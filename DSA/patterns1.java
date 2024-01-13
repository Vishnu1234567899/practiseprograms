public class patterns1 {
    static void patterns1(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < N; j++) {
                System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {
        int N = 6;
        patterns1(N);
    }
}
