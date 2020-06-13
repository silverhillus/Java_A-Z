package day49_Polymorphism;

/*
    5. create a class named iPhone that can inherit from AppleApps interface
    actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
 */
// regular class inherited abstract class and inherited interface
public final class iPhone extends Phone implements AppleApps { // final prevents iPhone class to be inherited
    // we need to override abstract methods

    static{ // static block
        brand = "Apple";
    }
//sub classes of Phone, create a constructor to initialize the instances
    public iPhone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void download() {
        System.out.println("iPhone is downloading apps from "+AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling to "+phoneNumber);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming to "+phoneNumber);
    }

    public void selfie(){
        System.out.println(model+ " takes a great selfie");
    }




}

