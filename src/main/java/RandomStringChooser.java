import java.util.*;
public class RandomStringChooser
{
  private arrayList<String> words;
  public RandomStringChooser(String[] arr){
    words = new arrayList<String>();
    for(String word; arr){
      words.add(word);
    }
  }
  public String getNext(){
    if (word.size()>0){
      rturn words.remove((int)(math.random()*word.size()));
    }
    return "NONE";
  }
}
