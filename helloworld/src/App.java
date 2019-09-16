

public class App {
    public static void main(String [] args){

        int[] values = {3, 5, 1234};

//        System.out.println(values[2]);

        int[][] grid = {
                {3, 5, 234},
                {2, 4, 123},
                {1, 3, 12},
        };
//        System.out.println(grid[2][0]);

        String[][] texts = new String[2][3];

        texts[0][1] = "HELLO THERE";

//        System.out.println(texts[1][2]);

//        for (int row=0; row<grid.length; row++){
//            for (int col=0; col<grid[row].length; col++){
//                System.out.print(grid[row][col] + "\t");
//            }
//            System.out.println();
//        }

        String[][] words = new String[2][];
//        System.out.println(words[0]);

        words[0] = new String[3];
        words[0][1] = "hi there";

        System.out.println(words[0][1]);
    }
}

