public class StringConverter 
{
    public static String reverse(String str)
    {
        String first = str;
        String print = "";
        for(int i = first.length(); i > 0; i--)
        {
            print = print + first.substring(i - 1, i);
        }
        return print;
    }
    
    public static boolean checkPalindrome(String str)
    {
        String space = puncuation(str);
        String print = "";
        
        if(space.length() % 2 == 0)
        {
           for(int i = space.length(); i > space.length() / 2; i--)
            {
                print = print + space.substring(i - 1, i);
            }
            return space.substring(0,(space.length() / 2)).equals(print);
        }
        else
        {
            for(int i = space.length(); i > (space.length() + 1) / 2; i--)
            {
                print = print + space.substring(i - 1, i);
            }
            return space.substring(0,((space.length() - 1) / 2)).equals(print);
        }
    }
    
    public static String pigLatinate(String str)
    {
        
    }
    
    public static String shorthand(String str)
    {
        String and = str.replaceAll("and", "&");
        String four = and.replaceAll("for", "4");
        String to = four.replaceAll("to", "2");
        String you = to.replaceAll("you", "U");
        
        
    }
    
    public String puncuation(String str)
    {
        String space = str.replaceAll(" ", "");
        String question = space.replaceAll("?", "");
        String period = question.replaceAll(".", "");
        String exclam = period.replaceAll("!", "");
        String comma = exclam.replaceAll(",", "");
        return comma;
    }
}