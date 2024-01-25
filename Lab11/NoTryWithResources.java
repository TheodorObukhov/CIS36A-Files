import java.io.*;

class NoTryWithResources {
    public static void main(String[] args) {
        // First make sure that both files have been specified.
        if(args.length != 2) {
            System.out.println("Usage: NoTryWithResources From To");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1]);) {
            if(fin != null && fout != null) {
                int c = fin.read();
                fout.write(c);
            }
        }
        catch (IOException exc) {
        System.out.println("IOException: program halted.");
        }
    }   
}
