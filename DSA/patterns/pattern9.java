public class pattern9 {
    static void maker(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i-1; j++)
            {
                System.out.println(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        maker(n);
    }
}
