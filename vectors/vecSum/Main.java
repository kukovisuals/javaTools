import java.util.*;
public class Main {

	public static void main(String[] args) {
		int col = 11;
		int row = 11;
		int down = 1;
		int right = 3;
		int[][] gps = new int[col][row];
		int[][] xy = new int[col][row];
		int[] ans = new int[row];

		for (int i = down; i < col; ++i) {
			for (int j = right; j < row; j+=right) {
				if (j == row-right) {
					
				}
				xy[i][j] = 69;
				System.out.print(j);
			}
		}


		for (int i = 0; i < col; ++i) {
			for (int j = 0; j < row; ++j) {
				gps[i][j] = j;
				ans[j] = gps[0][j] + gps[1][j];
			}
		}
		for (Integer o : ans) {		
		System.out.println(o);
		}
		// ans = gps[0][1] + gps[1][1];
		// ans = gps[0][2] + gps[1][2];
		// System.out.println(Arrays.deepToString(gps));
		System.out.println(Arrays.deepToString(xy));
	}
}