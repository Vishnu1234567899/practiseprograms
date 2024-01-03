import java.util.Scanner;

public class hm {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        for (int i = 0; i < t; i++) {
            // int n = read.nextInt();
            System.out.println(t * 2);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        {
            Scanner read = new Scanner(System.in);

            int t = read.nextInt();
            for (int i = 0; i < t; i++) {
                int n = read.nextInt();
                System.out.println(n + 1);
            }
        }
    }
}