import java.util.Stack;

public class insertStack
{
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        st.push(20);
        st.push(32);
        st.push(54);
        st.push(45);
        st.push(23);

        System.out.print(st);
        Stack<Integer> rt=new Stack<>();

        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            int x=rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }

    }
}