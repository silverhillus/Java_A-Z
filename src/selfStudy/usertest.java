package selfStudy;

import java.util.Scanner;

public class usertest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username");//rose
        String user=input.next();
        System.out.println("Enter your password");//123
        String pass=input.next();

        boolean valid=user.equals("rose") && pass.equals("123");

        int count=1;
        while (!valid){
            System.out.println("Re enter");
            user=input.next();
            pass=input.next();
            valid=user.equals("rose") && pass.equals("123");
            count++;

            if (count==3 && !valid){
                System.out.println("locked");
                break;
            }
            if (valid){
                System.out.println("logged in");
            }


        }

        if (valid){
            System.out.println("logged in");
        }



    }
}
