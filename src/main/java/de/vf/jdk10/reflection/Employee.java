package de.vf.jdk10.reflection;

import java.util.Date;

public class Employee implements Cloneable {

    private String name;
    private Double salary;
    private Date date;
    private EmployeeFriend employeeFriend;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    protected Employee clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        employee.setEmployeeFriend(employee.getEmployeeFriend().clone());
     return employee;
    }

    public EmployeeFriend getEmployeeFriend() {
        return employeeFriend;
    }

    public void setEmployeeFriend(EmployeeFriend employeeFriend) {
        this.employeeFriend = employeeFriend;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                ", employeeFriend=" + employeeFriend +
                '}';
    }
}
