public class Decrypter {
    public String decrypterrrrr(String messageToBeEncrypted, int offset) {
        char[] charArray = messageToBeEncrypted.toCharArray();
        char[] newArray = new char[charArray.length];
        String encryptedMessage = "";
        for (int i = 0; i < charArray.length; i++) {
 if (offset > 95){
     System.out.println("This offset is too long stop it and give me another (And yeah now you have to restart the programm -.-)");
     System.exit(0);
 }
 int a = offset + Constants.CHARACTER_SET.indexOf(charArray[i]);
 if (a > Constants.CHARACTER_SET.length()){
     a -= Constants.CHARACTER_SET.length();
 }
            newArray[i] = Constants.CHARACTER_SET.charAt(a);


        }
        for (int j = 0; j < charArray.length; j++) {
            encryptedMessage += newArray[j];
        }
  return encryptedMessage;  }
}