package StrategyPattern;

public class BankAccountRefund implements RefundStrategy {

    @Override
    public void doRefund() {
        System.out.println("Refund initiated to bank account.");
    }
}
