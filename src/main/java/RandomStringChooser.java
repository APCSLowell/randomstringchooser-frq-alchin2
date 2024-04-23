import java.util.*;
public class RandomStringChooser
{
  private arrayList<String> words;
  public RandomStringChooser(String[] array){
    words = new arrayList<String>();
    for(String word: arrray){
      words.add(word);
    }
  }
  public String getNext(){
    if (word.size()>0){
      return words.remove((int)(math.random()*word.size()));
    }
    return "NONE";
  }
}
