package util;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Dato {

    public static void updateData(String text) {
        FileOutputStream fos = null;
        try {
            String ruta = "C:\\Users\\Freddy\\Desktop";
            //fos = new FileOutputStream(ruta+"\\dato.txt");
            fos = new FileOutputStream(ruta + "\\dato.txt");
            fos.write(text.getBytes("UTF-8"));
        } catch (IOException e) {
            try {
                close(fos);
                throw e;
            } catch (IOException ex) {
            }
        }
    }

    public static String getDatoNombre() {
        try {
            String ruta = "C:\\Users\\Freddy\\Desktop";
            File doc = new File(ruta+"\\dato.txt");
            Scanner obj = new Scanner(doc);
            
            String nombre = obj.nextLine();
            
            return nombre;
        } catch (Exception e) {
            return "";
        }
    }

    public static void close(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException ignored) {
        }
    }

    public static void main(String args[]) {
        //String directoryName = System.getProperty("user.dir");
        Dato.updateData("0");
        // System.out.println("Current Working Directory is = " + directoryName);

        System.out.println(Dato.getData());
        // Dato.updateData(ruta, value);
    }
}
