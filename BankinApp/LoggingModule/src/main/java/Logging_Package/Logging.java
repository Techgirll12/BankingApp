package Logging_Package;


import java.time.LocalTime;

public class Logging {

    public static void LogInfo(String HandBooks) {
        System.out.println("[information]" + LocalTime.now() + " " + HandBooks);
    }

    public static void LoggInvalid(String HandBooks){
        System.out.println("[InvalidInfo]" +LocalTime.now()+ " " +HandBooks);
    }
    public void checkDebugging(String HandBooks){
        System.out.println("[Debugging]" + LocalTime.now()+ " " +HandBooks);
    }
}
