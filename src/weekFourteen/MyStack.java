package weekFourteen;

import java.util.ArrayList;

public class MyStack {
    ArrayList<Integer> stack = new ArrayList<>();

    public void push(int x){
        stack.add(x);
    }
    public int pop(){
        int x = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return x;
    }
    public int peek(){
        return stack.get(stack.size() - 1);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
