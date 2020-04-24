package day09_NestedIf_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int hour = 19;
        String result = (hour<12)?"Good morning":(hour>12 && hour<18)?"Good afternoon":"Good evening";
        System.out.println(result);

        // divisible by 15

        int num=1200;
        boolean divisibleBy3And5= (num % 3==0 && num % 5==0 )? true:false;
        System.out.println(divisibleBy3And5);

        // divisible by 6

        int num2 =73;
        String divisibleOf2By3= (num2 % 2==0 && num2 % 3==0)? "it's divisible by 6" : "it's not divisible by 6";
        System.out.println(divisibleOf2By3);
    }


}
