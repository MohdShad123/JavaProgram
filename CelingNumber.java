public class CelingNumber{
	public static void main(String[] args) {
		int[] array = {2,3,5,9,14,16,18};
		int target = 10;
		int ans = celingNumber(array,target);
		System.out.println("The Celing Number  "+array[ans]+" is found at index no." + ans);
	}

	//return the index of smallest number >= target
	static int celingNumber(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length-1;

		//but what if target element is greater than the greatest number in the array
		if(target > arr[arr.length-1])
		{
			return -1;
		}

		while(start <= end)
		{
			int mid = start + (end-start)/2;

			if(arr[mid] == target)
			{
				return mid;
			}
			else if(target < arr[mid])
			{
				end = mid-1;
			}
			else{
				start = mid+1;
			}
		}
		return start;
	}
}