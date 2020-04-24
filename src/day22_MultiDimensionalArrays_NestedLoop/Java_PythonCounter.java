package day22_MultiDimensionalArrays_NestedLoop;

import java.util.Arrays;

public class Java_PythonCounter {
    public static void main(String[] args) {

        String sentence="I like java and javascript";

        //ignore case sensitivity
        sentence=sentence.toLowerCase();


        //change the string into array by split method
       //sentence.split(" ");// split in string so assign into new string array

        String[] word=sentence.split(" ");
        System.out.println(Arrays.toString(word));// [i, like, java, and, javascript]

        //so now count java and python by foreach loop

        int javaCounter=0;
        int pythonCounter=0;
        for(String eachWord: word){
            if(eachWord.contains("java")){
                javaCounter++;
            }
            if(eachWord.contains("python")){
                pythonCounter++;
            }
        }
        System.out.println(javaCounter==pythonCounter);



    }
}
