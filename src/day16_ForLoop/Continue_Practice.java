package day16_ForLoop;

public class Continue_Practice {
    public static void main(String[] args) {

        for (char ch='Z'; ch>='A'; ch--){
            if (ch=='F' ||ch=='A' || ch=='T'){
                continue;
            }
            System.out.print(ch+ " ");
        }

        // skip numbers divisible by 15, multiples of 15.
        System.out.println();

        for (int i=0; i<=100; i++){
            if (i%3==0 && i%5==0){
                continue;
            }
            System.out.print(i+ " ");
        }






    }
}
