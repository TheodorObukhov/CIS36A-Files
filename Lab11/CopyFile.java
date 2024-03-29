/* Copy a text file.
 To use this program, specify the name
 of the source file and the destination file.
 For example, to copy a file called FIRST.TXT
 to a file called SECOND.TXT, use the following
 command line.
 java CopyFile FIRST.TXT SECOND.TXT
*/
import java.io.*;
class CopyFile {
    public static void main(String[] args){
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        // First, make sure that both files has been specified.
        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }
        // Copy a File.
        try {
        // Attempt to open the files.
            System.out.println("Opening files");
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
                System.out.println("Writing files");
            } 
            while(i != -1);
        } 
        catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        } 
        finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(fout != null) fout.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}