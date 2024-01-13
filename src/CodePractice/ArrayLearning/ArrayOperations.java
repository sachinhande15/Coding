package CodePractice.ArrayLearning;

public class ArrayOperations {
	public static int [] reverseArray(int[] arr){
		int arrayLength=arr.length;
		int [] reversed=new int[arrayLength];
		if(arrayLength!=0){
			for (int i = 0; i < arr.length; i++) {
				reversed[i]=arr[arr.length-1-i];
			}
		}
		return reversed;
	}
	// use less iteration and without new array
	public static int [] reverseArrayWithWhile(int [] array){
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

	// [17,37,54,3,2,1]
	public static int [] sortArray(int[] array){
		int temp=0;
		if(array.length!=0){
			for(int i=0;i< array.length;i++){
				for (int j=i+1; j< array.length;j++){
					if(array[i]>array[j]){
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
			return array;
		}
		return array;
	}

	// sum of even numbers form the array [12,45,14]  sum=26

	public static int sumOfEvenNumbers(int[] array){
		int sum=0;
		int i=0;
		int length=array.length;
		while (i<length){
			if(array[i] % 2 ==0){
				sum+=array[i];
			}
			i++;
		}
		return sum;
	}
}
