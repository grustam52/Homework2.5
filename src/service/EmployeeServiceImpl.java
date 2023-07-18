package service;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee add(String firstName, String lastName, int salary, int departmentId) {
        Employee employee = new Employee(firstName, lastName, salary, departmentId);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;}
        return null;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)){
            employeeList.remove(employee);
            return employee;
        }
        return null;
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        if (employeeList.contains(employee)){
            return employee;

        }
        return employee;
    }

}
