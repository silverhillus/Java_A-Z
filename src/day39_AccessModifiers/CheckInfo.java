package day39_AccessModifiers;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println("Name: "+ PersonalInfo.name); // name is public so it can be called with className. It has one copy bc it's a static
        System.out.println("Gender: "+ PersonalInfo.gender); // gender is public so it can be called with className.It has one copy bc it's a static

        System.out.println("Grade: " + PersonalInfo.grade ); // grade is default
        System.out.println("Age: "+ PersonalInfo.age);// age is default

      //  System.out.println( "SSN: "+PersonalInfo.SSN ); // private is only accessible with in same class
      //  System.out.println( "ID: "+PersonalInfo.ID );


        PersonalInfo obj = new PersonalInfo();
        System.out.println( obj.name);
        System.out.println( obj.gender);

        System.out.println(obj.grade);
        System.out.println(obj.age);

      //  System.out.println(obj.SSN);
       //  System.out.println( obj.ID );


    }


}
