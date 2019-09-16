public class App {
    public static void main(String [] args){

        Person person1 = new Person();
        person1.name = "Latipah";
        person1.age = 25;
//        person1.speak();

        int years = person1.getYearstoRetire();
        System.out.println("Years till retirement " + years);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);

        Person person2 = new Person();
        person2.name = "John";
        person2.age = 27;
//        person2.speak();

    }
}

class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    int getYearstoRetire(){
        int yearsLeft = 65 - age;
        return yearsLeft;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }
}

