package day15_ForLoops;

public class ForLoop {
    public static void main(String[] args) {

        // for( initialise; condition; iterator)
        for (int i=0; i<5; i++){
            System.out.println("Hello World");
        }
        System.out.println("===============");

        for (int i=0; i<4; i++){
            System.out.println("**********");

        }

        System.out.println("===============");


        for (int n=1;  n<=10;  n+=1){

            //System.out.println(n);//n+=4 >>1 5 9
            System.out.println(n +" : " +n*n);//

        }
        System.out.println("===============");


        //print the odd numbers between 0-100 in a SINGLE LINE/print()
        String odd="";
        for (int n=1;  n<=100;  n+=2){

            //System.out.print(n+", ");//1, 3, 5, 7, 9, 11, 13,...
            odd+=n+", ";
            //System.out.println(odd); //inside loops prints triangle
        }
        System.out.print(odd); // has to be outside loop if you're using string



        System.out.println();//prints new line so even number can start from the new line


        //print the even numbers between 0-100 in a SINGLE LINE/print()
        String even="";
        for (int n=0;  n<=100;  n+=2){

            //System.out.print(n+", ");
            even=even+n+", ";
            //System.out.println(even);// inside loop prints triangle
        }
        System.out.println(even);












    }
}
