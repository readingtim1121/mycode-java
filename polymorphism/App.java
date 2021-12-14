package polymorphism;

class Person {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}

class Highschool extends Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String b) {
        name = b;
    }

}

public class App {

    public static void main(String[] args) throws Exception {

        Person tim = new Highschool();
        Highschool h = new Highschool();
        tim.setAge(10);
        h.setAge(18);

        System.out.println(tim.getAge());
        System.out.println(h.getAge());
    }

}
