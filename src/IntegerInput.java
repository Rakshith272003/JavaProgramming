//Java program to take an integer as input and print it
import java.io.*;
import java.util.Scanner;


public class IntegerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        System.out.println("Entered integer is:"+n);
        sc.close();
    }
}
