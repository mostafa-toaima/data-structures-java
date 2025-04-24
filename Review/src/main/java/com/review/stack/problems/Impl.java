package com.review.stack.problems;

public class Impl {
    public static void main(String[] args) {

        //BalancedParenthesesUsingStack
        BalancedParenthesesUsingStack problems = new BalancedParenthesesUsingStack();
        System.out.println(problems.areBalanced("{[()]}"));
        System.out.println(problems.areBalanced("{[(])}"));
    }
}
