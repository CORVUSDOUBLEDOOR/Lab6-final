package Guardian;

public class Person {
    String name;
    int bornYear;
    Person(){
        name = "unknow";
        bornYear = 0;
    }
    public Person(String name, int bornYear){
        this.name = name;
        this.bornYear = bornYear;
    }
    public void introduce(){
        System.out.println("My name is "+ name);
        System.out.println("I was born in "+ bornYear);
    }
}
