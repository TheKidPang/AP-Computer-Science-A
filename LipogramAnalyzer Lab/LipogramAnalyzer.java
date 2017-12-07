
public class LipogramAnalyzer
{
    public String thisText;
    String output = "";
    public LipogramAnalyzer(String text)
    {
        thisText = text;
    }
    public String mark(char letter){
        for(int x=0;x<thisText.length();x++){
            if (thisText.charAt(x) != 'e'){
            output += thisText.charAt(x);
            
        }
        else{
            output += "#";
        }
    }
        return output;
    }
    public String allWordsWith(char letter){
         String [] output;
         output = thisText.split(" ");
         int a = 0;
         String fOutput = "";
         for (int x =0; x< output.length;x++){
             
             if ((output[x]).indexOf("e") >= 0) {
              fOutput += output[x] + "\n";
              
         }
    }
    return fOutput;
    }
}
