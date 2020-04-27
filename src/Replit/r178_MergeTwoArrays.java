package Replit;

import java.util.Arrays;

public class r178_MergeTwoArrays {
    /*
    mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
     */
    public static int[] mergR(int[] a,int[] b) {

        int combined=a.length + b.length;
        int [] merged = new int [combined];

        int j=0;
        for (int i=0; i<a.length; i++){
            merged[i]=a[i];
            j++;
        }
        int k=0;
        for (int i=a.length; i<combined; i++){
            merged[i]=b[k];
            k++;
        }
        return merged;




    }//end mergR

    public static void main(String[] args) {
        int []a={1,2,3,4}; //l=6 max 5
        int []b={50,60,5,7}; //2
        int [] res=mergR(a,b);
        System.out.println(Arrays.toString(res));

    }
}
