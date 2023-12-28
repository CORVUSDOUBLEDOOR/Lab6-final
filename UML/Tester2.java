package UML;
import java.util.Scanner;
public class Tester2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number of person : ");
        int n = kb.nextInt();
        Employee [] list = new Employee[n];
        int count1 = 1;
        int count2 = 1;
        int count3 = 1;
        int count4 = 1;
        for(int i = 0 ; i < n; i++){

            System.out.printf("Enter information of person (%s) : \n",(i+1));
            System.out.print("Enter type of person : ");
            int type = kb.nextInt();
            if(type == 1){
                System.out.printf("Enter employee information (%s) [name salary] : ",count1);
                String name = kb.next();
                double salary = kb.nextDouble();
                Employee employee = new Employee(name, salary);
                list[i] = employee;
                count1++;
            }
            if(type == 2){
                System.out.printf("Enter Sale information (%s) [name salary commission] : ",count2);
                String name = kb.next();
                double salary = kb.nextDouble();
                double commission = kb.nextDouble();
                Sales sales = new Sales(name, salary, commission);
                list[i] = sales;
                count2++;
            }
            if(type == 3){
                System.out.printf("Enter Manager information of person (%s) [ name salary parkNo ] : ",count3);
                String name = kb.next();
                double salary = kb.nextDouble();
                String parkNo = kb.next();
                Manager manager = new Manager(name, salary, parkNo);
                list[i] = manager;
                count3++;
            }
            if(type == 4){
                System.out.printf("Enter Programmer in formation (%s) [ name salary OT ] : ",count4);
                String name = kb.next();
                double salary = kb.nextDouble();
                int OT = kb.nextInt();
                System.out.print("Enter number of programming language : ");
                int programmingLanguage = kb.nextInt();
                String [] progSkills = new String[programmingLanguage];
                for(int j = 0; j < programmingLanguage; j++){
                    System.out.printf("Enter name of Lang (%s) : ", (j+1));
                    String lang = kb.next();
                    progSkills[j] = lang;
                }
                Programmer programmer = new Programmer(name, salary, progSkills);
                programmer.setOT(OT);
                list[i] = programmer;
                count4++;
            }
        }
        System.out.println("<=== The detail of each person ===>");
        for(Employee employee : list){
            System.out.println(employee);
        }
    }
}
