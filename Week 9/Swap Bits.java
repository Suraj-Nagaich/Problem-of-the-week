import java.util.*;
class POW {
    static int swapBits(int n) {
        for (int i = 0; i < 32; i += 2) {
            if (((n >> i) & 1) != ((n >> (i + 1)) & 1)) {              // if the two adjacent bits are different                                                   
                n ^= (1 << i) | (1 << (i + 1));                                     // toggle both bits using XOR
            }
        }
        return n;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(swapBits(n)); 
    }
}
