public class AgnosticB_S{   //Order Agnostic Binary Search -> says you are given a sorted array but you dont know weather it is sorted in increasing or decreasing order
	public static void main(String[] args)
	{
		int[] array = {89,45,22,18,16,15,4,3,2,0,-4,-12,-18};
		int target = 22;
		int ans = agnosticBS(array, target);
		System.out.println(ans);
	}

	static int agnosticBS(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length-1;

		boolean isAgno;  //cheacking the arry for increasing or decreasing order
		{
			if(arr[start] < arr[end])
			{
				isAgno = true;
			}
			else
			{
				isAgno = false;
			}
		}

		while(start <= end)
		{
			int mid = start +(end-start)/2;

			if(arr[mid] == target)
			{
				return mid;
			}
			if(isAgno){
				if(target < arr[mid])
				{
					end = mid-1;
				}
				else if(target > arr[mid])
				{
					start = mid+1;
				}
			}
			else{
					if(target > arr[mid])
					{
						end = mid-1;
					}else if(target < arr[mid])
					{
						start = mid+1;
					}
				}
			}
		return -1;
	}
}