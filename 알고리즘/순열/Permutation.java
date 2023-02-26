package 조합;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
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
        visited = new boolean[n+1];

        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }

        System.out.println("---------순열---------");
        perm(0);

        System.out.println("---------중복순열---------");
        permRepitition(0);
    }

    private static void perm(int cnt){
        if(cnt == k){
            System.out.println(Arrays.toString(result));
            return;
        }

        for(int i = 1; i <= n; i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            result[cnt] = i;
            perm(cnt + 1);
            visited[i] = false;

        }
    }

    private static void permRepitition(int cnt){
        if(cnt == k){
            System.out.println(Arrays.toString(result));
            return;
        }

        for(int i = 1; i <= n; i++){
            result[cnt] = i;
            permRepitition(cnt + 1);
        }
    }
}
