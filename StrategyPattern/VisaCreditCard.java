package StrategyPattern;


public class VisaCreditCard extends CreditCard implements RefundCompatible {

    private RefundStrategy refundStrategy;

    VisaCreditCard() {
        this.refundStrategy = new SameStateRefund();
    }

    @Override
    public void tapAndPay() {
        System.out.println("Visa: Tapped and paid.");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Visa: Swiped and paid.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Visa: Online payment made.");
    }

    @Override
    public void processRefund() {
        refundStrategy.doRefund();
    }

}
