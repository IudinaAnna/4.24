package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result;
        while (true) {
            if(studentCounter<=10) {
                System.out.println("Passed: " + passes + "\t\t" + " Failed: " + failures);
                System.out.print("Enter result (1 = pass, 2 = fail): ");
                result = input.nextInt();
                if (result == 1) passes = passes + 1;
                if (result == 2) {
                    failures = failures + 1;
                    studentCounter = studentCounter + 1;
                }
                if (result != 1 || result != 2) {
                    System.out.println("Repeat please!");
                }
            }
            else
                break;
        }
    }
}
