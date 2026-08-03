import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String arr1[] = s1.split("\\s+");
        String arr2[] = s2.split("\\s+");

        HashMap<String, Integer> hs1 = new HashMap<>();
        HashMap<String, Integer> hs2 = new HashMap<>();

        // Store words of first string
        for (String word : arr1) {
            hs1.put(word, hs1.getOrDefault(word, 0) + 1);
        }

        // Store words of second string
        for (String word : arr2) {
            hs2.put(word, hs2.getOrDefault(word, 0) + 1);
        }

        int count = 0;

        // Count common words
        for (Map.Entry<String, Integer> e : hs1.entrySet()) {

            if (hs2.containsKey(e.getKey())) {
                count++;
            }
        }

        System.out.print(count);
    }
}
===================================================

Input 
aabcd isdfk mxcv s hwncs pqts
hwncs tky ogdfo pqts erlp s bdr hwncs dufkna bevfz
Output
3
==================================================
