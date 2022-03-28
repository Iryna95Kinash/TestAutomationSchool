package src.jappware;

import src.jappware.enums.Currency;

public class Payment {
    private int size;
    private Currency currency;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "size=" + size +
                ", currency=" + currency +
                '}';
    }
}
