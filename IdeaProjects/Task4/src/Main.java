import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int neighbours(int x, int y, char[][] source) {// count of neighbours
        int number = 0;
        int i_start = 0, i_end = 0, j_start = 0, j_end = 0;
        if ((x > 0) && (y > 0) && (x < source.length - 1) && (y < source[0].length - 1)) {//counting in the middle of field
            i_start = x - 1;
            i_end = x + 1;
            j_start = y - 1;
            j_end = y + 1;
        } else if ((x == 0) && (y > 0) && (y < source[0].length - 1)) {//counting near top border
            i_start = x;
            i_end = x + 1;
            j_start = y - 1;
            j_end = y + 1;
        } else if ((x == source.length - 1) && (y > 0) && (y < source[0].length - 1)) {//counting near bottom border
            i_start = x - 1;
            i_end = x;
            j_start = y - 1;
            j_end = y + 1;
        } else if ((y == 0) && (x > 0) && (x < source.length - 1)) {//counting near left border
            i_start = x - 1;
            i_end = x + 1;
            j_start = y;
            j_end = y + 1;
        } else if ((y == source[0].length - 1) && (x > 0) && (x < source.length - 1)) {//counting near right border
            i_start = x - 1;
            i_end = x + 1;
            j_start = y - 1;
            j_end = y;
        } else if ((x == 0) && (y == 0)) {//counting in left top corner
            i_start = x;
            i_end = x + 1;
            j_start = y;
            j_end = y + 1;
        } else if ((x == 0) && (y == source[0].length - 1)) {//counting in right top corner
            i_start = x;
            i_end = x + 1;
            j_start = y - 1;
            j_end = y;
        } else if ((x == source.length - 1) && (y == 0)) {//counting in left bottom corner
            i_start = x - 1;
            i_end = x;
            j_start = y;
            j_end = y + 1;
        } else if ((x == source.length - 1) && (y == source[0].length - 1)) {//counting in right bottom corner
            i_start = x - 1;
            i_end = x;
            j_start = y - 1;
            j_end = y;
        }

        for (int i = i_start; i <= i_end; i++) {
            for (int j = j_start; j <= j_end; j++) {
                if ((i != x) || (j != y)) {
                    if (source[i][j] == '*') number++;
                }
            }
        }
        return number;
    }

    public static void printArray(int[][] source) {
        System.out.println("===============================================");
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[0].length; j++) {
                System.out.print(String.format("%2d", source[i][j]));
            }
            System.out.println();
        }
        System.out.println("===============================================");
    }

    public static void printArray(char[][] source) {
        System.out.println("===============================================");
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[0].length; j++) {
                System.out.print(String.format("%2c", source[i][j]));
            }
            System.out.println();
        }
        System.out.println("===============================================");
    }

    public static boolean isLife(char[][] source) {//is alive cell here
        boolean result = false;
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                if (source[i][j] == '*') result = true;
            }
        }
        return result;
    }

    public static void cpArray(char[][] source, char[][] target) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                target[i][j] = source[i][j];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        char[][] pres_gen = new char[20][20];
        char[][] next_gen = new char[20][20];
        int neighbNumb[][] = new int[20][20];

        for (int i = 0; i < pres_gen.length; i++) {//initialization
            for (int j = 0; j < pres_gen[i].length; j++) {
                if ((i / 3 == 0) || (j / 2 == 0) || (i == pres_gen.length - 1)) pres_gen[i][j] = '*';
            }
        }
        Scanner in = new Scanner(System.in);
        String cont = "";
        int generation_number = 0;
        System.out.println("Start generation");
        printArray(pres_gen);
        char key;
        int code;
        while (isLife(pres_gen)) {
            generation_number++;
            System.out.println("generation " + generation_number);
            for (int i = 0; i < pres_gen.length; i++) {
                for (int j = 0; j < pres_gen[i].length; j++) {
                    if ((neighbours(i, j, pres_gen) > 3) || (neighbours(i, j, pres_gen) < 2)) {
                        next_gen[i][j] = ' ';
                    } else if (neighbours(i, j, pres_gen) == 3) {
                        next_gen[i][j] = '*';
                    }
                }
            }
            cpArray(next_gen, pres_gen);
            printArray(pres_gen);
            try {
                code = System.in.read();
                key = (char) code;
                if (key == '\n') continue;
                else break;
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}