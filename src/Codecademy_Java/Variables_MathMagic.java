package Codecademy_Java;
/* VARIABLES
Math Magic
In this project, you will become a mathemagician and write a small program that performs a mathematical magic trick!
It will involve performing arithmetic operations on an integer that you choose.

The instructions provided are general guidelines. Upon completion of the project, feel free to explore the code
on your own.

If you get stuck during this project or would like to see an experienced developer work through it,
click “Get Help“ to see a project walkthrough video.
 */

public class Variables_MathMagic {

        public static void main(String[] args) {
            int myNumber= 8;
//We will refer to myNumber as the original number from now on - it might be helpful to document this.
            int stepOne= myNumber*myNumber;
            int stepTwo= myNumber+stepOne;
            int stepThree= stepTwo/myNumber;
            int stepFour= stepThree+17;
            int stepFive= stepFour-myNumber;
            int stepSix= stepFive/6;
            System.out.println(stepSix);

        
    }
}
