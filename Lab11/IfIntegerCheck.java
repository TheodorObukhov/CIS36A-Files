import java.io.*;
public class IfIntegerCheck {
    public static void main(String[] args) throws IOException{
        InputStream is = new ByteArrayInputStream(new byte[] { 0, 1, 2, 3, 4, 5, 6 });
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int nRead;
        byte[] data = new byte[4];

        while ((nRead = is.readNBytes(data, 0, data.length)) != 0) {
            System.out.println("here " + nRead);
            buffer.write(data, 0, nRead);
        }

        buffer.flush();
        byte[] targetArray = buffer.toByteArray();
        for (int i : targetArray){
            if (i == -889275714){
                System.out.println("yes");
                break;
            }
            System.out.println("no");
        }
    }
}
