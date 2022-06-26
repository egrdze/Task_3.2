package cs.vsu.ru.lyashenko_e_v;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Queue_reverse {

    static Queue<Integer> queue;

    static void Print()
    {
        while (!queue.isEmpty()) {
            System.out.print( queue.peek() + ", ");
            queue.remove();
        }
    }


    static void reversequeue()
    {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }

   
    public static void main(String args[])
    {
        System.out.println("Enter Numbers: ");
        Scanner scanner = new Scanner(System.in);
        queue = new LinkedList<Integer>();
        queue.add(scanner.nextInt());
        queue.add(scanner.nextInt());
        queue.add(scanner.nextInt());
        queue.add(scanner.nextInt());
        queue.add(scanner.nextInt());
        queue.add(scanner.nextInt());
        queue.add(scanner.nextInt());
        queue.add(scanner.nextInt());
        queue.add(scanner.nextInt());
        queue.add(scanner.nextInt());

        reversequeue();
        Print();
    }
}


