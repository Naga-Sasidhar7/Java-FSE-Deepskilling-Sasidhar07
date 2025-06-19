package Week1_Exercises.Design_Pattern_And_Principles.Exercise2_Factory_Pattern;

public class PayPalPayFactory implements paymentFactory {
    @Override
    public payment Createpayment(){
        return new PayPalPay();

    }
}

