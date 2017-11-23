public class Cipher
{
    String output = "" ;
    String alpha = "abcdefghijklmnopqrstuvwxyz ";
    String cAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ "; 
    String cipher = "αβψδεφγηιξκλμνοπ;ρστθωςχυζ ";
    String aCipher = "фисвуапршолдьтщзйкыегмцчня ";
    
    public Cipher()
    {
        
    }
 
    public void encode(String input)
    {
         for (int a = 0; a < input.length(); a++){
             char letter1 = input.charAt(a);
             
             if (alpha.indexOf(letter1)>=0) {
                 output += cipher.charAt(alpha.indexOf(letter1));
            }
            else if (cAlpha.indexOf(letter1)>=0) {
                 output += aCipher.charAt(cAlpha.indexOf(letter1));
            }
    }
    String b = output.substring(0,2);
    output += b;
    
    
    System.out.println(output);
    
}
}