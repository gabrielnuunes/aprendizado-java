package com.roadjava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {

    public static void main(String[] args) {
        //Checked and Unchecked

        //NullPointerException
        Object object = null;
        System.out.println(object.toString());

        // IndexOutOfBoundsException
        int[] nums = {1, 2};
        System.out.println(nums[2]);


    }
}
