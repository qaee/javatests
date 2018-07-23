package de.vf.jdk10.interfaces;

public class EmployeeFriend implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeFriend{" +
                "name='" + name + '\'' +
                '}';
    }

    public EmployeeFriend clone() throws CloneNotSupportedException{
        return (EmployeeFriend) super.clone();
    }
}
