public class App {
    public static void main(String[] args) {

        Animal animal = Animal.DOG;

        switch (animal) {
            case CAT:
            case MOUSE:
            case DOG:
                System.out.println(Animal.DOG.name());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + animal);
        }

        System.out.println(Animal.DOG);
        System.out.println("Enum name as a string: " + Animal.DOG.name());

        System.out.println(Animal.DOG.getClass());

        System.out.println(Animal.DOG instanceof Enum);

        System.out.println(Animal.MOUSE.getName());

        Animal animal1 = Animal.valueOf("CAT");

        System.out.println(animal1);
    }
}

