package StrategyPattern;

public class RupayCreditCard extends CreditCard implements Upi, RefundCompatible {

    RefundStrategy refundStrategy;

    RupayCreditCard() {
        this.refundStrategy = new BankAccountRefund();
    }

    @Override
    public void tapAndPay() {
        System.out.println("Rupay: Tapped and paid.");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Rupay: Swiped and paid.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Rupay: Online payment made.");
    }

    @Override
    public void upiPayment() {
        System.out.println("Rupay: UPI payment made.");
    }

    @Override
    public void processRefund() {
        refundStrategy.doRefund();
    }

}
