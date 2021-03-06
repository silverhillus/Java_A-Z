package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;
/*
create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
 */

public class School { // school HAS A relationship with Student class
    public static void main(String[] args) {
        Student student1= new Student();
        Student student2= new Student();
        Student student3= new Student();
        ArrayList<Student>studentList= new ArrayList<>();
        studentList.addAll(Arrays.asList(student1,student2,student3));

        // student objects needs to be initialised
        student1.setStudentInfo( "bahtiyar", 35,'M',2345,"testing" );
        student2.setStudentInfo( "Fatih", 32,'M',2378,"Math" );
        student3.setStudentInfo( "byakl", 10,'M',2309,"soccer");


        for (Student each : studentList){
            //System.out.println(each); // Name: null, ID: 0,  age: 0, gender:  , class: null, school: Cybertek
            System.out.println("name: "+each.name+", ID: "+each.studentID);

        }
    }
}
