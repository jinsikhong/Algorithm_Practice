package 조합;

import java.util.Arrays;
import java.util.Scanner;

public class Combination {
	static boolean[] visited;
    static int[] result;
    static int[] arr;
    static int n;
    static int k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 숫자의 개수
        k = sc.nextInt(); // 몇개를 뽑을 건지
        result = new int[k];
        arr = new int[n+1];

        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }

        System.out.println("---------조합---------");
        combi(1, 0);

        System.out.println("---------중복조합---------");
        combiRepitition(1, 0);
    }
    
    private static void combi(int start, int cnt) {
    	if(cnt == k) {
    		System.out.println(Arrays.toString(result));
    		return;
    	}
    	
    	for(int i = start; i <= n; i++) {
    		result[cnt] = arr[i];
    		combi(i+1, cnt + 1);
    	}
    }
    
    private static void combiRepitition(int start, int cnt) {
    	if(cnt == k) {
    		System.out.println(Arrays.toString(result));
    		return;
    	}
    	
    	for(int i = start; i <= n; i++) {
    		result[cnt] = arr[i];
    		combiRepitition(i, cnt + 1);
    	}
    }
    

}
