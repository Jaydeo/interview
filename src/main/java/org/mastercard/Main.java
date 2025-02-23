package org.mastercard;
interface Interface1{
    default void sayHello(){
        System.out.println("hell i am from interface1");
    }
    static void sayStatic(){
        System.out.println("Hello : I am static interface1");
    }
    abstract int sum(int a,int b);
}
interface Interface2{
    default void sayHello(){
        System.out.println("hell i am from interface1");
    }
}

class MyClass implements Interface1,Interface2{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public void sayHello() {
        System.out.println("hello i am from MYCLass");
        Interface1.super.sayHello();
    }
}

public class Main {
    public static void main(String[] args) {
     Interface1 interface1=new MyClass();
     Interface1 interface11=(a,b)->a+b;
        System.out.println( interface1.sum(2,3))  ;
    }
}