public class App {
    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.setId(1);

        Car car = new Car();
        car.setId(2);

        car.run();
        camera.run();
    }
}

