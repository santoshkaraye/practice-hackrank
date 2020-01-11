package main.java.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SocksPairCount {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
 Arrays.sort(ar);
      int tmp=0;
      int count=0;
      int pair=0;
      int pivot;
      for(int i=0;i<ar.length;i++)
      {
          pivot = ar[tmp];
          
          if(ar[i]==pivot)
              count++;
          else
          {
              pair= pair + (count/2);
              pivot = ar[i];
              count = 1;
              tmp = i;
          }
    
          
      }
       pair= pair + (count/2);
      return pair; 

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;

        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

