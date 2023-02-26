package 순열조합부분집합;

import java.util.Scanner;

public class Subset {
	 static boolean[] visited;
	    static int[] result;
	    static int[] arr;
	    static int n;
	    static int k;
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt(); // 숫자의 개수
	        result = new int[n];
	        arr = new int[n];
	        visited = new boolean[n];

	        for(int i = 0; i < n; i++){
	            arr[i] = i+1;
	        }

	        System.out.println("---------부분집합---------");
	        subset(0);

	    }
	    
	    private static void subset(int cnt) {
	    	if(cnt == n) {
	    		for(int i = 0; i < n; i++) {
	    			System.out.print((visited[i]?arr[i]:"x") + "\t");
	    		}
	    		System.out.println();
	    		return;
	    	}
	    	
	    	
    		visited[cnt] = true;
    		subset(cnt + 1);
    		visited[cnt] = false;
    		subset(cnt + 1);
	    	
	    }
}
