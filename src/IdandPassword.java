import java.util.HashMap;

public class IdandPassword
{
    HashMap<String, String> logininfo = new HashMap<String, String>();
    IdandPassword()
    {
        logininfo.put("kunj", "first");
        logininfo.put("robert", "second");
    }
    
    protected HashMap getLoginInfo()
    {
        return logininfo;
    }
}
