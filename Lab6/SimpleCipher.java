class SimpleCipher {
 public static void main(String[] args) {
 String msg = "This is a test";
 String encMsg = "";
 String decMsg = "";
 String key = "12345678";
 System.out.print("Original message: ");
 System.out.println(msg);
 // encode the message
 for(int i=0; i < msg.length(); i++)
 encMsg = encMsg + (char) (msg.charAt(i) ^ Integer.parseInt(key));
 System.out.print("Encoded message: ");
 System.out.println(encMsg);
 // decode the message
 for(int i=0; i < msg.length(); i++)
 decMsg = decMsg + (char) (encMsg.charAt(i) ^ Integer.parseInt(key));
 System.out.print("Decoded message: ");
 System.out.println(decMsg);
 }
}
