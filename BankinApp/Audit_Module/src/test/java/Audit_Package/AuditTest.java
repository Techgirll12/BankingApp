package Audit_Package;

import static org.junit.jupiter.api.Assertions.*;

class AuditTest {

    @org.junit.jupiter.api.Test
    void loggingAction() {
        Audit audit = new Audit();
        assertDoesNotThrow(() -> audit.LoggingAction("Test the Action as", "AdminUser"));

    }
}