package day08_IfStatements;
/*
The marks obtained by a student in 3 different subjects are input by the user.
Your program should calculate the average of subjects. The student gets a grade as per the following rules:
AVERAGE GRADE
90-100A
80-89B
70-79C
60-69D
0-59F
 */

public class MultiBranchIf_Practice {
    public static void main(String[] args) {
        double score=45;
        boolean AGrade= score >=90 && score <=100;
        boolean BGrade= score >= 80 && score <90;
        boolean CGrade= score >= 70 && score <80;
        boolean DGrade= score >= 60 && score <70;
        // Since I'm using multi branch if so last option is not required

/*        if (AGrade){
            System.out.println(score + " is: A");
        }
        else if (BGrade){
            System.out.println(score + " is: B");
        }
        else if (CGrade){
            System.out.println(score + " is: C");
        }
        else if (DGrade){
            System.out.println(score + " is: D");
        }else {                                  // Last option so it's else only.
            System.out.println(score + " is: F");
        }

 */


        System.out.println("===================");



        //Version 2_With char

        char grade =' ';//define a char variable called grade with any INITIAL VALUE.


        if(AGrade){
            grade = 'A';

        } else if(BGrade){
            grade = 'B';

        } else if(CGrade){
            grade = 'C';

        } else if(DGrade){
            grade = 'D';

        } else {
            grade = 'F';
        }
        System.out.println( "Score "+score +" is: "+grade );





        /*String grade = "Ali"; // define a String variable called grade with any INITIAL VALUE.

        if (AGrade){
            grade="A";
        }
        else if (BGrade){
            grade="B";
        }
        else if (CGrade){
            grade="C";
        }
        else if (DGrade){
            grade="D";
        }else {                                  // Last option so it's else only.
            grade="F";
        }

         */






    }
}
