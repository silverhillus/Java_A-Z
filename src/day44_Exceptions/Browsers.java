package day44_Exceptions;
//It's not a good habit to create multiple classes in 1 file but in order to see it better we created all in 1.

public class Browsers { // super class
    protected void openBrowser() {
        System.out.println("Opening the default browser");
    }

    protected void closeBrowser() {
        System.out.println("Closing the default browser");
    }
}

    class ChromeBrowser extends Browsers{ // sub class inherited from Browsers super class
         /* methods inherited but needs to be overridden
          openBrowser()
          closeBrowser()
         */
        // access modifier should be same or more visible when overriding
        // everything must be same but different function!
         @Override //
        protected void openBrowser(){ // the up arrow on the left indicates this method is overridden
            System.out.println("Opening the Chrome browser");
        }
        @Override
        protected  void closeBrowser(){ // the up arrow on the left indicates this method is overridden
            System.out.println("Closing the Chrome browser");
        }
    }

class FirefoxBrowser extends Browsers {
    @Override
    public void openBrowser(){
        System.out.println("Opening the firefox browser");
    }

    @Override
    public void closeBrowser(){
        System.out.println("Closing the firefox browser");
    }
}

    class Test{
        public static void main(String[] args) {
            // create an obj from ChromeBrowser sub class to test
            ChromeBrowser obj = new ChromeBrowser();
            obj.openBrowser();

            System.out.println("==================================");
            FirefoxBrowser obj2 = new FirefoxBrowser();
            obj2.openBrowser();
            obj2.closeBrowser();


        }
    }







