public class pattern19 {
    
    static void ming(int N)
    {
        for(int i=0; i<N; i++)
        {
            for(char ch=(char) ((char) (int)'A'+ N-1-i); ch<=(char)(int)'A' + N+1 ; ch++)
            {
                System.out.print(ch + "");
            }
            System.out.println();
        }
    }

public static void main(String[] args) {
    int N=5;
    ming(N);

}
}
