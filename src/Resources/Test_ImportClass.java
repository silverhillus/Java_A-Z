package Resources;

import selfStudy.Car; // Car class imported from selfStudy package

public class Test_ImportClass {
    public static void main(String[] args) {
        //How can I use the custom class called Car which is in different package?
        // import selfStudy.Car; the package is imported now I can use it!
        Car car1= new Car();
        System.out.println(car1); // null, null, null, 0
        car1.getCarInfo(); // null, null, null, 0
        car1.setCarInfo("toyota", "prius","blue",2012); // car1 has been initialized
        System.out.println(car1); // toyota, blue, prius, 2012



    }
}
