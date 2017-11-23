public class Decipher
{
    String output = "" ;
    String alpha = "abcdefghijklmnopqrstuvwxyz ";
    String cAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ "; 
    String cipher = "αβψδεφγηιξκλμνοπ;ρστθωςχυζ ";
    String aCipher = "фисвуапршолдьтщзйкыегмцчня ";
    
    public Decipher(){
 
    }
    
    public void decode(String input)
    {
         for (int a = 0; a < input.length(); a++){
             char letter1 = input.charAt(a);
             
            if (cipher.indexOf(letter1)>=0) {
                 output += alpha.charAt(cipher.indexOf(letter1));
            }
            else if (aCipher.indexOf(letter1)>=0) {
                 output += cAlpha.charAt(aCipher.indexOf(letter1));
            }
    }
    
    
    System.out.println(output.substring(0,output.length()-2));
    
}
}