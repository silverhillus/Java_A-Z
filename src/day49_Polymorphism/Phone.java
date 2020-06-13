package day49_Polymorphism;
        /*
        Task02:
	1. create an interface named downloadable:
			variable: boolean downloadable
			abstract method: download();

	2. create an interface named AndroidApps that can inherit from downloadable interface
			variable: AppStoreName


	3. create an interface named AppleApps that can inherit from downloadable interface
			variable: AppStoreName

	4. create an abstract class named Phone
			variables: brand, model, price, size
			abstract methods: texting(), calling()
         */

interface downloadable{ // by default access modifier is public and static,final
boolean downloadable=true;
void download(); // by default public abstract(no body)
}

interface AndroidApps extends downloadable{ // inherited so we have 2 var, 1 abstract method
    String AppStoreName="Android"; // public and static,final

}
interface AppleApps extends downloadable{ // inherited so we have 2 var, 1 abstract method
    String AppStoreName="Apple"; // // public and static,final

}

public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber); // abstract method in abstract class must include abstract keyword
    // abstract method cannot be private, static and final >> it's meant to be overridden.
    //only public, protected

    public abstract void  calling(long phoneNumber);

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Size: "+size+", Price: "+price;
    }


}
