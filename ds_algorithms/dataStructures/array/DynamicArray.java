package ds_algorithms.dataStructures.array;

public class DynamicArray<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final double GROWTH_FACTOR = 1.5;
    private static final double SHRINK_THRESHOLD = 0.25;
    
    private Object[] data;
    private int size;
    
    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }
    
    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        this.data = new Object[capacity];
        this.size = 0;
    }
    
    // Add element at end - O(1) amortized
    public void add(T element) {
        ensureCapacity();
        data[size++] = element;
    }
    
    // Add element at specific index - O(n)
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
        // Shift elements right
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }
    
    // Get element - O(1)
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }
    
    // Set element - O(1)
    public T set(int index, T element) {
        checkIndex(index);
        T oldValue = get(index);
        data[index] = element;
        return oldValue;
    }
    
    // Remove element - O(n)
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        checkIndex(index);
        T removed = (T) data[index];
        // Shift elements left
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null; // Clear reference for GC
        shrinkIfNeeded();
        return removed;
    }
    
    // Size - O(1)
    public int size() {
        return size;
    }
    
    // Check if empty - O(1)
    public boolean isEmpty() {
        return size == 0;
    }
    
    // Clear all elements - O(1)
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null; // Help GC
        }
        size = 0;
    }
    
    // Check if contains element - O(n)
    public boolean contains(T element) {
        return indexOf(element) >= 0;
    }
    
    // Find index of element - O(n)
    public int indexOf(T element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(data[i])) return i;
            }
        }
        return -1;
    }
    
    // Get current capacity
    public int capacity() {
        return data.length;
    }
    
    // Ensure capacity for growth
    private void ensureCapacity() {
        if (size == data.length) {
            int newCapacity = Math.max(1, (int) (data.length * GROWTH_FACTOR));
            resize(newCapacity);
        }
    }
    
    // Shrink if too much unused space
    private void shrinkIfNeeded() {
        if (data.length > DEFAULT_CAPACITY && size < data.length * SHRINK_THRESHOLD) {
            int newCapacity = Math.max(DEFAULT_CAPACITY, (int) (data.length / GROWTH_FACTOR));
            resize(newCapacity);
        }
    }
    
    // Resize internal array
    private void resize(int newCapacity) {
        Object[] newData = new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
    
    // Validate index
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
    
    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}