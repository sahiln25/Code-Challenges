import java.util.*;
public class SpiralMatrix {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> sampleInput = new ArrayList<ArrayList<Integer>>();
		sampleInput.add(new ArrayList<Integer>());
		sampleInput.add(new ArrayList<Integer>());
		sampleInput.add(new ArrayList<Integer>());
		sampleInput.get(0).add(1);
		sampleInput.get(0).add(2);
		sampleInput.get(0).add(3);
		sampleInput.get(1).add(4);
		sampleInput.get(1).add(5);
		sampleInput.get(1).add(6);
		sampleInput.get(2).add(7);
		sampleInput.get(2).add(8);
		sampleInput.get(2).add(9);

		ArrayList<Integer> result = spiralOrder(sampleInput);
		System.out.println(result.toString());
	}
	public static ArrayList<Integer> spiralOrder(List<ArrayList<Integer>> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int T = 0;
		int B = a.size() - 1;
		int L = 0;
		int R = a.get(0).size() - 1;
		 
		int dir = 0; // 0 = left to right, 1 = top to bottom, 2 = right to left, 3 = bottom to top
		 
		while(T <= B && L <= R)
		{
			if(dir == 0)
			{
				for(int i = L; i <= R; i++)
				{
					result.add(a.get(T).get(i));
				}
				T++;
				dir = 1;
			}
			else if(dir == 1)
			{
				for(int i = T; i <= B; i++)
				{
					result.add(a.get(i).get(R));
				}
				R--;
				dir = 2;
			}
			else if(dir == 2)
			{
				for(int i = R; i >= L; i--)
				{
					result.add(a.get(B).get(i));
				}
				B--;
				dir = 3;
			}
			else if(dir == 3)
			{
				for(int i = B; i >= T; i--)
				{
					result.add(a.get(i).get(L));
				}
				L++;
				dir = 0;
			}
		}
		return result;
	}
}
