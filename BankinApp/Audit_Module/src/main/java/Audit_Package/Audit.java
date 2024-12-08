package Audit_Package;

public class Audit {

    public void LoggingAction(String action, String PerformedBy)
    {
        System.out.println("[Audoit] action:" + action + ", Performed by:" + PerformedBy);
    }
}
