
public class SequentialSort {

	public static int[] sequantialSort(int[] arr) {
		for(int i = 0; i <arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp;
				if (arr[i] >= arr[j]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 7, 123, 646, 232, 674, 30, 22 };
		arr = sequantialSort(arr);
		for(int ar : arr) {
			System.out.println(ar);
		}
	}
}
