import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    static HashMap<String, Integer> mp = new HashMap<>();
    static HashMap<String, Integer> mp2 = new HashMap<>();
    static int cnt = 1;

    public static String normalizeName(String name) {
        name = name.trim();
        name = name.toLowerCase();
        // Split the name into individual words
        String[] words = name.split("\\s+");

        // Join the normalized words into a single string
        return String.join(" ", words);
    }



    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in")); // Read input from the file
            while (sc.hasNextLine()) {
                String s = sc.nextLine();;
                String tmp2 = normalizeName(s);
                if (mp2.containsKey(tmp2)) {
                    Integer val = mp2.get(tmp2);
                    if (val != null) {
                        continue;
                    } else {
                        mp2.put(tmp2, 1);
                    }
                } else {
                    mp2.put(tmp2, 1);
                    s = s.toLowerCase() + " ";
                    String x = "";
                    Vector<String> v = new Vector<>();
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == ' ') {
                            if (!x.isEmpty()) {
                                v.add(x);
                                x = "";
                            }
                        } else {
                            x += s.charAt(i);
                        }
                    }
                    String tmp1 = "";

                    for (int i = 0; i < v.size() - 1; i++) {
                        tmp1 += v.get(i).charAt(0);
                    }
                    if (mp.containsKey(tmp1)) {
                        Integer val = mp.get(tmp1);
                        if (val != null) {
                            mp.put(tmp1, val + 1);
                        } else {
                            mp.put(tmp1, 1);
                        }
                    } else mp.put(tmp1, 1);
                    System.out.print(v.get(v.size() - 1));
                    for (int i = 0; i < v.size() - 1; i++) {
                        System.out.print(v.get(i).charAt(0));
                    }
                    Integer val = mp.get(tmp1);
                    if (val > 1) System.out.print(val);
                    System.out.println("@ptit.edu.vn");
                }

            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
