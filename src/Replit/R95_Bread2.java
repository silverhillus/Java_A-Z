package Replit;

import java.util.Scanner;

public class R95_Bread2 {
    public static void main(String[] args) {
        //revision related to the question
        /*String s="anananbread amamdmdm bread";
        //        0123456
        int a= s.indexOf("bread");//index of first letter that appears
        System.out.println(a);//prints > 6

         */
        // Murat Kara
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str2 = str;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str2.contains("bread")) {
                str2 = str2.replaceFirst("bread", "");
                count++;
            }
        }
        if (str.length() <= 10 || count <= 1) {
            System.out.println("nothing");
        } else {
            System.out.println(str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));
        }


    }
}
