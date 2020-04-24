package Replit;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        //WRITE YOUR CODE HERE
        switch(response){
            case 'y':
                System.out.println("Your request is being processed");
             break;

            default:
                System.out.println("invalid");


        }
    }
}
