import java.util.Scanner;

/**
 * main
 */
public class main {
    public static void main(String[] args) {
        Scanner readScanner = new Scanner(System.in);
        int t = readScanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = readScanner.nextInt();
            System.out.println(n * 2);
        }
    }

}