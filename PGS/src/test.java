import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lst = new ArrayList<>();
        String str = "";
        for(int i = 0; i < 684; i++){
            str = br.readLine();
            lst.add(str);
        }
        System.out.println(lst.toString());
        System.out.println(lst.size());
    }
}
