package Guardian;

public class Sheriff extends Person {
    String workState;
    public Sheriff(String name, int bornYear, String workState){
        this.name = name;
        this.bornYear = bornYear;
        this.workState = workState;
    }
    public void introduce(){
        System.out.println("My name is "+ name);
        System.out.println("I was born in " + bornYear);
        System.out.println("I'm a sheriff and work in "+ workState);
    }
}
