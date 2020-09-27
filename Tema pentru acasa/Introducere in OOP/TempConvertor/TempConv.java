package com.step.TempConvertor;

public class TempConv {
    double celcius=100,fahr=100;

    public void convertToCelcius() {
        double Celcius = ((celcius*9)/5)+32;
        System.out.println("Celcius in Fahr = " + Celcius);
    }
    public void convertToFahr() {
        double Fahrenheit = ((fahr-32)*5)/9;
        System.out.println("Fahr in Celcius = " + Fahrenheit);
    }
}
