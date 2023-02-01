package com.core_java;

public class Math_Function {

        public static void main(String[] args) {
            int x = 4;
            int y = 10;
            System.out.println(Math.max(x, y));
            System.out.println(Math.sqrt(x));
            System.out.println(Math.abs(x));


            //Random returns a random number between 0.0 and 1.0
            System.out.println(Math.random());

            //To get more control over the random number, for example, if you only want a random number between 0 and 100,
            // you can use the following formula:
            int ranNum = (int)(Math.random() * 101);
            System.out.println(ranNum);

        }
    }


