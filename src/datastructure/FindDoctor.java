package datastructure;

public class FindDoctor {

	public static int solution(int[][] A) {
		int N = A.length;
		int M = A[0].length;
		int count = 0;

		// Count the number of occurrences of each doctor
		int[] doctorCount = new int[N * M + 1];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				doctorCount[A[i][j]]++;
			}
		}

		// Count the number of doctors who work at more than one hospital
		for (int i = 0; i < doctorCount.length; i++) {
			if (doctorCount[i] > 1) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[][] A1 = { { 1, 2, 2 }, { 3, 1, 4 } };
		int[][] A2 = { { 1, 1, 5, 2, 3 }, { 4, 5, 6, 4, 3 }, { 9, 4, 4, 1, 5 } };
		int[][] A3 = { { 4, 3 }, { 5, 5 }, { 6, 2 } };

		System.out.println("Case1 - The number of doctors working at more than one hospital : " + solution(A1));
		System.out.println("Case2 - The number of doctors working at more than one hospital : " + solution(A2));
		System.out.println("Case3 - The number of doctors working at more than one hospital : " + solution(A3));
	}
}
