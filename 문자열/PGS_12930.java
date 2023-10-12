/**
 * pgs 12930
 * lv1
 * 이상한 문자 만들기
 *
 *
 *
 */
public class PGS_12930 {
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }

    public static String solution(String s){
        StringBuilder builder = new StringBuilder();
        Boolean flag = true; // true : 짝수
        for(char c : s.toCharArray()){
            if(c == ' '){
                builder.append(' ');
                flag = true;
                continue;
            }
            builder.append(flag ? Character.toUpperCase(c) : Character.toLowerCase(c));
            flag = !flag;
        }
        return builder.toString();
    }
}
