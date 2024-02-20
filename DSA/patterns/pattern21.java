public class pattern21 {
    
    static void ming(int n)
    {

        int space= 2*n-2;
        for(int i=1; i<2*n-1; i++)
        {
            int stars = i;
        
            if(i>n) stars = 2*n - i;
            
            for(int l=1; l<=stars; l++)
            {
                System.out.print("*");
            }

            //spaces 

            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }

            //stars

            for(int s=1; s<=stars; s++)
            {
                System.out.print("*");
            }

            System.out.println();
            if(i<n) space -=2;
            else space +=2;

        }

    }

    public static void main(String[] args) {
        int n=5;
        ming(n);
    }
}
