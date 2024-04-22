package Hash;
import java.util.HashSet;
import java.util.Set;

public class IsHappy {

    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }



    public static boolean isHappy(int n) {
        Set<Integer> num = new HashSet<>(0);
        while ( !num.contains(n)){
            num.add(n);
            n = getSum(n);
            if ( n == 1 ){
                return true;
            }
        }
        return false;
    }

    public static int getSum(int n) {
        int sum = 0;
        while ( n>0 ){
            sum += (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }

}
