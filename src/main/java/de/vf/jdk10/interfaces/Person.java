package de.vf.jdk10.interfaces;

public interface Person {
    default String getName() {
        return "Hiba Ali";
    }
    int nextId();
}
