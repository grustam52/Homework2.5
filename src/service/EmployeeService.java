package service;

import model.Employee;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee add(String firstName, String lastName, int salary, int departmentId);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);
}
