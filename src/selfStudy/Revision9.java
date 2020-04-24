package selfStudy;

public class Revision9 {
    public static void main(String[] args) {

        String str="level";
        String rev="";
        int max=str.length()-1;

        while (max>=0){
            rev+=str.charAt(max);
            max--;
        }
        System.out.println(rev);
        boolean pal=str.equalsIgnoreCase(rev);
        System.out.println(pal);




    }
}
