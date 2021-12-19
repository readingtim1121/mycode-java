package inheritance;

class Person {
    int age;
    String name;

    Person(int a, String b) {
        age = a;
        name = b;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getname() {
        return name;
    }

    public void setname(String b) {
        name = b;
    }

    public int calSalary(int sly) {
        return sly * 2;
    }
}

class Student extends Person {
    int sn;

    Student(int a, String b, int c) {
        super(a, "b");
        sn = c;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int a) {
        sn = a;
    }

    @Override
    public int calSalary(int sly) {
        return sly * 0;
    }

}

class Highschool extends Student {
    String schoolname;

    Highschool(int a, String b, int c, String d) {
        super(a, "b", c);
        schoolname = d;
    }

    public String getschoolame() {
        return schoolname;
    }

    public void setname(String b) {
        schoolname = b;
    }

    @Override
    public int calSalary(int sly) {
        return sly * 3;
    }

}

public class App {

    public static void main(String[] args) throws Exception {

        Person tim = new Person(9, "owen");
        Student s = new Student(10, "tim", 100464);
        Highschool h = new Highschool(10, "tim", 100464, "Chengon");

        System.out.println(tim.getAge());
        System.out.println(tim.getname());
        System.out.println(s.getAge());
        System.out.println(s.getname());
        System.out.println(h.getAge());
        System.out.println(h.getschoolame());
    }

}
