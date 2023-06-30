import java.util.Stack;

public class ReverseStack
{

    public static void displayReverse(Stack<Integer> st){
        if(st.size()==0) return;

        int top=st.pop();
        System.out.print(top+" ");
        displayReverse(st);
        st.push(top);
    }
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();

        st.push(32);
        st.push(43);
        st.push(21);
        st.push(65);
       System.out.println(st); 
        displayReverse(st);
    }
}