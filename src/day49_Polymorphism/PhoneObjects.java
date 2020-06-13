package day49_Polymorphism;

public class PhoneObjects {
    public static void main(String[] args) {
        iPhone phone1 = new iPhone("IPhone X", 799, "Small");
        System.out.println(phone1);
        //let's call the methods
        phone1.calling(911);
        phone1.texting(911);
        phone1.faceTiming(12223444);
        phone1.download();


    }
}
