package main.java.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotation {
	 // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

       int [] b= new int[a.length] ;
        int [] c= new int[a.length] ;
                
        if(d==a.length)
            return a;
        else
            if(d>a.length)
                d = d / a.length;
            
        for(int i=0;i<d;i++)
        {
            b[i]=a[i];
        
        }
        
        int k=0;
        for(int i =d;i<a.length;i++)
        {
            c[k]=a[i];
            k++;
        }
        
        for(int i=0;i<d;i++)
        {
            c[k] = b[i];
            k++;
        }
        
        System.out.println("a-----" +Arrays.toString(c));
        
        return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
