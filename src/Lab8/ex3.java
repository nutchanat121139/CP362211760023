package Lab8;

import java.util.Random;

public class ex3 {

    public static void main(String[] args) {

        int num[] = (1, 2, 3, 4, 5);

        System.out.println(num[4]);

        //array 2D


        int number[][] = new int[2][3]; // = 6 block


        //input data in array 2D
        for (int i = 0; i < number.length; i++) {
            Random sc;
            for (int j = 0; j < number[i].length; j++) {
                 System.out.print("Enter an integer [" + i +")[" + j + "]:");
                 number[i][j]= sc.nextInt();
            }//for j


            //input data in array 2D
            for (int j = 0; j < number.length; i++) {
                for (int j = 0; j < number[i].length; j++) {
                    System.out.print("Enter an integer [" + i +")[" + j + "]:");
                    number[i][j]= sc.nextInt();
                }//for i
            }


            }


        }


    }//main


//class



    }
