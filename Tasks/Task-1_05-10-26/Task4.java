public class Task4 {
    public static void main(String[] args) {
        int age = 19;

        if (age < 0 || age > 120) {
            System.out.println("Invalid age");
        } else if (age >= 18) {
            System.out.println("Valid and eligible for voting");
        } else {
            System.out.println("Valid but not eligible for voting");
        }
    }
}
