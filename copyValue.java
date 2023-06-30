import java.util.Stack;

public class copyValue
{
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(32);
        st.push(43);
        st.push(98);
        st.push(321);

        System.out.print(st);
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println();

        Stack<Integer> cp=new Stack<>();
        while(rt.size()>0){
            cp.push(rt.pop());
        }

        System.out.print(cp);
    }
}