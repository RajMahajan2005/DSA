import java.util.Stack;

public  class S {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing bracket, check if stack is not empty and matches
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;  // nothing to match with

                char top = stack.pop();

                // Check for matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack should be empty if all brackets matched
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s));
    }
}
