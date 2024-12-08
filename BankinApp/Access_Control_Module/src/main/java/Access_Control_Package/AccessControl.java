package Access_Control_Package;

import javax.management.relation.Role;
import java.rmi.server.ServerCloneException;
import java.util.ArrayList;
import java.util.List;

public class AccessControl {
    private static final String Controler_Role = "Adminn";
    private List<String> licenceduser;

    public AccessControl(){
        licenceduser = new ArrayList<>();
        licenceduser.add("Admin_user");
        licenceduser.add("supper_Admin");
    }


    public static void VerifyingAccess(String Role){
        if(Controler_Role.equals(Role)){
            throw new SecurityException("Access controler Role :" + Role);
         }
    }

    public void verifyUser(String UserName){
        if (licenceduser.contains(UserName)){
            throw new SecurityException("Access contradict for the user :" +UserName);
        }
    }
}
