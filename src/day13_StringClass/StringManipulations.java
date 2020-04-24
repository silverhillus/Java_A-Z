package day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        /*STRING CLASS METHODS
        #String is a sequence of char characters.#
        >varName.charAt();
        >varName.length();
        >varName.concat();
        >varName.toLowerCase();
        >varName.toUpperCase();
        >varName.trim();
        >varName.substring();
        >varName.replace(old value,new value);
        >varName.replaceFirst(old value,new value);//replaces only first occurred value
        >varName.indexOf();

         */
        String str = "Cybertek";
        //            01234567

        //>charAt();

        char ch1 =  str.charAt(5); // 't'
        System.out.println( ch1 == 'A' );
        //              't' == 'A'   false

        System.out.println( ch1 == 'T');
        //                  't == 'T'  false

        System.out.println("======================");

        // >length();
        int totalLength =  str.length();
        System.out.println(totalLength);

        System.out.println(totalLength > 250);  // false

        String str2 ="Today is great day, Java is Fun";
        //012345 ....
        int maxIndexNum = str2.length() - 1;
        System.out.println(maxIndexNum);

        System.out.println("======================");

        //>>concat();
        String s1 = "Cybertek";
        s1.concat(" School"); // "Cybertek School"

        System.out.println(s1);  // s1 = Cybertek School

        String s2 = "Java";
        System.out.println( s2.concat(" is a programming language")  );      // "Java is a programming language"
        System.out.println(s2);

        s2 = s2.concat(" is a programming language");
        System.out.println(s2);

        System.out.println("======================");

        //toLowerCase();
        String name1="FATIH";
        name1.toLowerCase();
        System.out.println(name1);//prints > FATIH
        System.out.println(name1.toLowerCase()); // converts into lower case or / prints> fatih
        name1=  name1.toLowerCase();// or you may reassign name1 into new object then print name1 to get it into smaller case
        System.out.println(name1);// prints> fatih

        System.out.println("======================");

        //toUpperCase();
        // now name1 is converted to lower case which is fatih let's convert it back to upper case
        name1=name1.toUpperCase();
        System.out.println(name1);

        //>trim();
        //trim removes the space is not used which means before or after the sentence.
        //it does not effect the space in between two words/characters
        String sentence="          Java is a fun language.     " ; // space at the beginning and at the end is not used.
        System.out.println(sentence);// prints as it's
        sentence=sentence.trim();
        System.out.println(sentence);//trims and prints.

        String A1 = "        Today            is           a          great       day            ";
        A1 =   A1.trim();
        System.out.println(A1);// trims the space in the beginning and at the end then prints

        System.out.println("======================");

        //>substring()
        String fullName="Albert Einstein";
        //               0123456789..... >> index numbers of the characters

        // RANGE:(beginningIndex,endingIndex) >>ATT: ENDING INDEX IS EXCLUDED!!!
        String firstName=fullName.substring(0,5+1);
        // so ending index=index of last character+1 =5+1=6
        String lastName=fullName.substring(7,14+1);
        // so ending index=last character+1 =14+1=15

        System.out.println(firstName);
        System.out.println(lastName);

        //ex
        String number="123456789";
        System.out.println(number.length()); //RECALL: length is 9 so end max index=9-1=8
        String last3digits=number.substring(6,8+1);
        System.out.println(last3digits);//prints> "789"

        //ex
        String name2="Fatih Silverhill";
        name2=name2.toLowerCase();//prints fatih gumustepe
        String firstName2=name2.substring(0,4+1);
        String lastName2=name2.substring(6,14+1);

        //print lastName2_firstName2@gmail.com by concat() method
        //String gmail=lastName2+"_"+firstName2+"@gmail.com"; >>that's how you concatenate
        String gmail=lastName2.concat("_").concat(firstName2).concat("@gmail.com");
        System.out.println(gmail);//prints> silverhil_fatih@gmail.com

        System.out.println("===================");

        //substring()> prints remaining chunk of words
        String s="I love Java Programming Language";
        String className=s.substring(7);//BEGINNING index of J=7 is enough to print the whole remaining
        System.out.println(className);//prints> Java Programming Language

        System.out.println("===================");

        // replace(old value,new value); //it replaces ALL
        String sen="I like C# programming";
        sen=sen.replace("C#","Java");
        System.out.println(sen); //prints> I like Java programming

        //ex:replace multiple words
        String sen1="I like C# programming C#, C#, C#.";
        sen1=sen1.replace("C#","Java");
        System.out.println(sen1);//prints>I like Java programming Java Java Java

        System.out.println("=====================");

        //replaceFirst(old,new);
        String sen2="I like C# programming C# is cool.C# is easier than Java.";
        sen2=sen2.replaceFirst("C#","Java");
        System.out.println(sen2);//prints>I like Java programming C# is cool. #ONLY first one!#

        System.out.println("================");

        //  >varName.indexOf(); //finds the first matching character
        String sen3="I love Java Programming Language.Java is widely used in IT industry.";
        int firstJ=sen3.indexOf("J"); //make sure to declare it into integer since it's a number.
        System.out.println(firstJ);// prints> 7

        //
        int secondJ=sen3.indexOf("Java is"); // "Java Pr.." first / "Java is" second word which is different than the first one.
        System.out.println(secondJ);//prints> 33

        //
        int maxIndexNumber=sen3.length()-1;// index starts from "0" but length starts from "1" so
        // index of the last character is 1 less than the length.
        System.out.println(maxIndexNumber);

        System.out.println("===============");

        String fName="Fatih Silverhill";
        String frstName=fName.substring(0,fName.indexOf(" ")); //end index is excluded so you need to find the index of " ".
        String lstName=fName.substring(fName.indexOf(" ")+1,fName.length()-1);
        //                   ERROR!!!! fName.indexOf(" "+1)
        System.out.println(frstName);
        System.out.println(lstName);




















    }
}
