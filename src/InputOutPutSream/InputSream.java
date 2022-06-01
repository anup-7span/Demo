package InputOutPutSream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputSream {

    public static void main(String[] args) {
    try{


        FileInputStream fin=new FileInputStream("D://Update/update.txt");
        System.out.println("Data");
        int i;
        while ((i=fin.read())!=-1)
        {
            System.out.print((char)i);
        }
        try {
            fin.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    catch (FileNotFoundException e)
    {
        System.out.println(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}
