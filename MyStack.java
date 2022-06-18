//Created by Stanslaus Mwongela
// Stack Data Structure
import java.util.EmptyStackException;
//class name
public class MyStack {
    //main class
    private static class StackNode{
        // the data in each and every stack node
        int data;
        // the next node added 
        StackNode next;
//constructor
    public StackNode (int data){
        this.data = data;

    }

    }
    //declare the top node
    private StackNode top;
//return item data at the top node
    public int pop(){
        //check
        if (top ==null) throw new EmptyStackException();
        top=top.next;
        int item = top.data;
        return item;

    }

    public void push(int item){
        StackNode t = new StackNode(item);

        t.next = top;
        top=t;
    }

    public int peep(){

        if (top==null) throw new EmptyStackException();
      int  top_item = top.data;
      return top_item;
    }

    public boolean isEmpty(){
        return top == null;
    }

}
