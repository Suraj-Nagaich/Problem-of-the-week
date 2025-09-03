import java.util.ArrayList;
import java.util.Arrays;
class POW {
    static int dfs(ArrayList<Integer>[] tree, boolean[] visit,int[] ans, int node) {
        int num = 0, cnt;
        visit[node] = true;
        for (int neighbor : tree[node]) {
            if (!visit[neighbor]) {
                cnt = dfs(tree, visit, ans, neighbor);
                if (cnt % 2 == 0) {
                    ans[0]++;
                } else {
                    num += cnt;
                }
            }
        }
        return num + 1;
    }
    static int maxEdge(ArrayList<Integer>[] tree, int n) {
        boolean[] visit = new boolean[n + 1];
        int[] ans = {0};
        Arrays.fill(visit, false);
        dfs(tree, visit, ans, 1);
        return ans[0];
    }
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer>[] tree = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            tree[i] = new ArrayList<>();
        }
        tree[1].add(2);
        tree[2].add(1);
        tree[1].add(3);
        tree[3].add(1);
        tree[1].add(4);
        tree[4].add(1);
        tree[2].add(5);
        tree[5].add(2);
        tree[2].add(6);
        tree[6].add(2);
        tree[3].add(7);
        tree[7].add(3);
        tree[4].add(8);
        tree[8].add(4);
        tree[8].add(9);
        tree[9].add(8);
        tree[8].add(10);
        tree[10].add(8);
        System.out.println(maxEdge(tree, n));
    }
}
