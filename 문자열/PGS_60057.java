import java.util.ArrayList;

/**
 * pgs 600587
 * lv2
 * 문자열 압축
 *
 *
 */
public class PGS_60057 {
    public static void main(String[] args) {

    }

    public static int solution(String s){
        int ans = s.length();

        StringBuilder builder = new StringBuilder();
        for(int i = 1; i < s.length(); i++){
            int press = s.length() / i;
            ArrayList<String>  sList = new ArrayList<>();
            for(int j = 0; j < press; j++){

            }
        }

        return 0;
    }

}
