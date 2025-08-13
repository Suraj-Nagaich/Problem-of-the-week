class Pair {
    int row;
    int col;
    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int initialColor = image[sr][sc];
        if (initialColor == color) return image;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr,sc));
        image[sr][sc] = color;
        int[] temprow = {1,-1,0,0};
        int[] tempcol = {0,0,-1,1};
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            q.poll();
            for(int i = 0;i<4;i++){
                int nrow = row+temprow[i];
                int ncol = col+tempcol[i];
                if((nrow>=0 && nrow<n && ncol>=0 && ncol<m) &&(image[nrow][ncol] == initialColor)){
                    q.add(new Pair(nrow,ncol));
                    image[nrow][ncol]= color;
                }
            }
        }
        return image;
    }
}
