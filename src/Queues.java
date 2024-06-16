import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();


        queue.offer("Karen");
        queue.offer("Peter");
        queue.offer("Mois");
        queue.offer("Diggi");
        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();

        System.out.println(queue);

    }






}
