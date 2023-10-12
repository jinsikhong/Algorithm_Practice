
/**
 * pgs 12926
 * lv1
 * 시저 암호
 */

public class PGS_12926 {

    static private char push(char c, int n){
        if(!Character.isAlphabetic(c)) return c; // 알파벳이 아닌 경우 그대로 return

        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;
        position = (position + n) % ('z' - 'a' + 1);
        return (char)(offset + position);
    }
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;


//        int distance = n % ('z' - 'a');
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            ans.append(push(c, n));
        }
        System.out.println(ans.toString());
    }
}
