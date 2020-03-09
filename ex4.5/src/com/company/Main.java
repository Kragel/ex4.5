package com.company;

/*Repeat Exercise 10 from the previous chapter, using the ternary operator
and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( )*/
public class Main {

    public static void main(String[] args) {
        int i = 2 + 5 + 18 + 69;
        int j = 1 + 3 + 35 + 123;
        int k = 0x100;
        int m = 0;
        System.out.println("Using Integer.toBinaryString():");
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("k = " + Integer.toBinaryString(k));
        System.out.println("m = " + Integer.toBinaryString(m));
        System.out.println("i & j = " + (i & j) + " = " + Integer.toBinaryString(i & j));
        System.out.println("i | j = " + (i | j) + " = " + Integer.toBinaryString(i | j));
        System.out.println("i ^ j = " + (i ^ j) + " = " + Integer.toBinaryString(i ^ j));
        System.out.println("~i = " + Integer.toBinaryString(~i));
        System.out.println("~j = " + Integer.toBinaryString(~j));
        System.out.println("Using binaryPrint():");
        System.out.println("i = " + i + " = ");
        System.out.println("j = " + j + " = ");
        System.out.println("k = " + k + " = ");
        System.out.println("m = " + m + " = ");
        System.out.println("i & j = " + (i & j) + " = ");
        System.out.println("i | j = " + (i | j) + " = ");
        System.out.println("i ^ j = " + (i ^ j) + " = ");
        System.out.println("~i = " + ~i + " = ");
        System.out.println("~j = " + ~j + " = ");
    }
}
