import java.util.Scanner;

class Solution{

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            getResult(a,b,n);
        }
        in.close();
    }
    public static void getResult(int a, int b, int n){
        int[] list = new int[n];
        for (int i = 0 ; i < n; i++){
            int result = 0;
            for (int j = 0 ; j<= i ; j++){
                result +=  Math.pow(2,j) * b;
            }
            list[i] = a + result;
        }
        for (int k = 0  ; k < list.length ; k++){
            System.out.print(list[k] + " ");
        }
        System.out.println();
    }
}