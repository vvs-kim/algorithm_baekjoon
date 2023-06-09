package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {
    public static int[] arrayN;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arrayN = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arrayN[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrayN);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int result = binarySearch(0, arrayN.length - 1, Integer.parseInt(st.nextToken()));
            if (result == 1) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int lo, int hi, int key) {
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (key < arrayN[mid]) {
                    hi = mid - 1;
                } else if (key > arrayN[mid]) {
                    lo = mid + 1;
                } else {
                    return 1;
                }
            }
            return -1;
    }
}
