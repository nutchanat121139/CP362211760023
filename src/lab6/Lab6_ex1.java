package lab6;

public class Lab6_ex1 {
    public class ConvertTemperature {
        public static void main(String[] args) {
            int temp;
            int far;
            int cel;

            temp = 25;

            far = temp * 9 / 5 + 32; //convert Celsius to Fahrenheit
            cel = (far - 32) * 5 / 9; // convert Fahrenheit to Celsius

            System.out.println("Celsius --> Fahrenheit: " + far);
            System.out.println("Fahrenheit --> Celsius: " + cel);
        }
    }
}
