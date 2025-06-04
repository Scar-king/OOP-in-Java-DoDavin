package Lab06.Ex1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = 1234;
        double n = 10.4;

        System.out.println(num + " = " + reverseNumber(1234));

        System.out.println(n + " = " + roundNumber(n));

        System.err.println(decimalToBinary(10));

        scanner.close();
        
    }
    static int reverseNumber(int num){

        int reversed = 0;

        while(num != 0){
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num /= 10;
        }

        return reversed;
    }

    static int roundNumber(double num){
        int num_without_decimal = (int) num;
        double decimal = num - num_without_decimal;
        if(decimal >= 0.5){
            return num_without_decimal + 1;
        } else {
            return num_without_decimal;
        }
    }

    static int countDistinct(int[] value){
        int count = 0;
        for(int i = 0; i < value.length; i++){
            boolean isDistinct = true;
            for(int j = 0; j < i; j++){
                if(value[i] == value[j]){
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
                count++;
            }
        }
        return count;
    }

    static int decimalToBinary(int decimal){
        int binary = 0, base = 1;
        while(decimal > 0){
            int rem = decimal % 2;
            binary = binary + rem * base;
            base *= 10;
            decimal = decimal / 2;
        }
        return binary;
    }
}