package datastructure;

public class ReplaceLetter {
	public static void main(String[] args) {
		String input1 = "baaaa";
		String input2 = "baaabbaabbba";
		String input3 = "baabab";

		System.out.println("Minimum number of moves for " + input1 + " is : " + minimumMoves(input1));
		System.out.println("Minimum number of moves for " + input2 + " is : " + minimumMoves(input2));
		System.out.println("Minimum number of moves for " + input3 + " is : " + minimumMoves(input3));
	}

	public static int minimumMoves(String S) {
		int n = S.length();
		int moves = 0;
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (S.charAt(i) == S.charAt(i - 1)) {
				count++;
				if (count == 3) {
					count = 2;
					moves++;
				}
			} else {
				count = 1;
			}
		}
		return moves;
	}

}
