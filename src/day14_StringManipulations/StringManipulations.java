package day14_StringManipulations;

public class StringManipulations {
    public static void main(String[] args) {
        //>.indexOf();
        String str = "I like to learn Java. I like the movie Jumanji is my favourite.";
        int firstJ = str.indexOf("J"); // index NUMBER data type is INT!!!
        int secondJ = str.indexOf("Ju");
        System.out.println(firstJ + "\n" + secondJ);
        int firstI = str.indexOf("I");//0
        //int secondI=str.indexOf("I like the");// returns the index num of first occurred character//22
        int secondI = str.indexOf(" I") + 1;//index of space +1 ==> index of second I//22
        System.out.println(firstI);
        System.out.println(secondI);


        //>.lastIndexOf();
        int firstE = str.indexOf("e");//5
        int lastE = str.lastIndexOf("e");//returns the last index of  last occurred character//61
        int lastE2 = str.indexOf("e.");// returns the index of last e//61
        System.out.println(firstE);
        System.out.println(lastE);
        System.out.println(lastE2);
        System.out.println(lastE == lastE2);//true


        String z = "I like C#, C# is cool";
        int c1 = z.lastIndexOf("C");
        System.out.println(c1);

        //multiple way of finding the index numbers
        String x = "I like Java, Java is fun, Java programming is fun";
        int d1 = x.indexOf("Java is");  // second J' index num
        System.out.println(d1);
        int d2 = x.indexOf(", J") + 2;   // second J' index num
        System.out.println(d2);
        int d3 = x.lastIndexOf("J"); // last J' index number
        System.out.println(d3);
        int d4 = x.indexOf("Java p"); // last J' index number
        System.out.println(d4);


        char ch1 = x.charAt(26);

        System.out.println(ch1);

    }
}
