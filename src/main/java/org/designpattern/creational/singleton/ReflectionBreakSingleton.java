package org.designpattern.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionBreakSingleton {
    public static void main(String[] args) {
        try {
           Singleton instance1 = Singleton.getInstance();

            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton instance2 = constructor.newInstance(); // Creates a new instance

           // System.out.println(instance1.hashCode()); // Different hash codes, proving Singleton is broken
            System.out.println(instance2.hashCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
