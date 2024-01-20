package CodePractice.ArrayLearning;

public class ArrayReverse {
	public static void main(String args[]){
		reverseArray(new int[]{12,24,56,78});
	}
	// Reverse a given array
	public static int [] reverseArray(int [] array){
		int start=0, end=array.length-1, temp;
		while (start<end){
			temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		return array;
	}
}
