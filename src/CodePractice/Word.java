package CodePractice;

public class Word {
	public static String reverseWord(String s){
		if(s==null && s.isEmpty()) return "";
			StringBuilder sb=new StringBuilder(s);
			return sb.reverse().toString();
	}
	public static String reverseWordInSent(String sentence){
		if(sentence==null && sentence.isEmpty()) return "";
		String [] words=sentence.split(" ");
		StringBuilder result=new StringBuilder();
		for(String word:words){
			result.append(reverseWord(word));
			result.append(" ");
		}
		result.trimToSize();
		return result.toString();
	}
}
