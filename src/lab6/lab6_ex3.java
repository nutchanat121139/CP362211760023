package lab6;

import java.util.Scanner;

public class lab6_ex3 {

    public class NovelliveSimple {
        public static void main(String[] args)
        {
            //BMI = weight/(height*height)
            Scanner in = new Scanner(System.in);

            System.out.print("Weight: ");
            float weight = in.nextFloat();

            System.out.print("Height: ");
            float height = in.nextFloat();

            float bmi = weight*10000.00f/(height*height);
            System.out.println(bmi);

            in.close();
        }
    }
}
