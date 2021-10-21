import java.util.Scanner;    //Taking input in 2D Array during Run time;
public class JaggedArray{		//Also taking size of array during run time
	public static void main(String[] args) {
		/*int[][] array = {
			{10,20,30},
			{40,50,60,70},
			{1,2,3,4,5,6,7,8,}
		};*/
		Scanner input = new Scanner(System.in);

		int inside_size;
		System.out.println("Enter the base size of an Array: "); 
		int base_size = input.nextInt();
		int[][] array = new int[base_size][];

		/*array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[8];*/

		for(int row = 0; row<array.length; row++)
		{
			inside_size = input.nextInt();
			array[row] = new int[inside_size];
			for(int column = 0; column<array[row].length; column++)
			{
				array[row][column] = input.nextInt();
			}
			
		}


		for(int row = 0; row<array.length; row++)
		{
			for(int column = 0; column<array[row].length; column++)
			{
				System.out.print(array[row][column] + " ");
			}
			System.out.println(" ");
		}
	}
}
