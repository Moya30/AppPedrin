package util;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Dato {

    public static void updateData(String text) {
        FileOutputStream fos = null;
        try {
            //fos = new FileOutputStream(ruta+"\\dato.txt");
            fos = new FileOutputStream("C:\\dato.txt");
            fos.write(text.getBytes("UTF-8"));
        } catch (IOException e) {
            try {
                close(fos);
                throw e;
            } catch (IOException ex) {
            }
        }
    }

    public static String getData() {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("C:\\dato.txt");

            String cadena;

            cadena = String.valueOf(fin.read());
            return String.valueOf( cadena);

        } catch (IOException e) {
            try {
                close(fin);
                throw e;
            } catch (IOException ex) {
            }
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
