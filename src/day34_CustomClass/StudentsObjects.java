package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsObjects {

    public static void main(String[] args) {
        Student student1=new Student();
        student1.setStudentInfo("Christopher","Chinese",16,2.9,'M',false);
        //System.out.println(student1); // day34_CustomClass.Student@61bbe9ba// toString method needs to be created in Student Class
        //toString() Method created in Student Class then
        System.out.println(student1); // Name: Christopher, Nationality: Chinese, Age: 16, GPA: 3.4,Gender: M, Married: false

        Student student2= new Student();
        student2.setStudentInfo("John","Iceland",32,2.5,'m',true);

        Student student3= new Student();
        student2.setStudentInfo("Anna","Ukrainian", 33,3.9, 'F', true);

        Student student4= new Student();
        student4.setStudentInfo("Fatih","Turkish",32,3.1, 'M', true);

        //Now let's create an array out of student objects
        Student [] students= {student1,student2,student3,student4};

        // Now let's create an ArrayList with this array
        ArrayList<Student>canGraduate= new ArrayList<>(Arrays.asList(students));
        // I wanna remove if gpa<=3.0 so I can print the students who can graduate
        canGraduate.removeIf(p-> p.gpa<=3.0); // p stands for each student objects so I can call gpa by> student.gpa

        System.out.println(canGraduate.size());// 4 so let's repeat 4 times!!

        for (int i=0; i<canGraduate.size(); i++){
            Student each=canGraduate.get(i);
            System.out.println("Name: "+each.name+" can graduate!");
        }
        System.out.println("===============");









    }


}
