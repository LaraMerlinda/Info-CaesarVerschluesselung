public class CaesarSimple
{
    public CaesarSimple()
    {
        
    }
    
    public void Entschluesseln(String satz, int schluessel)
    {
        
    }
    
    public void Teste()
    {
        
    }
    
    public void Verschluessle(String satz, int schluessel)
    {
        for(int i = 0; i < satz.length(); i++)
        {
            char a = satz.charAt(i);
            int code = (int) a;
            code = code + schluessel;
            char zeichen = (char) code;
            System.out.print(zeichen);
        }
    }
    
    public void VerschiebeBuchstabe(char ch, int abstand)
    {
        for (int i = 0; i <; i++) {

        }
    }
    
    public void VerschiebeSatz(String satz, int abstand)
    {
        
    }
}