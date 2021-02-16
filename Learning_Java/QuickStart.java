package Learning_Java;

class QuickStart {
    String firstName = "Hello";
    // now this is available without creating thi class's instance.
    public static int a = 10;
    static double b = 1.01;
    boolean c = true;
    char d = 'a';
    // Encapsulation
    private String name;

    // This is a constant (due to keyword 'final') changes can't be made.
    final int NUMBER_OF_MONTHS = 12;

    // constructor for this class - using concept on method overloading
    public QuickStart(String inp) {
        setName(inp);
    }

    // Encapsulation
    public String getName() {
        return name;
    }

    // Encapsulation
    public void setName(String name) {
        this.name = name;
    }

    // Function overloading
    public void setName(int name) {
        System.out.println("Please enter a string not an integer");
        setName("No Name");
    }

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
        System.out.println("The COmplete lst of names is:");
        int i = 0;
        int l = names.length;
        while (i < l) {
            System.out.println(names[i]);
            i++;
        }
        // for-each loop
        for (int j : ages) {
            System.out.println(j);
        }
        // other loops being do-while and for loop
        try {
            System.out.println(QuickStart.a / 0);
        } catch (ArithmeticException q) {
            System.out.println("Divide by zero error");
        }
        System.out.println("program flow after try-catch block");
    }

}

class Eg {
    //
    void main() {
        // Creating an object
        QuickStart example = new QuickStart("John");
        /*
         * Notice that didn't use any instance of QuickStart but still we were able to
         * access the static variobale as static variables/methods belongs to the class
         * and not to any particular object.
         */
        System.out.println(QuickStart.a);
        System.out.println(example.d);
    }

}

// Revise interface