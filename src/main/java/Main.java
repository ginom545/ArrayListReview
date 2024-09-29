/*
Created 3/10/24
ArrayList notes
CHECK THIS OUT IN OUR GOOGLE DOC
More practice next lesson
*/

import java.util.ArrayList;

public class Main 
{
  public static void main(String[] args) 
  {
    // myArray contains ints
    // notice here we say Integer not int
    // ArrayList<Integer> myArray = new ArrayList<Integer>();

    // myWords contains a bunch of String words
    /*
    ArrayList<String> myGames = new ArrayList<String>();
    String s1 = "Sonic the Hedgehog";
    myGames.add(s1);
    String s2 = "Undertale";
    myGames.add(s2);
    String s3 = "Minecraft";
    myGames.add(s3);
    String s4 = "Super Mario Bros Wonder";
    myGames.add(s4);
    String s5 = "Deltarune";
    myGames.add(s5);
    String s6 = "Splatoon";
    myGames.add(s6);
    */

    // keep in mind that Strings are NOT primitives, they ARE objects
    // so although s1 and s7 contain the same OBJECT DATA
    // the value of s1 is a pointer value, and the value of s7 is also a pointer value
    // but, since these are two separate object variables
    // s1 and s7 will have different pointer values
    // in other words
    // s1.equals(s7) gives TRUE because they have the same OBJECT DATA
    // but
    // s1 == s7 gives FALSE because they have different POINTER VALUES
    // now subtle detail
    // if I just wrote String s7 = "Sonic the Hedgehog"
    // the Java compiler does a trick for you
    // and just would make s7 point to the same thing as s1
    // because it notices they have the same String data (object data)
    // this a trick built into Java's compiler to conserve memory
    // so it didn't have to allocate a new String object data
    // we can workaround this by explicitly evoking the "new String" constructor
    // String s7 = new String("Sonic the Hedgehog");

    // the main idea I am trying to demonstrate here
    // is that ArrayList methods (such as contains, indexOf, remove, lastIndexOf)
    // use .equals, NOT ==
    // notice I added s1 to myGames, but never added s7
    // System.out.println(myGames.contains(s7)); // prints true
    // it is tempting to look at this and think it will print false
    // because we never directly added s7 to the list
    // so of course we'd think "the list does not contain s7"
    // but keep in mind that List methods (including ArrayList methods)
    // use .equals() not ==s
    // so they care about object DATA, not the objects themselves
    // so contains is really asking
    // "is there an object in my list that has data EQUAL to the data of this object"
    // not
    // "does this list contain this exact object"
    // because myGames contains an object pointer (s1) with the same DATA as s7
    // it returns true

    // similarly, this is valid
    // myGames.remove(s7);
    // this would actually remove s1 from the list
    // they are two separate objects, two separate pointer values
    // but because s1 and s7 have the same data
    // it triggers the .equals() check inside the remove() function code
    // and will remove s1

    // we can prove this by printing the contents of myGames
    // and see "Sonic the Hedgehog" (s1) is no longer there
    /*
    for(int i = 0; i < myGames.size(); i++)
    {
       System.out.println(myGames.get(i)); 
    }
    */

    // call practice() function from ArrayListPractice.java   
    // notice we have to precede practice() with ArrayListPractice
    // because we are accessing that static method practice() from class ArrayListPractice
    // in general in Java, everything is "organized" by the class
    ArrayListPractice.practice();
    
  }
}