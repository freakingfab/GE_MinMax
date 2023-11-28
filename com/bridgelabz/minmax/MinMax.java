package com.bridgelabz.minmax;

public class MinMax {
    public static void main(String[] args){
        System.out.println("Implementing Min Max using java generics");
        System.out.print("TC1: Largest in first position: ");
        System.out.println(findMaxNumber(5,4,3));
        System.out.print("TC2: Largest in second position: ");
        System.out.println(findMaxNumber(4,5,3));
        System.out.print("TC3: Largest in third position: ");
        System.out.println(findMaxNumber(3,4,5));
    }

    /*
        @desc: finds the maximum value among three:
        @params: takes three integer value
        @return: integer
     */
    public static Integer findMaxNumber(Integer num1, Integer num2 , Integer num3){
        Integer max = num1;
        if(num2.compareTo(max)>0){
            max=num2;
        }
        if(num3.compareTo(max)>0){
            max=num3;
        }
        return max;
    }
}
