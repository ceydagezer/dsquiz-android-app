package com.example.myapplication.data

import com.example.myapplication.model.Question

object QuestionRepository {

    val questions = listOf(

        Question(
            id = 1,
            questionText = "What is an array?",
            options = listOf(
                "A structure storing elements in random memory locations",
                "A structure storing elements in contiguous memory locations",
                "A structure without indexes",
                "A structure storing only characters"
            ),
            correctAnswerIndex = 1,
            explanation = "Arrays store elements of the same type in contiguous memory locations.",
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 2,
            questionText = "Which index represents the first element of an array in most programming languages?",
            options = listOf(
                "-1",
                "0",
                "1",
                "n"
            ),
            correctAnswerIndex = 1,
            explanation = "Most programming languages use zero-based indexing.",
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 3,
            questionText = "Which operation is fastest in arrays?",
            options = listOf(
                "Insert at beginning",
                "Delete from middle",
                "Access by index",
                "Insert in middle"
            ),
            correctAnswerIndex = 2,
            explanation = "Arrays support direct index access in constant time.",
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 4,
            questionText = "Which statement is TRUE about arrays compared to linked lists?",
            options = listOf(
                "Arrays allow easier insertion at beginning",
                "Arrays store elements in contiguous memory",
                "Arrays do not support indexing",
                "Arrays grow dynamically by default"
            ),
            correctAnswerIndex = 1,
            explanation = "Arrays store elements in contiguous memory locations.",
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 5,
            questionText = "What happens when inserting an element in the middle of an array?",
            options = listOf(
                "Nothing changes",
                "Elements shift left",
                "Elements shift right",
                "Array becomes sorted automatically"
            ),
            correctAnswerIndex = 2,
            explanation = "Elements shift right to create space.",
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 6,
            questionText = "What happens when deleting the first element of an array?",
            options = listOf(
                "Nothing happens",
                "Elements shift left",
                "Elements shift right",
                "Array size doubles"
            ),
            correctAnswerIndex = 1,
            explanation = "Remaining elements shift left after deletion.",
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 7,
            questionText = "Which structure allows faster random access?",
            options = listOf(
                "Linked List",
                "Stack",
                "Queue",
                "Array"
            ),
            correctAnswerIndex = 3,
            explanation = "Arrays support direct index-based access.",
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 8,
            questionText = "Why is inserting at the beginning of an array expensive?",
            options = listOf(
                "Arrays are unordered",
                "Elements must shift right",
                "Arrays do not allow insertion",
                "Arrays resize automatically"
            ),
            correctAnswerIndex = 1,
            explanation = "All elements must shift to make space.",
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 9,
            questionText = "Which operation has O(1) time complexity in arrays?",
            options = listOf(
                "Searching unsorted element",
                "Inserting at beginning",
                "Accessing by index",
                "Deleting from middle"
            ),
            correctAnswerIndex = 2,
            explanation = "Index access is constant time.",
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 10,
            questionText = "What is the main limitation of fixed-size arrays?",
            options = listOf(
                "Cannot store integers",
                "Cannot be indexed",
                "Size cannot change easily after creation",
                "Cannot access last element"
            ),
            correctAnswerIndex = 2,
            explanation = "Fixed-size arrays cannot be resized dynamically.",
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // Linked Lists — Easy

        Question(
            id = 11,
            questionText = "What is a linked list?",
            options = listOf(
                "A structure storing elements in contiguous memory",
                "A structure where elements are connected using references",
                "A structure without nodes",
                "A structure storing only numbers"
            ),
            correctAnswerIndex = 1,
            explanation = "Linked lists store elements as nodes connected via references.",
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 12,
            questionText = "What does each node in a singly linked list contain?",
            options = listOf(
                "Only data",
                "Only address",
                "Data and reference to next node",
                "Reference to previous node only"
            ),
            correctAnswerIndex = 2,
            explanation = "Each node contains data and a reference to the next node.",
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 13,
            questionText = "Which operation requires traversal in a linked list?",
            options = listOf(
                "Accessing by index",
                "Accessing first element",
                "Inserting at beginning",
                "Deleting first element"
            ),
            correctAnswerIndex = 0,
            explanation = "Linked lists do not support direct indexing, so traversal is required.",
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Easy"
        ),

// Linked Lists — Medium

        Question(
            id = 14,
            questionText = "Which operation is faster in linked lists than arrays?",
            options = listOf(
                "Random access",
                "Access by index",
                "Insertion at beginning",
                "Access last element"
            ),
            correctAnswerIndex = 2,
            explanation = "Linked lists can insert at the beginning without shifting elements.",
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 15,
            questionText = "Why are linked lists preferred over arrays for frequent insertions?",
            options = listOf(
                "They use contiguous memory",
                "They allow direct indexing",
                "They do not require shifting elements",
                "They are always faster"
            ),
            correctAnswerIndex = 2,
            explanation = "Linked lists insert by changing links instead of shifting elements.",
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 16,
            questionText = "What is the time complexity of accessing the last element in a singly linked list?",
            options = listOf(
                "O(1)",
                "O(log n)",
                "O(n)",
                "O(n²)"
            ),
            correctAnswerIndex = 2,
            explanation = "Accessing the last node requires traversal from the head.",
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 17,
            questionText = "Which statement is TRUE about linked lists?",
            options = listOf(
                "They support faster random access than arrays",
                "They require contiguous memory",
                "They allow dynamic size changes",
                "They cannot store integers"
            ),
            correctAnswerIndex = 2,
            explanation = "Linked lists can grow or shrink dynamically.",
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Medium"
        ),

// Linked Lists — Hard

        Question(
            id = 18,
            questionText = "Why is random access slow in linked lists?",
            options = listOf(
                "Nodes are unordered",
                "Nodes are stored contiguously",
                "Nodes must be accessed sequentially",
                "Linked lists do not support traversal"
            ),
            correctAnswerIndex = 2,
            explanation = "Each node must be visited one by one to reach a target.",
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 19,
            questionText = "Which pointer is required in a doubly linked list but not in a singly linked list?",
            options = listOf(
                "Head pointer",
                "Next pointer",
                "Previous pointer",
                "Tail pointer"
            ),
            correctAnswerIndex = 2,
            explanation = "Doubly linked lists store both next and previous references.",
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 20,
            questionText = "What is the main advantage of linked lists over arrays?",
            options = listOf(
                "Faster random access",
                "Less memory usage always",
                "Dynamic size flexibility",
                "Contiguous memory storage"
            ),
            correctAnswerIndex = 2,
            explanation = "Linked lists can easily grow or shrink during runtime.",
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // Stacks — Easy

        Question(
            id = 21,
            questionText = "Which principle does a stack follow?",
            options = listOf(
                "FIFO",
                "LIFO",
                "Random",
                "Priority-based"
            ),
            correctAnswerIndex = 1,
            explanation = "Stack follows Last In First Out, so the last inserted element is removed first.",
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 22,
            questionText = "Which operation adds an element to a stack?",
            options = listOf(
                "Pop",
                "Peek",
                "Push",
                "Insert"
            ),
            correctAnswerIndex = 2,
            explanation = "Push adds a new element to the top of the stack.",
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 23,
            questionText = "Which operation removes the top element from a stack?",
            options = listOf(
                "Delete",
                "Pop",
                "Remove",
                "Peek"
            ),
            correctAnswerIndex = 1,
            explanation = "Pop removes the most recently added element from the stack.",
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Easy"
        ),

// Stacks — Medium

        Question(
            id = 24,
            questionText = "Which operation returns the top element without removing it?",
            options = listOf(
                "Push",
                "Peek",
                "Pop",
                "Insert"
            ),
            correctAnswerIndex = 1,
            explanation = "Peek returns the top element without deleting it.",
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 25,
            questionText = "If stack contains: 5 → 10 → 15 (top = 15), what happens after one pop?",
            options = listOf(
                "5 removed",
                "10 removed",
                "15 removed",
                "Nothing removed"
            ),
            correctAnswerIndex = 2,
            explanation = "Stack removes 15 first because it was inserted last.",
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 26,
            questionText = "Which situation causes stack overflow?",
            options = listOf(
                "Removing from empty stack",
                "Adding to full stack",
                "Viewing top element",
                "Checking stack size"
            ),
            correctAnswerIndex = 1,
            explanation = "Overflow happens when trying to push into a full stack.",
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 27,
            questionText = "Which situation causes stack underflow?",
            options = listOf(
                "Adding element",
                "Viewing element",
                "Removing from empty stack",
                "Printing stack"
            ),
            correctAnswerIndex = 2,
            explanation = "Underflow happens when trying to pop from an empty stack.",
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Medium"
        ),

// Stacks — Hard

        Question(
            id = 28,
            questionText = "Which data structure is commonly used for function calls in programs?",
            options = listOf(
                "Queue",
                "Stack",
                "Array",
                "Graph"
            ),
            correctAnswerIndex = 1,
            explanation = "Function calls are stored in a call stack where the latest call returns first.",
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 29,
            questionText = "Which expression type is easiest to evaluate using a stack?",
            options = listOf(
                "Infix",
                "Prefix",
                "Postfix",
                "Binary"
            ),
            correctAnswerIndex = 2,
            explanation = "In postfix notation operands come before operators, making stack evaluation straightforward.",
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 30,
            questionText = "Which expression type places operators before operands?",
            options = listOf(
                "Infix",
                "Prefix",
                "Postfix",
                "Binary"
            ),
            correctAnswerIndex = 1,
            explanation = "In prefix notation operators appear before operands and can be evaluated without parentheses.",
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // Queues — Easy

        Question(
            id = 31,
            questionText = "Which principle does a queue follow?",
            options = listOf(
                "LIFO",
                "FIFO",
                "Random",
                "Priority-based"
            ),
            correctAnswerIndex = 1,
            explanation = "Queue follows First In First Out, so the first inserted element is removed first.",
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 32,
            questionText = "Which operation adds an element to a queue?",
            options = listOf(
                "Pop",
                "Push",
                "Enqueue",
                "Insert"
            ),
            correctAnswerIndex = 2,
            explanation = "Enqueue adds a new element to the rear of the queue.",
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 33,
            questionText = "Which operation removes an element from a queue?",
            options = listOf(
                "Dequeue",
                "Pop",
                "Peek",
                "Delete"
            ),
            correctAnswerIndex = 0,
            explanation = "Dequeue removes the element from the front of the queue.",
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Easy"
        ),

// Queues — Medium

        Question(
            id = 34,
            questionText = "From which end are elements removed in a queue?",
            options = listOf(
                "Rear",
                "Middle",
                "Front",
                "Top"
            ),
            correctAnswerIndex = 2,
            explanation = "Elements are removed from the front following FIFO order.",
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 35,
            questionText = "From which end are elements inserted in a queue?",
            options = listOf(
                "Front",
                "Rear",
                "Middle",
                "Top"
            ),
            correctAnswerIndex = 1,
            explanation = "New elements are inserted at the rear of the queue.",
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 36,
            questionText = "Which situation causes queue overflow?",
            options = listOf(
                "Removing from empty queue",
                "Adding to full queue",
                "Viewing front element",
                "Printing queue"
            ),
            correctAnswerIndex = 1,
            explanation = "Overflow happens when trying to enqueue into a full queue.",
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 37,
            questionText = "Which situation causes queue underflow?",
            options = listOf(
                "Adding element",
                "Viewing element",
                "Removing from empty queue",
                "Checking size"
            ),
            correctAnswerIndex = 2,
            explanation = "Underflow happens when trying to dequeue from an empty queue.",
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Medium"
        ),

// Queues — Hard

        Question(
            id = 38,
            questionText = "Which real-life example best represents a queue?",
            options = listOf(
                "Stack of plates",
                "Printer job list",
                "Undo operation",
                "Function calls"
            ),
            correctAnswerIndex = 1,
            explanation = "Printer jobs are processed in order of arrival, matching FIFO behavior.",
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 39,
            questionText = "Which operation returns the front element without removing it?",
            options = listOf(
                "Peek",
                "Pop",
                "Push",
                "Insert"
            ),
            correctAnswerIndex = 0,
            explanation = "Peek returns the front element without removing it from the queue.",
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 40,
            questionText = "Which data structure is commonly used for scheduling tasks in operating systems?",
            options = listOf(
                "Stack",
                "Queue",
                "Tree",
                "Graph"
            ),
            correctAnswerIndex = 1,
            explanation = "Operating systems schedule tasks using queues based on arrival order.",
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // Trees — Easy

        Question(
            id = 41,
            questionText = "What is a tree in data structures?",
            options = listOf(
                "Linear structure",
                "Hierarchical structure",
                "Circular structure",
                "Random structure"
            ),
            correctAnswerIndex = 1,
            explanation = "A tree stores data in a hierarchical structure with parent–child relationships.",
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 42,
            questionText = "What is the top node of a tree called?",
            options = listOf(
                "Leaf",
                "Root",
                "Parent",
                "Child"
            ),
            correctAnswerIndex = 1,
            explanation = "The root is the highest node in a tree.",
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 43,
            questionText = "What is a node with no children called?",
            options = listOf(
                "Root",
                "Parent",
                "Leaf",
                "Edge"
            ),
            correctAnswerIndex = 2,
            explanation = "A leaf node has no child nodes.",
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 44,
            questionText = "What connects two nodes in a tree?",
            options = listOf(
                "Vertex",
                "Edge",
                "Link",
                "Pointer"
            ),
            correctAnswerIndex = 1,
            explanation = "An edge represents the connection between two nodes.",
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Easy"
        ),

// Trees — Medium

        Question(
            id = 45,
            questionText = "What is the maximum number of children a binary tree node can have?",
            options = listOf(
                "1",
                "2",
                "3",
                "Unlimited"
            ),
            correctAnswerIndex = 1,
            explanation = "Each node in a binary tree can have at most two children.",
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 46,
            questionText = "Which traversal visits nodes in the order: Root → Left → Right?",
            options = listOf(
                "Inorder",
                "Postorder",
                "Preorder",
                "Level order"
            ),
            correctAnswerIndex = 2,
            explanation = "Preorder traversal visits root first, then left subtree, then right subtree.",
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 47,
            questionText = "Which traversal visits nodes in the order: Left → Root → Right?",
            options = listOf(
                "Inorder",
                "Preorder",
                "Postorder",
                "Level order"
            ),
            correctAnswerIndex = 0,
            explanation = "Inorder traversal visits left subtree, then root, then right subtree.",
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 48,
            questionText = "Which traversal visits nodes level by level?",
            options = listOf(
                "Preorder",
                "Inorder",
                "Postorder",
                "Level order"
            ),
            correctAnswerIndex = 3,
            explanation = "Level order traversal visits nodes one level at a time from top to bottom.",
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Medium"
        ),

// Trees — Hard

        Question(
            id = 49,
            questionText = "In a Binary Search Tree (BST), where are smaller values stored?",
            options = listOf(
                "Right subtree",
                "Left subtree",
                "Root only",
                "Anywhere"
            ),
            correctAnswerIndex = 1,
            explanation = "In a BST, smaller values are stored in the left subtree.",
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 50,
            questionText = "What is the height of a tree?",
            options = listOf(
                "Number of nodes",
                "Number of edges in longest path from root to leaf",
                "Number of leaves",
                "Number of children"
            ),
            correctAnswerIndex = 1,
            explanation = "Tree height is the number of edges in the longest path from root to a leaf.",
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // Graphs — Easy

        Question(
            id = 51,
            questionText = "What is a graph in data structures?",
            options = listOf(
                "Linear structure",
                "Hierarchical structure",
                "Collection of vertices and edges",
                "Circular structure"
            ),
            correctAnswerIndex = 2,
            explanation = "A graph consists of vertices (nodes) connected by edges.",
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 52,
            questionText = "What are the nodes in a graph called?",
            options = listOf(
                "Edges",
                "Vertices",
                "Paths",
                "Roots"
            ),
            correctAnswerIndex = 1,
            explanation = "Graph nodes are called vertices.",
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 53,
            questionText = "What connects two vertices in a graph?",
            options = listOf(
                "Root",
                "Edge",
                "Leaf",
                "Branch"
            ),
            correctAnswerIndex = 1,
            explanation = "An edge represents a connection between two vertices.",
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 54,
            questionText = "A graph with direction on edges is called?",
            options = listOf(
                "Undirected graph",
                "Directed graph",
                "Binary graph",
                "Circular graph"
            ),
            correctAnswerIndex = 1,
            explanation = "In a directed graph, edges have direction between vertices.",
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Easy"
        ),

// Graphs — Medium

        Question(
            id = 55,
            questionText = "A graph without edge directions is called?",
            options = listOf(
                "Directed graph",
                "Undirected graph",
                "Weighted graph",
                "Binary graph"
            ),
            correctAnswerIndex = 1,
            explanation = "In an undirected graph, edges have no direction.",
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 56,
            questionText = "Which graph traversal uses a queue?",
            options = listOf(
                "DFS",
                "BFS",
                "Inorder",
                "Preorder"
            ),
            correctAnswerIndex = 1,
            explanation = "Breadth-First Search uses a queue to visit nodes level by level.",
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 57,
            questionText = "Which graph traversal uses a stack (or recursion)?",
            options = listOf(
                "BFS",
                "DFS",
                "Level order",
                "Binary search"
            ),
            correctAnswerIndex = 1,
            explanation = "Depth-First Search uses a stack or recursion to explore deeply.",
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 58,
            questionText = "What is a path in a graph?",
            options = listOf(
                "A loop in the graph",
                "A sequence of connected vertices",
                "A disconnected vertex",
                "A weighted edge"
            ),
            correctAnswerIndex = 1,
            explanation = "A path is a sequence of vertices connected by edges.",
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Medium"
        ),

// Graphs — Hard

        Question(
            id = 59,
            questionText = "What is a cycle in a graph?",
            options = listOf(
                "A vertex with no edges",
                "A path that starts and ends at the same vertex",
                "A disconnected graph",
                "A weighted connection"
            ),
            correctAnswerIndex = 1,
            explanation = "A cycle is a path that begins and ends at the same vertex.",
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 60,
            questionText = "Which representation stores graph connections using a matrix?",
            options = listOf(
                "Adjacency list",
                "Adjacency matrix",
                "Binary tree",
                "Stack representation"
            ),
            correctAnswerIndex = 1,
            explanation = "An adjacency matrix uses a 2D array to represent connections.",
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // Sorting — Easy

        Question(
            id = 61,
            questionText = "What is the goal of a sorting algorithm?",
            options = listOf(
                "Searching data",
                "Arranging data in order",
                "Deleting data",
                "Storing data"
            ),
            correctAnswerIndex = 1,
            explanation = "Sorting algorithms arrange elements in a specific order.",
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 62,
            questionText = "Which sorting algorithm repeatedly swaps adjacent elements?",
            options = listOf(
                "Merge Sort",
                "Quick Sort",
                "Bubble Sort",
                "Selection Sort"
            ),
            correctAnswerIndex = 2,
            explanation = "Bubble Sort repeatedly swaps adjacent elements until sorted.",
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 63,
            questionText = "Which sorting algorithm selects the smallest element each step?",
            options = listOf(
                "Selection Sort",
                "Insertion Sort",
                "Merge Sort",
                "Quick Sort"
            ),
            correctAnswerIndex = 0,
            explanation = "Selection Sort repeatedly selects the smallest element and places it in position.",
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 64,
            questionText = "Which sorting algorithm inserts elements into their correct position step by step?",
            options = listOf(
                "Merge Sort",
                "Insertion Sort",
                "Quick Sort",
                "Heap Sort"
            ),
            correctAnswerIndex = 1,
            explanation = "Insertion Sort places each element into its correct position in the sorted part.",
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Easy"
        ),

// Sorting — Medium

        Question(
            id = 65,
            questionText = "Which sorting algorithm follows divide-and-conquer strategy?",
            options = listOf(
                "Bubble Sort",
                "Selection Sort",
                "Merge Sort",
                "Insertion Sort"
            ),
            correctAnswerIndex = 2,
            explanation = "Merge Sort divides the array into halves and merges them after sorting.",
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 66,
            questionText = "Which sorting algorithm uses a pivot element?",
            options = listOf(
                "Merge Sort",
                "Quick Sort",
                "Bubble Sort",
                "Selection Sort"
            ),
            correctAnswerIndex = 1,
            explanation = "Quick Sort partitions elements around a pivot.",
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 67,
            questionText = "Which sorting algorithm compares adjacent elements repeatedly until sorted?",
            options = listOf(
                "Quick Sort",
                "Merge Sort",
                "Bubble Sort",
                "Heap Sort"
            ),
            correctAnswerIndex = 2,
            explanation = "Bubble Sort repeatedly compares neighboring elements.",
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 68,
            questionText = "Which sorting algorithm is efficient for small or nearly sorted arrays?",
            options = listOf(
                "Insertion Sort",
                "Merge Sort",
                "Quick Sort",
                "Heap Sort"
            ),
            correctAnswerIndex = 0,
            explanation = "Insertion Sort performs well when data is nearly sorted.",
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Medium"
        ),

// Sorting — Hard

        Question(
            id = 69,
            questionText = "Which sorting algorithm has average time complexity O(n log n)?",
            options = listOf(
                "Bubble Sort",
                "Selection Sort",
                "Quick Sort",
                "Insertion Sort"
            ),
            correctAnswerIndex = 2,
            explanation = "Quick Sort has average-case time complexity O(n log n).",
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 70,
            questionText = "Which sorting algorithm guarantees O(n log n) time complexity in all cases?",
            options = listOf(
                "Quick Sort",
                "Merge Sort",
                "Bubble Sort",
                "Insertion Sort"
            ),
            correctAnswerIndex = 1,
            explanation = "Merge Sort always runs in O(n log n) time.",
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        // Searching — Easy

        Question(
            id = 71,
            questionText = "What is the goal of a searching algorithm?",
            options = listOf(
                "Arrange data",
                "Find an element in data",
                "Delete data",
                "Sort data"
            ),
            correctAnswerIndex = 1,
            explanation = "Searching algorithms locate a target element in a dataset.",
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 72,
            questionText = "Which searching algorithm checks elements one by one?",
            options = listOf(
                "Binary Search",
                "Linear Search",
                "Merge Search",
                "Quick Search"
            ),
            correctAnswerIndex = 1,
            explanation = "Linear Search checks each element sequentially until found.",
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 73,
            questionText = "Which searching algorithm requires sorted data?",
            options = listOf(
                "Linear Search",
                "Binary Search",
                "DFS",
                "BFS"
            ),
            correctAnswerIndex = 1,
            explanation = "Binary Search requires sorted data to divide the search space.",
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 74,
            questionText = "Which searching algorithm divides the search space into halves?",
            options = listOf(
                "Linear Search",
                "Binary Search",
                "DFS",
                "BFS"
            ),
            correctAnswerIndex = 1,
            explanation = "Binary Search halves the search space each step.",
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Easy"
        ),

// Searching — Medium

        Question(
            id = 75,
            questionText = "What is the time complexity of Linear Search in the worst case?",
            options = listOf(
                "O(1)",
                "O(log n)",
                "O(n)",
                "O(n log n)"
            ),
            correctAnswerIndex = 2,
            explanation = "Linear Search checks all elements in worst case.",
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 76,
            questionText = "What is the time complexity of Binary Search in the worst case?",
            options = listOf(
                "O(n)",
                "O(log n)",
                "O(n²)",
                "O(1)"
            ),
            correctAnswerIndex = 1,
            explanation = "Binary Search halves search space each step.",
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 77,
            questionText = "Which searching algorithm is faster for large sorted datasets?",
            options = listOf(
                "Linear Search",
                "Binary Search",
                "DFS",
                "BFS"
            ),
            correctAnswerIndex = 1,
            explanation = "Binary Search reduces search space by half each step.",
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 78,
            questionText = "Which searching algorithm works even if data is unsorted?",
            options = listOf(
                "Binary Search",
                "Linear Search",
                "Tree Search",
                "Graph Search"
            ),
            correctAnswerIndex = 1,
            explanation = "Linear Search works on both sorted and unsorted data.",
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Medium"
        ),

// Searching — Hard

        Question(
            id = 79,
            questionText = "Where does Binary Search start checking first?",
            options = listOf(
                "First element",
                "Last element",
                "Middle element",
                "Random element"
            ),
            correctAnswerIndex = 2,
            explanation = "Binary Search starts at the middle to divide search space.",
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 80,
            questionText = "Why is Binary Search more efficient than Linear Search?",
            options = listOf(
                "Uses recursion",
                "Works without sorting",
                "Reduces search space by half each step",
                "Checks elements randomly"
            ),
            correctAnswerIndex = 2,
            explanation = "Binary Search halves the search space each step.",
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        // Recursion — Easy

        Question(
            id = 81,
            questionText = "What is recursion?",
            options = listOf(
                "Repeating loops only",
                "A function calling another function",
                "A function calling itself",
                "Sorting data"
            ),
            correctAnswerIndex = 2,
            explanation = "Recursion occurs when a function calls itself to solve smaller subproblems.",
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 82,
            questionText = "What is required to stop recursion?",
            options = listOf(
                "Loop condition",
                "Base case",
                "Stack overflow",
                "Return type"
            ),
            correctAnswerIndex = 1,
            explanation = "A base case stops recursion and prevents infinite calls.",
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 83,
            questionText = "What happens if recursion has no base case?",
            options = listOf(
                "Faster execution",
                "Infinite recursion",
                "Sorted output",
                "Queue formation"
            ),
            correctAnswerIndex = 1,
            explanation = "Without a base case recursion continues until stack overflow.",
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 84,
            questionText = "Recursion mainly uses which data structure internally?",
            options = listOf(
                "Queue",
                "Stack",
                "Tree",
                "Array"
            ),
            correctAnswerIndex = 1,
            explanation = "Recursive calls are stored in the call stack.",
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Easy"
        ),

// Recursion — Medium

        Question(
            id = 85,
            questionText = "Which problem is commonly solved using recursion?",
            options = listOf(
                "Printing array once",
                "Factorial calculation",
                "Queue insertion",
                "Stack push"
            ),
            correctAnswerIndex = 1,
            explanation = "Factorial is a classic example where each step depends on the previous result.",
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 86,
            questionText = "What is the base case of factorial recursion?",
            options = listOf(
                "factorial(n−1)",
                "factorial(0) = 1",
                "factorial(n+1)",
                "factorial(n²)"
            ),
            correctAnswerIndex = 1,
            explanation = "Factorial recursion stops at factorial(0) = 1.",
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 87,
            questionText = "What happens in each recursive step?",
            options = listOf(
                "Problem becomes larger",
                "Problem stays same",
                "Problem is divided into smaller subproblems",
                "Program stops immediately"
            ),
            correctAnswerIndex = 2,
            explanation = "Each recursive call solves a smaller version of the problem.",
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Medium"
        ),

// Recursion — Hard

        Question(
            id = 88,
            questionText = "Which condition ensures recursion eventually stops?",
            options = listOf(
                "Increasing input size",
                "Removing return statement",
                "Reaching the base case",
                "Using iteration"
            ),
            correctAnswerIndex = 2,
            explanation = "Recursion stops when execution reaches the base case.",
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 89,
            questionText = "What mainly determines recursion space complexity?",
            options = listOf(
                "Loop condition",
                "Array size",
                "Depth of recursive calls",
                "Sorting method"
            ),
            correctAnswerIndex = 2,
            explanation = "Space complexity depends on recursion depth stored in stack.",
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 90,
            questionText = "Why can deep recursion cause stack overflow?",
            options = listOf(
                "Too many loops",
                "Too many variables",
                "Too many function calls stored in stack",
                "Missing arrays"
            ),
            correctAnswerIndex = 2,
            explanation = "Each recursive call uses stack memory and too many calls exceed stack capacity.",
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Hard"
        )
    )
}