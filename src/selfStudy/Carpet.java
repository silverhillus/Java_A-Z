package selfStudy;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost() {
        double total = (width + length) * unitPrice; //total price
        return (isPersian) ? total + 200 : total; // if it's persian add 200 to total.
    }
    public void customOrder(double width, double length, double unitPrice, boolean isPersian){
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;

    }

    public String toString(){
        return "Width: "+ width+"\nLength: "+length+"\nUnit Price: "+unitPrice+"\n Persian: "+isPersian+
                "\nTotal Cost: "+ calcCost();
    }

}

