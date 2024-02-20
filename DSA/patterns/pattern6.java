public class pattern6 {
    
    static void ming(int n)
    {

        for(int i=0; i<n; i++)
        {
            for (int j = n; j > i; j--)
            {
                System.out.print(n-j+1+" ");
            }
    
             // As soon as numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n=5;
        ming(n);
    }
}
