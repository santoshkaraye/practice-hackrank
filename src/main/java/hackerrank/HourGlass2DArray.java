package main.java.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HourGlass2DArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

       int hourglassMax= 0;
        boolean pivot = true;
        for(int i=0;i<arr.length-2;i++)
        {
                
            for(int m=0;m<4;m++)
            {
                int max=0;
                for(int j=0;j<3;j++)
                {
                    System.out.print(arr[i][m+j]);
                    max= max + arr[i][m+j];
                }
                System.out.print("\n" + " " +arr[i+1][m+1] + "\n");
                max = max + arr[i+1][m+1];
                for(int l=0;l<3;l++)
                {
                    System.out.print(arr[i+2][m+l]);
                    max = max+arr[i+2][m+l];
                }
                        
                System.out.println("\n" + "max" +max);
                
                if(hourglassMax < max)
                    hourglassMax= max;
                
                if(pivot)
                {
                    hourglassMax= max;
                    pivot=!pivot;
                }
                  
            }
            
            
            
        }
        
        System.out.println("output===>" +hourglassMax);
        return hourglassMax;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
