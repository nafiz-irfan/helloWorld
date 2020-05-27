public class App {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    private static int factorial(int val) {
        if (val == 1) return 1;

        return factorial(val - 1) * val;
    }
}

