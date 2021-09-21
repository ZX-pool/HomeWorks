package it;

import java.io.Serializable;

public class Emloyee implements Serializable {
    @EmployeeAnnotation(parameter = "This field is name employee")
    private String name;
    @EmployeeAnnotation(parameter = "This field is id number of employee")
    private int id;
    @EmployeeAnnotation //(parameter = "This field is value of salary employee")
    private int salary;

    public Emloyee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emloyee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
