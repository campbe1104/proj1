public class Evens {
	
	/** Calculates if an integer is an even number
	 * @param i the value
	 * @return true if i is even
	 */
	private static boolean isEven(int i) {
		return  (i % 2 == 0 );
	}
	
	/** Counts the number of even integers in an array
	 * @param numbers the array to be tested
	 * @return the sum of even integers in the array
	 */
	public static int countEvens(int[] numbers) {
		return countEvens(numbers, 0);
	}
	
	private static int countEvens(int[] numbers, int index) {
		// base case
		if (numbers.length == index) {
			// TODO
			return -1;
		}
		
		// recursive case
		else {
			boolean nextIsEven = isEven( numbers[index] );
			if (nextIsEven) {
				// TODO
				return -1;
			}
			else {
				// TODO
				return -1;
			}
		}
	}
}
