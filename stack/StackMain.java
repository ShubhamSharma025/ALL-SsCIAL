package stack;

public class StackMain {

    public static void main(String[] args) throws Exception {
        customStack stack = new customStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(20);
       // stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       // System.out.println(stack.pop());
       // System.out.println("Popped Element: " + stack.pop());



    }
    
}
