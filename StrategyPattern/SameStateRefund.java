package StrategyPattern;

public class SameStateRefund implements RefundStrategy {

    @Override
    public void doRefund() {
        System.out.println("Refund to the same state processed.");
    }
    
}
