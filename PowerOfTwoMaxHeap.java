import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerOfTwoMaxHeap {

    private List<Integer> heap;
    private int degree;

    public PowerOfTwoMaxHeap(int degree) {
        if (degree <= 0) {
            throw new IllegalArgumentException("Degree must be a positive integer.");
        }
        this.heap = new ArrayList<>();
        this.degree = degree;
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int popMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = heap.get(0);
        int lastElement = heap.remove(heap.size() - 1);

        if (!isEmpty()) {
            heap.set(0, lastElement);
            heapifyDown(0);
        }

        return max;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / degree;

            if (heap.get(index) > heap.get(parentIndex)) {
                Collections.swap(heap, index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        int maxChildIndex;
        int maxChildValue;

        while (true) {
            int leftChildIndex = index * degree + 1;
            maxChildIndex = -1;
            maxChildValue = Integer.MIN_VALUE;

            for (int i = 0; i < degree; i++) {
                int childIndex = leftChildIndex + i;

                if (childIndex < heap.size() && heap.get(childIndex) > maxChildValue) {
                    maxChildIndex = childIndex;
                    maxChildValue = heap.get(childIndex);
                }
            }

            if (maxChildIndex != -1 && maxChildValue > heap.get(index)) {
                Collections.swap(heap, index, maxChildIndex);
                index = maxChildIndex;
            } else {
                break;
            }
        }
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public static void main(String[] args) {
        // Example usage and testing
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2);

        heap.insert(5);
        heap.insert(10);
        heap.insert(8);
        heap.insert(3);

        System.out.println(heap.popMax()); // Output: 10
        System.out.println(heap.popMax()); // Output: 8
        heap.insert(12);
        System.out.println(heap.popMax()); // Output: 12
    }
}
