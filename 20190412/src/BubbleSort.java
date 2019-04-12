
public class BubbleSort {
	
	public static int[] bubbleSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int temp = 0;
			int pass = 0;
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>=arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} else {
					pass++;
				}
			}
			if (pass == arr.length-1) {
				break;
			}
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {10,7,123,646,232,674,30,22};
		arr = bubbleSort(arr);
		for(int ar : arr) {
			System.out.println(ar);
		}
	}
}
