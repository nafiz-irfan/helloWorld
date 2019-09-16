public class App {
    public static void main(String [] args){

        Person person1 = new Person();
        person1.name = "Latipah";
        person1.age = 25;

        Person person2 = new Person();
        person2.name = "John";
        person2.age = 27;

        System.out.println(person1.name + " : " + person1.age);
    }
}

class Person{
    String name;
    int age;
}

