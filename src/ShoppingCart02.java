public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase 2 "+itemDesc;
        double price = 12.50;
        double tax = .78;
        int quantity = 2;

        // Declare and initialize numeric fields: price, tax, quantity.



        // Declare and assign a calculated totalPrice
        double totalPrice = ((price * quantity)+tax);

        // Modify message to include quantity

        System.out.println(message);

        // Print another message with the total cost
        System.out.println("Total cost with tax is " + totalPrice);
    }
}
