package com.bridgelabz.minmax;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
/*
 desc: it provides maximum value for same type of arguments
 */
public class MaxFinder<T extends Comparable<T>> {
    private final List<T> values;

    /*
        @desc: parameterized constructor for MaxFinder class
        @params: three variables for type T
        @return: none
     */
    public MaxFinder(T... values){
        this.values = Arrays.asList(values);
    }
    /*
        @desc: provides maximum out of three
        @params: none
        @return: T
     */
    public T findMax(){
        Optional<T> max = values.stream().max(Comparable::compareTo);
        return max.orElse(null);
    }

    /*
        @desc: it calls findMax function to give max for current object
        @params:none
        @return: T
     */
    public void testFindMax(){
        System.out.println("The maximum is: " + findMax());
    }
}
