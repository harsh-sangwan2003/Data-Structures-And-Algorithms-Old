import java.io.*;
import java.util.*;

public class k_largest_elements {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int k = Integer.parseInt(br.readLine());
        // write your code here

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            if (i < k)
                pq.add(arr[i]);

            else {
                if (arr[i] > pq.peek()) {
                    pq.add(arr[i]);
                    pq.remove();
                }
            }
        }

        while (pq.size() != 0) {
            System.out.println(pq.remove());
        }
    }

}