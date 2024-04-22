package Hash;

public class IsAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for ( int i=0 ; i<s.length() ; i++ ){
            count [s.charAt(i) - 'a'] ++;
        }
        for ( int j=0 ; j<t.length() ; j++ ){
            count [t.charAt(j) - 'a'] --;
        }
        for( int k : count){
            if (k != 0){
                return false;
            }
        }
        return true;
    }

}
