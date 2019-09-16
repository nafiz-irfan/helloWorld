public class App {
    public static void main(String [] args){

        Person person1 = new Person();
        person1.name = "Latipah";
        person1.age = 25;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "John";
        person2.age = 27;
        person2.speak();
        person2.sayHello();

    }
}

class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    void sayHello(){
        System.out.println("Hello there!");
    }
}

