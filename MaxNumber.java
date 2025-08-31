public class MaxNumber{

    public static void main(String[] args){
        System.out.println("Max is: " + Max(10, 25, 15));
        System.out.println("Min is: " + Min(10, 25, 15));
    }

    public static int Max(int i, int j, int k){

        int max = 0;

        while(i > 0 || j > 0 || k > 0){
            max++;
            i--;
            j--;
            k--;
        }
        return max;
    }

    public static int Min(int i, int j, int k){

    int min = 0;

        while(i > 0 && j > 0 && k > 0){
            min++;
            i--;
            j--;
            k--;
        }
        return min;
    }

    static {
        System.out.println("From static block");
    }
}
