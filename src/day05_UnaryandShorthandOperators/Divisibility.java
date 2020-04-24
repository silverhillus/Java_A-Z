package day05_UnaryandShorthandOperators;
/*
      2. write a program that can check if a number is evenly divisible by 2, 3, 5,
          Ex:
              number = 65; (int)
              divisibleBy2==> true or false
              divisibleBy3==> true or false
              divisibleBy5==> true or false


          output:
              65 is divisible by 2: false
              65 is divisible by 3: false
              65 is divisible by 5: true

       */
public class Divisibility {
    public static void main(String[] args) {

        int num = 65;
        boolean divisibleBy2 = num % 2 == 0;
        boolean divisibleBy3 = num % 3 == 0;
        boolean divisibleBy5 = num % 5 == 0;

        String result1= num + " is divisible by 2: " + divisibleBy2;
        String result2= num + " is divisible by 3: " + divisibleBy3;
        String result3= num + " is divisible by 5: " + divisibleBy5;
        String finalResult = result1 + "\n" + result2 + "\n"+ result3;

        // System.out.println(result1 + "\n" + result2 + "\n"+ result3 ); it could be like this or // concatenation

        System.out.println(finalResult);

    }
}
