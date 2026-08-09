class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Sum of 10 and 20 = " + obj.add(10, 20));
        System.out.println("Sum of 10, 20 and 30 = " + obj.add(10, 20, 30));
        System.out.println("Sum of 10.5 and 20.5 = " + obj.add(10.5, 20.5));
    }
}
