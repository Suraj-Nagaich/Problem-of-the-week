class Solution {

    public double knightProbability(int n, int k, int row, int column) {

                                                //CREATING DOUBLE TYPE 2D ARRAYS TO STORE THE PROBABILITY VALUES IN DOUBLE.
        double [][] curr = new double[n][n];
        double [][] next = new double[n][n];
        curr[row][column] = 1;                             //INITIALLY, THE PLACE WHERE THE KNIGHT IS PRESENT  will be marked as '1' - denotes success.

        for (int t = 0; t < k; t++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (curr[i][j] != 0) 
                    {
                        int ni = i - 2;
                        int nj = j - 1;
                        if (isValid(ni,nj,n)){
                        }
                         ni = i - 1;
                         nj = j - 2;
                        if (isValid(ni,nj,n)){
                            next[ni][nj] += curr[i][j] / 8.0;
                        }
                         ni = i + 1;
                         nj = j - 2;
                        if (isValid(ni,nj,n)){
                            next[ni][nj] += curr[i][j] / 8.0;
                        }
                         ni = i + 2;
                         nj = j - 1;
                        if (isValid(ni,nj,n)){
                            next[ni][nj] += curr[i][j] / 8.0;
                        }
                         ni = i - 2;
                         nj = j + 1;
                        if (isValid(ni,nj,n)){
                            next[ni][nj] += curr[i][j] / 8.0;
                        }
                         ni = i - 1;
                         nj = j + 2;
                        if (isValid(ni,nj,n)){
                            next[ni][nj] += curr[i][j] / 8.0;
                        }
                         ni = i + 1;
                         nj = j + 2;
                        if (isValid(ni,nj,n)){
                            next[ni][nj] += curr[i][j] / 8.0;
                        }
                         ni = i + 2;
                         nj = j + 1;
                        if (isValid(ni,nj,n)){
                            next[ni][nj] += curr[i][j] / 8.0;
                        }
                    }
                }
            }
            curr = next;
            next = new double[n][n];
        }

        double sum = 0;
                                                      //FINALYY ADD THE VALUES AND RETURN THEM.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += curr[i][j];
            }
        }
        return sum;
    }
    static boolean isValid(int ni, int nj, int n) {
        if (ni >= 0 && nj >= 0 && ni < n && nj < n) return true;
        return false;
    }
    
}
