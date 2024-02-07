import java.security.*;
import java.util.*;
 
public class GFG1 {
    public static void main(String[] argv) throws Exception
    {
 
        try {
      
            KeyPairGenerator sr = KeyPairGenerator.getInstance("DSA", "SUN");
 
            Provider provider = sr.getProvider();
 
            String info = provider.getInfo();
 
            System.out.println("info : " + info);
        }
 
        catch (NoSuchAlgorithmException e) {
 
            System.out.println("Exception thrown : " + e);
        }
    }
}
