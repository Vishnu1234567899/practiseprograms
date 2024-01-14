/**
 * pattern4
 * in there is a error output coming as a stars.............
 */
class Main {
    static void pattern4(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern4(n);
    }
}