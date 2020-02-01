package com.company;

public class Main {

    public static void main(String[] args) {

        String [] names = new String[3];
        names[0] = "Asan";
        names [1] = "Uson";
        names [2] = "Sergei";
        for (int i = 0; i < 3 ; i++) {


            switch (names[i]) {
                case "Asan":
                    System.out.println("Dobroe utro " + names[0]);
                    break;
                case "Uson":
                    System.out.println("Dobryi den " + names[1]);
                    break;
                case "Sergei":
                    System.out.println("Dobryi vecher "+ names[2]);
                    break;
            }
        }

    }


}











