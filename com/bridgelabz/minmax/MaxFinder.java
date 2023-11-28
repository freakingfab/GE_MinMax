package com.bridgelabz.minmax;

/*
 desc: it provides maximum value for same type of arguments
 */
public class MaxFinder<T extends Comparable<T>> {
    private final T var1;
    private final T var2;
    private final T var3;

    /*
        @desc: constructor for MaxFinder class
        @params: three variables for type T
        @return: none
     */
    public MaxFinder(T var1, T var2, T var3){
        this.var1=var1;
        this.var2=var2;
        this.var3=var3;
    }
    /*
        @desc: provides maximum out of three
        @params: none
        @return: T
     */
    public T findMax(){
        T max = var1;
        if(var2.compareTo(max)>0){
            max=var2;
        }
        if(var3.compareTo(max)>0){
            max=var3;
        }
        return max;
    }

    /*
        @desc: it calls findMax function to give max for current object
        @params:none
        @return: T
     */
    public T testFindMax(){
        return findMax();
    }
}
