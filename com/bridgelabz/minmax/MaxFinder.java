package com.bridgelabz.minmax;

/*
 desc: it provides maximum value for same type of arguments
 */
public class MaxFinder<T extends Comparable<T>> {

    /*
        @desc: provides maximum out of three
        @params: three arguments of same type T
        @return: T
     */
    public T findMax(T num1, T num2, T num3){
        T max = num1;
        if(num2.compareTo(max)>0){
            max=num2;
        }
        if(num3.compareTo(max)>0){
            max=num3;
        }
        return max;
    }
}
