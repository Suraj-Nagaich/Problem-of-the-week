import java.util.*;
class POW {
    static int fixedPoint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int[] arr = new int [n];
       for(int i=0;i<arr.length;i++)
         {
           arr[i]=sc.nextInt();
         }
    }
}
