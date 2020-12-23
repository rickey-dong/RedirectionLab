import java.util.*;
public class MakeStars
{
  public static String starify(String terminalInput)
  {
    String starString = "";
    for (int i = 0; i < terminalInput.length(); i++)
    {
      if (terminalInput.charAt(i) != ' ')
      {
        starString += "*";
      }
      else
      {
        starString += " ";
      }
    }
    return starString;
  }
}