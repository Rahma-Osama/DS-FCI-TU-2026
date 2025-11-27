# Data Structures & Algorithms Project

This project demonstrates implementations of fundamental data structures and algorithms in Java.
It is designed for learning and practice, highlighting core operations and techniques used in software development.
Developed by **Rahma Osama, Software Developer**.

---

## 📘 1. Array Module (ArrayUtils.java)

Implements basic array operations using static arrays.

**Features:**

* `isFull()` – Check if the array is full.
* `accessItem(index)` – Access a specific element by index.
* `append(item)` – Insert item at the end if space exists.
* `traverseItems()` – Print all stored elements.
* `searchItem(item)` – Linearly search for an item and print its index.
* `isItemFound(item)` – Boolean search method using enhanced for-loop.
* `insert(pos, newItem)` – Insert at a specific position with shifting.
* `deleteItemAtSpecificIndex(index)` – Delete an element by shifting the rest.
* `deleteLastItem()` – Delete last element by creating a new trimmed array.
* `enlargeArray(newSize)` – Create a bigger array and copy items into it.

---

## 📘 2. Linked List (SingleLinkedList.java)

Implements a single linked list with dynamic node management.

**Features:**

* `isEmpty()` – Check if the list is empty.
* `insertAtFirst(item)` – Insert an item at the beginning.
* `insertAtLast(item)` – Insert an item at the end.
* `insertAtPosition(pos, item)` – Insert an item at a specific position.
* `delete(item)` – Delete a specific item from the list.
* `traverseItems()` – Print all items in the list.

Maintains `head`, `tail`, and `length` for efficient insertion and deletion.

---

## 📘 3. Stack Module

Implements a stack using a static array.

**Features:**

* `push()` – Add an item to the top.
* `pop()` – Remove the top item.
* `peek()` – View the top item without removing.
* `display()` – Print all stack items.

Demonstrates the **LIFO (Last In, First Out)** principle.

---

## 📘 4. Queue Module (Linear Queue)

Implements a linear queue using arrays.

**Features:**

* `enqueue()` – Add an item to the end.
* `dequeue()` – Remove the item from the front.
* `peek()` – View the front item without removing.

Demonstrates the **FIFO (First In, First Out)** principle.

---

## 📘 5. Binary Search Tree (BST)

Implements BST with efficient search and traversal.

**Features:**

* `search()` – Search for a specific node.
* Traversals: `inorder()`, `preorder()`, `postorder()`

Helps visualize hierarchical data structures.

---

## 📘 6. Sorting Module

Implements classical sorting algorithms.

**Features:**
* **Find Minimum Item** – Locate the smallest element in an array ehich help to understand the concept of sorting.
  
* **Selection Sort** – Sorts by repeatedly selecting the minimum element.
* **Bubble Sort** – Sorts by repeatedly swapping adjacent elements.
* **Insertion Sort** – Sorts by inserting each element in the correct position.

---

## ▶️ Running the Project

Each module can be run individually via its test class.
This project is ideal for learning core **data structures** and **algorithmic thinking** in Java.
