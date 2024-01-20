package CodePractice.ArrayLearning;

import java.util.Arrays;

public class ArrayLeftRotate {
	public static void main(String[] args){
		System.out.println(Arrays.toString(leftRotate(new int[]{12, 45, 32, 3, 23})));
	}

	private static int [] leftRotate(int[] arr) {
		int temp=arr[0];
		for (int i = 1; i < arr.length ; i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		return arr;
	}
}
