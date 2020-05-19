package day42_Inheritance.Task01;
/*
create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString

 */

public class Student extends Person{
    /*
   name (Inherited)
   age (Inherited)
   gender (Inherited)
   studentID
   clazz
   shcoolName = "Cybertek University" // let's make it static

    setPersonInfo() (inherited)
    eat() (inherited)
    sleep() (inherited)
    walk() (inherited)
    drink() (inherited)

   setStudentInfo
    attendClass
     code
      toString

    */
    public long studentID;
    public String clazz; // class is a Java reserved word
    public static String schoolName = "Cybertek";


    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz){
        setPersonInfo(name,age,gender); // inherited from Person class
        this.studentID=studentID;
        this.clazz=clazz;
    }
    public void attendClass(){
        System.out.println(name+" is attending "+clazz);
    }

    public void code(){
        System.out.println(name+" is coding");
    }
    public String toString(){
        return "Name: "+name+", ID: "+studentID+",  age: "+age+", gender: "+gender+", class: "+clazz+ ", school: "+schoolName;
    }


}
