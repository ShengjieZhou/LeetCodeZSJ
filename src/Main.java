import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str1 = in.nextLine();
//        int n = Integer.parseInt(str1.split(" ")[0]);
//        int k = Integer.parseInt(str1.split(" ")[1]);
        int n=10;
        int k=3;
        String str = "1234567890";
//        String str = in.nextLine();
        String result = "";
        String handledStr = str.substring(0,k);
        for (int i=0; i<n-k+1; i++){
            if (i>=1){
                result += handledStr.charAt(0);
                handledStr = handledStr.substring(1) + str.charAt(i+k-1);
            }
            System.out.println(handledStr);
            //handledStr = reverse(handledStr);
            //String subStr = str.substring(i,i+k-1);

//            String subStr = str.(i,i+k);
//            String restStr1 = str.substring(0,i);
//            String restStr2 = str.substring(i+k,str.length());
//            String tempStr = reverse(subStr);
//            str = restStr1 + tempStr + restStr2;
        }
        //System.out.println(result);
    }

    public static String reverse(String s){
//        return reverse(s.substring(1)+s.charAt(0));

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}