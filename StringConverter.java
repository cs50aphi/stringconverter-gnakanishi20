public class StringConverter 
{
    //reverse function
    public static String reverse(String str)
    {
        String print = "";
        //starts from the back and adds chars in the string to print which makes the word backwards
        for(int i = str.length(); i > 0; i--)
        {
            print = print + str.substring(i - 1, i);
        }
        return print;
    }
    
    public static boolean checkPalindrome(String str)
    {
        //lowercases the string and takes out chars that are not letters   
        String space = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String print = "";
        
        //checks to see if its a palendrome
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
        //makes a place holder for space so when I take out all special chars I can reinput space later
        str = str.replaceAll(" ", "spaceee");
        //takes out all special chars
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        //reinputing space
        str = str.replaceAll("spaceee", " ");
        
        for(int i = 0; i < str.length(); i++)
        {
            if(vowel.indexOf(str.substring(i, i + 1)) >= 0)
            {
                if(i == 0)
                {
                    //what to do if the fist letter is a vowel
                    String pigLatinFirst = str + "yay";
                    return pigLatinFirst;
                }
                else
                {
                    //if the first letter is an uppercase
                    if(str.toUpperCase().substring(0,1).equals(str.substring(0,1)))
                    {
                        //chenges the uppercase word right
                        String start = str.toLowerCase().substring(0,1) + str.substring(0, i - 1);
                        String end = str.toUpperCase().substring(i, i + 1) + str.substring(i + 1, str.length());
                        return end + start + "ay";
                    }
                    else
                    {
                        //making other words pig latin
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
        //required replacements
        String and = str.replaceAll("and", "&");
        String four = and.replaceAll("for", "4");
        String to = four.replaceAll("to", "2");
        //Replaces you with a place holder because U is a vowel and there could be other capital U's
        String you = to.replaceAll("you", "@@@");
        
        String vowel = "aeiouAEIOU";
        
        for(int i = 0; i < you.length(); i++)
        {
            //deletes vowels in the string
            if(vowel.indexOf(you.substring(i, i + 1)) >= 0)
            {
                int location = vowel.indexOf(you.substring(i, i + 1));
                complete = you.replaceAll((vowel.substring(location, location + 1)), "");
                you = complete;
            }
        }
        String last = complete.trim();
        //replaces the place holder
        last = last.replaceAll("@@@", "U");
        return last;
    }
}