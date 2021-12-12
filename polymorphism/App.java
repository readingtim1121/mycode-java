package polymorphism;

class Person {
    int age;

    public Person(int a) { // constructor建構式
        this.age = a;
    }

    int getage(int a) {
        return age;
    }
}

class Highschool extends Person {
    int name;

    public Highschool(int a) { // constructor建構式
        super(a);
    }
}

public class App {

    public static void main(String[] args) throws Exception {

        Person tim = new Highschool(10);
        Highschool h = new Highschool(20);

        System.out.println(tim.age);
        System.out.println(h.age);
    }

}
