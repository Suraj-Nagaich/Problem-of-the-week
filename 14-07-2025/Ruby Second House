public class PaintHouseII {
  public int minCostII(int[][] costs) {
    int n = costs.length;
    if (n == 0) return 0;
    int k = costs[0].length;
    if (k == 0) return 0;
    int min1 = -1, min2 = -1;
    for (int i = 0; i < n; i++) {
        int lastMin1 = min1, lastMin2 = min2;
              min1 = -1;
              min2 = -1;
    for (int j = 0; j < k; j++) {
        if (i > 0) {
          if (j != lastMin1) {
            costs[i][j] += costs[i - 1][lastMin1];
    } else {
        costs[i][j] += costs[i - 1][lastMin2];
}
}
if (min1 == -1 || costs[i][j] < costs[i][min1]) {
        min2 = min1;
        min1 = j;
} else if (min2 == -1 || costs[i][j] < costs[i][min2]) {
          min2 = j;
}
}
}
    return costs[n - 1][min1];
}

