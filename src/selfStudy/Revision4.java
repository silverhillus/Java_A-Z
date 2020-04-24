package selfStudy;

public class Revision4 {
    public static void main(String[] args) {

        //3. write a program that can calculate the sum of all the even numbers between 1 ~ 100

        int evensum=0;
        int oddsum=0;

        for (int i=1; i<=100; i+=1){
            //System.out.print(i+" ");
            if (i%2==0){
                evensum+=i;
            }else{
                oddsum+=i;
            }

        }
        System.out.println(evensum);
        System.out.println(oddsum);




    }
}
