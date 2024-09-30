public class Classwork
{
  public static void main(String[] args)
  {
    // test cases for delEnd
    // System.out.println(delEnd("library", 5));
    // System.out.println(delEnd("banana", 3));

    // test cases for compareLower
    // System.out.println(compareLower("framing", "framING"));
    // System.out.println(compareLower("Sterling", "material"));
    // System.out.println(compareLower("BAgels", "candLes"));

    // test cases for lengthFirst
    System.out.println(lengthFirst("Everything in its right place"));
    System.out.println(lengthFirst("Down is the new up"));
  }

  public static String delEnd(String word, int n)
  {
    int StoppingIndex = word.length()- n;
    String output = word.substring(0, StoppingIndex); //starts @ beginning of the string, pos 0 
    return output;

  }
  public static int compareLower(String word1, String word2)
  {
    String w1 = word1.toLowerCase();
    String w2 = word2.toLowerCase();
    int output = w1.compareTo(w2);
    return output;
  }
  public static int lengthFirst(String sentence)
  {
    int first_word_index = sentence.indexOf(" ");
    String first_word = sentence.substring(0, first_word_index);
    int length_first_word = first_word.length();
    return length_first_word;

  }

}
