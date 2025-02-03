public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("123-456-789"));
        paymentContext.makePayment(600);

        paymentContext.setPaymentStrategy(new PayPalPayment("abcd@gmail.com"));
        paymentContext.makePayment(700);
    }
}