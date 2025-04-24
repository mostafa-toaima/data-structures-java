package com.review.stack;

public class TestStack {
   static String s = "Welcome";

    public static void main(String[] args) {
//        StackX myStack = new StackX(s.length());
//        for (int i =0 ; i < s.length(); i++)
//        {
//            int ch = s.charAt(i);
//            myStack.push(ch);
//        }
//
//        while (!myStack.isEmpty()){
//            char ch = (char) myStack.pop();
//            System.out.print(ch);
//        }

        StackX myStack1 = new StackX(s.length());
        StackX myStack2 = new StackX(s.length());
        for (int i =0 ; i < s.length(); i++)
        {
            myStack1.push(s.charAt(i));
        }

        while (!myStack1.isEmpty()){
            myStack2.push(myStack1.pop());
        }

        while (!myStack2.isEmpty()) {
            char ch = (char) myStack2.pop();
            System.out.print(ch);
        }


    }
}
