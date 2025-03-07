package org.designpattern.creational.singleton;

import java.io.*;

public class SerializableBreakSingleton {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance=Singleton.getInstance();
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("serializable.ser"));
        outputStream.writeObject(instance);

        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("serializable.ser"));
        Singleton instance2= (Singleton) inputStream.readObject();
        System.out.println("instance1 "+instance.hashCode());
        System.out.println("instance2 "+instance2.hashCode());
    }
}
