package testplay;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHandler {
    
    
    private static Properties p = new Properties();
     
    static{
        try {
            InputStream in = new FileInputStream(new File("conf/configure.properties"));
            p.load(in);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException("configure.properties load error!");
        }
    }
     
    public static String getProperty(String key){
        try{
            return p.getProperty(key, null);
        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }
    public static void main(String[] args) {
    	System.out.println(getProperty("did"));
    }
}
