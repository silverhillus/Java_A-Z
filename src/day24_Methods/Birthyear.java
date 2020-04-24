package day24_Methods;

public class Birthyear {

    public static void main(String[] args) {
        Age(1988);
    }



    public static void Age (int birthYear){

        int cuurentYear=2020;
        int age=cuurentYear-birthYear;
        // birthyear cannot be bigger than current year so age cannot be less than 0.
        if (birthYear<cuurentYear){
            System.out.println(age);
        }else{
            System.out.println("Birth year cannot be later than current year!!!");
        }


    }
}
