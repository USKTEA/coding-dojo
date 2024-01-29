import Stack from './Stack';

const context = describe;

describe('Stack', () => {
  let stack;

  beforeEach(() => {
    stack = new Stack();
  });

  context('when add string to Stack', () => {
    it('will has length 1', () => {
      stack = stack.add('a');

      expect(stack.length()).toBe(1);
    });
  });

  context('when add two equal letters to Stack', () => {
    it('will has length 0', () => {
      stack = stack.add('a');

      expect(stack.length()).toBe(1);

      stack = stack.add('a');

      expect(stack.length()).toBe(0);
    });
  });

  context('when add three letters to Stack', () => {
    it('will has length 0', () => {
      stack = stack.add('b');
      stack = stack.add('a');
      stack = stack.add('a');

      expect(stack.length()).toBe(1);
    });
  });

  context('when add six letters to Stack', () => {
    it('will has length 0', () => {
      stack = stack.add('b');
      stack = stack.add('a');
      stack = stack.add('a');
      stack = stack.add('b');
      stack = stack.add('a');
      stack = stack.add('a');

      expect(stack.length()).toBe(0);
    });
  });
});
