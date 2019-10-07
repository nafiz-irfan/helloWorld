public class Machine implements Info{

    private int id = 7;

    public void start(){
        System.out.println("Machine Started.");
    }

    public void stop(){
        System.out.println("Machine Stopped.");
    }

    public void showInfo(){
        System.out.println("Machine ID is: " + id);
    }
}
