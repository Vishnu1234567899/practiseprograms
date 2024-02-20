public class pattern7 {
    
    static void ming(int n)
    {

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            
            for(int l=0; l<2*i+1; l++)
            {
                System.out.print("*");
            }

            for(int m=0; m<n-i-1; m++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        ming(n);
    }
}
