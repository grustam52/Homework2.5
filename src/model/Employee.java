package model;

import java.util.Objects;
import java.util.Random;

public class Employee {
    private final String fistName;
    private final String lastName;
    private int salary;
    private int departmentId;

    public Employee(String fistName, String lastName) {
        Random random = new Random();
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = random.nextInt(1000) + 1000;
        this.departmentId = random.nextInt(5) + 1;
    }

    public Employee(String fistName, String lastName, int salary, int departmentId) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && departmentId == employee.departmentId && Objects.equals(fistName, employee.fistName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName, salary, departmentId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }
}
