import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
//    String[] words;
//
//    words = new String[5];
//
//    int numberOfWords = words.length;
//
//    words[0] = "Java";
//
//    String firstWord = words[0];
//
//    System.out.println(firstWord);

//          ArrayList
        ArrayList<String> words;
        words = new ArrayList<String>();
        int numberOfWords = words.size();
        words.add("IntelliJ");
        String firstWord = words.get(0);
        System.out.println(numberOfWords);
    }
}
