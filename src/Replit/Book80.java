package Replit;

import java.util.Scanner;

public class Book80 {
    public static void main(String[] args) {
        /*
        Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books
        and offers 2 free books with every purchase of 8 or more books.
        It offers regular customers 1 free book with every purchase of 7 or more books,
        and offers 2 free books with every purchase of 12 or more books.
     Write a program that assigns freeBooks the appropriate value based on the values of the
     boolean variable isPremiumCustomer and the int variable nbooksPurchased.
     Print amount of freeBooks into the console.
         */
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a premium customer");
        boolean isPremiumCustomer = scan.nextBoolean();
        System.out.println("Enter the number of book purchased");
        int nbooksPurchased = scan.nextInt();


        if (isPremiumCustomer) {
            if (nbooksPurchased<5){
                freeBooks+=1;
                nbooksPurchased+=freeBooks;

            }
            if (nbooksPurchased >= 5 && nbooksPurchased < 8 ) {
                for (int i = 5; i <= nbooksPurchased; i += 5) {
                    freeBooks = i/5 * 1;
                    nbooksPurchased+=freeBooks;

                }
            }

            if (nbooksPurchased >= 8  ) {
                for (int k = 8; k <= nbooksPurchased; k += 8) {
                    freeBooks = k/8 * 2;
                    nbooksPurchased+=freeBooks;

                }
            }


        } else {
            if (nbooksPurchased >= 7 && nbooksPurchased < 12 ) {
                for (int l = 7; l <= nbooksPurchased; l += 7) {
                    freeBooks = l/7 * 1;
                    nbooksPurchased+=freeBooks;

                }
            }
            if (nbooksPurchased >= 12) {
                for (int m = 12; m <= nbooksPurchased; m += 12) {
                    freeBooks = m/12 * 2;
                    nbooksPurchased+=freeBooks;
                }
            }

        }
        System.out.println("Free books: " + freeBooks);
        System.out.println("Number of books in total: "+ nbooksPurchased);


    }
}

