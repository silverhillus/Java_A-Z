package day23_Methods;
  /*
        task:
	1. write a method that can print all odd number between 1 ~ 100
	2. write a method that can print all even number between 1 ~ 100
         */

public class method_practice2 {
    public static void main(String[] args) {
        odd1To100();
        even1To100();

    }

    public static void odd1To100(){
        for (int i=1; i<=100; i++){
            if (i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }
    // System.out.println(); // !!!! empty print statement cannot be used between two methods right?

    public static void even1To100(){

        for (int i=1; i<=100; i++){
           if (i%2!=0){
               continue;
           }
            System.out.print(i+" ");
        }
    }





}
