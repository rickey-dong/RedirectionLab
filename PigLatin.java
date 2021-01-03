import java.util.*;
public class PigLatin
{
  public static void main(String[] args)
  {
    Scanner wholeFile = new Scanner(System.in);
    while (wholeFile.hasNextLine())
    {
      String indivLine = wholeFile.nextLine();
      Scanner eachLine = new Scanner(indivLine);
      while (eachLine.hasNext())
      {
        String word = eachLine.next();
        System.out.print(pigLatinBest(word));
        if (eachLine.hasNext())
        {
          System.out.print(' ');
        }
      }
      if (wholeFile.hasNextLine())
      {
        System.out.println();
      }
    }
  }
  public static String pigLatinSimple(String s)
  {
    s = s.toLowerCase();
    String finalResult = "";
    if (startsWithVowel(s))
    {
      finalResult += s;
      finalResult += "hay";
    }
    else
    {
      finalResult += s.substring(1,s.length());
      finalResult += s.charAt(0);
      finalResult += "ay";
    }
    return finalResult;
  }
  public static boolean startsWithVowel(String s)
  {
    return s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' 
          || s.charAt(0) == 'o' || s.charAt(0) == 'u';
  }
  public static String pigLatin(String s)
  {
    s = s.toLowerCase();
    String finalResult = "";
    if (startsWithVowel(s))
    {
      finalResult += s;
      finalResult += "hay";
    }
    else
    {
      if (startsWithDigraph(s))
      {
        finalResult += s.substring(2,s.length());
        finalResult += s.substring(0,2);
        finalResult += "ay";
      }
      else
      {
        finalResult += s.substring(1,s.length());
        finalResult += s.charAt(0);
        finalResult += "ay";
      }
    }
    return finalResult;
  }
  public static boolean startsWithDigraph(String s)
  {
    if (s.length() < 2)
    {
      return false;
    }
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl",
                        "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", 
                        "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i = 0; i < digraphs.length; i++)
    {
      if (s.substring(0,2).equals(digraphs[i]))
      {
        return true;
      }
    }
    return false;
  }
  public static String pigLatinBest(String s)
  {
    s = s.toLowerCase();
    String finalResult = "";
    if (startsWithNonLetter(s))
    {
      finalResult += s;
      return finalResult;
    }
    else
    {
      if (endsWithNonLetterNonNumber(s))
      {
        String modifiedString = s.substring(0,s.length() - 1);
        finalResult += pigLatin(modifiedString);
        finalResult += s.charAt(s.length() - 1);
      }
      else
      {
        finalResult += pigLatin(s);
      }
    }
    return finalResult;
  }
  public static boolean startsWithNonLetter(String s)
  {
    return s.charAt(0) != 'a' && s.charAt(0) != 'b' && s.charAt(0) != 'c' && s.charAt(0) != 'd' &&
           s.charAt(0) != 'e' && s.charAt(0) != 'f' && s.charAt(0) != 'g' && s.charAt(0) != 'h' &&
           s.charAt(0) != 'i' && s.charAt(0) != 'j' && s.charAt(0) != 'k' && s.charAt(0) != 'l' &&
           s.charAt(0) != 'm' && s.charAt(0) != 'n' && s.charAt(0) != 'o' && s.charAt(0) != 'p' &&
           s.charAt(0) != 'q' && s.charAt(0) != 'r' && s.charAt(0) != 's' && s.charAt(0) != 't' &&
           s.charAt(0) != 'u' && s.charAt(0) != 'v' && s.charAt(0) != 'w' && s.charAt(0) != 'x' &&
           s.charAt(0) != 'y' && s.charAt(0) != 'z';
  }
  public static boolean endsWithNonLetterNonNumber(String s)
  {
    return s.charAt(s.length() - 1) != 'a' && s.charAt(s.length() - 1) != 'b' && s.charAt(s.length() - 1) != 'c' && s.charAt(s.length() - 1) != 'd' &&
           s.charAt(s.length() - 1) != 'e' && s.charAt(s.length() - 1) != 'f' && s.charAt(s.length() - 1) != 'g' && s.charAt(s.length() - 1) != 'h' &&
           s.charAt(s.length() - 1) != 'i' && s.charAt(s.length() - 1) != 'j' && s.charAt(s.length() - 1) != 'k' && s.charAt(s.length() - 1) != 'l' &&
           s.charAt(s.length() - 1) != 'm' && s.charAt(s.length() - 1) != 'n' && s.charAt(s.length() - 1) != 'o' && s.charAt(s.length() - 1) != 'p' &&
           s.charAt(s.length() - 1) != 'q' && s.charAt(s.length() - 1) != 'r' && s.charAt(s.length() - 1) != 's' && s.charAt(s.length() - 1) != 't' &&
           s.charAt(s.length() - 1) != 'u' && s.charAt(s.length() - 1) != 'v' && s.charAt(s.length() - 1) != 'w' && s.charAt(s.length() - 1) != 'x' &&
           s.charAt(s.length() - 1) != 'y' && s.charAt(s.length() - 1) != 'z' && s.charAt(s.length() - 1) != '0' && s.charAt(s.length() - 1) != '1' &&
           s.charAt(s.length() - 1) != '2' && s.charAt(s.length() - 1) != '3' && s.charAt(s.length() - 1) != '4' && s.charAt(s.length() - 1) != '5' &&
           s.charAt(s.length() - 1) != '6' && s.charAt(s.length() - 1) != '7' && s.charAt(s.length() - 1) != '8' && s.charAt(s.length() - 1) != '9';
  }
}

























