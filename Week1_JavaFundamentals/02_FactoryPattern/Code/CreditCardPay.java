package Week1_Exercises.Design_Pattern_And_Principles.Exercise2_Factory_Pattern;

public class CreditCardPay implements payment {
    @Override
    public void ProcessPayment(double amount){
        System.out.println("payment through credit card:"+amount);
    }
}


