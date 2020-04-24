package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {

        String[] friends = {"selcuk", "anna", "rahman", "muhtar"};
        //String result=friends[2];
        //System.out.println(result);

        for (int i = 0; i <= friends.length - 1; i++) {
            String result = friends[i];
            System.out.println(result);
        }

        System.out.println("=======");

        String[] cities = {"Paris", "Amsterdam", "London", "Beijing", "Tokio", "Seoul"};
        for (int i = 0; i <= cities.length - 1; i++) {
            String city = cities[i];
            System.out.println(city);

            System.out.println("============");




            String[] friend = {"Kuzzat", "Asiya", "Saim", "Akbar", "Marufjon", "Guljannat", "Murodil"};
            //          0          1         2        3        4             5           6

        /*
        System.out.println(   friends[6]   );
              String s1 =    friends[2];
        System.out.println(s1);
         */

            for (int j = 0; j <= 6; j++) {
                String name = friend[i];
                System.out.println(name);
            }


            String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

            // print out all the users who regsitered with thier gmail

            //  max:  4

            for (int j = 0; j <= 3; j++) {
                String email = emails[i];
                if (email.endsWith("@gmail.com")) {
                    System.out.println(email);
                }

            }



        }
    }
}
