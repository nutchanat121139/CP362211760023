package Lab8;

import java.util.Scanner;

public class ex2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num [] = new int [5];


        //Input data to array
        for (int i = 0; i < num.length ; i++) {

            System.out.print("Enter an integer ["+(i+i)+"]:");
            num (i) = sc.nextInt();


        }//for

        //show data in array
        for (int  i; num) {
            System.out.print(i+" ");
        }

        //find maximum
        int max = num [0];
        for (int i:num) {
            if (max < i)
                max = i;

            System.out.println("The maximum numder : "+max);
            //find minimum

            int min = num [0];
            for (int i:num) {
                if (min > i)
                    min = i;
            System.out.println("The maxlmum numder : "+min);

             //find average
             int total = 0;
             for (int i:num) {
                 total += i;
             }
             System.out.println("the averags number:  "+(total/num.length));




            }




        }


    }//main


//class
}
