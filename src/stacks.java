import java.util.*;

public class stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        /*
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        */

        System.out.print("Enter the number of elements to push into the stack: "); // Input Numbers
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            stack.push(i);
        }
        /*
        System.out.print("Enter the number of strings to push into the stack: "); // Input Strings
        int n = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter string " + i + ": ");
            String input = scan.nextLine();
            stack.push(input);
        }
        */
        System.out.println("Elements on the stacks: " + stack);
        System.out.println("Stacks pop out of stacks: " + stack.pop() + ", " + stack.pop());
        System.out.println("Elements on stacks after popped: " + stack);
        System.out.println("Is stacks empty?: " + stack.isEmpty());
        System.out.println("Peek Operation: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
    }
}
