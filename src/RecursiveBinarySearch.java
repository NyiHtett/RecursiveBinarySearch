import java.util.Scanner;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		String ans;
		do {
			Scanner key = new Scanner(System.in);
			int[] numbers = { 100, 200, 400, 300 };
			System.out.println("which number do you want to search from database?");
			int value = key.nextInt();
			int result = Search(numbers, 0, numbers.length-1, value);
			if(result == -1) {
				System.out.println(value+" is not found in database");
			}
			else {
				System.out.println(value+" is found at the index "+result+" of the database");
			}
			System.out.println("\ndo you want to continue asking data?");
			ans = key.next();
			System.out.println();
		}while(ans.charAt(0) == 'Y' || ans.charAt(0) == 'y');
		
	}
	public static int Search(int[] array,int first,int last,int value) {		
		if(first > last) {
			return -1;
		}
		int middle = (first+last)/2;
		if(array[middle] == value) {
			return middle;
		}
		else if(array[middle] < value) {
			return Search(array, middle+1, last, value);
		}
		else {
			return Search(array, first, middle-1, value);
		}
	}
}
