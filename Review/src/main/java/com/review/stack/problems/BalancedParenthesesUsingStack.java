package com.review.stack.problems;

import java.util.Stack;

public class BalancedParenthesesUsingStack {
    private boolean arePair(char open, char close){
        if (open == '(' && close == ')'){
            return true;
        }else if (open == '{' && close == '}'){
            return true;
        }else return open == '[' && close == ']';
    }


    public boolean areBalanced(String exp) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (s.isEmpty() || !arePair(s.pop(), c)) {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }


}
