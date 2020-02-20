import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int toBit(int num) {
        StringBuilder result = new StringBuilder();
        while(num > 0) {
            int r = num % 2;
            num /= 2;
            result.append(String.valueOf(r));
        }
        String binario = result.reverse().toString();
        int respuesta=1;
        ArrayList<Integer> maximos = new ArrayList<Integer>();
        maximos.add(0);
        for(int i = 0; i < binario.length() ; i++) { 
            try {
                if(binario.charAt(i)=='1' & binario.charAt(i)==binario.charAt(i+1)) {
                    respuesta++;
                }
                else {
                	maximos.add(respuesta);
                	respuesta = 1;
                }
            }
            catch(Exception e) {
            }
        }
        return Collections.max(maximos);
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(toBit(n));
        scanner.close();
    }
}

