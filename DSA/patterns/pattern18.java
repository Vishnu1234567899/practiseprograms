public class pattern18 {
    

    static void ming(int n)
    {

        for(int i=0; i<n; i++)
        {
            for(int m=0; m<n-i-1; m++)
            {
                System.out.print(" ");
            }
         char ch ='A';

         int breakpoint =(2*i+1)/2;
         for(int j=1; j<=2*i+1; j++)
         {
            System.out.print(ch);
        if (j<breakpoint) ch++;
        else ch--;
            }

            for(int l=0; l<n; l++)
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
