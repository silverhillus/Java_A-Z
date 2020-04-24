package selfStudy;



public class test_substring {
    public static void main(String[] args) {
    String str= "breadjambread";
    //           0123456789
    //String newWord=str.substring(0,4+1); // bread
        //newWord=str.substring(0+5,5+3);
        String newWord=str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
        System.out.println(newWord);




    }
}
