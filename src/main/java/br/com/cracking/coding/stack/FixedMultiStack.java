package br.com.cracking.coding.stack;

public class FixedMultiStack {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public FixedMultiStack(int stackSize) {
        this.stackCapacity = stackSize;
        this.values = new int[stackSize * numberOfStacks];
        this.sizes = new int[numberOfStacks];
    }

    public void push(int stackNum, int value) throws Exception {
        if (isFull(stackNum)) {
            throw new Exception("Full stack");
        }
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    private boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

    public int pop(int stackNum) throws Exception {
        if (isEmpty(stackNum)) {
            throw new Exception("Empty Stack");
        }
        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNum]--;
        return value;
    }

    public int peek(int stackNum) throws Exception {
        if (isEmpty(stackNum)) {
            throw new Exception("Empty Stack");
        }
        return values[indexOfTop(stackNum)];
    }

    private boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }
}
