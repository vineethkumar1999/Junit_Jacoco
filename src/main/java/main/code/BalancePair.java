package main.code;

import java.util.Stack;

public class BalancePair {
    public static int countBalancedPairs(String str) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                        count++;
                    }
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                        count++;
                    }
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        count++;
                    }
                    break;
                default:
                    // Ignore invalid characters
                    break;
            }
        }

        // Check if all opening brackets have a closing pair
        return count;
    }

    public static void main(String[] args) {
        String input = "{[][[[{}()]]}";
        int balancedPairs = countBalancedPairs(input);
        System.out.println("Number of balanced pairs: " + balancedPairs);
    }
}

