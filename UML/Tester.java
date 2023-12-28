package UML;
public class Tester {
    public static void main(String[] args) {
        Employee [] array = new Employee[5];
        Sales s1 = new Sales("Jame",15000,5000);
        Sales s2 = new Sales("Bell",20000,8000);
        array [0] = s1;
        array [1] = s2;
        Manager m1 = new Manager("Peter",40000,"40-19");
        array [2] = m1;
        String[]skillsP1 = {"Java","C"};
        String[]skillsP2 = {"Java","PHP","Python"};
        Programmer p1 = new Programmer("Ann",30000,skillsP1);
        p1.setOT(10000);
        Programmer p2 = new Programmer("Bank",40000,skillsP2);
        p2.setOT(8000);
        array [3] = p1;
        array [4] = p2;
        for (Employee employee : array) {
            System.out.println(employee);
        }
    }
}