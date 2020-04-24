package day06_Shorthnd_LogicalOperators;

/*
1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

3. manually calculate the following code fragments:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;

 */

public class Practice_UnaryOperators {
    public static void main(String[] args) {

        //1_ gallons to liters
        double g = 12.3;
        double l = g * 3.78;
        String result = g + " gallons is equal to " + l + " liters";
        System.out.println(result);

        // 2_ litters to gallons
        double liters = 5.7;
        double gallons = liters / 3.785;
        String result1 = liters + " liters is equal to " + gallons + " gallons";
        System.out.println(result1);

        //3_1
        int a = 200;//200/201-1=200/200/199 ==>> so a stops at 199
             int b = -a++ + - --a * a-- % 2;
        System.out.println(b);

        //3_2
        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        System.out.println(z);



    }

}
