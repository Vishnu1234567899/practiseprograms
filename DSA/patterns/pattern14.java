public class pattern14 {
    
    static void ming(int n)
    {

        for(int i=0; i<n; i++)
        {

            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        ming(n);
    }
}
