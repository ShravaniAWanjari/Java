import java.util.Stack;

public class polishreverseexpression {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            
            switch (token) {
                case "+":
                    s.push(s.pop() + s.pop());
                    break;
                case "-": {
                    int val2 = s.pop();
                    int val1 = s.pop();
                    s.push(val1 - val2);
                    break;
                }
                case "*":
                    s.push(s.pop() * s.pop());
                    break;
                case "/": {
                    int val2 = s.pop();
                    int val1 = s.pop();
                    s.push(val1 / val2);
                    break;
                }
                default:
                    s.push(Integer.parseInt(tokens[i]));
            }
        }
        
        return s.pop();
    }
}