import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {

        java.util.Stack<String> stack = new java.util.Stack<String>();

        System.out.println(stack.empty());

        stack.push("Fallout");
        stack.push("Skyrim");
        stack.push("League of Legends");
        stack.push("Escape from Tarkov");
        stack.push("Cyberpunk 2077");
        System.out.println(stack);

        String myFavGame = stack.pop();
        System.out.println(myFavGame);

        System.out.println(stack.peek());
        System.out.println(stack.search("Skyrim")); //wenn nicht vorhanden wird -1 ausgegeben

        System.out.println(stack);
        zehnKopienHinzufügen(stack);
        System.out.println(stack);

    }
        public static void zehnKopienHinzufügen(java.util.Stack<String> stack) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Was willste 10 Fach hinzufügen?");
            String eingabe = scanner.nextLine();
            for (int i = 0; i < 10; i++) {
                stack.push(eingabe);
            }
            scanner.close();

        }

}