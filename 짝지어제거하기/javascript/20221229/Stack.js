export default class Stack {
  constructor(stack = []) {
    this.stack = stack;
  }

  add(letter) {
    if (this.stack.length && this.stack.at(-1) === letter) {
      return new Stack([...this.stack.slice(0, this.stack.length - 1)]);
    }

    return new Stack([...this.stack, letter]);
  }

  length() {
    return this.stack.length;
  }
}

export const stack = new Stack();
