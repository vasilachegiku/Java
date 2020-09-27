package com.step.TempConvertor;
import java.util.Scanner;

public class TempContert2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti temperatura in Celsius:");
        double C = in.nextInt();
        double F = C*1.8+32;
        System.out.println(C + "grade celsius este egal cu " + F + " grade fahrenheit");
    }

}
