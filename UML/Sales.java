package UML;

public class Sales extends Employee{
    double commission;
    Sales(String name, double salary, double commission){
        super(name,salary);
        this.commission = commission;
    }
    public double calSalary(){
        return salary + commission;
    }
    public String toString() {
        return "I am "+ super.name + ". " +
                "I am a sales." + "\n" +
                "My salary is " + calSalary();
    }
    public double getCommission() {
        return commission;
    }
    public void setCommission(double commission) {
        this.commission = commission;
    }
}