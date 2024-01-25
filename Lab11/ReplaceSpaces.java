import java.io.*;
class ReplaceSpaces {
    public static void main(String[] args) {
        byte i[];
        FileInputStream fin = null;
        FileOutputStream fout = null;
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }
        try {
            System.out.println("Opening files");
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            i = new byte[fin.available()];
            System.out.println("Writing files");
            fin.read(i);
            String temp = new String(i);
            int location = temp.indexOf(" ");
            String x = temp.substring( location, location + 3 );
            String replacement = "-";
            byte replacementBytes[] = replacement.getBytes();
            i[location] = replacementBytes[0];
            i[location + 1] = replacementBytes[1];
            i[location + 2] = replacementBytes[2];
            fout.write(i);
        } 
        catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        } 
        finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if (fout != null)
                    fout.close();
            } catch (IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}