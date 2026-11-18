package homework.h14;

// https://leetcode.com/problems/implement-queue-using-stacks/

import java.util.ArrayDeque;
import java.util.Deque;

public class T2 {
  private final Deque<Integer> in = new ArrayDeque<>();
  private final Deque<Integer> out = new ArrayDeque<>();

  public T2() {}

  public void push(int x) {
    in.push(x);
  }

  public int pop() {
    moveIfNeeded();
    return out.pop();
  }

  public int peek() {
    moveIfNeeded();
    return out.peek();
  }

  public boolean empty() {
    return in.isEmpty() && out.isEmpty();
  }

  private void moveIfNeeded() {
    if (out.isEmpty()) {
      while (!in.isEmpty()) {
        out.push(in.pop());
      }
    }
  }
}
