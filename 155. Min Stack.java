class MinStack {
    private int[] arr = new int[100];
    private int index = -1;

    public MinStack() {
        // Constructor remains the same
    }
    
    public void push(int val) {
        // Check if resizing is needed before inserting the new value
        if (index == arr.length - 1) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[++index] = val;
    }
    
    public void pop() {
        // Check if there's an element to pop
        if (index > -1) {
            // Resize if necessary
            if (index < arr.length / 4 && arr.length > 100) {
                arr = Arrays.copyOf(arr, arr.length / 2);
            }
            index--;
        }
    }
    
    public int top() {
        // Return the top element if stack is not empty
        if (index > -1) {
            return arr[index];
        } else {
            return 0; // Consider throwing an exception or a different error handling
        }
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= index; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // Return the minimum value after checking all elements
        return min;
    }
}
