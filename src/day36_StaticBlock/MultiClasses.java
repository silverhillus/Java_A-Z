package day36_StaticBlock;

class Tester{  // AM: default

    public static void main(String[] args) {
        System.out.println("Tester Class");
    }

}

class Developer{ // AM: default
    public static void main(String[] args) {
        System.out.println("Developer class");
    }

}


public class MultiClasses { // AM: public // only one public >> file name has to match with the public class name
    public static void main(String[] args) {
        System.out.println("public class");
    }
}


class scrumTeam{  // AM: default
    public static void main(String[] args) {
        System.out.println("Scrum Team class");
    }

}
