package UML;

public class Manager extends Employee{
    String parkingNo;
    Manager(String name, double salary, String parkingNo){
        super(name, salary);
        this.parkingNo = parkingNo;
    }
    public double calSalary(){
        return salary;
    }
    public String toString() {
        return "I am "+ super.name +". "+
                "I am a manager." + "\n" +
                "My salary is " + calSalary();
    }
    public String getParkingNo() {
        return parkingNo;
    }
    public void setParkingNo(String parkingNo) {
        this.parkingNo = parkingNo;
    }
}