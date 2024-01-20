package CodePractice.ArrayLearning;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args){
		System.out.println(Arrays.toString(sortArray(new int[]{12, 45, 32, 3, 23})));
	}

	public static int [] sortArray(int[] array){
		int temp;
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
}
