package Example.com;

// JAVA PROGRAM TO ILLUSTRATE A NESTED FOR LOOP
public class Nestedforloop {
	public static void main(String[] args) {
		//for loop started.
		for (int i = 1; i < 3; i++) 
		{
			//nested for loop started.
			for (int j = 1; j <3; j++) 
			{
				System.out.print("(" + i + "," + j + ") ");
			}
			// Will print a matrix
			System.out.println();
		}
				
	}
}
