package main.code;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCounter = new HashMap<>();
        String str = "Joseph(aka Stone(Cold)), Requests you to provide a new {keyboard as his old keyboard[alpha-numeric] is not in working condition. {eg. <,>,/ keys are not working}. You have to give him the replacement of it.}";

        boolean status = Test3.areBracketsBalanced(str);

        System.out.println(status);

        char[] arr = str.toCharArray();

        for (char c : arr) {
            if (c == '(') {
                if (charCounter.containsKey(c)) {
                    charCounter.put(c, charCounter.get(c) + 1);
                } else
                    charCounter.put(c, 1);
            }
            if (c == '{') {
                if (charCounter.containsKey(c)) {
                    charCounter.put(c, charCounter.get(c) + 1);
                } else
                    charCounter.put(c, 1);
            }
            if (c == '[') {
                if (charCounter.containsKey(c)) {
                    charCounter.put(c, charCounter.get(c) + 1);
                } else
                    charCounter.put(c, 1);
            }

            if (c == ')') {
                if (charCounter.containsKey(c)) {
                    charCounter.put(c, charCounter.get(c) + 1);
                } else
                    charCounter.put(c, 1);
            }
            if (c == '}') {
                if (charCounter.containsKey(c)) {
                    charCounter.put(c, charCounter.get(c) + 1);
                } else
                    charCounter.put(c, 1);
            }
            if (c == ']') {
                if (charCounter.containsKey(c)) {
                    charCounter.put(c, charCounter.get(c) + 1);
                } else
                    charCounter.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> chars : charCounter.entrySet()) {
            if (chars.getKey() == '}') {
                if (charCounter.get('{') != chars.getValue()) {
                    System.out.println("Paranthesis did not match");
                    break;
                }

            } else if (chars.getKey() == ']') {
                if (charCounter.get('[') != chars.getValue()) {
                    System.out.println("Paranthesis did not match");
                    break;
                }

            } else if (chars.getKey() == ')') {
                if (charCounter.get('(') != chars.getValue()) {
                    System.out.println("Paranthesis did not match");
                    break;
                }

            }
        }


    }


}

class Test2 {
    int a, b;

    Test2() {

    }

    Test2(int a) {
        this.a = a;
        b = 10;
    }

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Test3 {
    static boolean areBracketsBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

//"Joseph(aka Stone(Cold)), Requests you to provide a new {keyboard as his old keyboard[alpha-numeric] is not in working condition. {eg. <,>,/ keys are not working}. You have to give him the replacement of it.}"