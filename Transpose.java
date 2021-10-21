import java.util.Scanner;
public class Transpose{
	public static void main(String[] args) {
		int[][] array = {
			{10,20,30,100,200},
			{40,50,60,70,80},
			{1,2,3,4,5,}
		};
		/*Scanner input = new Scanner(System.in);
		int[][] array = new int[3][];
		array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[8];

		for(int row = 0; row<array.length; row++)
		{
			for(int column = 0; column<array[row].length; column++)
			{
				array[row][column] = input.nextInt();
			}
			
		}*/
		int[][] transposeMatrix = new int[array[0].length][array.length];
		for(int column = 0; column<array[0].length; column++)
		{
			for(int row = 0; row<array.length; row++)
				{
					{
						transposeMatrix[row][column] = array[column][row];
						System.out.print(transposeMatrix[row][column] + " ");
					}
					System.out.println(" ");
				}	
		}
	}
}
