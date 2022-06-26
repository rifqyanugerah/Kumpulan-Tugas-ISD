import java.util.Stack;

public class BackForward<E> {
    private Stack<E> backStack;
    private Stack<E> forwardStack;

    public BackForward() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
    }
    public void tambahData(E data) {
        backStack.push(data);
        System.out.printf("Website %s dibuka\n", data);
    }
    public void back() {
        if(!backStack.isEmpty()) {
            forwardStack.push(backStack.pop());
            System.out.printf("Mundur ke alamat %s\n", backStack.peek());
        }
    }
    public void forward() {
        if(!forwardStack.isEmpty()) {
            backStack.push(forwardStack.pop());
            System.out.printf("Kembali lagi ke alamat %s\n", backStack.peek());
        }
    }
}
