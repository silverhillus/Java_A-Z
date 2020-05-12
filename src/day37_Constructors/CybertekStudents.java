package day37_Constructors;

public class CybertekStudents {

    static String schoolName;
    String studentName; // we must need to know
    int groupNumber; // we must need to know
    String batch; // we must need to know

    public CybertekStudents( String studentName, int groupNumber, String batch){
        schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+
                ", in group: "+groupNumber+", School name: "+schoolName;
    }



}
