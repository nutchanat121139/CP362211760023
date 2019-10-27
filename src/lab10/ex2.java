package lab10;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        //max
        int max = Max(10, 20);
        System.out.println("The maximum number is : " + max);

        //min
        System.out.println("the maximum number is: " + Min(10, 20));
        //Multiple
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter an integer 2: ");
        int num2 = sc.nextInt();

        int mu1 = Multipie(num1, num2);
        System.out.println("The multiple value is : "+mu1);


    }


    private  static int Multipie (int mun1, int mun2,){


        return mun1*mun2





    }
    private  static  int Min(int x, int y){
        int rs;
        if (x <y)
            rs = x;
        else
            rs = y;
        return rs;

    }
    private static int Max (int x, int y,){
        int rs;
        if (x >y)
            rs = x;
        else
            rs = y ;
        return rs;








    }












}

