package opal;

/**
 * Created by dongsidou on 2016/10/2.
 */
import java.lang.*;
import java.io.*;
public class testexe {
    public static void main(String args[]){
        try
        {
            String cmd= "C:\\Program Files\\Lingoes\\Translator2\\Lingoes.exe";
            Runtime.getRuntime().exec(cmd);
        }
        catch(IOException e)
        {
            System.out.println("err!");
        }
    }
}
