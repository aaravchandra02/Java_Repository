
class QuickStart {
    String firstName = "Hello";
    static int a = 10;
    double b = 1.01;
    boolean c = true;

    // "main"
    public static void main(String[] args) {
        // "sysout"
        System.out.println("\tHello World 2021\t" + a);
        // it is done to increase the readability of the code.
        a = 10_000;
        System.out.println(a);

    }
}