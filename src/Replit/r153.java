package Replit;

public class r153 {
    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE //not remove dup! frequency==1

        for (int j=0; j<words.length; j++){
            int count=0;
            for (int i=0; i<words.length; i++){
                if (words[i]==words[j]){
                    count++;
                }
            }
            if (count==1){
                System.out.println(words[j]);
            }
        }
    }

    public static void main(String[] args) {
        String [] words={"java", "code", "python", "code", "rust", "code", "rust"};
        printUniqueWords(words);
        words[0].equals(words[1]);


    }




}
