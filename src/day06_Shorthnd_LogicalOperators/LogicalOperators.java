package day06_Shorthnd_LogicalOperators;
/*
        Logical Operators
        &&     Bitwise logical AND // when both are correct
        ||     Bitwise Logical Inclusive OR
        ^      Bitwise Logical Exclusive OR
 */

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean result1 = true;
        System.out.println(!result1); // ! logical opposite
        System.out.println("===================");

        // boolean result2 = 10+15>15; // true
        boolean result2 = !(10+15>15); // false
        System.out.println(result2);
        System.out.println("===================");

        boolean result3 = !true ==!false; // make sure it's == // false ==  true  ==> false
        System.out.println(result3);
        System.out.println("===================");


        // &&     Bitwise logical AND // when both are correct
        /*
        Logical conjunction
        p	q	p ∧ q
        T	T	T
        T	F	F
        F	T	F
       F	F	F

         */

        boolean r1 = 10>15 && 3< 1; // T && F >> F
        System.out.println(r1);
        System.out.println("===================");


        boolean r2 = 'a'== 'b'-1 && 'b'+1=='c'; // T && T >> T
        System.out.println(r2);
        System.out.println("===================");


        boolean r3 = "Corona Virus" != "End of the world"   && "Toilet paper" =="Cure";
        //                      true       &&   false   ==> false
        System.out.println(r3);
        System.out.println("===================");

        /* ||   Bitwise Logical Inclusive OR
        Logical disjunction (OR )
        p	q	p ∨ q
        T	T	T
        T	F	T
        F	T	T
        F	F	F

         */

        boolean r4 = true != false || false == !true; // T or T >> T
        System.out.println(r4);

        boolean r5 = true != false && false == !true; // T and T >> T
        System.out.println(r5);

        boolean r6 = !true;
        /* '!' negates>> false // 2 negates>> neutral so
        !! true==true (even number of ! result > same)
        !!! true==false (odd number of ! result >opposite)
         */

        boolean r7 = !!! false; // opposite






    }
}
