package day25_Methods_Recap;
/*
Warm up tasks:
	1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"},
				then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS

	2. do the first task with multi-branch if statement instead of switch statement

 */

public class getDriver {

    public static String getDriver1(String browser1) {
        browser1 = browser1.toLowerCase();
        String result = "";
        switch (browser1) {
            case "chrome":
                result = "Chrome Driver";
                break;

            case "firefox":
                result = "Firefox Driver";
                break;
            case "id":
                result = "Internet Driver";
                break;
            case "safari":
                result = "Safari Driver";
                break;
            case "edge":
                result = "Edge Driver";
                break;
            case "opera":
                result = "Opera Driver";
                break;
            default:
                result = "Invalid Driver";
        }
        return result;

    }

    public static String getDriver2(String browser2) {
        String result1 = "";
        if (browser2.equalsIgnoreCase("chrome")) {
            result1 = "Chrome Driver";
        } else if (browser2.equalsIgnoreCase("firefox")) {
            result1 = "Firefox Driver";
        } else if (browser2.equalsIgnoreCase("id")) {
            result1 = "Internet Explorer Driver";
        } else if (browser2.equalsIgnoreCase("safari")) {
            result1 = "Safari Driver";
        } else if (browser2.equalsIgnoreCase("edge")) {
            result1 = "Edge Driver";
        } else if (browser2.equalsIgnoreCase("opera")) {
            result1 = "Opera Driver";
        } else {
            result1 = "Invalid Driver";
        }
        return result1;

    }

    public static String getDriver3(String browser3) {
        String result = "";
        result = browser3.equalsIgnoreCase("chrome") ? "Chrome Driver" : browser3.equalsIgnoreCase("firefox") ? "Firefox Driver" :
                browser3.equalsIgnoreCase("id") ? "Internet Explorer Driver" : browser3.equalsIgnoreCase("safari") ? "Safari Driver" :
                        browser3.equalsIgnoreCase("edge") ? "Edge Driver" : browser3.equalsIgnoreCase("opera") ? "Opera Driver" : "Invalid Driver";
        return result;
    }


    public static void main(String[] args) {

        String str = "FireFOX";

        String dr = getDriver1(str);
        System.out.println(dr);

        String dr2 = getDriver2("ChroMe");
        System.out.println(dr2);
        dr2 = getDriver3("FireFOX");
        System.out.println(dr2);

    }


}
