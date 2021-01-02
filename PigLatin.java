public class PigLatin
{
  public static void main(String[] args)
  {
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("david"));
    System.out.println(pigLatinSimple("aaron"));
    System.out.println(pigLatinSimple("AARON"));
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
    return "S";
  }
  public static boolean startsWithDigraph(String s)
  {
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
}