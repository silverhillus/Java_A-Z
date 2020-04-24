package selfStudy;

import java.util.Arrays;

public class artest {
    public static void main(String[] args) {
        int [] ar={1,2,3};
        int [] ar2=new int[ar.length+1];
        int n=4;
        for (int i=0; i<ar.length; i++){
            ar2[i]=ar[i];
        }
        ar2[ar2.length-1]=n;
        System.out.println(Arrays.toString(ar2));

        int num=1234;


    }
}
