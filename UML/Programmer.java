package UML;
import java.util.Arrays;
public class Programmer extends Employee {
    String[] progSkills;
    int OT;

    Programmer(String name, double salary, String[] progSkill) {
        super(name, salary);
        this.progSkills = progSkill;
    }

    public double calSalary() {
        return super.salary + OT;
    }
    public void setOT(int OT) {
        this.OT = OT;
    }
    public String showSkills(){
        String showskills = String.join(", ", progSkills);
        return showskills;
    }

    public String toString() {
        return "I am " + super.name + ". " +
                "I am a programmer." + "\n" +
                "My programmer skills are: " + showSkills() + "\n" +
                "My salary is " + calSalary();
    }
}