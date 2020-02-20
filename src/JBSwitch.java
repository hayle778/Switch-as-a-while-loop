public class JBSwitch {
    public static void main(String[] args) {

        int day = 7;

        if (day == 0) {

            System.out.println( "Sunday" );
        }
        else if (day == 1) {

            System.out.println( "Monday" );
        }
        else if (day == 3) {
            System.out.println( "Tuesday" );
        }
        else {
            System.out.println( "Comoiestas segnor" );
        }


//    Switch is written as a while loop

         int day2 = 696786341;

        switch (day2) {

               case 1:
                System.out.println( "Sunday" );
                break;

               case 2:
                System.out.println( "Monday" );
               break;

               case 3:
                System.out.println( "Tuesday" );
                break;

            default:
                System.out.println( "It`s over" );


        }
    }
}