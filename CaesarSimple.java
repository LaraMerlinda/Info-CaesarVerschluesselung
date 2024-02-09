public class CaesarSimple
{
    public CaesarSimple()
    {
        
    }
    
    public void Entschluesseln(String satz, int schluessel)
    {
        System.out.print("Die Lösung ist: ");
        for(int i = 0; i < satz.length(); i++)
        {
            char a = satz.charAt(i);
            int code = (int) a;
            code = code - schluessel;
            char zeichen = (char) code;
            System.out.print(zeichen);
        }
        System.out.println("");
    }
    
    public void Teste()
    {
        
    }
    
    public void Verschluessle(String satz, int schluessel)
    {
        System.out.print("Die Lösung ist: ");
        for(int i = 0; i < satz.length(); i++)
        {
            char a = satz.charAt(i);
            int code = (int) a;
            code = code + schluessel;
            char zeichen = (char) code;
            System.out.print(zeichen);
        }
        System.out.println("");
    }
    
    public void VerschiebeBuchstabe(char ch, int abstand)
    {
        int code = (int) ch;
        code = code + abstand;
        char zeichen = (char) code;
        System.out.print(zeichen);
    }
    
    public void VerschiebeSatz(String satz, int abstand)
    {
        
    }
}