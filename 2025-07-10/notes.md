##  Kth Largest/Smallest Element - Notes

---

## 1. What is a Priority Queue?

A **Priority Queue** is a data structure where each element has a priority, and elements are served (removed) based on their priority rather than their insertion order.

It's usually implemented using a **heap**:

- **Min-heap** → The smallest element has the highest priority (comes out first).
- **Max-heap** → The largest element has the highest priority.

### Java Syntax:

```java
import java.util.PriorityQueue;
import java.util.Collections;

PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // min-heap (default)
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // max-heap

minHeap.add(5);       // Insert 5
minHeap.offer(3);     // Insert 3
minHeap.peek();       // View the minimum element
minHeap.poll();       // Remove and return the minimum element
```

## 2. Time and Space Complexity Comparison
| Approach           | Time Complexity               | Space Complexity  | Notes                                  |
| ------------------ | ----------------------------- | ----------------- | -------------------------------------- |
| **1. Sort**        | `O(n log n)`                  | `O(1)` (in-place) | Simple but not optimal if `k` is small |
| **2. Min-Heap**    | `O(n log k)`                  | `O(k)`            | Best for streaming or repeated queries |
| **3. QuickSelect** | `O(n)` average, `O(n²)` worst | `O(1)`            | Fastest on average, but not always     |
```
