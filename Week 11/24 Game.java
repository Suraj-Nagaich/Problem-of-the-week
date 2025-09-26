class Solution {
   public boolean check(double a,double b,double c,double d,int i){
        if(i == 4)  return d > 23.9f && d < 24.1f;
        if(i == 1){
            if(comb3(-1, a - b, c, d, 2)) return true;
            if(comb3(-1, a + b, c, d, 2)) return true;
            if(comb3(-1, a * b, c, d, 2)) return true;
            return b != 0 && comb3(-1, a / b, c, d, 2);
        }
        if(i == 2){
            if(comb2(-1, -1, b - c, d, 3)) return true;
            if(comb2(-1, -1, b + c, d, 3)) return true;
            if(comb2(-1, -1, b * c, d, 3)) return true;
            return c != 0 && comb2(-1, -1, b / c, d, 3);
        }
        if(check(-1, -1, -1, c - d, 4)) return true;
        if(check(-1, -1, -1, c + d, 4)) return true;
        if(check(-1, -1, -1, c * d, 4)) return true;
        return d != 0 && check(-1, -1, -1, c / d, 4);
    }
    public boolean comb4(double a,double b,double c,double d){
        if(comb3(a, b, c, d, 1)) return true;
        if(comb3(b, a, c, d, 1)) return true;
        if(comb3(c, b, a, d, 1)) return true;
        return comb3(d, b, c, a, 1);
    }
    public boolean comb3(double a,double b,double c,double d,int i){
        if(comb2(a, b, c, d, i)) return true;
        if(comb2(a, c, b, d, i)) return true;
        return comb2(a, d, c, b, i);
    }
    public boolean comb2(double a,double b,double c,double d,int i){
        if(check(a, b, c, d, i)) return true;
        return check(a, b, d, c, i);
    }
    public boolean judgePoint24(int[] cards) {
        return comb4(cards[0], cards[1], cards[2], cards[3]);
    }
}
