public class App {
    public static void main(String [] args){

        //Inefficient example
        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

//        System.out.println(info);

        //More efficient example
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a dentist.");

//        System.out.println(sb.toString());

        // The same as above, but nicer ....
        StringBuilder s = new StringBuilder();

        s.append("My name is Roger.").append(" ").append("I am an athlete.");

//        System.out.println(s.toString());

        ///// Formatting //////////////////////////////////

        //Outputting newlines and tabs
//        System.out.println("Here is some text.\tThat was a tab.\nThat was a newline.");
//        System.out.println("More text.");

        // Formatting integers
        // %-10d means: output an integer in a space ten characters wide,
        // padding with space and left-aligning (%10d would right-align)
        System.out.printf("Total cost %-10d; quantity is %10d\n", 5 , 120);
    }
}

