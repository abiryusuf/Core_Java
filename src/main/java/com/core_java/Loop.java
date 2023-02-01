package com.core_java;

public class Loop {
    public static void main(String[] args) {
// There is also a for each loop which is used exclusively to loop through elements in an array

        String [] cars = {"Kia", "BMW", "FORS"};
        for(String i : cars){
            System.out.println(i);
        }
//        int i;
//        for (i = 1; i <= 2; i++){
//            System.out.println("Outer " + i);
//            for(int j = 1; j <= 3; j++){
//                System.out.println("Inner " + j);
//            }
//
//        }
        for(int r = 0; r <= 10; r ++){
            if (r == 4){
                continue;
            }
            System.out.println(r);
        }

    }
}
