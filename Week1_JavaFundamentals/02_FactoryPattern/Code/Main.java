package Week1_Exercises.Design_Pattern_And_Principles.Exercise2_Factory_Pattern;

public class Main {
    public static void main(String[] args){
        paymentFactory factory = new CreditCardPayFactory();
        payment pay = factory.Createpayment();
        pay.ProcessPayment(100.00);

        paymentFactory factory1 = new PayPalPayFactory();
        payment pay1 = factory1.Createpayment();
        pay1.ProcessPayment(50.00);
    }
}
