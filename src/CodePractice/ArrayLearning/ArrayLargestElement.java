package CodePractice.ArrayLearning;
public class ArrayLargestElement {
	public static void main(String[] args){
		System.out.println("Largest element in the array is "+largestElement(new int[]{12, 45, 32, 3, 23}));
		System.out.println("Second largest element in the array is "+secondLargestElement(new int[]{12, 45, 32, 3, 23}));
	}
	public static int largestElement(int[] array){
		int largestNumber;
		if(array.length!=0) {
			largestNumber=array[0];
			for (int j : array) {
				if (j > largestNumber) {
					largestNumber = j;
				}
			}
			return largestNumber;
		}
		return 0;
	}
	public static int secondLargestElement(int[] array){
		int largestNumber, secondLargest;
		if(array.length!=0) {
			largestNumber = array[0];
			secondLargest = -1;
			for (int j : array) {
				if (j > largestNumber) {
					secondLargest = largestNumber;
					largestNumber = j;
				} else if (j < largestNumber && j > secondLargest) {
					secondLargest = j;
				}
			}
			return  secondLargest;
		}
		return 0;
	}
}
