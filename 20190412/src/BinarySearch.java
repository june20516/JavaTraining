
public class BinarySearch {

	/**
	 * @return index of target
	 * @param arr (sorted only)
	 * @param target
	 */
	public static void binarySearch(int[] arr, int target) {

		int max = arr.length - 1;
		int min = 0;
		int middle = (max + min) / 2;
		int resultIdx = -1;

		while (min <= max) {
			if (target > arr[middle]) {
				min = middle + 1;
				middle = (max + min) / 2;
			} else if (target < arr[middle]) {
				max = middle - 1;
				middle = (max + min) / 2;
			} else {
				resultIdx = middle;
				break;
			}
		}
		System.out.println(resultIdx);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		binarySearch(arr, 6);
		binarySearch(arr, 2);
		binarySearch(arr, 9);
		binarySearch(arr, 7);

	}
}
