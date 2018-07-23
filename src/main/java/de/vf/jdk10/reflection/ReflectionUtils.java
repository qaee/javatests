package de.vf.jdk10.reflection;

import java.util.Arrays;

public class ReflectionUtils {

    private Class cl;

    ReflectionUtils(Class cl) {
        this.cl = cl;
    }

    void printConstructors() {
        Arrays.stream(cl.getConstructors()).forEach(System.out::println);
        System.out.println(Arrays.toString(cl.getDeclaredConstructors()));
    }

    void printMethods() {
        Arrays.stream(cl.getMethods()).forEach(System.out::println);
    }

    public static void main(String[] args) {
        ReflectionUtils reflectionUtils = new ReflectionUtils(Employee.class);
        reflectionUtils.printConstructors();
        reflectionUtils.printMethods();
    }
}
