package InputOutPutSream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutSream
{
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("D://data.txt");

            String str = null;

            for (int i=1;i<str.length();i++)
            {
                try {
                    out.write(str.charAt(i));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
