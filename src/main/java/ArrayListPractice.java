import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice 
{

  // 1 - create ArrayList
  // 2 - call all of the methods from the notes
  // 3 - use a for loop to print all items of list
  public static void practice()
  {
    ArrayList<String> moreGames = new ArrayList<String>();

    String s1 = "Super Mario 64";
    moreGames.add("Super Mario 64");
    // [Super Mario 64]
    String s2 = "Subnautica";
    moreGames.add(s2);
    // [Super Mario 64, Subnautica]
    String s3 = "Stray";
    moreGames.add(s3);
    // [Super Mario 64, Subnautica, Stray]
    String s4 = "Rain World";
    moreGames.add(0, s4);
    // [Rain World, Super Mario 64, Subnautica, Stray]
    String s5 = new String("Rain World");
    moreGames.add(3, s5);
    // [Rain World, Super Mario 64, Subnautica, Rain World, Stray]

    String s6 = new String("Stray");

    System.out.println("contains: " + moreGames.contains(s6)); // true
    
    System.out.println("get: " + moreGames.get(1)); // "Super Mario 64"

    System.out.println("indexOf: " + moreGames.indexOf(s6)); // 4

    moreGames.remove(s6); // removes last value, so list is now [Rain World, Super Mario 64, Subnautica, Rain World]
    moreGames.remove(3); // removes last value, so list is now [Rain World, Super Mario 64, Subnautica]

    System.out.println("size: " + moreGames.size()); // 3

    // moreGames.sort();
    Collections.sort(moreGames); // after sorting, [Rain World, Subnautica, Super Mario 64]

    System.out.println("lastIndexOf: " + moreGames.lastIndexOf("Rain World")); // 0

    System.out.println("toString: " + moreGames.toString()); // [Rain World, Super Mario 64, Subnautica]
    System.out.println("for loop:\n");
    for (int i = 0; i < moreGames.size(); i++)
    {
      System.out.println(moreGames.get(i)); 
    }
    
  }
  
}