package de.vf.jdk10.interfaces;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee();
        e1.setName("Qasim Ali");
        e1.setSalary(200000d);
        e1.setDate(new Date());
        EmployeeFriend ef = new EmployeeFriend();
        ef.setName("Kashif Mushtaq ");
        e1.setEmployeeFriend(ef);
        Object clone = e1.clone();
        Employee e2 = (Employee) clone;
        e2.setSalary(200d);
        e2.setDate(new Date(100));
        e2.getEmployeeFriend().setName("Saqib Nasir");
        System.out.println(e1);
        System.out.println(e2);
    }
}
