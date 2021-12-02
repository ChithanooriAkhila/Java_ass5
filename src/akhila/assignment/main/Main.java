package akhila.assignment.main;

import akhila.assignment.data.Data;
import akhila.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data dataObject=new Data();
        dataObject.printVariables();
        dataObject.printLocalVariables();
        Singleton singletonObj = Singleton.initialize("creating object");
        singletonObj.printVariable();
    }
}
