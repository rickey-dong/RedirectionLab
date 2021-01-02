import java.util.*;
public class MakeStars
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
        System.out.print(starify(word));
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
  public static String starify(String terminalInput)
  {
    String starString = "";
    for (int i = 0; i < terminalInput.length(); i++)
    {
        starString += "*";
    }
    return starString;
  }
}