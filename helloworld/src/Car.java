public class Car extends Machine{

    @Override
    public void start(){
        System.out.println("Car Started");
    }

    public void wipeWindShield(){
        System.out.println("Wiping Windshield.");
    }

    public void showInfo(){
        System.out.println("Car name: " + name);
    }
}
