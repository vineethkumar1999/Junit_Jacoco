package main.code;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> charMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            // If the character mapping is not present, add it to the map
            if (!charMap.containsKey(ch1)) {
                // If the character in str2 is already mapped to a different character in str1, return false
                if (charMap.containsValue(ch2)) {
                    return false;
                }
                charMap.put(ch1, ch2);
            } else {
                // If the character mapping is present but not the same as the character in str2, return false
                if (charMap.get(ch1) != ch2) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        String a = "abbab";
        String b = "xyyxy";
        boolean status = areIsomorphic(a,b);
        System.out.println(status);
    }
}
