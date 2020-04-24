package day16_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {

    for (int i=1; i<=5;){ //if you don't use iteration it'll be infinity loop
            System.out.println("Hi Bye!");
            break; //prints one time then forcefully exit  the loop

        }
        System.out.println("=======");

        for (int k=1; k<=5; k++){

            /*if (k==3){
                break;// before statement prints  2 times
            }
             */

            System.out.println("Hi Testing!");
            if (k==3){
                break;// after statement prints  3 times
            }


        }





    }
}
