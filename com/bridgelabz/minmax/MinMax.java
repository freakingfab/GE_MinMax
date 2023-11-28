package com.bridgelabz.minmax;
public class MinMax {
    public static void main(String[] args){
        System.out.println("Implementing Min Max using java generics");
        System.out.print("TC1: for Integers: ");
        MaxFinder<Integer> intMaxFinder = new MaxFinder<>(1001,100,10);
        System.out.println(intMaxFinder.testFindMax());
        System.out.print("TC2: for Float: ");
        MaxFinder<Float> floatMaxFinder = new MaxFinder<>(4.2F,5.2F,2.3F);
        System.out.println(floatMaxFinder.testFindMax());
        System.out.print("TC3: for String: ");
        MaxFinder<String> stringMaxFinder = new MaxFinder<>("100","10","1001");
        System.out.println(stringMaxFinder.testFindMax());
    }
}
