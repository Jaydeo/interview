package org.designpattern.creational.singleton;

import java.io.Serializable;

/** Singleton can be break using below practise
 * JAVA Reflection
 * Singleton.class.getDeclaredConstructor();
 * constructor.setAccess(true);
 * constructor.newInstance();
 *
 *Serializable while deserialize wil create new instance
 * objectOutputStream.writeObject(Singleton.getInstance);
 * objectInputStream.readObject(); singleton2.hashcode()
 *
 */

public class Singleton implements Serializable,Cloneable {
    /** volatile prevent in multithreaded environment like Race Condition */
    private static  volatile Singleton instance;
    private Singleton(){}

    /** prevent Refection */
  /*  private Singleton(){
        if(instance==null ||instance!=null){
            throw new RuntimeException();
        }
    }*/


    /** double null check with synchronised prevent Race condition */
    public static Singleton getInstance(){
        if(null==instance){
            synchronized (Singleton.class){
                if(null==instance){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
/** prevent clonable */
    @Override
    protected Object clone() throws CloneNotSupportedException {
       //throw new CloneNotSupportedException("create Singletion Class object using getInstance");
        return super.clone();
    }

    /** Prevent deserialization from creating a new instance */
  /*  protected Object readResolve(){
        return getInstance();
    }*/



}

/** to prevent classloader need to use Enum */
/*Public Enum Singleton{
    INSTANCE;
}*/
