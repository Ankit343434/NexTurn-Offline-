
interface UPIPayment{
    void upiTransfer();
}
interface CreditCardPayment {
    void cardTransfer();
}

class PaymentGateway implements UPIPayment,CreditCardPayment{
    public void upiTransfer(){
        System.out.println("UPI Payment is Successfull");
    }
    public void cardTransfer(){
        System.out.println("Credit Card Payment Successfull");
    }
}

public class OnlinePayment {
    public static void main(String[] args) {
        PaymentGateway obj = new PaymentGateway();
        obj.upiTransfer();
        obj.cardTransfer();
        
    }
}
