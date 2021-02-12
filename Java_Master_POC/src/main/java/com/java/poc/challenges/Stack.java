package challenges;

public class Stack {

  private int[] array;
  private int top;
  private int capacity;

  Stack(int capacity) {
    this.array = new int[capacity];
    this.top = -1;
    this.capacity = capacity;
  }

  public void push(int item) {
    if (isFull()) {
      throw new RuntimeException("Stack is Full!");
    }
    array[++top] = item;
  }

  public int pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is Empty!");
    }
    return array[top--];
  }

  public int peek() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is Empty!");
    }
    return array[top];
  }

  private boolean isEmpty() {
    return top == -1;
  }

  private boolean isFull() {
    return top == capacity - 1;
  }

}
