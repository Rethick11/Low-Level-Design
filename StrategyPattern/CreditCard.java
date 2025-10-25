package StrategyPattern;



public abstract class CreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;  

    //getters and setters
    
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public abstract void tapAndPay();
    public abstract void swipeAndPay();
    public abstract void onlinePayment();

}
