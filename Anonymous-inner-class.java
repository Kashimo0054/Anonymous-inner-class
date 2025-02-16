class A {

    public void display() {
        System.out.println("Display of A");
    }
}

public class App {
    public static void main(String[] args) {

        A obj = new A() {
            public void display() {
                System.out.println("Display of Anonymous class");
            }
        };
        obj.display();

    }
}
