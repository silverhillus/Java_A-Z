package Replit;

import java.util.Scanner;

public class CatsDogs_86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        word=word.toLowerCase();

        while (word.contains("cat") || word.contains("dog")){
          if (word.contains("cat")){
                countOfCats++;
                word=word.replaceFirst("cat","");
            }

          if (word.contains("dog")){
              countOfDogs++;
              word=word.replaceFirst("dog","");
          }

        }
        boolean result=(countOfCats==countOfDogs)? true : false;
        //System.out.println(countOfCats);
        //System.out.println(countOfDogs);
        System.out.println(result);



    }
}
