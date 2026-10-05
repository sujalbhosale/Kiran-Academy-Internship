public class Task2 {
    public static void main(String[] args) {
        double cost_price = 1000;
        double selling_price = 1200;

        if (selling_price > cost_price) {
            System.out.println("Profit: " + (selling_price - cost_price));
        } else if (cost_price > selling_price) {
            System.out.println("Loss: " + (cost_price - selling_price));
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}
