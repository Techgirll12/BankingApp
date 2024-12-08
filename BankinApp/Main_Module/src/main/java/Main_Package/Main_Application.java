package Main_Package;


import Access_Control_Package.AccessControl;
import Audit_Package.Audit;
import Currency_Converter_Package.CurrencyConverter;
import Logging_Package.Logging;

public class Main_Application {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Logging logg = new Logging();
        AccessControl Access = new AccessControl();
        Audit audit = new Audit();

        try{
           Logging.LogInfo("Begining the Application");

           String UserRole = "Admin";
           String UserName ="AdminUser";
         AccessControl.VerifyingAccess(UserRole);
         Logging.LogInfo("Access allowed for the role " +UserRole + "and the User" +UserName);

            double amount = 100.0;
            String fromCurrency = "USD";
            String toCurrency = "EUR";
            double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
            Logging.LogInfo("Converted " + amount + " " + fromCurrency + " to " + toCurrency + ": " + convertedAmount);

            audit.LoggingAction("Currency conversion: " + fromCurrency + " to " + toCurrency, UserName);
        }

        catch (SecurityException e) {
            Logging.LoggInvalid("Security error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            Logging.LoggInvalid("Validation error: " + e.getMessage());
        } catch (Exception e) {
            Logging.LoggInvalid("Unexpected error: " + e.getMessage());
        } finally {
            Logging.LogInfo("Application ended.");
        }
    }
}
