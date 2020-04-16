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
        
        String space = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
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
        String vowel = "aeiouAEIOU";
        str = str.replaceAll(" ", "spaceee");
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.replaceAll("spaceee", " ");
        
        for(int i = 0; i < str.length(); i++)
        {
            if(vowel.indexOf(str.substring(i, i + 1)) >= 0)
            {
                if(i == 0)
                {
                    String pigLatinFirst = str + "yay";
                    return pigLatinFirst;
                }
                else
                {
                    if(str.toUpperCase().substring(0,1).equals(str.substring(0,1)))
                    {
                        String decap = str.toLowerCase().substring(0,1);
                        String upper = str.toUpperCase().substring(i, i + 1);
                        String start = decap + str.substring(0, i);
                        String end = upper + str.substring(i + 1, str.length());
                        return end + start + "ay";
                    }
                    else
                    {
                        String start = str.substring(0, i);
                        String end = str.substring(i, str.length());
                        return end + start + "ay";
                    }
                }
            }
            
        }
        return str + "ay";
    }
    
    public static String shorthand(String str)
    {
        String complete = "";
        String and = str.replaceAll("and", "&");
        String four = and.replaceAll("for", "4");
        String to = four.replaceAll("to", "2");
        String you = to.replaceAll("you", "@@@");
        
        String vowel = "aeiouAEIOU";
        
        for(int i = 0; i < you.length(); i++)
        {
            if(vowel.indexOf(you.substring(i, i + 1)) >= 0)
            {
                int location = vowel.indexOf(you.substring(i, i + 1));
                complete = you.replaceAll((vowel.substring(location, location + 1)), "");
                you = complete;
            }
        }
        String last = complete.trim();
        last = last.replaceAll("@@@", "U");
        return last;
    }
}