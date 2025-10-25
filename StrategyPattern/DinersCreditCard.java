package StrategyPattern;

public class DinersCreditCard  extends CreditCard implements RefundCompatible {

    private RefundStrategy refundStrategy;

    DinersCreditCard() {
        this.refundStrategy = new BankAccountRefund();
    }

   

    @Override
    public void tapAndPay() {
        System.out.println("Diners: Tapped and paid.");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Diners: Swiped and paid.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Diners: Online payment made.");
    }  
    
    @Override
    public void processRefund() {
        refundStrategy.doRefund();
    }
    
}
