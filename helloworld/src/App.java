public class App {
    public static void main(String[] args) {

        String text = null;

//        System.out.println(text.length());

//        int val = 7/0;

//        System.out.println(val);

        String[] texts = {"one", "two", "three"};
        try {
            System.out.println(texts[3]);
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}

