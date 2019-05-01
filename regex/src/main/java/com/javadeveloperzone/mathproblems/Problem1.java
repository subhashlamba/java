package main.java.com.javadeveloperzone.mathproblems;

import java.util.HashSet;

/**
    @author subhash lamba
    Defination : If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
                 Find the sum of all the multiples of 3 or 5 below 1000.
    Ref: https://projecteuler.net/problem=1
 */
public class Problem1 {


    public static void main(String ... args){

        System.out.println(getResult(10).equals(23));
        System.out.println(getResult(16).equals(60));
        System.out.println(getResult(1000));
    }

    public static Integer getResult(int max){
        int sum=0;
        java.util.Set<Integer> set=new HashSet<>();     // to check for duplicate values
        for(int i=1; ; i++){
            int multipleOf5 =i*5;
            int multipleOf3 =i*3;

            if(multipleOf5>max && multipleOf3>max){
                break;
            }
            if(set.add(multipleOf3) && multipleOf3<max) {
                sum += multipleOf3;
            }
            if(set.add(multipleOf5) && multipleOf5<max) {
                sum += multipleOf5;
            }
        }
        return sum;
    }
}

