public class pattern12 {
    static void ming(int n)
    {

        int spaces = 2*(n-1);
        for(int i=0; i<n; i++)
        {
             
            //For printing numbers in each row........

            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }

            for(int k=1; k<=spaces; k++ )
            {

                System.out.print(" ");
            }

            for(int p=i; p>=1; p--)
            {
                System.out.print(p);
            }

            System.out.println();

            spaces-=2;
        }


    }

    public static void main(String[] args) {
        int n=5;
        ming(n);
    }
}
