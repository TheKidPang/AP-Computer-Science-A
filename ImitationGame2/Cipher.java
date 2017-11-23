public class Cipher
{
    String output = "" ;
  
    public Cipher()
    {
        
    }
    public void encode(String input)
    {
         for (int a = 0; a < input.length(); a++){
            
             output += "" + (char)(((int) input.charAt(a))+1);
             
            
    }
    System.out.println(output);
    
    }
}