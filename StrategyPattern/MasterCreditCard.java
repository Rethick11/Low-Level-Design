package StrategyPattern;

public class MasterCreditCard extends CreditCard implements RefundCompatible {
    private RefundStrategy refundStrategy;

    MasterCreditCard() {
        this.refundStrategy = new SameStateRefund();
    }

    @Override
    public void tapAndPay() {
        System.out.println("MasterCard: Tapped and paid.");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("MasterCard: Swiped and paid.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("MasterCard: Online payment made.");
    }

    public void processRefund() {
        refundStrategy.doRefund();

}
}
