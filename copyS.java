import java.util.*;

public class copyS
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n;
        System.out.println("Enter Numbers :");
        n=sc.nextInt();
        System.out.println("Enter your numbers :");
        
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }

        System.out.print(st);
    }
}