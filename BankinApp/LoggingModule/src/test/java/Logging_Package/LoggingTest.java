package Logging_Package;

import static org.junit.jupiter.api.Assertions.*;

class LoggingTest {

    @org.junit.jupiter.api.Test
    void logInfo() {
        assertDoesNotThrow(() -> Logging.LogInfo("This is the information of logging"));
    }

    @org.junit.jupiter.api.Test
    void loggInvalid() {
        assertDoesNotThrow(() -> Logging.LoggInvalid("This one is invallid logging"));
    }

    @org.junit.jupiter.api.Test
    void checkDebugging() {
        assertDoesNotThrow(() -> Logging.LoggInvalid("in this debuggind is invallid"));

    }
}