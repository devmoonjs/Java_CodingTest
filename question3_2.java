import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class question3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        StringTokenizer value = new StringTokenizer(bf.readLine(), " ");
        int[] intValue = new int[n];

        long max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            intValue[i] = Integer.parseInt(value.nextToken());
            if (intValue[i] > max) {
                max = intValue[i];
            }
            sum += intValue[i];
        }
        System.out.println(sum*100.0/max/n);
    }
}
