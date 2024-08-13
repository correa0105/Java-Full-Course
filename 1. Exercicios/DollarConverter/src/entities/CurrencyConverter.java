package entities;

import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConverter {
    private static final double IOF = 0.06;
    public double currencyDollar;
    public double dollarAmountPurchased;

    public double dollarConverter() {
        return (currencyDollar * dollarAmountPurchased) + ((currencyDollar * dollarAmountPurchased) * IOF);
    }
}
