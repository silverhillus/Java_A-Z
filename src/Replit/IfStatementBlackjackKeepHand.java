package Replit;
/*
in blackjack after the player asks to keep the house 4 things may happen.

1) if the card total is bigger then 21 the player busts.
2)if the house score is bigger then the player, the player loses .
3)if the player score is equal to the house then theirs a draw.
4)if the player score is bigger then the house the player wins.

player and house scores are represented by  player and house int variables.

check them using ifs to determine the result.

for example:

player  = 21
 house = 8

output: bust


player  = 7
 house = 10

output: player loss

player  = 4
 house = 4

output: its a tie

player  = 12
 house = 7

output: player wins

 */

import java.util.Scanner; // Without this it's not working
public class IfStatementBlackjackKeepHand {
    public static void main(String[] args) {

                Scanner s = new Scanner(System.in); // define new scanner inside main method

        System.out.println("Enter house score:");
        int house = s.nextInt(); // call variable

        System.out.println("Enter player score:");
        int player = s.nextInt(); //9 call variable

                //your code here
                if (player >= 21) {
                    System.out.println("bust");
                }
                if (player < house) {
                    System.out.println("player loss");
                }

                if (player == house) {
                    System.out.println("it's a tie");
                }

                if (player > house && player < 21) {
                    System.out.println("player wins");
                }


            }
        }
