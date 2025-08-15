package com.prabhat.practice;
// Question: Demonstrate all major Java Reflection use cases.
// Explanation: This class shows how to use reflection for common interview questions, including listing methods, fields, constructors, instantiating objects, invoking methods, accessing private fields, working with annotations, checking interfaces, getting superclasses, and creating arrays.

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

// Example annotation for demonstration
@Retention(RetentionPolicy.RUNTIME)
@interface DemoAnnotation {}

@DemoAnnotation
class Dummy {
    private String secret = "old";
    public Dummy() {}
    public void sayHello() { System.out.println("Hello from Dummy"); }
}

public class ReflectionExample {
    // 1. List all methods of a class
    public static void listMethods(Class<?> clazz) {
        System.out.println("Methods:");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(m.getName());
        }
    }

    // 2. List all fields of a class
    public static void listFields(Class<?> clazz) {
        System.out.println("Fields:");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(f.getName());
        }
    }

    // 3. List all constructors of a class
    public static void listConstructors(Class<?> clazz) {
        System.out.println("Constructors:");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) {
            System.out.println(c);
        }
    }

    // 4. Instantiate an object using reflection
    public static Object instantiate(Class<?> clazz) throws Exception {
        System.out.println("Instantiating: " + clazz.getName());
        return clazz.getDeclaredConstructor().newInstance();
    }

    // 5. Invoke a method using reflection
    public static void invokeMethod(Object obj, String methodName) throws Exception {
        System.out.println("Invoking method: " + methodName);
        Method m = obj.getClass().getMethod(methodName);
        m.invoke(obj);
    }

    // 6. Access and modify a private field
    public static void accessPrivateField(Object obj, String fieldName, Object newValue) throws Exception {
        Field f = obj.getClass().getDeclaredField(fieldName);
        f.setAccessible(true);
        System.out.println("Old value: " + f.get(obj));
        f.set(obj, newValue);
        System.out.println("New value: " + f.get(obj));
    }

    // 7. Get and use annotations at runtime
    public static void getAnnotations(Class<?> clazz) {
        System.out.println("Annotations:");
        for (Annotation a : clazz.getAnnotations()) {
            System.out.println(a);
        }
    }

    // 8. Check if a class implements an interface
    public static void checkImplementsInterface(Class<?> clazz, Class<?> iface) {
        boolean implementsIt = Arrays.asList(clazz.getInterfaces()).contains(iface);
        System.out.println(clazz.getName() + " implements " + iface.getName() + ": " + implementsIt);
    }

    // 9. Get superclass and interfaces of a class
    public static void getSuperAndInterfaces(Class<?> clazz) {
        System.out.println("Superclass: " + clazz.getSuperclass());
        System.out.println("Interfaces: " + Arrays.toString(clazz.getInterfaces()));
    }

    // 10. Create an array using reflection
    public static void createArray(Class<?> componentType, int length) {
        Object array = Array.newInstance(componentType, length);
        System.out.println("Created array of type " + componentType.getName() + " and length " + length);
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Dummy.class;
            listMethods(clazz);
            listFields(clazz);
            listConstructors(clazz);
            Object obj = instantiate(clazz);
            invokeMethod(obj, "sayHello");
            accessPrivateField(obj, "secret", "newSecret");
            getAnnotations(clazz);
            checkImplementsInterface(clazz, java.io.Serializable.class);
            getSuperAndInterfaces(clazz);
            createArray(String.class, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
