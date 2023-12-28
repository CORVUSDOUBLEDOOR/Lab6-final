package UML;

public class Employee {
    String name;
    double salary;
    Employee(){
        name = "unknow";
        salary = 0;
    }
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double calSalary(){
        return salary;
    }
    public String toString() {
        return "I am " + name + ". " +
                "I am an employee." + "\n" +
                "My salary is " + salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
