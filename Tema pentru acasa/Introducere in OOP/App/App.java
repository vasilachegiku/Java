package com.step.App;
import com.step.TempConvertor.TempConv;
import com.step.calculator.Calculator;
import com.step.comparator.NumberComparator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

       TempConv TempConvert = new TempConv();
       TempConvert.convertToCelcius();
       TempConvert.convertToFahr();


        Scanner num = new Scanner(System.in);
        System.out.println("Introdu primul numar:");
        double num1 = num.nextDouble();
        System.out.println("Introdu al doilea numar:");
        double num2 = num.nextDouble();

        Calculator op = new Calculator(num1, num2);
        op.Adunare();
        op.Scadere();
        op.Impartire();
        op.Inmultire();

System.out.println(" ");
        Scanner compar = new Scanner(System.in);
        System.out.println("Introduc primul numar");
        int first = compar.nextInt();
        System.out.println("Introdu al doilea numar");
        int seconde = compar.nextInt();

        NumberComparator maxmin = new NumberComparator(first,seconde);
        maxmin.Maxim();
        maxmin.Minim();




    }
}
