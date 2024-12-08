package Access_Control_Package;

import static org.junit.jupiter.api.Assertions.*;

class AccessControlTest {
    private final AccessControl AcessCon = new AccessControl();

    @org.junit.jupiter.api.Test
    void verifyingAccess() {

        assertDoesNotThrow(() -> AcessCon.VerifyingAccess("Admin"));

    }
    @org.junit.jupiter.api.Test
    void verifyUser() {
        Exception exception = assertThrows(SecurityException.class, () -> {
            AcessCon.verifyUser("User");
        });
        assertTrue(exception.getMessage().contains("acess are controled by user"));
    }
    }
