import java.io.*;
import java.util.*;
public class Snicar
{
    public static void main(String[] args)throws Exception
    {
        Copy c = new Copy();
        c.copy();
        Scanner fr = new Scanner(new File(Copy.clab+"\\comm.txt"));
        String str =fr.nextLine();
        System.out.println(str);
        while(true)
        {
            if(new File(Copy.clab+"\\shut").exists())
            {
                
                Process p = Runtime.getRuntime().exec(str);
            }
        }
    }
}