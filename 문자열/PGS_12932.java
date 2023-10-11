import java.util.Arrays;

/**
 * pgs 12932
 * lv1
 * 자연수 뒤집어 배열로 만들기
 *
 *
 *
 */
public class PGS_12932 {
    public static void main(String[] args) {
        Long n = 12345l;
        String str = n.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();

        char[] arr = reversed.toCharArray();
        int[] result = new int[arr.length];
        for(int i = 0; i < result.length; i++){
            result[i] = arr[i] - '0';
        }
        System.out.println(Arrays.toString(result));
    }
}
