package testgeneric;

public class StackClient {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("America");
        stack.push("Canada");
        stack.push("France");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
