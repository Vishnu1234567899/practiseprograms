public class pattern20 {
    
    static void ming(int n)
    
    {

        int inns =0;
        for(int i=0; i<n; i++)
        {
         
            for(int j=1; j<n-i; j++)
            {
                System.out.print("*");
            }
            
            for(int k=0; k<inns; k++)
            {
                System.out.print(" ");
            }

            for(int l=0; l<n-i; l++)
        {
            System.out.print("*");
        }
           inns+=2;
        
           System.out.println();
        }



        // second one

        inns =2*n-2;
        for(int i=1; i<n; i++)
        {
         
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            
            for(int k=0; k<inns; k++)
            {
                System.out.print(" ");
            }

            for(int l=1; l<=i; l++)
        {
            System.out.print("*");
        }
           inns-=2;
        
           System.out.println();
        }
    }

    public static void main(String[] args) {
        int n =5;
        ming(n);
    }
}
