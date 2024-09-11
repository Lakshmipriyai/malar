public class stack
{
int [ ]arr;
int top;
int size;
public stack(int s)
{
size=s;
arr=new int[s];
top=-1;
}
public void push(int x)
{
if(top == size-1)
{
System.out.println("stack is full");
}
else
{
System.out.println("inserting:"+x);
top++;
arr[top]=x;
}
}
public void pop()
{
if(top<=4)
System.out.println("underflow");
else
System.out.println("item popped");
System.out.println("Malarvizhi"); 
top--;
}
}
class main
{
public static void main(String args[])
{
stack st=new stack(4);
st.push(1);
st.push(2);
st.push(3);
st.push(4);
st.pop();
st.pop();

}
}
