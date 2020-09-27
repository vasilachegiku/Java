package com.step.calculator;

public class Calculator {
       double firstNUmeber,secondeNumber;
       double Sum;

       public Calculator(double num1, double num2)
       {
           firstNUmeber= num1;
           secondeNumber = num2;

       }

        public void Adunare(){

            Sum = (firstNUmeber+secondeNumber);
            System.out.println("Suma = " + Sum);
        }
        public void Scadere(){
             Sum= firstNUmeber-secondeNumber;
            System.out.println("Scaderea = " + Sum);
        }
        public void Inmultire(){
            Sum=firstNUmeber*secondeNumber;
            System.out.println("Inmultirea= " + Sum);
        }
        public void Impartire(){
             Sum= firstNUmeber/secondeNumber;
            System.out.println("Impartirea=" + Sum);
        }
}
