import java.util.Scanner;

public class Addition_of_2D_array {

	public static void main(String[] args) {
		
				Scanner input = new Scanner(System.in);
				System.out.print("Enter your size of the array: ");
				int n=input.nextInt();
				int[][] number1= new int[n][n];
				int[][] number2= new int[n][n];
				int[][] result= new int[n][n];
				System.out.println("Enter your 1st array elements: ");
				for(int i=0;i<number1.length;i++) {
					for(int j=0;j<number1.length;j++) {
						number1[i][j] = input.nextInt();
					}
				}
				System.out.println("Enter your 2nd array elements are: " );
				for(int i=0;i<number2.length;i++) {
					for(int j=0;j<number2.length;j++) {
						number2[i][j] = input.nextInt();
					}
				}
				input.close();
				for(int i=0;i<number1.length;i++) {
					for(int j=0;j<number2.length;j++) {
						result[i][j]=number1[i][j] + number2[i][j];
					}
				}
				System.out.println("Addition of 2D elements are: ");
				for(int i=0;i<number1.length;i++) {
					for(int j=0;j<number2.length;j++) {
						System.out.print(result[i][j]+" ");
					}
					System.out.println();
				}

			}

		}