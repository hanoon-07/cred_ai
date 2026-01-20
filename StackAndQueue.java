import java.util.*;


public class StackAndQueue{
    public static void main(String[] args){

        System.out.println("stack operations");
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());  
        System.out.println(stack.peek()); 

        System.out.println("queue operations");
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue.poll()); 
        System.out.println(queue.peek()); 
    }
}