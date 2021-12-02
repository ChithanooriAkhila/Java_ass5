package akhila.assignment.singleton;

public class Singleton {
    String inputString;
    public static Singleton initialize(String inputString){
        //cannot access inputString as static method cannot access non static members
        Singleton obj=new Singleton();
        obj.inputString=inputString;
        return obj;
    }
    public void printVariable(){
        System.out.println(inputString);
    }
}
