import java.util.Scanner;

public class morse
{
   
        final String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
          "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
          "v", "w", "x", "y", "z", " "};

        final String[] morse = {".-", "-...", "-.-/>.", "-..", ".", "..-.", "--.", "....", "..",
          ".---", "-.-/>", ".-..", "--", "-.", "---", ".--.", "--.-/>",  ".-.", "...", "-", "..-",
          "...-" ,".--" ,"-..-", "-.-/>-", "--..", "|"};
    public static void main(String [] args)
    {       
        Scanner input = new Scanner( System.in ); 
        System.out.print( "Would you like to convert English to Morse (yes or no)? " ); 
        String answer = input.nextLine(); 
        if( answer.equals( "yes" ) ) 
        { 
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter a String for translation to Morse:");
            String letter = scan.nextLine();
            System.out.println( toMorse( letter ));
        } 
        if (answer.equalsIgnoreCase( "no" ) ) 
        { 
            System.out.print( "Morse to English? " ); 
            String answer2 = input.nextLine(); 
                if (answer2.equalsIgnoreCase( "yes" ) ) 
                { 
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Please enter a String for translation to English:");
                    String dot = scan.nextLine();
                   
                    for (int j=0; j < 26; ++j)
                    {
                        System.out.println( toAlpha( dot ));
                    }

                }
        }
    }

    public static String toMorse(String letter)
    {
        final String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
        "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
        "v", "w", "x", "y", "z", " "};

        final String[] morse = {".-", "-...", "-.-/>.", "-..", ".", "..-.", "--.", "....", "..",
          ".---", "-.-/>", ".-..", "--", "-.", "---", ".--.", "--.-/>",  ".-.", "...", "-", "..-",
          "...-" ,".--" ,"-..-", "-.-/>-", "--..", "|"};
       

        for(int i = 0; i < alpha.length; ++i)
        {   
            char [] chars = letter.toCharArray();
           for( i=0;i<letter.length;++i)
           {
            if(letter.equals(alpha[i]))
            {
                return morse[i];
            }
        }
        return " ";  // not found
    }
    public static String toAlpha(String dot)
    {
        final String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
          "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
          "v", "w", "x", "y", "z", " "};

        final String[] morse = {".-", "-...", "-.-/>.", "-..", ".", "..-.", "--.", "....", "..",
          ".---", "-.-/>", ".-..", "--", "-.", "---", ".--.", "--.-/>",  ".-.", "...", "-", "..-",
          "...-" ,".--" ,"-..-", "-.-/>-", "--..", "|"};


        for(int i = 0; i < morse.length; ++i)
        {
            if(dot.equals(morse[i]))
            return alpha[i];
        }
        return " ";  // not found
    }
}