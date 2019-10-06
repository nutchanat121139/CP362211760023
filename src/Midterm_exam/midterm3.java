package Midterm_exam;

public class midterm3 {


    public static void main(String[] args) {
    choice =Integer.parseInt(user_input);
   switch(choice)
    {

        case 1:
            E = D*13.75 ;
            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ E +" กิโลแคลอรี่" );
            break;

        case 2:
            F = D*5.003 ;
            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ F +" กิโลแคลอรี่" );
            break;

        case 3:
            G = D*6.775 ;
            JOptionPane.showMessageDialog(null, " พลังงานที่จำเป็นพื้นฐานในการมีชีวิต   BMR ( Basal  Metabolic Rate )\n"+" = "+ D +" กิโลแคลอรี่\n"+
                    " พลังงานที่คุณใช้ในแต่ละวัน   TDEE ( Total Daily Energy Expenditure )\n"+" = "+ G +" กิโลแคลอรี่" );
            break;


        while(true);

    }
}
}



