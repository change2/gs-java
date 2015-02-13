package com.shclearing;

import java.util.Stack;

/**
 * User: changejava
 * Date: 2015/2/12
 * Time: 17:28
 */
public class StackTest {


  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    int size = stack.size();
    for (int i = 0; i < size; i++) {
      System.out.println(stack.peek());
      System.out.println(stack.pop());
    }
  }

}
