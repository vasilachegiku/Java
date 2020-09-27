package com.step.comparator;

public class NumberComparator {
    int first, seconde;

    public NumberComparator(int one,int two){
        first = one;
        seconde= two;
    }

    public void Maxim() {
        int max=0;
        if (first > seconde) {
            max = first;
        }
        System.out.println("Numarul maxim =" + max);

    }
    public void Minim(){
        int min=0;
        if(first>seconde){
            min = seconde;
        }
        System.out.println("Numarul minim = "+ min);
    }


}
