package main.java.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
	 // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long repeat=0;
        repeat = n/s.length();
        
        char sArray [] = s.toCharArray();
        long count=0;
        
        for(int i=0;i<sArray.length;i++)
        {
            if(sArray[i]=='a')
                count++;
        }
        
        if(count == 0)
                return 0;
        else
            count = count * repeat;
        
        int x =(int) (n % s.length());
        
        if(x == 1 & s.startsWith("a"))
            return ++count;

        String nString = s.substring(0, x);
        
        sArray = nString.toCharArray();
        
        for(int i=0;i<sArray.length;i++)
        {
            if(sArray[i]=='a')
                count++;
        }
        
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
