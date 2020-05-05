package day34_CustomClass;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;


    //Parameter local variables: localVarNames should be different than instanceVarNames but if you wanna keep it same just add this. to instanceVarNames
    public void setDogInfo(String breed, String size, int age, String color, String name){
       this.breed = breed; // this.instanceVarName=localVarName
       this.size = size; // this.instanceVarName=localVarName
       this.age = age; // this.instanceVarName=localVarName
       this.color = color;// this.instanceVarName=localVarName
       this.name = name;// this.instanceVarName=localVarName
       // this keyword is used for calling object instance (instance variables)
        // if you don't include this. it's not gonna call instance var local var will be assigned to local var
        // ex: breed= breed // only local it does not refer to instance variable
    }


    public String toString(){
        return "Dog Name: "+name+", breed: "+
                breed+", size: "+size+", color:"+color+", age: "+age;
    }



}
