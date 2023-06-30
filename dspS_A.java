import java.util.Stack;

public class dspS_A
{
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        st.push(23);
        st.push(34);
        st.push(23);
        st.push(65);
        st.push(236);


        int n=st.size();
        int arr[]=new int[n];

        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}