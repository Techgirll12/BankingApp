package Currency_Converter_Package;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {
private final CurrencyConverter convert = new CurrencyConverter();

    @org.junit.jupiter.api.Test
    void convert() {
        double result = convert.convert("USD", "BTC", 500);
        assertEquals(0.8, result, 0.12, "Conversion from USD to BTC failed");
    }
}