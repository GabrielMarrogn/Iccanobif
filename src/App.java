import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Long> list = new ArrayList<>();

        long a = 0;
        long b = 1;
        long sum = 0;
        int y = Integer.parseInt(br.readLine());

        for (int k = 0; k < y; k++) {
            if (k == 1) {
                sum = 1;
            } else {
                sum = a + b;
                a = b;
                b = sum;
            }

            list.add(sum);

        }

        int tamanho = list.size() - 1;

        for (int i = tamanho; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.println();

    }
}