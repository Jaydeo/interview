package org.designpattern.creational.singleton;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderBreakSingleton {
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();

        // Load Singleton class using a different class loader
        URL classUrl = new URL("file://path_to_classes_directory/");
        URLClassLoader classLoader = new URLClassLoader(new URL[]{classUrl});
        Class<?> singletonClass = classLoader.loadClass("Singleton");
        Method getInstanceMethod = singletonClass.getMethod("getInstance");
        Object instance2 = getInstanceMethod.invoke(null); // New instance

        System.out.println(instance1.hashCode()); // Different hash codes
        System.out.println(instance2.hashCode());
    }
}
