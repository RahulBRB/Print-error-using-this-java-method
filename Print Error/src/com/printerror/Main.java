package com.printerror;

public class Main {

    public static void main(String[] args) {

        // Let's make an array first.
        int[] marks = {67, 88, 90, 74};

        /*
        (Let's try to print something so that we can get an error)
        System.out.println(marks[4]);

        (marks[4] is not there because indexing starts from 0 in Java.
        Such as, in this case: 0=67, 1=88, 2=90,3=74. (As you see, nothing at position [4]).
        System.out.println("There is an error");
        (If we run our program now then it wont be able to print our last command.
        To fix this we will use the try-catch method. )
         */

        try {
            System.out.println(marks[4]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("There is an error");

        // Now when the error is detected it will not stop the whole process.
        // Instead the error will get printed.
        // With the help of this method you can experiment this code on your own now for better understanding.

    }
}