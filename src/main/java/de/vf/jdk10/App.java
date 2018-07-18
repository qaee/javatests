package de.vf.jdk10;

import de.vf.model.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Employee> employees = mockEmployees();

        Collections.sort(employees, Comparator.comparing(Employee::getSalary,Comparator.nullsLast(Comparator.naturalOrder())));
        employees.forEach(employee -> System.out.println(employee.print()));
    }

    static List<Employee> mockEmployees() {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("Qasim Ali");
        employee1.setSalary(4000d);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setSalary(4001d);

        Employee employee3 = new Employee();
        employee1.setName("Faiza Ali");
        employee3.setId(3);

        return Arrays.asList(employee1, employee2,employee3);
    }
}
