package com.example.mysingleton;

public class SingleTon {
    private static SingleTon obj;
    private SingleTon(){ // creating private constructor
    }
    public static SingleTon getInstance(){ //creating static method to get instance
        if (obj==null){
            obj=new SingleTon();
        }
        return obj;
    }
    public void getSomething(){
        System.out.println("This is singleton class to be used in retrofit");
    }
}
//So, the singleton class is different from a normal Java class in terms of instantiation.
// For a normal class, we use a constructor, whereas for singleton class we use the getInstance()method.
// The singleton design pattern is used to restrict the instantiation of a class and ensures that only one instance of the class exists in the JVM.
// In other words, a singleton class is a class that can have only one object (an instance of the class) at a time per JVM instance.
// There are various ways to design/code a singleton class.