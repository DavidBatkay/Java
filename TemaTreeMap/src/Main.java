import java.util.ArrayList;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		input.add("The");
		input.add("quick");
		input.add("brown");
		input.add("fox");
		input.add("jumps");
		input.add("over");
		input.add("the");
		input.add("lazy");
		input.add("dog");
		ArrayList<String> output = new ArrayList<String>();
		for(String word: input) {
			word=word.toLowerCase();
			output.add(word);
		}
		String[] words=new String[output.size()];
		words= output.toArray(words);
		//System.out.println(output);
		System.out.println(countWords(words));
		}
	
	public static TreeMap<String,Integer> countWords(String[] words){
		TreeMap<String,Integer> wordCount = new TreeMap<String, Integer>();
		for(String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
		}
		return wordCount;
	}
}
