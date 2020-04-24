package day11_Scanner;
/* 3. write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names,
                        output should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task

 */

public class Switch_WTask_Browser {
    public static void main(String[] args) {

        String browserName="CHROME";// Chrome or chrome should be accepted by
        switch (browserName){
            case "Chrome":
            case "chrome"://
            case "CHROME"://You can include multiple cases before the break statement.
                System.out.println("Chrome is opening...");
                break; // if you remove this break statement it'll also execute the next case print statement.
            case "Firefox":
            case "firefox":
                System.out.println("Firefox is opening...");
                break;
            case "Opera":
            case "opera":
                System.out.println("Opera is opening...");
                break;
            case "Safari":
            case "safari":
                System.out.println("Safari is opening...");
                break;
            default:
                System.out.println("Invalid browser name!");


        }



    }
}
