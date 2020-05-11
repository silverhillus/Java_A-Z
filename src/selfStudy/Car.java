package selfStudy;

public class Car {
    //instance variables
    String brand;
    String model;
    String color;
    int year;

    //now let's create instance methods to have some functions with the car
    //instance method does NOT INCLUDE : static
    public void start(){ // object method >> action
        System.out.println(brand+" is started!");
    }
    //Go to CarsObject and try

    public void drive(){ // object method >> action
        System.out.println(brand+" is driving!");
    }
    //Go to CarsObject and try

    public void getCarInfo(){ // object method >> action
        System.out.println(brand+", "+color+", "+model+", "+year);
    }
    //Go to CarsObject and try

    //let's create a setCarInfo() method
    public void setCarInfo(String brand,String model,String color,int year){
        //now assign those local variables to instanca variables
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.year=year;
    }

    //how do you directly print car object?
    // Create a toString Method to do that!!
    // ex : System.out.println(car1);
    public String toString(){
        return (brand+", "+color+", "+model+", "+year);
    }





}
