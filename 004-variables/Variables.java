public class Variables {
    public static void main(String[] args) {
        int age = 18;
        System.out.println("My age is: " + age);
        age = 19;
        System.out.println("My age is: " + age);

        // Used to avoid re-assign of a value 
        final int quantity = 20;
        System.out.println("Quantity: " + quantity);
    }
}
