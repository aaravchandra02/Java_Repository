
class QuickStart {
    String firstName = "Hello";
    static int a = 10;
    static double b = 1.01;
    boolean c = true;
    char d = 'a';
    // This is a constant (due to keyword 'final') changes can't be made.
    final int NUMBER_OF_MONTHS = 12;

    // "main"
    public static void main(String[] args) {
        // "sysout"
        System.out.println("\tHello World 2021\t" + a);
        // it is done to increase the readability of the code.
        a = 10_000;
        System.out.println(a);
        if (a > b) {
            System.out.println("a is bigger than a");
        } else if (a == b) {
            System.out.println("a and b are equal");
        } else {
            System.out.println("b is bigger than a");
        }

        double price = 151.0;
        double discount;
        String condition = "used";
        switch (condition) {
            case "used":
                discount = 0.2;
                System.out.println("Price = " + price * (1 - discount));
                // if break is not specified then all the below cases will also execute
                break;
            case "damaged":
                discount = 0.4;
                System.out.println("Price = " + price * (1 - discount));
                break;

            default:
                System.out.println("Price = " + price);

        }

        // Working with arrays now:
        String[] names = { "John", "Beck", "Catherine" };
        int[] ages = new int[3];
        ages[0] = 10;
        ages[1] = 11;
        ages[2] = 12;
        System.out.println(names[0] + " is " + ages[0] + " years old.");
        System.out.println("His name contains " + names[0].length() + " letters.");
        System.out.println(names.length);

    }
}