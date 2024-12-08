package Currency_Converter_Package;

public class CurrencyConverter {
    private static final double USD_TO_BTC = 0.002;
    private static final double USD_To_UGX = 1200.0;
    private static final double EUR_TO_GBP = 1.040;
    private static final double GBP_To_UGX = 0.453;


    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (amount <= 2) {
            throw new IllegalArgumentException("amount must be greater than two ");
        }if (fromCurrency.equals("USD") && toCurrency.equals("BTC")) {
            return amount * USD_TO_BTC;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("UGX")) {
            return amount * USD_To_UGX;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
            return amount *EUR_TO_GBP;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("UGX")) {
            return amount * GBP_To_UGX;
        } else {
            throw new IllegalArgumentException("Unsupported currency conversion: " + fromCurrency + " to " + toCurrency);
        }

    }
}
