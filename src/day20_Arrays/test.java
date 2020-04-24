package day20_Arrays;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int [] ar1={9,8,0,2,3,5,12,43,1};
        int [] ar2={9,8,0,2,3,5};

        //converting array to string
        Arrays.toString(ar1);
        Arrays.toString(ar2);



        //comparing 2 arrays if they're equal or not
        Arrays.equals(ar1,ar2);



        //sorts the arrays
        Arrays.sort(ar1);
        Arrays.sort(ar2);


        //String to char
        String str1=Arrays.toString(ar1);
        String str2=Arrays.toString(ar2);

        str1.toCharArray();
        str2.toCharArray();

        System.out.println(str1);
        System.out.println(str2);


        //Creating new array with fixed sizes
        int[] ar3= new int[4];
        short[] ar4=new short[2];
        double[] ar5= new double[3];
        String[] ar6= new String[2];
        char[]ar7= new char[4];
        //assigning new values at specific index
        ar3[1]=2;
        System.out.println(Arrays.toString(ar3));





        

    }
}
