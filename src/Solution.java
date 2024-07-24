import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();

        cur.add(1);
        ans.add(cur);
        if (numRows == 1) return ans;

        cur = new ArrayList<Integer>();
        cur.add(1);
        cur.add(1);
        ans.add(cur);
        if (numRows == 2) return ans;

        for (int j = 3; j < numRows+1; j++) {
            int n = cur.size();
            List<Integer> prev = cur;
            cur = new ArrayList<Integer>();
            cur.add(1);
            for (int i = 1; i < n; i++) {
                cur.add(prev.get(i-1) + prev.get(i));
            }
            cur.add(1);
            ans.add(cur);
        }

        return ans;
    }
}