import java.util.*;
public class Subset {
    public static void main(String[] args) {
        ArrayList<Integer> sample = new ArrayList<Integer>();
        sample.add(1);
        sample.add(2);
        sample.add(3);
        ArrayList<ArrayList<Integer>> result = subsets(sample);
        System.out.println(result.toString());
    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> S) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        if (S == null || S.size() == 0) {
            return result;
        }
        Collections.sort(S);
        helper(result, S, new ArrayList<Integer>(), 0);
        return result;
    }
    
    private static void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> S, ArrayList<Integer> cur, int i) {
        for (int j = i; j < S.size(); j++) {
            cur.add(S.get(j));
            result.add(new ArrayList<Integer>(cur));
            helper(result, S, cur, j + 1);
            cur.remove(S.get(j));
        }
    }
}