import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReplaceSpacesChar {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(args[0]);
            outputStream = new FileWriter(args[1]);

            int c;
            while ((c = inputStream.read()) != -1) {
                if (c == ' '){
                    c = '-';
                }
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
