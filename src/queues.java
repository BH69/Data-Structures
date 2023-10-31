import java.util.*;

public class queues {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        /*
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.print("Enter the number of elements to push into the Queue: "); // Input Numbers
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        */
        System.out.print("Enter the number of strings to push into the Queue: "); // Input Strings
        int n = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter string " + i + ": ");
            String input = scan.nextLine();
            q.add(input);
        }

        System.out.println("Elements on Queue: " + q);
        System.out.println("Elements removed from Queue: " + q.remove() + ", " + q.remove());
        System.out.println("Elements on Queue after remove: " + q);
        System.out.println("Is Queue empty?: " + q.isEmpty());
        System.out.println("Peek Operation" + q.peek());
        System.out.println("Queue size: " + q.size());
    }
}
