package selfStudy;

public class CarObjects {
    public static void main(String[] args) {
       //Class object = new object
        Car car1 = new Car(); // custom created objects from Car class
        car1.brand="BMW"; //Data type String // how you define features of the car1 object >> car1's brand
        car1.color="White";
        car1.model="X5";
        car1.year=2012;
        //that's how initialized
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.model);
        System.out.println(car1.year);

        car1.start(); // it has print statement already so it'll print >> BMW is started!
        car1.drive(); // BMW is driving!
        car1.getCarInfo();

        System.out.println("=========");
        Car car2 = new Car(); // custom created objects from Car class
        car2.brand="Merceds"; //Data type String // how you define features of the car1 object >> car1's brand
        car2.color="White";
        car2.model="clk";
        car2.year=2015;
        car2.getCarInfo();

        Car car3 = new Car(); // custom created objects from Car class
        car3.brand="Honda"; //Data type String // how you define features of the car1 object >> car1's brand
        car3.color="Silver";
        car3.model="Accord";
        car3.year=2008;
        car3.getCarInfo();

        //Let's create a Car Arrays
        Car [] gallery={car1,car2,car3};
        for (Car each : gallery){
            each.getCarInfo();
        }

        System.out.println("========");
        Car car4= new Car();
        car4.setCarInfo("Nissan","Altima","Black",2013);
        car4.getCarInfo();

        // how do you directly print car1?
        // Create a toString Method to do that!!
        System.out.println(car1); // selfStudy.Car@61bbe9ba
        System.out.println(car1); // BMW, White, X5, 2012




    }
}
