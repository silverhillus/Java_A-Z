package selfStudy;

public class Revision5 {
    public static void main(String[] args) {

       //skip the letters of your name from the alphabet
        // skip all except your letters A F H I T
        // skip div by  3 & 5

        String l="";
        for (char ch='A'; ch<='Z'; ch++){

            //  boolean make sure ==
            if (!(ch=='F' || ch=='A'|| ch=='T' || ch=='I' || ch=='H')){
                continue;

            }
            l+=ch+" ";

        }
        System.out.println(l);

        for (int i=1; i<=100; i+=1){
            /*if (i%3==0 || i%5==0){// all multiples of 3 and 5 not necessarily 15
                continue;
            }
             */
            if (i%3==0 && i%5==0){// only multiples of 15 skipped
                continue;
            }
            System.out.print(i+" ");// 1 2 4 5 7 8 10 11 13 14 16
        }



    }
}
