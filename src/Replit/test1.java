package Replit;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        int j = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        for ( j=0; j<=n; j++){
            String asterix="*";
            System.out.print(asterix);
        }


        for (int i=1; i<=20; i++){
            if(i%3==0){
                System.out.print(i+" ");
            }
        }

        String word="xredX";
        word=word.substring(1,4);
        System.out.println(word);

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here
        a=(a.contains("alejandro")) ? "read this mail":"dont read";
            System.out.println(a);
            a.startsWith("k");

        // XgrapeX   l=7
        // 0123456   maxIn=6

        // xJava
        // Java
        //Jav


    }
}
