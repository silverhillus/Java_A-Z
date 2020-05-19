package Resources;

import day39_AccessModifiers.PersonalInfo;

public class checkInfo {

    public static void main(String[] args) {

        System.out.println( PersonalInfo.name );
        System.out.println( PersonalInfo.gender );

       // System.out.println( PersonalInfo.grade );
       // System.out.println( PersonalInfo.age );

      //  System.out.println( PersonalInfo.SSN );
     //   System.out.println(PersonalInfo.ID);

        PersonalInfo obj = new PersonalInfo();
        System.out.println( obj.name );
        System.out.println( obj.gender);

       // System.out.println( obj.grade );
      //  System.out.println( obj.age );

      //  System.out.println( obj.SSN );
      //  System.out.println( obj.ID );




    }


}
