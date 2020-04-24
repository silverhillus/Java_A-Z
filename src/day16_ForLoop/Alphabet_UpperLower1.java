package day16_ForLoop;

public class Alphabet_UpperLower1 {
    public static void main(String[] args) {
        String upperCase="";
        String lowerCase="";

        for(char ch='A'; ch<='Z'; ch++){
            lowerCase+=ch;

        }
        System.out.println(lowerCase);

        for(char ch='a'; ch<='z'; ch++){

            upperCase+=ch;
        }
        System.out.println(upperCase);


        String result="";
        //             max index of
        for(int i=0; i<=upperCase.length()-1; i+=1){
            //result=lowerCase.charAt(i)+upperCase.charAt(i);// now you cannot concatanate char to string
            //result=lowerCase.charAt(i)+""+upperCase.charAt(i);//prints > Yy
            //  that's how you add each time
            //result+=lowerCase.charAt(i)+""+upperCase.charAt(i);//prints > AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYy
            result+=lowerCase.charAt(i)+""+upperCase.charAt(i)+" ";//prints > Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy

        }
        System.out.print(result);

        System.out.println();

        //Second with ascii table
        int A=65;
        int a=97;

        String result2="";
        for(int i =0 ; i < 26; i++ ) {
            char ch = (char) (A + i);  // upper case characters
            //               65+0
            char ch2 = (char) (a + i);
            //                97+0
            //result2+=ch+ch2+" ";// (Empty String)"" at the end DOES NOT! concatenate char with string// prints> 162 164 166 168 ...
            result2+=""+ch+ch2+" ";// (Empty String)"" in the beginning does concatenate char with string// prints> Aa Bb Cc ...

        }
        System.out.println(result2);


    }
}
