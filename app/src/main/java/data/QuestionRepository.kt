package com.example.myapplication.data

import com.example.myapplication.model.Question

object QuestionRepository {

    /** Number of questions presented in a single quiz session. */
    const val QUIZ_LENGTH = 10

    val questions = listOf(

        // ===================== Arrays =====================

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
            optionExplanations = listOf(
                "Incorrect — arrays store elements in contiguous, not random, memory locations.",
                "Correct — arrays store elements of the same type in contiguous memory locations.",
                "Incorrect — arrays are indexed; that's one of their defining features.",
                "Incorrect — arrays can store any single data type, not just characters."
            ),
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 2,
            questionText = "Which index represents the first element of an array in most programming languages?",
            options = listOf("-1", "0", "1", "n"),
            correctAnswerIndex = 1,
            explanation = "Most programming languages use zero-based indexing.",
            optionExplanations = listOf(
                "Incorrect — negative indices aren't used to mark the first element in standard indexing.",
                "Correct — most languages (Java, Python, C++, Kotlin) use zero-based indexing.",
                "Incorrect — index 1 is used in one-based languages like Lua, but not in most mainstream ones.",
                "Incorrect — index n would be out of bounds for an array of size n."
            ),
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
            optionExplanations = listOf(
                "Incorrect — inserting at the beginning requires shifting every other element, O(n).",
                "Incorrect — deleting from the middle requires shifting later elements, O(n).",
                "Correct — an index maps directly to a memory address, giving constant-time access.",
                "Incorrect — inserting in the middle requires shifting elements to make room, O(n)."
            ),
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
            optionExplanations = listOf(
                "Incorrect — linked lists, not arrays, allow easier insertion at the beginning.",
                "Correct — this contiguous layout is what distinguishes arrays from linked lists.",
                "Incorrect — indexing is one of the main advantages arrays have over linked lists.",
                "Incorrect — a plain array has a fixed size and doesn't grow automatically."
            ),
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
            optionExplanations = listOf(
                "Incorrect — space must be made for the new element, so something does change.",
                "Incorrect — shifting left would overwrite existing data instead of making room.",
                "Correct — elements after the insertion point shift right to make room for the new value.",
                "Incorrect — insertion doesn't automatically reorder or sort the array."
            ),
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
            optionExplanations = listOf(
                "Incorrect — the gap left behind must be closed.",
                "Correct — remaining elements shift left by one position to close the gap.",
                "Incorrect — shifting right would create a gap instead of closing one.",
                "Incorrect — deleting an element has nothing to do with resizing."
            ),
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 7,
            questionText = "Which structure allows faster random access?",
            options = listOf("Linked List", "Stack", "Queue", "Array"),
            correctAnswerIndex = 3,
            explanation = "Arrays support direct index-based access.",
            optionExplanations = listOf(
                "Incorrect — linked lists require sequential traversal to reach a node.",
                "Incorrect — a stack only exposes its top element.",
                "Incorrect — a queue only exposes its front (and sometimes rear) element.",
                "Correct — arrays support direct index-based access in constant time."
            ),
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
            optionExplanations = listOf(
                "Incorrect — arrays are ordered by index; that isn't the issue here.",
                "Correct — every existing element must shift right by one position to make room.",
                "Incorrect — arrays do allow insertion, it's just costly at the beginning.",
                "Incorrect — a fixed-size array doesn't resize itself; resizing isn't the cause here."
            ),
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
            optionExplanations = listOf(
                "Incorrect — searching an unsorted array checks elements one by one, O(n).",
                "Incorrect — inserting at the beginning shifts all elements, O(n).",
                "Correct — an index maps directly to a memory address, so access is constant time.",
                "Incorrect — deleting from the middle shifts subsequent elements, O(n)."
            ),
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
            optionExplanations = listOf(
                "Incorrect — arrays can store integers without any issue.",
                "Incorrect — indexing is a core feature of arrays.",
                "Correct — a fixed-size array's capacity is set at creation and can't be changed without creating a new one.",
                "Incorrect — the last element is accessible directly through its index."
            ),
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 91,
            questionText = "What is a 2D array commonly used to represent?",
            options = listOf(
                "A single row of data",
                "A matrix or grid of data",
                "A queue",
                "A stack"
            ),
            correctAnswerIndex = 1,
            explanation = "A 2D array organizes data into rows and columns, like a matrix or grid.",
            optionExplanations = listOf(
                "Incorrect — a single row describes a 1D array, not a 2D one.",
                "Correct — a 2D array organizes data into rows and columns, like a matrix or grid.",
                "Incorrect — a queue is a FIFO behavior, unrelated to array dimensions.",
                "Incorrect — a stack is a LIFO behavior, unrelated to array dimensions."
            ),
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 92,
            questionText = "What is the amortized time complexity of inserting into a dynamic array (e.g. ArrayList) when it needs to resize?",
            options = listOf(
                "O(n) every time",
                "O(log n)",
                "O(1) amortized",
                "O(n²)"
            ),
            correctAnswerIndex = 2,
            explanation = "Although a resize copies all elements, doubling capacity makes the average cost per insertion O(1).",
            optionExplanations = listOf(
                "Incorrect — resizes are rare; most insertions are O(1), so it isn't O(n) every time.",
                "Incorrect — dynamic array growth doesn't follow a logarithmic pattern.",
                "Correct — occasional O(n) resizes are spread out over many cheap insertions, averaging to O(1).",
                "Incorrect — this would only happen with a very inefficient resizing strategy."
            ),
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 109,
            questionText = "What is used to access a specific element in an array?",
            options = listOf("Index", "Pointer only", "Hash key", "Node reference"),
            correctAnswerIndex = 0,
            explanation = "Arrays use a numeric index to directly locate an element's position.",
            optionExplanations = listOf(
                "Correct — the index maps directly to the element's position in memory.",
                "Incorrect — low-level implementations may use pointers, but the array abstraction is accessed via an index.",
                "Incorrect — hash keys are used in hash tables/maps, not plain arrays.",
                "Incorrect — node references are used in linked structures, not arrays."
            ),
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 110,
            questionText = "Can an array store elements of different data types in most statically typed languages?",
            options = listOf(
                "Yes, always",
                "No, only the same type",
                "Only if declared as Object",
                "Only in 2D arrays"
            ),
            correctAnswerIndex = 1,
            explanation = "Statically typed arrays are declared with one type, so all elements must match that type.",
            optionExplanations = listOf(
                "Incorrect — statically typed arrays enforce a single element type.",
                "Correct — arrays in statically typed languages are homogeneous, storing only the declared type.",
                "Incorrect — an Object[] holding mixed types is a special case, not the general rule.",
                "Incorrect — dimensionality doesn't change the type restriction."
            ),
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 111,
            questionText = "What is the time complexity of searching for an element in an unsorted array?",
            options = listOf("O(1)", "O(log n)", "O(n)", "O(n log n)"),
            correctAnswerIndex = 2,
            explanation = "Without any ordering, every element may need to be checked to find the target.",
            optionExplanations = listOf(
                "Incorrect — O(1) would only apply if you already knew the exact index.",
                "Incorrect — O(log n) applies to searching sorted data, like Binary Search.",
                "Correct — in the worst case every element must be checked one by one.",
                "Incorrect — O(n log n) is typical of sorting, not a single search."
            ),
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 112,
            questionText = "Which of these best describes a multi-dimensional array?",
            options = listOf(
                "An array of arrays",
                "A single value",
                "A sorted array",
                "A linked structure"
            ),
            correctAnswerIndex = 0,
            explanation = "A multi-dimensional array is essentially nested arrays, like rows containing arrays of columns.",
            optionExplanations = listOf(
                "Correct — each dimension adds another level of nesting, e.g. rows that are themselves arrays of values.",
                "Incorrect — a single value has no dimensions or structure.",
                "Incorrect — sorting is unrelated to dimensionality.",
                "Incorrect — linked structures use node references, not nested arrays."
            ),
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 113,
            questionText = "What is the space complexity of an array holding n elements?",
            options = listOf("O(1)", "O(log n)", "O(n)", "O(n²)"),
            correctAnswerIndex = 2,
            explanation = "Each element needs its own storage slot, so space grows linearly with the number of elements.",
            optionExplanations = listOf(
                "Incorrect — O(1) would mean space doesn't grow with element count, which isn't true here.",
                "Incorrect — logarithmic space wouldn't be enough to store n separate elements.",
                "Correct — storing n elements requires space proportional to n.",
                "Incorrect — O(n²) would be excessive; arrays don't need quadratic space."
            ),
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 114,
            questionText = "Why is binary search possible on arrays but not efficient on singly linked lists?",
            options = listOf(
                "Arrays support O(1) random access to the middle element",
                "Linked lists are always sorted",
                "Arrays cannot be sorted",
                "Linked lists use more memory"
            ),
            correctAnswerIndex = 0,
            explanation = "Binary Search repeatedly jumps to the middle element, which arrays support instantly but linked lists cannot.",
            optionExplanations = listOf(
                "Correct — jumping to the middle is O(1) for arrays but O(n) for linked lists, which must be traversed.",
                "Incorrect — linked lists are not inherently sorted; ordering is independent of the structure.",
                "Incorrect — arrays can absolutely be sorted, which is a prerequisite for binary search.",
                "Incorrect — memory overhead isn't why binary search is inefficient here; the access pattern is."
            ),
            topic = "Arrays",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // ===================== Linked Lists =====================

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
            optionExplanations = listOf(
                "Incorrect — that describes an array, not a linked list.",
                "Correct — linked lists store elements as nodes connected via references.",
                "Incorrect — nodes are the fundamental building blocks of a linked list.",
                "Incorrect — linked lists can store any data type, not just numbers."
            ),
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
            optionExplanations = listOf(
                "Incorrect — a node also needs a reference to continue the chain.",
                "Incorrect — a node needs to hold data as well, not just an address.",
                "Correct — each node pairs its data with a reference to the next node.",
                "Incorrect — a previous-node reference belongs to a doubly linked list, not a singly linked one."
            ),
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
            optionExplanations = listOf(
                "Correct — without direct indexing, reaching a position means walking node by node from the head.",
                "Incorrect — the first element (head) is directly accessible without traversal.",
                "Incorrect — inserting at the beginning only requires updating the head reference.",
                "Incorrect — deleting the first element only requires updating the head reference."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Easy"
        ),

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
            optionExplanations = listOf(
                "Incorrect — random access is actually slower in linked lists, since nodes must be traversed.",
                "Incorrect — index-based access is slower in linked lists for the same reason.",
                "Correct — inserting at the beginning just updates a reference, no shifting needed.",
                "Incorrect — accessing the last element still requires full traversal in a singly linked list."
            ),
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
            optionExplanations = listOf(
                "Incorrect — linked lists use scattered memory connected by references, not contiguous blocks.",
                "Incorrect — linked lists don't support direct indexing; that's an array strength.",
                "Correct — inserting only means relinking a couple of references, not shifting elements.",
                "Incorrect — linked lists aren't universally faster; array access, for example, is faster."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 16,
            questionText = "What is the time complexity of accessing the last element in a singly linked list?",
            options = listOf("O(1)", "O(log n)", "O(n)", "O(n²)"),
            correctAnswerIndex = 2,
            explanation = "Accessing the last node requires traversal from the head.",
            optionExplanations = listOf(
                "Incorrect — O(1) would require direct access, which a singly linked list doesn't provide.",
                "Incorrect — there's no halving process involved in traversing a linked list.",
                "Correct — reaching the last node means walking through every node from the head.",
                "Incorrect — O(n²) would be far more than a single traversal requires."
            ),
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
            optionExplanations = listOf(
                "Incorrect — random access is slower in linked lists, not faster.",
                "Incorrect — linked lists use scattered nodes connected by references, not contiguous memory.",
                "Correct — nodes can be added or removed at runtime without resizing a contiguous block.",
                "Incorrect — linked lists can store any data type, including integers."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Medium"
        ),

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
            optionExplanations = listOf(
                "Incorrect — nodes are ordered by their links; the issue is how you reach them.",
                "Incorrect — nodes are scattered in memory, not stored contiguously.",
                "Correct — reaching a node means following links one at a time from the head.",
                "Incorrect — traversal is exactly how linked lists are accessed."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 19,
            questionText = "Which pointer is required in a doubly linked list but not in a singly linked list?",
            options = listOf("Head pointer", "Next pointer", "Previous pointer", "Tail pointer"),
            correctAnswerIndex = 2,
            explanation = "Doubly linked lists store both next and previous references.",
            optionExplanations = listOf(
                "Incorrect — both types of linked lists typically use a head pointer.",
                "Incorrect — both types use a next pointer to link forward.",
                "Correct — the previous-node reference is what makes a linked list 'doubly' linked.",
                "Incorrect — a tail pointer is an optional optimization, not unique to doubly linked lists."
            ),
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
            optionExplanations = listOf(
                "Incorrect — random access is actually slower in linked lists.",
                "Incorrect — linked lists use extra memory per node for references, so this isn't always true.",
                "Correct — linked lists can grow or shrink at runtime without reallocating a contiguous block.",
                "Incorrect — contiguous storage is a property of arrays, not linked lists."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 93,
            questionText = "What is the reference of the last node set to in a singly linked list?",
            options = listOf("Itself", "Null", "The head node", "It is left undefined"),
            correctAnswerIndex = 1,
            explanation = "The last node's next reference is null, marking the end of the list.",
            optionExplanations = listOf(
                "Incorrect — pointing to itself would create a cycle, not mark the end.",
                "Correct — the last node's next reference is null, marking the end of the list.",
                "Incorrect — pointing back to the head would make it a circular linked list.",
                "Incorrect — it's explicitly set to null, not left undefined."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 94,
            questionText = "What is the main drawback of a singly linked list compared to a doubly linked list?",
            options = listOf(
                "It cannot store data",
                "It cannot be traversed backward without extra pointers",
                "It requires contiguous memory",
                "It cannot grow dynamically"
            ),
            correctAnswerIndex = 1,
            explanation = "Without a previous-node reference, a singly linked list can only be traversed forward.",
            optionExplanations = listOf(
                "Incorrect — singly linked lists store data just fine.",
                "Correct — without a previous-node reference, you can only move forward through the list.",
                "Incorrect — linked lists use scattered memory with references, not contiguous blocks.",
                "Incorrect — dynamic growth is actually an advantage linked lists have over arrays."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 115,
            questionText = "What is a 'head' in a linked list?",
            options = listOf("The last node", "The first node", "A null reference", "The middle node"),
            correctAnswerIndex = 1,
            explanation = "The head is the entry point of the list — the first node.",
            optionExplanations = listOf(
                "Incorrect — the last node is usually called the 'tail', not the head.",
                "Correct — the head is the starting node that all traversal begins from.",
                "Incorrect — null typically marks the end of the list, not its start.",
                "Incorrect — there's no fixed 'middle' reference in a standard linked list."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 116,
            questionText = "What must you traverse to reach the 5th node in a singly linked list?",
            options = listOf("Nothing, direct access", "The first 4 nodes", "The last node only", "Any node"),
            correctAnswerIndex = 1,
            explanation = "Without indexing, you must follow links one at a time from the head to reach a target node.",
            optionExplanations = listOf(
                "Incorrect — linked lists don't support direct index access like arrays.",
                "Correct — you must follow the chain from the head through nodes 1–4 to reach the 5th.",
                "Incorrect — the last node has no shortcut to the 5th node.",
                "Incorrect — traversal must start from the head and proceed in order."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 117,
            questionText = "What is a circular linked list?",
            options = listOf(
                "A list where the last node points back to the head",
                "A list with no nodes",
                "A list sorted in a circle",
                "A 2D array"
            ),
            correctAnswerIndex = 0,
            explanation = "In a circular linked list, the last node's reference points back to the first node instead of null.",
            optionExplanations = listOf(
                "Correct — this creates a loop instead of the list ending at null.",
                "Incorrect — an empty list is simply empty; that's not what 'circular' describes.",
                "Incorrect — 'circular' refers to the link structure, not the order of the values.",
                "Incorrect — a 2D array is an entirely different structure using indices, not node references."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 118,
            questionText = "Which is more efficient for inserting in the middle: a linked list or an array?",
            options = listOf(
                "Linked list, since no shifting is needed once positioned",
                "Array, always",
                "Both are equal",
                "Neither supports it"
            ),
            correctAnswerIndex = 0,
            explanation = "Once you're at the insertion point, a linked list only relinks a couple of references, while an array must shift many elements.",
            optionExplanations = listOf(
                "Correct — inserting is just relinking two references, with no need to shift other elements.",
                "Incorrect — arrays require shifting all elements after the insertion point.",
                "Incorrect — arrays are strictly worse here because of the required shifting.",
                "Incorrect — both structures do support middle insertion, just at different costs."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 119,
            questionText = "What technique is commonly used to detect a cycle in a linked list?",
            options = listOf(
                "Floyd's cycle detection (slow/fast pointers)",
                "Binary search",
                "Quick sort",
                "Hashing only"
            ),
            correctAnswerIndex = 0,
            explanation = "Floyd's algorithm uses two pointers moving at different speeds; if they meet, a cycle exists.",
            optionExplanations = listOf(
                "Correct — if a fast pointer ever catches up to a slow pointer, the list contains a cycle.",
                "Incorrect — binary search needs random access and sorted data, neither of which applies here.",
                "Incorrect — sorting algorithms don't detect structural cycles.",
                "Incorrect — tracking visited nodes with a hash set also works, but it uses extra memory, unlike Floyd's constant-space trick."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 120,
            questionText = "What is the time complexity of reversing a singly linked list iteratively?",
            options = listOf("O(1)", "O(log n)", "O(n)", "O(n²)"),
            correctAnswerIndex = 2,
            explanation = "Reversing requires visiting each node once to redirect its next pointer.",
            optionExplanations = listOf(
                "Incorrect — O(1) would mean it doesn't depend on the list's size, which isn't true.",
                "Incorrect — there's no halving process involved in reversing a list.",
                "Correct — each node is visited exactly once to flip its next pointer.",
                "Incorrect — O(n²) would imply nested traversal, which isn't needed here."
            ),
            topic = "Linked Lists",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // ===================== Stacks =====================

        Question(
            id = 21,
            questionText = "Which principle does a stack follow?",
            options = listOf("FIFO", "LIFO", "Random", "Priority-based"),
            correctAnswerIndex = 1,
            explanation = "Stack follows Last In First Out, so the last inserted element is removed first.",
            optionExplanations = listOf(
                "Incorrect — FIFO (First In First Out) describes a queue, not a stack.",
                "Correct — a stack follows Last In First Out: the most recently added item comes out first.",
                "Incorrect — stack order is strictly defined, not random.",
                "Incorrect — priority-based removal describes a priority queue, not a stack."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 22,
            questionText = "Which operation adds an element to a stack?",
            options = listOf("Pop", "Peek", "Push", "Insert"),
            correctAnswerIndex = 2,
            explanation = "Push adds a new element to the top of the stack.",
            optionExplanations = listOf(
                "Incorrect — pop removes the top element; it doesn't add one.",
                "Incorrect — peek only looks at the top element without changing the stack.",
                "Correct — push adds a new element to the top of the stack.",
                "Incorrect — 'Insert' isn't the standard stack term; 'push' is."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 23,
            questionText = "Which operation removes the top element from a stack?",
            options = listOf("Delete", "Pop", "Remove", "Peek"),
            correctAnswerIndex = 1,
            explanation = "Pop removes the most recently added element from the stack.",
            optionExplanations = listOf(
                "Incorrect — 'Delete' isn't the standard stack term; 'pop' is.",
                "Correct — pop removes the most recently added element from the top.",
                "Incorrect — 'Remove' isn't the standard stack term; 'pop' is.",
                "Incorrect — peek only views the top element without removing it."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 24,
            questionText = "Which operation returns the top element without removing it?",
            options = listOf("Push", "Peek", "Pop", "Insert"),
            correctAnswerIndex = 1,
            explanation = "Peek returns the top element without deleting it.",
            optionExplanations = listOf(
                "Incorrect — push adds a new element; it doesn't return the top one.",
                "Correct — peek returns the top element while leaving the stack unchanged.",
                "Incorrect — pop returns the top element but also removes it.",
                "Incorrect — 'Insert' isn't standard stack terminology."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 25,
            questionText = "If stack contains: 5 → 10 → 15 (top = 15), what happens after one pop?",
            options = listOf("5 removed", "10 removed", "15 removed", "Nothing removed"),
            correctAnswerIndex = 2,
            explanation = "Stack removes 15 first because it was inserted last.",
            optionExplanations = listOf(
                "Incorrect — 5 is at the bottom and isn't touched by a single pop.",
                "Incorrect — 10 is in the middle and isn't removed by a single pop from the top.",
                "Correct — 15 is on top, so it's removed first (LIFO).",
                "Incorrect — pop always removes the top element as long as the stack isn't empty."
            ),
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
            optionExplanations = listOf(
                "Incorrect — that situation causes underflow, not overflow.",
                "Correct — overflow happens when pushing into a stack that has no more capacity.",
                "Incorrect — viewing (peek) doesn't modify the stack, so it can't cause overflow.",
                "Incorrect — checking size is read-only and doesn't affect capacity."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 27,
            questionText = "Which situation causes stack underflow?",
            options = listOf("Adding element", "Viewing element", "Removing from empty stack", "Printing stack"),
            correctAnswerIndex = 2,
            explanation = "Underflow happens when trying to pop from an empty stack.",
            optionExplanations = listOf(
                "Incorrect — adding (push) would cause overflow if anything, not underflow.",
                "Incorrect — viewing (peek) doesn't remove anything, so it can't cause underflow.",
                "Correct — underflow happens when popping from a stack that has nothing left to remove.",
                "Incorrect — printing is read-only and doesn't affect the stack's contents."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 28,
            questionText = "Which data structure is commonly used for function calls in programs?",
            options = listOf("Queue", "Stack", "Array", "Graph"),
            correctAnswerIndex = 1,
            explanation = "Function calls are stored in a call stack where the latest call returns first.",
            optionExplanations = listOf(
                "Incorrect — a queue would return calls in the wrong order (first called, first returned).",
                "Correct — function calls sit on a call stack, where the most recent call returns first.",
                "Incorrect — a plain array has no built-in push/pop discipline for managing calls.",
                "Incorrect — graphs model relationships between nodes, not sequential call order."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 29,
            questionText = "Which expression type is easiest to evaluate using a stack?",
            options = listOf("Infix", "Prefix", "Postfix", "Binary"),
            correctAnswerIndex = 2,
            explanation = "In postfix notation operands come before operators, making stack evaluation straightforward.",
            optionExplanations = listOf(
                "Incorrect — infix needs operator precedence and parentheses handling, which complicates a simple stack scan.",
                "Incorrect — prefix can be evaluated with a stack too, but by scanning right-to-left.",
                "Correct — with operands before operators, a single left-to-right scan evaluates postfix directly.",
                "Incorrect — 'Binary' isn't a standard expression notation type here."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 30,
            questionText = "Which expression type places operators before operands?",
            options = listOf("Infix", "Prefix", "Postfix", "Binary"),
            correctAnswerIndex = 1,
            explanation = "In prefix notation operators appear before operands and can be evaluated without parentheses.",
            optionExplanations = listOf(
                "Incorrect — infix places the operator between the two operands (e.g., a + b).",
                "Correct — prefix places the operator before its operands (e.g., + a b).",
                "Incorrect — postfix places the operator after the operands (e.g., a b +).",
                "Incorrect — 'Binary' isn't a standard expression notation type here."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 95,
            questionText = "Which of these is a real-world example of a stack?",
            options = listOf(
                "A queue at a ticket counter",
                "A stack of plates",
                "A printer job list",
                "People waiting in line"
            ),
            correctAnswerIndex = 1,
            explanation = "You can only take the top plate off a stack of plates, matching LIFO behavior.",
            optionExplanations = listOf(
                "Incorrect — a ticket counter queue is FIFO, matching a queue, not a stack.",
                "Correct — you can only take the top plate off, matching LIFO behavior.",
                "Incorrect — a printer job list is typically processed FIFO, matching a queue.",
                "Incorrect — a line of people is served FIFO, matching a queue, not a stack."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 96,
            questionText = "What is the time complexity of push and pop on a stack implemented with an array?",
            options = listOf("O(n)", "O(log n)", "O(1)", "O(n log n)"),
            correctAnswerIndex = 2,
            explanation = "Adding or removing from the top of an array-based stack takes constant time.",
            optionExplanations = listOf(
                "Incorrect — no shifting or traversal is needed, so it isn't O(n).",
                "Incorrect — there's no halving process involved.",
                "Correct — adding or removing from the top of an array-based stack is constant time.",
                "Incorrect — O(n log n) is far more than a single push or pop requires."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 121,
            questionText = "What does LIFO stand for?",
            options = listOf("Last In First Out", "Last In Final Out", "Linear In First Out", "Last Index First Out"),
            correctAnswerIndex = 0,
            explanation = "LIFO describes the stack's order: the most recently added item is removed first.",
            optionExplanations = listOf(
                "Correct — the last element pushed is the first one popped.",
                "Incorrect — 'Final Out' isn't the correct expansion; it's 'First Out'.",
                "Incorrect — 'Linear' isn't part of the LIFO acronym.",
                "Incorrect — 'Last Index' isn't part of the LIFO acronym."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 122,
            questionText = "Which operation checks if a stack has no elements?",
            options = listOf("isEmpty", "isFull", "peek", "pop"),
            correctAnswerIndex = 0,
            explanation = "isEmpty is the standard check for whether a stack has zero elements.",
            optionExplanations = listOf(
                "Correct — isEmpty returns true when the stack has no elements left.",
                "Incorrect — isFull checks the opposite condition: whether capacity is reached.",
                "Incorrect — peek returns the top element; it doesn't check for emptiness.",
                "Incorrect — pop removes an element and would fail (underflow) if called on an empty stack."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 123,
            questionText = "Which browser feature commonly uses a stack?",
            options = listOf("Back button history", "Bookmarks list", "Tab search", "Autofill"),
            correctAnswerIndex = 0,
            explanation = "Each visited page is pushed on, and the back button pops the most recent one off.",
            optionExplanations = listOf(
                "Correct — visiting a page pushes it on; going back pops the most recent page off.",
                "Incorrect — bookmarks are typically an unordered or user-ordered list, not a LIFO stack.",
                "Incorrect — tab search just filters open tabs, with no push/pop behavior.",
                "Incorrect — autofill retrieves saved values, unrelated to stack order."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 124,
            questionText = "What is the result of pushing 1, 2, 3 then popping twice?",
            options = listOf("1 remains on top", "2 remains on top", "3 remains on top", "Stack is empty"),
            correctAnswerIndex = 0,
            explanation = "Push 1, 2, 3 puts 3 on top; popping twice removes 3 then 2, leaving 1 on top.",
            optionExplanations = listOf(
                "Correct — after popping 3 and then 2, only 1 remains, sitting on top.",
                "Incorrect — 2 is removed by the second pop, not left on top.",
                "Incorrect — 3 is removed by the first pop, since it was pushed last.",
                "Incorrect — one element (1) is still left after two pops on a stack of three."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 125,
            questionText = "How can a stack be used to check for balanced parentheses in an expression?",
            options = listOf(
                "Push opening brackets and pop when a matching closing bracket appears",
                "Sort brackets alphabetically",
                "Count vowels",
                "Use a queue instead"
            ),
            correctAnswerIndex = 0,
            explanation = "Each opening bracket is pushed; each closing bracket should match the most recently pushed opening bracket, which a stack naturally tracks.",
            optionExplanations = listOf(
                "Correct — this LIFO matching is exactly how bracket balance is validated.",
                "Incorrect — brackets don't have an alphabetical order to sort by.",
                "Incorrect — vowels are unrelated to bracket matching.",
                "Incorrect — a queue would check brackets in the wrong order (FIFO instead of LIFO)."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 126,
            questionText = "What is the time complexity of converting infix to postfix notation using a stack?",
            options = listOf("O(1)", "O(log n)", "O(n)", "O(n²)"),
            correctAnswerIndex = 2,
            explanation = "Each token in the expression is processed once, using the stack to hold pending operators.",
            optionExplanations = listOf(
                "Incorrect — the conversion depends on the expression's length, so it can't be constant time.",
                "Incorrect — there's no halving process involved in this conversion.",
                "Correct — each token is read and processed exactly once.",
                "Incorrect — O(n²) would imply repeated re-scanning, which isn't needed here."
            ),
            topic = "Stacks",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // ===================== Queues =====================

        Question(
            id = 31,
            questionText = "Which principle does a queue follow?",
            options = listOf("LIFO", "FIFO", "Random", "Priority-based"),
            correctAnswerIndex = 1,
            explanation = "Queue follows First In First Out, so the first inserted element is removed first.",
            optionExplanations = listOf(
                "Incorrect — LIFO (Last In First Out) describes a stack, not a queue.",
                "Correct — a queue follows First In First Out: the earliest added item comes out first.",
                "Incorrect — queue order is strictly defined, not random.",
                "Incorrect — priority-based removal describes a priority queue, a variant of the basic queue."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 32,
            questionText = "Which operation adds an element to a queue?",
            options = listOf("Pop", "Push", "Enqueue", "Insert"),
            correctAnswerIndex = 2,
            explanation = "Enqueue adds a new element to the rear of the queue.",
            optionExplanations = listOf(
                "Incorrect — pop is a removal operation, typically associated with stacks.",
                "Incorrect — push is typically associated with stacks, not queues.",
                "Correct — enqueue adds a new element to the rear of the queue.",
                "Incorrect — 'Insert' isn't the standard queue term; 'enqueue' is."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 33,
            questionText = "Which operation removes an element from a queue?",
            options = listOf("Dequeue", "Pop", "Peek", "Delete"),
            correctAnswerIndex = 0,
            explanation = "Dequeue removes the element from the front of the queue.",
            optionExplanations = listOf(
                "Correct — dequeue removes the element from the front of the queue.",
                "Incorrect — pop is typically associated with stacks, not queues.",
                "Incorrect — peek only views the front element without removing it.",
                "Incorrect — 'Delete' isn't the standard queue term; 'dequeue' is."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 34,
            questionText = "From which end are elements removed in a queue?",
            options = listOf("Rear", "Middle", "Front", "Top"),
            correctAnswerIndex = 2,
            explanation = "Elements are removed from the front following FIFO order.",
            optionExplanations = listOf(
                "Incorrect — the rear is where new elements are added, not removed.",
                "Incorrect — queues don't remove from the middle; that would break FIFO order.",
                "Correct — elements are removed from the front, following FIFO order.",
                "Incorrect — 'Top' is stack terminology, not queue terminology."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 35,
            questionText = "From which end are elements inserted in a queue?",
            options = listOf("Front", "Rear", "Middle", "Top"),
            correctAnswerIndex = 1,
            explanation = "New elements are inserted at the rear of the queue.",
            optionExplanations = listOf(
                "Incorrect — the front is where elements are removed, not inserted.",
                "Correct — new elements are inserted at the rear of the queue.",
                "Incorrect — queues don't insert into the middle; that would break FIFO order.",
                "Incorrect — 'Top' is stack terminology, not queue terminology."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 36,
            questionText = "Which situation causes queue overflow?",
            options = listOf("Removing from empty queue", "Adding to full queue", "Viewing front element", "Printing queue"),
            correctAnswerIndex = 1,
            explanation = "Overflow happens when trying to enqueue into a full queue.",
            optionExplanations = listOf(
                "Incorrect — that situation causes underflow, not overflow.",
                "Correct — overflow happens when enqueuing into a queue that has no more capacity.",
                "Incorrect — viewing (peek) doesn't modify the queue, so it can't cause overflow.",
                "Incorrect — printing is read-only and doesn't affect capacity."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 37,
            questionText = "Which situation causes queue underflow?",
            options = listOf("Adding element", "Viewing element", "Removing from empty queue", "Checking size"),
            correctAnswerIndex = 2,
            explanation = "Underflow happens when trying to dequeue from an empty queue.",
            optionExplanations = listOf(
                "Incorrect — adding (enqueue) would cause overflow if anything, not underflow.",
                "Incorrect — viewing (peek) doesn't remove anything, so it can't cause underflow.",
                "Correct — underflow happens when dequeuing from a queue with nothing left to remove.",
                "Incorrect — checking size is read-only and doesn't affect the queue's contents."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 38,
            questionText = "Which real-life example best represents a queue?",
            options = listOf("Stack of plates", "Printer job list", "Undo operation", "Function calls"),
            correctAnswerIndex = 1,
            explanation = "Printer jobs are processed in order of arrival, matching FIFO behavior.",
            optionExplanations = listOf(
                "Incorrect — a stack of plates is LIFO, matching a stack, not a queue.",
                "Correct — printer jobs are processed in the order they arrive, matching FIFO behavior.",
                "Incorrect — undo operations reverse the most recent action first, matching a stack (LIFO).",
                "Incorrect — function calls return in LIFO order via the call stack, not FIFO."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 39,
            questionText = "Which operation returns the front element without removing it?",
            options = listOf("Peek", "Pop", "Push", "Insert"),
            correctAnswerIndex = 0,
            explanation = "Peek returns the front element without removing it from the queue.",
            optionExplanations = listOf(
                "Correct — peek returns the front element without removing it from the queue.",
                "Incorrect — pop is a removal operation typically associated with stacks.",
                "Incorrect — push adds an element; it doesn't return the front one.",
                "Incorrect — 'Insert' isn't the standard queue term for this operation."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 40,
            questionText = "Which data structure is commonly used for scheduling tasks in operating systems?",
            options = listOf("Stack", "Queue", "Tree", "Graph"),
            correctAnswerIndex = 1,
            explanation = "Operating systems schedule tasks using queues based on arrival order.",
            optionExplanations = listOf(
                "Incorrect — a stack would run the most recently added task first, not in arrival order.",
                "Correct — operating systems commonly schedule tasks using queues, based on arrival order.",
                "Incorrect — trees model hierarchy, not simple arrival-order scheduling.",
                "Incorrect — graphs model relationships between nodes, not scheduling order."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 97,
            questionText = "Which of these is a real-world example of a queue?",
            options = listOf("A stack of plates", "People waiting in line", "An undo history", "A recursive call stack"),
            correctAnswerIndex = 1,
            explanation = "The first person to line up is the first to be served, matching FIFO behavior.",
            optionExplanations = listOf(
                "Incorrect — a stack of plates is LIFO, matching a stack, not a queue.",
                "Correct — the first person to line up is the first to be served, matching FIFO behavior.",
                "Incorrect — undo history reverses the most recent action first, matching a stack (LIFO).",
                "Incorrect — a recursive call stack unwinds in LIFO order, not FIFO."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 98,
            questionText = "What is a key limitation of a simple array-based queue?",
            options = listOf(
                "It cannot store integers",
                "Freed space at the front can't be reused without shifting or a circular design",
                "It cannot enqueue elements",
                "It always resizes automatically"
            ),
            correctAnswerIndex = 1,
            explanation = "A circular queue design is often used to reuse freed space at the front.",
            optionExplanations = listOf(
                "Incorrect — array-based queues can store integers without any issue.",
                "Correct — a circular queue design is often used to reuse freed space at the front.",
                "Incorrect — a simple array-based queue can enqueue elements fine, up to its capacity.",
                "Incorrect — a plain fixed-size array queue doesn't resize itself automatically."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 127,
            questionText = "What does FIFO stand for?",
            options = listOf("First In First Out", "First In Final Out", "Fast In Fast Out", "First Index First Out"),
            correctAnswerIndex = 0,
            explanation = "FIFO describes the queue's order: the earliest added item is removed first.",
            optionExplanations = listOf(
                "Correct — the first element enqueued is the first one dequeued.",
                "Incorrect — 'Final Out' isn't the correct expansion; it's 'First Out'.",
                "Incorrect — FIFO is about order, not speed, so 'Fast' isn't part of the acronym.",
                "Incorrect — 'First Index' isn't part of the FIFO acronym."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 128,
            questionText = "Which end of a queue do you enqueue new elements to?",
            options = listOf("Front", "Rear", "Middle", "Either end"),
            correctAnswerIndex = 1,
            explanation = "New elements join at the rear; the front is reserved for removal.",
            optionExplanations = listOf(
                "Incorrect — the front is where elements are removed (dequeued), not added.",
                "Correct — enqueue adds new elements to the rear of the queue.",
                "Incorrect — inserting into the middle would break FIFO order.",
                "Incorrect — a standard queue only allows insertion at the rear; a deque allows both ends."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 129,
            questionText = "What is a priority queue?",
            options = listOf(
                "A queue where elements are served based on priority, not just order",
                "A queue that only stores numbers",
                "A stack in disguise",
                "A queue with fixed size 1"
            ),
            correctAnswerIndex = 0,
            explanation = "A priority queue serves the highest (or lowest) priority element first, regardless of insertion order.",
            optionExplanations = listOf(
                "Correct — elements with higher priority are dequeued before others, regardless of arrival order.",
                "Incorrect — a priority queue can store any comparable data type, not just numbers.",
                "Incorrect — a priority queue has its own distinct ordering rules, not simply a relabeled stack.",
                "Incorrect — size has nothing to do with what defines a priority queue."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 130,
            questionText = "What is a deque?",
            options = listOf(
                "A double-ended queue allowing insertion/removal from both ends",
                "A queue that only removes from the middle",
                "A single-ended stack",
                "A sorted queue"
            ),
            correctAnswerIndex = 0,
            explanation = "'Deque' stands for double-ended queue, supporting operations at both the front and rear.",
            optionExplanations = listOf(
                "Correct — a deque supports adding and removing elements at both the front and the rear.",
                "Incorrect — removing from the middle isn't a standard deque operation.",
                "Incorrect — a deque is a distinct structure, not simply another name for a stack.",
                "Incorrect — sorting isn't part of a deque's definition; it just supports two-ended access."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 131,
            questionText = "How does a circular queue solve the wasted-space problem of a linear array queue?",
            options = listOf(
                "By wrapping the rear index back to the start when space is free",
                "By doubling the array size every time",
                "By using a stack internally",
                "By removing FIFO order"
            ),
            correctAnswerIndex = 0,
            explanation = "A circular queue treats the array as a ring, so freed slots at the front can be reused by wrapping the rear index around.",
            optionExplanations = listOf(
                "Correct — wrapping around lets the queue reuse space freed by earlier dequeues.",
                "Incorrect — resizing doesn't solve the wasted-space problem at the front; wrapping does.",
                "Incorrect — a circular queue doesn't rely on a stack internally.",
                "Incorrect — a circular queue still follows FIFO order; only the storage strategy changes."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 132,
            questionText = "Which traversal algorithm relies on a queue to visit nodes level by level?",
            options = listOf("Breadth-First Search", "Depth-First Search", "Inorder traversal", "Quick Sort"),
            correctAnswerIndex = 0,
            explanation = "BFS uses a queue to process nodes in the order they're discovered, visiting each level before moving to the next.",
            optionExplanations = listOf(
                "Correct — BFS enqueues neighboring nodes and processes them in discovery order, level by level.",
                "Incorrect — DFS typically uses a stack (or recursion), not a queue.",
                "Incorrect — inorder traversal is usually implemented with recursion or a stack, not a queue.",
                "Incorrect — Quick Sort is a sorting algorithm, unrelated to level-by-level traversal."
            ),
            topic = "Queues",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // ===================== Trees =====================

        Question(
            id = 41,
            questionText = "What is a tree in data structures?",
            options = listOf("Linear structure", "Hierarchical structure", "Circular structure", "Random structure"),
            correctAnswerIndex = 1,
            explanation = "A tree stores data in a hierarchical structure with parent–child relationships.",
            optionExplanations = listOf(
                "Incorrect — a linear structure describes arrays or linked lists, not a tree.",
                "Correct — a tree organizes data hierarchically with parent–child relationships.",
                "Incorrect — trees don't loop back on themselves like a circular structure would.",
                "Incorrect — a tree follows a strict hierarchical order, not a random arrangement."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 42,
            questionText = "What is the top node of a tree called?",
            options = listOf("Leaf", "Root", "Parent", "Child"),
            correctAnswerIndex = 1,
            explanation = "The root is the highest node in a tree.",
            optionExplanations = listOf(
                "Incorrect — a leaf is a node with no children, typically at the bottom of the tree.",
                "Correct — the root is the topmost node, with no parent of its own.",
                "Incorrect — 'parent' is a relative term for any node with children, not specifically the top one.",
                "Incorrect — 'child' is a relative term for any node with a parent, not the top one."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 43,
            questionText = "What is a node with no children called?",
            options = listOf("Root", "Parent", "Leaf", "Edge"),
            correctAnswerIndex = 2,
            explanation = "A leaf node has no child nodes.",
            optionExplanations = listOf(
                "Incorrect — the root is the topmost node, which usually does have children.",
                "Incorrect — a parent node by definition has at least one child.",
                "Correct — a leaf node has no children.",
                "Incorrect — an edge is the connection between two nodes, not a node itself."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 44,
            questionText = "What connects two nodes in a tree?",
            options = listOf("Vertex", "Edge", "Link", "Pointer"),
            correctAnswerIndex = 1,
            explanation = "An edge represents the connection between two nodes.",
            optionExplanations = listOf(
                "Incorrect — a vertex is another name for a node itself, not the connection between them.",
                "Correct — an edge represents the connection between two nodes.",
                "Incorrect — 'link' is used informally, but 'edge' is the standard tree term.",
                "Incorrect — a pointer is an implementation detail, not the conceptual term for the connection."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 45,
            questionText = "What is the maximum number of children a binary tree node can have?",
            options = listOf("1", "2", "3", "Unlimited"),
            correctAnswerIndex = 1,
            explanation = "Each node in a binary tree can have at most two children.",
            optionExplanations = listOf(
                "Incorrect — at most 1 child would describe a different, more restrictive structure.",
                "Correct — 'binary' means at most two children per node.",
                "Incorrect — three children would make it a ternary tree, not binary.",
                "Incorrect — unlimited children describes a general tree, not specifically a binary tree."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 46,
            questionText = "Which traversal visits nodes in the order: Root → Left → Right?",
            options = listOf("Inorder", "Postorder", "Preorder", "Level order"),
            correctAnswerIndex = 2,
            explanation = "Preorder traversal visits root first, then left subtree, then right subtree.",
            optionExplanations = listOf(
                "Incorrect — inorder visits Left → Root → Right.",
                "Incorrect — postorder visits Left → Right → Root.",
                "Correct — preorder visits the root first, then the left subtree, then the right subtree.",
                "Incorrect — level order visits nodes level by level, not by this depth-first pattern."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 47,
            questionText = "Which traversal visits nodes in the order: Left → Root → Right?",
            options = listOf("Inorder", "Preorder", "Postorder", "Level order"),
            correctAnswerIndex = 0,
            explanation = "Inorder traversal visits left subtree, then root, then right subtree.",
            optionExplanations = listOf(
                "Correct — inorder visits the left subtree, then the root, then the right subtree.",
                "Incorrect — preorder visits Root → Left → Right.",
                "Incorrect — postorder visits Left → Right → Root.",
                "Incorrect — level order visits nodes level by level, not in this depth pattern."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 48,
            questionText = "Which traversal visits nodes level by level?",
            options = listOf("Preorder", "Inorder", "Postorder", "Level order"),
            correctAnswerIndex = 3,
            explanation = "Level order traversal visits nodes one level at a time from top to bottom.",
            optionExplanations = listOf(
                "Incorrect — preorder is a depth-first traversal, not level by level.",
                "Incorrect — inorder is a depth-first traversal, not level by level.",
                "Incorrect — postorder is a depth-first traversal, not level by level.",
                "Correct — level order (BFS) visits nodes one level at a time from top to bottom."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 49,
            questionText = "In a Binary Search Tree (BST), where are smaller values stored?",
            options = listOf("Right subtree", "Left subtree", "Root only", "Anywhere"),
            correctAnswerIndex = 1,
            explanation = "In a BST, smaller values are stored in the left subtree.",
            optionExplanations = listOf(
                "Incorrect — the right subtree holds values greater than the current node.",
                "Correct — in a BST, smaller values are stored in the left subtree.",
                "Incorrect — smaller values can appear throughout the left subtree, not just at the root.",
                "Incorrect — a BST enforces a strict ordering; values can't be placed anywhere."
            ),
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
            optionExplanations = listOf(
                "Incorrect — the total node count is the tree's size, not its height.",
                "Correct — height is measured by the number of edges on the longest root-to-leaf path.",
                "Incorrect — the leaf count doesn't measure how deep the tree goes.",
                "Incorrect — one node's number of children doesn't describe the whole tree's height."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 99,
            questionText = "What is the time complexity of searching in a balanced Binary Search Tree?",
            options = listOf("O(n)", "O(log n)", "O(1)", "O(n²)"),
            correctAnswerIndex = 1,
            explanation = "A balanced BST halves the search space at each level, giving O(log n) search.",
            optionExplanations = listOf(
                "Incorrect — O(n) would describe search in an unsorted or unbalanced (skewed) structure.",
                "Correct — a balanced BST halves the search space at each level, giving O(log n).",
                "Incorrect — O(1) would mean no traversal at all, which isn't the case for a BST.",
                "Incorrect — O(n²) would be far worse than what a balanced BST needs."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 100,
            questionText = "What happens to search performance if a Binary Search Tree becomes unbalanced (skewed)?",
            options = listOf("It stays O(log n)", "It degrades toward O(n)", "It becomes O(1)", "It has no effect on performance"),
            correctAnswerIndex = 1,
            explanation = "A skewed tree behaves like a linked list, so search degrades toward O(n).",
            optionExplanations = listOf(
                "Incorrect — the O(log n) guarantee relies on the tree staying balanced.",
                "Correct — a skewed tree behaves like a linked list, so search degrades toward O(n).",
                "Incorrect — O(1) would mean instant access, which a tree traversal never guarantees.",
                "Incorrect — balance has a direct, significant effect on search performance."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 133,
            questionText = "What is a binary tree?",
            options = listOf(
                "A tree where each node has at most two children",
                "A tree with only one node",
                "A tree with unlimited children per node",
                "A sorted array"
            ),
            correctAnswerIndex = 0,
            explanation = "'Binary' means each node can branch into at most two children: left and right.",
            optionExplanations = listOf(
                "Correct — each node in a binary tree has at most a left and a right child.",
                "Incorrect — a single-node tree is just a minimal special case, not the definition of 'binary'.",
                "Incorrect — unlimited children describes a general tree, not a binary tree.",
                "Incorrect — a sorted array is an entirely different, non-hierarchical structure."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 134,
            questionText = "What is the depth of the root node in a tree?",
            options = listOf("0", "1", "-1", "Undefined"),
            correctAnswerIndex = 0,
            explanation = "Depth is measured as the number of edges from the root, so the root itself is at depth 0.",
            optionExplanations = listOf(
                "Correct — the root has no edges above it, so its depth is 0.",
                "Incorrect — depth 1 would describe the root's direct children.",
                "Incorrect — depth is a non-negative count of edges; it can't be negative.",
                "Incorrect — the root's depth is well-defined as 0, not undefined."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 135,
            questionText = "What is a complete binary tree?",
            options = listOf(
                "All levels are fully filled except possibly the last, which fills left to right",
                "A tree with no children",
                "A tree with only leaves",
                "A tree with random node placement"
            ),
            correctAnswerIndex = 0,
            explanation = "A complete binary tree fills every level fully except possibly the last, which is filled from left to right.",
            optionExplanations = listOf(
                "Correct — this left-to-right filling of the last level is exactly what 'complete' means.",
                "Incorrect — a tree with no children is just a single root node, not a defining trait of 'complete'.",
                "Incorrect — a tree of only leaves isn't what 'complete' describes.",
                "Incorrect — 'complete' implies a specific fill order, not randomness."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 136,
            questionText = "Which traversal visits nodes in the order: Left → Right → Root?",
            options = listOf("Postorder", "Preorder", "Inorder", "Level order"),
            correctAnswerIndex = 0,
            explanation = "Postorder visits both subtrees before visiting the root itself.",
            optionExplanations = listOf(
                "Correct — postorder processes the left subtree, then the right subtree, then the root last.",
                "Incorrect — preorder visits Root → Left → Right.",
                "Incorrect — inorder visits Left → Root → Right.",
                "Incorrect — level order visits nodes by depth level, not this pattern."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 137,
            questionText = "What is a self-balancing binary search tree used for?",
            options = listOf(
                "Keeping operations at O(log n) by preventing skewed shapes",
                "Storing only sorted arrays",
                "Avoiding the use of pointers",
                "Making traversal unnecessary"
            ),
            correctAnswerIndex = 0,
            explanation = "Structures like AVL or Red-Black trees automatically rebalance to avoid worst-case skewed shapes.",
            optionExplanations = listOf(
                "Correct — automatic rebalancing keeps the tree's height close to log n, preserving fast operations.",
                "Incorrect — self-balancing trees store nodes with references, not sorted arrays.",
                "Incorrect — self-balancing trees still use pointers/references to connect nodes.",
                "Incorrect — traversal is still required; balancing just keeps it efficient."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 138,
            questionText = "Which data structure is often used to efficiently find the minimum or maximum element, with O(log n) insert/remove?",
            options = listOf("Heap", "Stack", "Queue", "Unsorted array"),
            correctAnswerIndex = 0,
            explanation = "A heap keeps the smallest (or largest) element accessible at the root while maintaining O(log n) insert and remove.",
            optionExplanations = listOf(
                "Correct — a heap's structure guarantees the min (or max) is always at the root, with O(log n) updates.",
                "Incorrect — a stack only gives access to the most recently added element, not the min/max.",
                "Incorrect — a queue only gives access to the oldest added element, not the min/max.",
                "Incorrect — finding the min/max in an unsorted array takes O(n), not O(log n)."
            ),
            topic = "Trees",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // ===================== Graphs =====================

        Question(
            id = 51,
            questionText = "What is a graph in data structures?",
            options = listOf("Linear structure", "Hierarchical structure", "Collection of vertices and edges", "Circular structure"),
            correctAnswerIndex = 2,
            explanation = "A graph consists of vertices (nodes) connected by edges.",
            optionExplanations = listOf(
                "Incorrect — a linear structure describes arrays or linked lists, not a graph.",
                "Incorrect — a strict parent-child hierarchy describes a tree, not a general graph.",
                "Correct — a graph consists of vertices (nodes) connected by edges.",
                "Incorrect — 'circular' describes only certain graph shapes, not the general definition."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 52,
            questionText = "What are the nodes in a graph called?",
            options = listOf("Edges", "Vertices", "Paths", "Roots"),
            correctAnswerIndex = 1,
            explanation = "Graph nodes are called vertices.",
            optionExplanations = listOf(
                "Incorrect — edges are the connections between nodes, not the nodes themselves.",
                "Correct — graph nodes are called vertices.",
                "Incorrect — a path is a sequence of connected vertices, not a single node.",
                "Incorrect — 'root' is tree terminology for a specific top node; graphs don't require one."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 53,
            questionText = "What connects two vertices in a graph?",
            options = listOf("Root", "Edge", "Leaf", "Branch"),
            correctAnswerIndex = 1,
            explanation = "An edge represents a connection between two vertices.",
            optionExplanations = listOf(
                "Incorrect — 'root' is tree terminology, not a connection between vertices.",
                "Correct — an edge represents a connection between two vertices.",
                "Incorrect — 'leaf' is tree terminology for a childless node, not a connection.",
                "Incorrect — 'branch' is informal tree terminology, not the standard graph term."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 54,
            questionText = "A graph with direction on edges is called?",
            options = listOf("Undirected graph", "Directed graph", "Binary graph", "Circular graph"),
            correctAnswerIndex = 1,
            explanation = "In a directed graph, edges have direction between vertices.",
            optionExplanations = listOf(
                "Incorrect — an undirected graph's edges have no direction, the opposite of what's described.",
                "Correct — in a directed graph, edges have direction between vertices.",
                "Incorrect — 'binary graph' isn't a standard term for edge direction.",
                "Incorrect — 'circular' describes a shape or cycle, not edge direction."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 55,
            questionText = "A graph without edge directions is called?",
            options = listOf("Directed graph", "Undirected graph", "Weighted graph", "Binary graph"),
            correctAnswerIndex = 1,
            explanation = "In an undirected graph, edges have no direction.",
            optionExplanations = listOf(
                "Incorrect — a directed graph's edges do have direction, the opposite of what's described.",
                "Correct — in an undirected graph, edges have no direction.",
                "Incorrect — 'weighted' describes edges having costs/values, unrelated to direction.",
                "Incorrect — 'binary graph' isn't a standard term here."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 56,
            questionText = "Which graph traversal uses a queue?",
            options = listOf("DFS", "BFS", "Inorder", "Preorder"),
            correctAnswerIndex = 1,
            explanation = "Breadth-First Search uses a queue to visit nodes level by level.",
            optionExplanations = listOf(
                "Incorrect — DFS typically uses a stack or recursion, not a queue.",
                "Correct — Breadth-First Search uses a queue to visit nodes level by level.",
                "Incorrect — inorder is a tree traversal, usually done with recursion or a stack.",
                "Incorrect — preorder is a tree traversal, usually done with recursion or a stack."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 57,
            questionText = "Which graph traversal uses a stack (or recursion)?",
            options = listOf("BFS", "DFS", "Level order", "Binary search"),
            correctAnswerIndex = 1,
            explanation = "Depth-First Search uses a stack or recursion to explore deeply.",
            optionExplanations = listOf(
                "Incorrect — BFS uses a queue, not a stack.",
                "Correct — Depth-First Search uses a stack or recursion to explore deeply before backtracking.",
                "Incorrect — level order traversal uses a queue, just like BFS.",
                "Incorrect — binary search is a searching technique on sorted data, unrelated to graph traversal."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 58,
            questionText = "What is a path in a graph?",
            options = listOf("A loop in the graph", "A sequence of connected vertices", "A disconnected vertex", "A weighted edge"),
            correctAnswerIndex = 1,
            explanation = "A path is a sequence of vertices connected by edges.",
            optionExplanations = listOf(
                "Incorrect — a loop that returns to its start describes a cycle, not a general path.",
                "Correct — a path is a sequence of vertices connected by edges.",
                "Incorrect — a disconnected vertex has no edges at all, the opposite of a path.",
                "Incorrect — a single weighted edge is just one connection, not a full path."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 59,
            questionText = "What is a cycle in a graph?",
            options = listOf("A vertex with no edges", "A path that starts and ends at the same vertex", "A disconnected graph", "A weighted connection"),
            correctAnswerIndex = 1,
            explanation = "A cycle is a path that begins and ends at the same vertex.",
            optionExplanations = listOf(
                "Incorrect — a vertex with no edges is isolated, unrelated to cycles.",
                "Correct — a cycle is a path that begins and ends at the same vertex.",
                "Incorrect — a disconnected graph simply lacks a path between some vertices; that's unrelated to cycles.",
                "Incorrect — a weighted connection just describes an edge with a cost, not a loop."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 60,
            questionText = "Which representation stores graph connections using a matrix?",
            options = listOf("Adjacency list", "Adjacency matrix", "Binary tree", "Stack representation"),
            correctAnswerIndex = 1,
            explanation = "An adjacency matrix uses a 2D array to represent connections.",
            optionExplanations = listOf(
                "Incorrect — an adjacency list uses lists (one per vertex), not a matrix.",
                "Correct — an adjacency matrix uses a 2D array to represent connections.",
                "Incorrect — a binary tree is a hierarchical structure, not a matrix-based graph representation.",
                "Incorrect — 'stack representation' isn't a standard way to represent graph connections."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 101,
            questionText = "Which algorithm finds the shortest path in a weighted graph with non-negative edges?",
            options = listOf("Dijkstra's algorithm", "Bubble Sort", "Binary Search", "Depth-First Search alone"),
            correctAnswerIndex = 0,
            explanation = "Dijkstra's algorithm finds shortest paths from a source in graphs with non-negative weights.",
            optionExplanations = listOf(
                "Correct — Dijkstra's algorithm finds shortest paths from a source in graphs with non-negative weights.",
                "Incorrect — Bubble Sort is a sorting algorithm, unrelated to pathfinding.",
                "Incorrect — Binary Search finds a value in sorted data, unrelated to weighted pathfinding.",
                "Incorrect — plain DFS doesn't account for edge weights, so it can't guarantee the shortest path."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 102,
            questionText = "What is the time complexity of Breadth-First Search using an adjacency list (V vertices, E edges)?",
            options = listOf("O(V + E)", "O(V²)", "O(E log V)", "O(1)"),
            correctAnswerIndex = 0,
            explanation = "BFS visits every vertex and edge once, giving O(V + E) time complexity.",
            optionExplanations = listOf(
                "Correct — BFS visits every vertex and edge once, giving O(V + E).",
                "Incorrect — O(V²) would apply to a dense adjacency-matrix approach, not typical adjacency-list BFS.",
                "Incorrect — O(E log V) is characteristic of algorithms like Dijkstra's with a priority queue.",
                "Incorrect — O(1) would mean no traversal at all, which BFS clearly requires."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 139,
            questionText = "What is the degree of a vertex in a graph?",
            options = listOf("The number of edges connected to it", "Its position in the graph", "Its distance from the root", "The number of vertices in the graph"),
            correctAnswerIndex = 0,
            explanation = "A vertex's degree counts how many edges touch it.",
            optionExplanations = listOf(
                "Correct — degree simply counts the edges incident to that vertex.",
                "Incorrect — graphs don't have a fixed 'position'; degree is about edge connections.",
                "Incorrect — 'distance from the root' is tree terminology, and graphs don't require a root.",
                "Incorrect — the total vertex count describes the whole graph's size, not one vertex's degree."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 140,
            questionText = "What is a weighted graph?",
            options = listOf("A graph where edges have associated costs or values", "A graph with no edges", "A graph with only one vertex", "A tree with weights"),
            correctAnswerIndex = 0,
            explanation = "In a weighted graph, each edge carries a number representing cost, distance, or another metric.",
            optionExplanations = listOf(
                "Correct — each edge in a weighted graph carries an associated cost or value.",
                "Incorrect — a graph with no edges has nothing to weight.",
                "Incorrect — a single-vertex graph has no edges to weight either.",
                "Incorrect — 'weighted graph' is the general term; it isn't specific to trees."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Easy"
        ),

        Question(
            id = 141,
            questionText = "What is a connected graph?",
            options = listOf("A graph where a path exists between every pair of vertices", "A graph with no edges", "A graph with only directed edges", "A graph with cycles only"),
            correctAnswerIndex = 0,
            explanation = "A connected graph has no isolated groups — every vertex can reach every other vertex through some path.",
            optionExplanations = listOf(
                "Correct — 'connected' means there's a path linking every pair of vertices.",
                "Incorrect — a graph with no edges would be disconnected (unless it has just one vertex).",
                "Incorrect — directed edges don't determine connectivity; both directed and undirected graphs can be connected.",
                "Incorrect — having cycles isn't required for a graph to be connected."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 142,
            questionText = "Which structure is commonly used to represent a graph with an adjacency list?",
            options = listOf("An array of lists, one per vertex", "A single 2D matrix always", "A binary tree", "A stack"),
            correctAnswerIndex = 0,
            explanation = "An adjacency list stores, for each vertex, a list of its directly connected neighbors.",
            optionExplanations = listOf(
                "Correct — each vertex gets its own list of neighboring vertices.",
                "Incorrect — a 2D matrix describes an adjacency matrix, a different representation.",
                "Incorrect — a binary tree is a hierarchical structure, not how adjacency lists are organized.",
                "Incorrect — a stack has no natural way to represent per-vertex neighbor relationships."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Medium"
        ),

        Question(
            id = 143,
            questionText = "What algorithm is commonly used to detect a cycle in a directed graph?",
            options = listOf("Depth-First Search with recursion stack tracking", "Binary Search", "Bubble Sort", "Linear Search"),
            correctAnswerIndex = 0,
            explanation = "DFS tracks nodes in the current recursion path; revisiting one of them indicates a cycle.",
            optionExplanations = listOf(
                "Correct — if DFS reaches a vertex already in the current recursion stack, a cycle exists.",
                "Incorrect — binary search works on sorted linear data, not graph structure.",
                "Incorrect — Bubble Sort is a sorting algorithm, unrelated to cycle detection.",
                "Incorrect — linear search just scans a list; it doesn't track traversal paths."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        Question(
            id = 144,
            questionText = "What does Kruskal's algorithm compute?",
            options = listOf("A minimum spanning tree", "The shortest path between two nodes only", "A topological sort", "A binary search tree"),
            correctAnswerIndex = 0,
            explanation = "Kruskal's algorithm greedily adds the smallest edges (avoiding cycles) to build a minimum spanning tree.",
            optionExplanations = listOf(
                "Correct — Kruskal's builds a tree connecting all vertices with the minimum possible total edge weight.",
                "Incorrect — single-pair shortest path is what algorithms like Dijkstra's or Bellman-Ford compute.",
                "Incorrect — topological sort orders vertices in a DAG, a different problem entirely.",
                "Incorrect — a binary search tree is an ordering structure for values, unrelated to spanning trees."
            ),
            topic = "Graphs",
            category = "Data Structures",
            difficulty = "Hard"
        ),

        // ===================== Sorting =====================

        Question(
            id = 61,
            questionText = "What is the goal of a sorting algorithm?",
            options = listOf("Searching data", "Arranging data in order", "Deleting data", "Storing data"),
            correctAnswerIndex = 1,
            explanation = "Sorting algorithms arrange elements in a specific order.",
            optionExplanations = listOf(
                "Incorrect — searching locates an element; it doesn't reorder data.",
                "Correct — sorting algorithms arrange elements into a specific order.",
                "Incorrect — deleting removes data; it doesn't reorder what remains.",
                "Incorrect — storing is about holding data, not arranging it."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 62,
            questionText = "Which sorting algorithm repeatedly swaps adjacent elements?",
            options = listOf("Merge Sort", "Quick Sort", "Bubble Sort", "Selection Sort"),
            correctAnswerIndex = 2,
            explanation = "Bubble Sort repeatedly swaps adjacent elements until sorted.",
            optionExplanations = listOf(
                "Incorrect — Merge Sort splits and merges subarrays; it doesn't swap adjacent pairs repeatedly.",
                "Incorrect — Quick Sort partitions around a pivot, not simple adjacent swaps.",
                "Correct — Bubble Sort repeatedly swaps adjacent out-of-order elements until sorted.",
                "Incorrect — Selection Sort swaps a found minimum into place, not adjacent pairs repeatedly."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 63,
            questionText = "Which sorting algorithm selects the smallest element each step?",
            options = listOf("Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort"),
            correctAnswerIndex = 0,
            explanation = "Selection Sort repeatedly selects the smallest element and places it in position.",
            optionExplanations = listOf(
                "Correct — Selection Sort scans for the smallest remaining element and places it each pass.",
                "Incorrect — Insertion Sort inserts each new element into place; it doesn't hunt for minimums.",
                "Incorrect — Merge Sort divides and merges; it doesn't search for a minimum each pass.",
                "Incorrect — Quick Sort partitions around a pivot, not repeated minimum selection."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 64,
            questionText = "Which sorting algorithm inserts elements into their correct position step by step?",
            options = listOf("Merge Sort", "Insertion Sort", "Quick Sort", "Heap Sort"),
            correctAnswerIndex = 1,
            explanation = "Insertion Sort places each element into its correct position in the sorted part.",
            optionExplanations = listOf(
                "Incorrect — Merge Sort divides and merges subarrays; it doesn't insert one element at a time.",
                "Correct — Insertion Sort places each new element into its correct position in the sorted part.",
                "Incorrect — Quick Sort partitions around a pivot, not step-by-step insertion.",
                "Incorrect — Heap Sort relies on a heap structure, not step-by-step insertion."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 65,
            questionText = "Which sorting algorithm follows divide-and-conquer strategy?",
            options = listOf("Bubble Sort", "Selection Sort", "Merge Sort", "Insertion Sort"),
            correctAnswerIndex = 2,
            explanation = "Merge Sort divides the array into halves and merges them after sorting.",
            optionExplanations = listOf(
                "Incorrect — Bubble Sort just makes repeated passes; it doesn't divide the problem.",
                "Incorrect — Selection Sort scans the whole remaining list each pass; it doesn't divide it.",
                "Correct — Merge Sort divides the array into halves, sorts them, then merges the results.",
                "Incorrect — Insertion Sort builds up the sorted list incrementally, not by dividing."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 66,
            questionText = "Which sorting algorithm uses a pivot element?",
            options = listOf("Merge Sort", "Quick Sort", "Bubble Sort", "Selection Sort"),
            correctAnswerIndex = 1,
            explanation = "Quick Sort partitions elements around a pivot.",
            optionExplanations = listOf(
                "Incorrect — Merge Sort splits by position, not around a chosen pivot value.",
                "Correct — Quick Sort partitions elements around a chosen pivot.",
                "Incorrect — Bubble Sort compares adjacent pairs; it has no pivot.",
                "Incorrect — Selection Sort finds a minimum each pass; it has no pivot."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 67,
            questionText = "Which sorting algorithm compares adjacent elements repeatedly until sorted?",
            options = listOf("Quick Sort", "Merge Sort", "Bubble Sort", "Heap Sort"),
            correctAnswerIndex = 2,
            explanation = "Bubble Sort repeatedly compares neighboring elements.",
            optionExplanations = listOf(
                "Incorrect — Quick Sort compares against a pivot, not just adjacent pairs.",
                "Incorrect — Merge Sort compares elements while merging, not through repeated adjacent passes.",
                "Correct — Bubble Sort repeatedly compares and swaps neighboring elements.",
                "Incorrect — Heap Sort compares elements within a heap structure, not simple adjacent passes."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 68,
            questionText = "Which sorting algorithm is efficient for small or nearly sorted arrays?",
            options = listOf("Insertion Sort", "Merge Sort", "Quick Sort", "Heap Sort"),
            correctAnswerIndex = 0,
            explanation = "Insertion Sort performs well when data is nearly sorted.",
            optionExplanations = listOf(
                "Correct — Insertion Sort does very few moves when data is already nearly in order.",
                "Incorrect — Merge Sort always does the full divide-and-merge work regardless of existing order.",
                "Incorrect — Quick Sort's overhead isn't specifically optimized for nearly sorted data.",
                "Incorrect — Heap Sort always maintains heap structure regardless of existing order."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 69,
            questionText = "Which sorting algorithm has average time complexity O(n log n)?",
            options = listOf("Bubble Sort", "Selection Sort", "Quick Sort", "Insertion Sort"),
            correctAnswerIndex = 2,
            explanation = "Quick Sort has average-case time complexity O(n log n).",
            optionExplanations = listOf(
                "Incorrect — Bubble Sort averages O(n²), not O(n log n).",
                "Incorrect — Selection Sort averages O(n²), not O(n log n).",
                "Correct — Quick Sort has average-case time complexity O(n log n).",
                "Incorrect — Insertion Sort averages O(n²), not O(n log n)."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 70,
            questionText = "Which sorting algorithm guarantees O(n log n) time complexity in all cases?",
            options = listOf("Quick Sort", "Merge Sort", "Bubble Sort", "Insertion Sort"),
            correctAnswerIndex = 1,
            explanation = "Merge Sort always runs in O(n log n) time.",
            optionExplanations = listOf(
                "Incorrect — Quick Sort can degrade to O(n²) in its worst case.",
                "Correct — Merge Sort always runs in O(n log n), regardless of the input.",
                "Incorrect — Bubble Sort runs in O(n²) in the average and worst case.",
                "Incorrect — Insertion Sort runs in O(n²) in the average and worst case."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 103,
            questionText = "What is the worst-case time complexity of Quick Sort?",
            options = listOf("O(n log n)", "O(n²)", "O(log n)", "O(n)"),
            correctAnswerIndex = 1,
            explanation = "Quick Sort degrades to O(n²) when the pivot repeatedly splits the array poorly.",
            optionExplanations = listOf(
                "Incorrect — O(n log n) is Quick Sort's average case, not its worst case.",
                "Correct — Quick Sort degrades to O(n²) when the pivot repeatedly splits the array poorly.",
                "Incorrect — O(log n) is far too fast for a sort that must process every element.",
                "Incorrect — O(n) would be unusually fast even for Quick Sort's best case."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 104,
            questionText = "Which sorting algorithm is NOT comparison-based?",
            options = listOf("Merge Sort", "Quick Sort", "Counting Sort", "Bubble Sort"),
            correctAnswerIndex = 2,
            explanation = "Counting Sort sorts by counting occurrences of values instead of comparing elements.",
            optionExplanations = listOf(
                "Incorrect — Merge Sort compares elements while merging, so it is comparison-based.",
                "Incorrect — Quick Sort compares elements against the pivot, so it is comparison-based.",
                "Correct — Counting Sort counts occurrences of values instead of comparing elements to each other.",
                "Incorrect — Bubble Sort directly compares adjacent elements, so it is comparison-based."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 145,
            questionText = "What does it mean for a sorting algorithm to be 'stable'?",
            options = listOf(
                "Equal elements keep their relative order after sorting",
                "It never crashes",
                "It sorts in O(1) time",
                "It only works on numbers"
            ),
            correctAnswerIndex = 0,
            explanation = "Stability means if two elements are equal, the one that appeared first in the input still appears first in the output.",
            optionExplanations = listOf(
                "Correct — stability preserves the original relative order of equal elements.",
                "Incorrect — reliability/crash-safety isn't what 'stable' refers to in sorting.",
                "Incorrect — stability is unrelated to time complexity.",
                "Incorrect — stability applies to sorting any comparable data, not just numbers."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 146,
            questionText = "Which of these is the simplest sorting algorithm to understand conceptually?",
            options = listOf("Bubble Sort", "Quick Sort", "Merge Sort", "Heap Sort"),
            correctAnswerIndex = 0,
            explanation = "Bubble Sort's repeated adjacent swaps make it the easiest to visualize and implement.",
            optionExplanations = listOf(
                "Correct — comparing and swapping neighbors repeatedly is the most straightforward idea among these.",
                "Incorrect — Quick Sort's partitioning logic is more involved than a simple adjacent swap.",
                "Incorrect — Merge Sort requires understanding recursive division and merging.",
                "Incorrect — Heap Sort requires understanding the heap data structure first."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 147,
            questionText = "What is the best-case time complexity of Bubble Sort on an already sorted array, with an early-exit optimization?",
            options = listOf("O(n)", "O(n log n)", "O(n²)", "O(log n)"),
            correctAnswerIndex = 0,
            explanation = "With an early-exit flag, a single pass with no swaps confirms the array is sorted in O(n).",
            optionExplanations = listOf(
                "Correct — one full pass with no swaps confirms the array is already sorted, taking O(n).",
                "Incorrect — O(n log n) doesn't apply to Bubble Sort's simple pass-based approach.",
                "Incorrect — O(n²) is Bubble Sort's average/worst case, not its optimized best case.",
                "Incorrect — a single full pass over n elements can't be done in less than O(n)."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 148,
            questionText = "Which sorting algorithm builds the final array one item at a time by comparing with previous elements?",
            options = listOf("Insertion Sort", "Quick Sort", "Merge Sort", "Heap Sort"),
            correctAnswerIndex = 0,
            explanation = "Insertion Sort takes each new element and shifts it backward past larger already-sorted elements.",
            optionExplanations = listOf(
                "Correct — each new element is inserted into its correct spot by comparing with the sorted prefix.",
                "Incorrect — Quick Sort partitions around a pivot, not one-at-a-time comparisons with prior elements.",
                "Incorrect — Merge Sort divides and merges, rather than building up one element at a time.",
                "Incorrect — Heap Sort extracts elements from a heap, not by comparing to previous array entries."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 149,
            questionText = "What is the time and space complexity of Merge Sort?",
            options = listOf(
                "O(n log n) time, O(n) space",
                "O(n log n) time, O(1) space",
                "O(n²) time, O(n) space",
                "O(n) time, O(n) space"
            ),
            correctAnswerIndex = 0,
            explanation = "Merge Sort always runs in O(n log n) time but needs O(n) extra space for merging.",
            optionExplanations = listOf(
                "Correct — Merge Sort guarantees O(n log n) time but needs O(n) auxiliary space to merge subarrays.",
                "Incorrect — merging subarrays requires extra O(n) space; it isn't done in-place with O(1) space.",
                "Incorrect — Merge Sort's time complexity is O(n log n), not the slower O(n²).",
                "Incorrect — O(n) time would be too fast for a comparison-based sort of n elements."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 150,
            questionText = "Why is Heap Sort useful despite being slower in practice than Quick Sort on average?",
            options = listOf(
                "It guarantees O(n log n) worst case with O(1) extra space",
                "It is always stable",
                "It works only on linked lists",
                "It requires no comparisons"
            ),
            correctAnswerIndex = 0,
            explanation = "Heap Sort trades average-case speed for a guaranteed O(n log n) worst case using only constant extra space.",
            optionExplanations = listOf(
                "Correct — unlike Quick Sort's O(n²) worst case, Heap Sort guarantees O(n log n) with minimal extra memory.",
                "Incorrect — Heap Sort is not stable; equal elements can be reordered during heapify operations.",
                "Incorrect — Heap Sort works on array-based heaps, not specifically on linked lists.",
                "Incorrect — Heap Sort is comparison-based; it needs comparisons to maintain the heap property."
            ),
            topic = "Sorting",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        // ===================== Searching =====================

        Question(
            id = 71,
            questionText = "What is the goal of a searching algorithm?",
            options = listOf("Arrange data", "Find an element in data", "Delete data", "Sort data"),
            correctAnswerIndex = 1,
            explanation = "Searching algorithms locate a target element in a dataset.",
            optionExplanations = listOf(
                "Incorrect — arranging data describes sorting, not searching.",
                "Correct — searching algorithms locate a target element within a dataset.",
                "Incorrect — deleting removes data; it doesn't locate anything.",
                "Incorrect — sorting reorders data; that's a different goal from searching."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 72,
            questionText = "Which searching algorithm checks elements one by one?",
            options = listOf("Binary Search", "Linear Search", "Merge Search", "Quick Search"),
            correctAnswerIndex = 1,
            explanation = "Linear Search checks each element sequentially until found.",
            optionExplanations = listOf(
                "Incorrect — Binary Search jumps to the middle and skips half the data, not one by one.",
                "Correct — Linear Search checks each element sequentially until it finds the target.",
                "Incorrect — 'Merge Search' isn't a standard searching algorithm name.",
                "Incorrect — 'Quick Search' isn't a standard searching algorithm name."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 73,
            questionText = "Which searching algorithm requires sorted data?",
            options = listOf("Linear Search", "Binary Search", "DFS", "BFS"),
            correctAnswerIndex = 1,
            explanation = "Binary Search requires sorted data to divide the search space.",
            optionExplanations = listOf(
                "Incorrect — Linear Search works on data in any order.",
                "Correct — Binary Search requires sorted data to safely skip half the search space each step.",
                "Incorrect — DFS traverses graph/tree structures; it doesn't require sorted data.",
                "Incorrect — BFS traverses graph/tree structures; it doesn't require sorted data."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 74,
            questionText = "Which searching algorithm divides the search space into halves?",
            options = listOf("Linear Search", "Binary Search", "DFS", "BFS"),
            correctAnswerIndex = 1,
            explanation = "Binary Search halves the search space each step.",
            optionExplanations = listOf(
                "Incorrect — Linear Search scans one element at a time, without dividing anything.",
                "Correct — Binary Search halves the search space at each comparison.",
                "Incorrect — DFS explores paths deeply; it doesn't halve a sorted range.",
                "Incorrect — BFS explores level by level; it doesn't halve a sorted range."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 75,
            questionText = "What is the time complexity of Linear Search in the worst case?",
            options = listOf("O(1)", "O(log n)", "O(n)", "O(n log n)"),
            correctAnswerIndex = 2,
            explanation = "Linear Search checks all elements in worst case.",
            optionExplanations = listOf(
                "Incorrect — O(1) would mean no scanning is needed at all.",
                "Incorrect — O(log n) applies to searches like Binary Search that can skip elements.",
                "Correct — in the worst case, Linear Search checks every element.",
                "Incorrect — O(n log n) is a sorting-level complexity, not a single linear scan."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 76,
            questionText = "What is the time complexity of Binary Search in the worst case?",
            options = listOf("O(n)", "O(log n)", "O(n²)", "O(1)"),
            correctAnswerIndex = 1,
            explanation = "Binary Search halves search space each step.",
            optionExplanations = listOf(
                "Incorrect — O(n) describes Linear Search, not the more efficient Binary Search.",
                "Correct — Binary Search halves the search space each step, giving O(log n).",
                "Incorrect — O(n²) would be far worse than what Binary Search needs.",
                "Incorrect — O(1) would mean no comparisons are needed, which isn't realistic in general."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 77,
            questionText = "Which searching algorithm is faster for large sorted datasets?",
            options = listOf("Linear Search", "Binary Search", "DFS", "BFS"),
            correctAnswerIndex = 1,
            explanation = "Binary Search reduces search space by half each step.",
            optionExplanations = listOf(
                "Incorrect — Linear Search's O(n) scan is slower than Binary Search on large sorted data.",
                "Correct — Binary Search reduces the search space by half each step, making it much faster.",
                "Incorrect — DFS is a traversal technique for graphs/trees, not a search over sorted arrays.",
                "Incorrect — BFS is a traversal technique for graphs/trees, not a search over sorted arrays."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 78,
            questionText = "Which searching algorithm works even if data is unsorted?",
            options = listOf("Binary Search", "Linear Search", "Tree Search", "Graph Search"),
            correctAnswerIndex = 1,
            explanation = "Linear Search works on both sorted and unsorted data.",
            optionExplanations = listOf(
                "Incorrect — Binary Search relies on sorted data to work correctly.",
                "Correct — Linear Search simply checks each element, so order doesn't matter.",
                "Incorrect — 'Tree Search' generally relies on an ordered structure like a BST to be efficient.",
                "Incorrect — 'Graph Search' isn't relevant to searching a simple unsorted list."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 79,
            questionText = "Where does Binary Search start checking first?",
            options = listOf("First element", "Last element", "Middle element", "Random element"),
            correctAnswerIndex = 2,
            explanation = "Binary Search starts at the middle to divide search space.",
            optionExplanations = listOf(
                "Incorrect — starting at the first element describes Linear Search, not Binary Search.",
                "Incorrect — Binary Search doesn't start from the end either.",
                "Correct — Binary Search starts at the middle to divide the search space in half.",
                "Incorrect — Binary Search follows a deterministic middle-based strategy, not a random one."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 80,
            questionText = "Why is Binary Search more efficient than Linear Search?",
            options = listOf("Uses recursion", "Works without sorting", "Reduces search space by half each step", "Checks elements randomly"),
            correctAnswerIndex = 2,
            explanation = "Binary Search halves the search space each step.",
            optionExplanations = listOf(
                "Incorrect — Binary Search can be implemented iteratively too; recursion isn't the reason.",
                "Incorrect — Binary Search actually requires sorted data to work correctly.",
                "Correct — halving the search space each step is what gives Binary Search its speed advantage.",
                "Incorrect — Binary Search follows a deterministic middle-based strategy, not a random one."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 105,
            questionText = "What is the space complexity of a recursive Binary Search due to the call stack?",
            options = listOf("O(1)", "O(log n)", "O(n)", "O(n log n)"),
            correctAnswerIndex = 1,
            explanation = "Each recursive call adds a stack frame, and Binary Search recurses O(log n) times.",
            optionExplanations = listOf(
                "Incorrect — O(1) describes the iterative version; the recursive version adds stack frames.",
                "Correct — each recursive call adds a stack frame, and Binary Search recurses O(log n) times.",
                "Incorrect — O(n) would be far more stack usage than Binary Search's logarithmic recursion depth.",
                "Incorrect — O(n log n) is a time complexity for some sorts, not this recursion's space usage."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 106,
            questionText = "Which searching technique gives O(1) average-case lookup?",
            options = listOf("Linear Search", "Binary Search", "Hash table lookup", "Depth-First Search"),
            correctAnswerIndex = 2,
            explanation = "Hash tables compute a direct index from the key, giving O(1) average-case lookup.",
            optionExplanations = listOf(
                "Incorrect — Linear Search takes O(n) on average, not O(1).",
                "Incorrect — Binary Search takes O(log n), not O(1).",
                "Correct — hash tables compute a direct index from the key, giving O(1) average-case lookup.",
                "Incorrect — DFS explores a graph/tree structure, not a direct-lookup structure."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 151,
            questionText = "What must be true before you can run Binary Search on a list?",
            options = listOf("The list must be sorted", "The list must be a linked list", "The list must have unique values", "The list must be an array of numbers"),
            correctAnswerIndex = 0,
            explanation = "Binary Search relies on order to safely eliminate half the remaining elements each step.",
            optionExplanations = listOf(
                "Correct — without sorted order, halving the search space could skip right over the target.",
                "Incorrect — Binary Search actually needs random access, which linked lists don't provide efficiently.",
                "Incorrect — duplicate values don't prevent Binary Search from working.",
                "Incorrect — Binary Search works on any comparable data type, not just numbers."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 152,
            questionText = "What does a searching algorithm return if the target is not found?",
            options = listOf("An indicator like -1 or 'not found'", "Always 0", "An error that crashes the program", "The last element"),
            correctAnswerIndex = 0,
            explanation = "A well-designed search returns a clear signal, such as -1 or null, when nothing matches.",
            optionExplanations = listOf(
                "Correct — returning a sentinel value like -1 clearly signals that no match was found.",
                "Incorrect — returning 0 would be ambiguous with a valid result at index 0.",
                "Incorrect — a well-designed search shouldn't crash; it should return a clear 'not found' result.",
                "Incorrect — returning the last element would incorrectly suggest a match was found."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 153,
            questionText = "How many comparisons does Binary Search need in the worst case for 1,000 elements (approximately)?",
            options = listOf("About 10", "About 500", "About 1000", "About 1"),
            correctAnswerIndex = 0,
            explanation = "Binary Search needs about log2(n) comparisons; log2(1000) is approximately 10.",
            optionExplanations = listOf(
                "Correct — log2(1000) ≈ 10, matching Binary Search's logarithmic comparison count.",
                "Incorrect — checking half the list on average describes Linear Search, not Binary Search.",
                "Incorrect — checking all 1000 elements would describe Linear Search's worst case.",
                "Incorrect — 1 comparison would only work if the target happened to be exactly in the middle."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 154,
            questionText = "What is 'interpolation search' an improvement on?",
            options = listOf(
                "Binary Search, by estimating position based on value distribution",
                "Linear Search, by removing loops",
                "Bubble Sort",
                "Hashing"
            ),
            correctAnswerIndex = 0,
            explanation = "Interpolation search estimates where the target likely is (like flipping to a dictionary page) instead of always checking the exact middle.",
            optionExplanations = listOf(
                "Correct — it refines Binary Search's 'check the middle' rule into 'estimate the likely position'.",
                "Incorrect — the idea targets estimating position within sorted data, not removing loops from Linear Search.",
                "Incorrect — Bubble Sort is a sorting algorithm, unrelated to interpolation search.",
                "Incorrect — hashing computes a direct index from a key; it isn't what interpolation search improves on."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 155,
            questionText = "What is the average-case time complexity of searching in a balanced Binary Search Tree?",
            options = listOf("O(log n)", "O(n)", "O(1)", "O(n log n)"),
            correctAnswerIndex = 0,
            explanation = "A balanced BST halves the remaining candidates at each level, similar to Binary Search.",
            optionExplanations = listOf(
                "Correct — a balanced tree's height stays around log n, so search takes O(log n) on average.",
                "Incorrect — O(n) would describe an unbalanced (skewed) tree, not a balanced one.",
                "Incorrect — O(1) would mean no traversal at all, which a tree search still requires.",
                "Incorrect — O(n log n) is a sorting-level complexity, not a single tree search."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 156,
            questionText = "Why can hash table lookups degrade to O(n) in the worst case?",
            options = listOf("Too many keys collide into the same bucket", "The table is too small physically", "Keys are always sorted", "Hashing never fails"),
            correctAnswerIndex = 0,
            explanation = "If many keys hash to the same bucket, that bucket becomes a list that must be scanned linearly.",
            optionExplanations = listOf(
                "Correct — heavy collisions turn a bucket into a long list that must be searched linearly.",
                "Incorrect — physical table size alone doesn't cause O(n) lookups; poor hash distribution does.",
                "Incorrect — hash tables don't require sorted keys at all.",
                "Incorrect — hash functions can absolutely produce collisions, which is exactly the cause here."
            ),
            topic = "Searching",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        // ===================== Recursion =====================

        Question(
            id = 81,
            questionText = "What is recursion?",
            options = listOf("Repeating loops only", "A function calling another function", "A function calling itself", "Sorting data"),
            correctAnswerIndex = 2,
            explanation = "Recursion occurs when a function calls itself to solve smaller subproblems.",
            optionExplanations = listOf(
                "Incorrect — loops and recursion are different control structures, though they can solve similar problems.",
                "Incorrect — calling a different function is just a normal function call, not recursion.",
                "Correct — recursion happens when a function calls itself to solve smaller subproblems.",
                "Incorrect — sorting is a task; recursion is a technique that can be used to implement it."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 82,
            questionText = "What is required to stop recursion?",
            options = listOf("Loop condition", "Base case", "Stack overflow", "Return type"),
            correctAnswerIndex = 1,
            explanation = "A base case stops recursion and prevents infinite calls.",
            optionExplanations = listOf(
                "Incorrect — a loop condition controls loops, not recursive calls.",
                "Correct — a base case gives recursion a condition to stop calling itself.",
                "Incorrect — a stack overflow is what happens when recursion fails to stop, not what stops it correctly.",
                "Incorrect — a return type just defines what a function returns; it doesn't control termination."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 83,
            questionText = "What happens if recursion has no base case?",
            options = listOf("Faster execution", "Infinite recursion", "Sorted output", "Queue formation"),
            correctAnswerIndex = 1,
            explanation = "Without a base case recursion continues until stack overflow.",
            optionExplanations = listOf(
                "Incorrect — missing a base case causes runaway calls, not faster execution.",
                "Correct — without a base case, the function keeps calling itself until the stack overflows.",
                "Incorrect — recursion without a base case doesn't sort anything; it just keeps calling.",
                "Incorrect — recursion uses a call stack, not a queue."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 84,
            questionText = "Recursion mainly uses which data structure internally?",
            options = listOf("Queue", "Stack", "Tree", "Array"),
            correctAnswerIndex = 1,
            explanation = "Recursive calls are stored in the call stack.",
            optionExplanations = listOf(
                "Incorrect — recursion doesn't use FIFO ordering, so it isn't a queue.",
                "Correct — recursive calls are stored in the call stack, with LIFO order matching how calls return.",
                "Incorrect — a tree can represent call relationships conceptually, but the actual mechanism is a stack.",
                "Incorrect — recursion doesn't require indexed storage like an array."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 85,
            questionText = "Which problem is commonly solved using recursion?",
            options = listOf("Printing array once", "Factorial calculation", "Queue insertion", "Stack push"),
            correctAnswerIndex = 1,
            explanation = "Factorial is a classic example where each step depends on the previous result.",
            optionExplanations = listOf(
                "Incorrect — printing an array once is a simple linear task that doesn't need recursion.",
                "Correct — factorial is a classic example where each step depends on the previous result.",
                "Incorrect — queue insertion is a single O(1) operation, not naturally recursive.",
                "Incorrect — stack push is a single O(1) operation, not naturally recursive."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 86,
            questionText = "What is the base case of factorial recursion?",
            options = listOf("factorial(n−1)", "factorial(0) = 1", "factorial(n+1)", "factorial(n²)"),
            correctAnswerIndex = 1,
            explanation = "Factorial recursion stops at factorial(0) = 1.",
            optionExplanations = listOf(
                "Incorrect — factorial(n−1) is the recursive step, not the stopping condition.",
                "Correct — factorial recursion stops at factorial(0) = 1.",
                "Incorrect — factorial(n+1) would move away from the base case, not toward it.",
                "Incorrect — factorial(n²) isn't part of the standard factorial recursion at all."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 87,
            questionText = "What happens in each recursive step?",
            options = listOf("Problem becomes larger", "Problem stays same", "Problem is divided into smaller subproblems", "Program stops immediately"),
            correctAnswerIndex = 2,
            explanation = "Each recursive call solves a smaller version of the problem.",
            optionExplanations = listOf(
                "Incorrect — a growing problem would never reach a base case.",
                "Incorrect — an unchanging problem would also never terminate.",
                "Correct — each recursive call works on a smaller version of the original problem.",
                "Incorrect — the program only stops once the base case is reached, not at every step."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 88,
            questionText = "Which condition ensures recursion eventually stops?",
            options = listOf("Increasing input size", "Removing return statement", "Reaching the base case", "Using iteration"),
            correctAnswerIndex = 2,
            explanation = "Recursion stops when execution reaches the base case.",
            optionExplanations = listOf(
                "Incorrect — an increasing input would move further from stopping, not closer.",
                "Incorrect — removing the return statement would break the function, not guarantee termination.",
                "Correct — recursion stops once execution reaches the base case.",
                "Incorrect — iteration is an alternative to recursion, not a condition within it."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 89,
            questionText = "What mainly determines recursion space complexity?",
            options = listOf("Loop condition", "Array size", "Depth of recursive calls", "Sorting method"),
            correctAnswerIndex = 2,
            explanation = "Space complexity depends on recursion depth stored in stack.",
            optionExplanations = listOf(
                "Incorrect — loop conditions apply to loops, not the recursive call stack.",
                "Incorrect — array size isn't directly what determines stack usage in recursion.",
                "Correct — each active call adds a stack frame, so space depends on how deep recursion goes.",
                "Incorrect — sorting method is unrelated to how recursion uses stack space."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 90,
            questionText = "Why can deep recursion cause stack overflow?",
            options = listOf("Too many loops", "Too many variables", "Too many function calls stored in stack", "Missing arrays"),
            correctAnswerIndex = 2,
            explanation = "Each recursive call uses stack memory and too many calls exceed stack capacity.",
            optionExplanations = listOf(
                "Incorrect — loops don't add stack frames the way recursive calls do.",
                "Incorrect — a few extra variables per call aren't what exhausts the stack; the call count is.",
                "Correct — each unfinished recursive call sits on the stack, and too many exceed its capacity.",
                "Incorrect — missing arrays has nothing to do with stack overflow from recursion."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 107,
            questionText = "Which of these problems is naturally suited to a recursive solution?",
            options = listOf("Traversing a binary tree", "Reading a single integer", "Printing a fixed string", "Adding two numbers"),
            correctAnswerIndex = 0,
            explanation = "Tree traversal naturally breaks into smaller subtrees, making recursion a natural fit.",
            optionExplanations = listOf(
                "Correct — each subtree can be processed the same way as the whole tree, a natural fit for recursion.",
                "Incorrect — reading one integer is a single, non-repeating operation with no natural subproblem.",
                "Incorrect — printing a fixed string is a single operation, not a repeating subproblem.",
                "Incorrect — adding two numbers is a single operation with no smaller version of itself to recurse into."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 108,
            questionText = "What is 'tail recursion'?",
            options = listOf(
                "A recursive call that is the last operation in the function",
                "A function with no base case",
                "A recursive call made at the start of a function",
                "A loop disguised as recursion"
            ),
            correctAnswerIndex = 0,
            explanation = "In tail recursion the recursive call is the final action, which some compilers can optimize to avoid growing the call stack.",
            optionExplanations = listOf(
                "Correct — in tail recursion, the recursive call is the final action taken.",
                "Incorrect — a missing base case causes infinite recursion, a bug, not what defines 'tail' recursion.",
                "Incorrect — a call at the very start, before other work, is not what 'tail' refers to.",
                "Incorrect — tail recursion is still genuine recursion, not a disguised loop."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 157,
            questionText = "What is an example of a recursive definition?",
            options = listOf("Factorial: n! = n × (n−1)!", "A for loop", "A fixed constant", "A print statement"),
            correctAnswerIndex = 0,
            explanation = "Factorial defines each value in terms of a smaller instance of itself, which is the essence of recursion.",
            optionExplanations = listOf(
                "Correct — n! is defined in terms of (n−1)!, referencing a smaller version of itself.",
                "Incorrect — a for loop is an iterative construct, not a self-referential definition.",
                "Incorrect — a fixed constant doesn't reference itself or change with input.",
                "Incorrect — a print statement is a single action, not a self-referential definition."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 158,
            questionText = "What is returned first when unwinding a recursive call stack?",
            options = listOf("The most recently called function's result", "The first called function's result", "Nothing is returned", "All results at once"),
            correctAnswerIndex = 0,
            explanation = "The call stack unwinds in LIFO order, so the most recent (innermost) call finishes and returns first.",
            optionExplanations = listOf(
                "Correct — the last call made is the first to complete and return, following LIFO order.",
                "Incorrect — the first call made is the outermost one and finishes last, after nested calls return.",
                "Incorrect — every completed call does return a result up the chain.",
                "Incorrect — results return one at a time, as each call finishes, not simultaneously."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Easy"
        ),

        Question(
            id = 159,
            questionText = "What is 'indirect recursion'?",
            options = listOf(
                "When function A calls function B, which calls function A again",
                "When a function calls itself directly",
                "When there is no base case",
                "When recursion uses a loop instead"
            ),
            correctAnswerIndex = 0,
            explanation = "Indirect recursion happens when the recursive cycle passes through one or more other functions before returning to the original.",
            optionExplanations = listOf(
                "Correct — the recursive cycle goes through another function (B) before returning to A.",
                "Incorrect — a function calling itself directly is 'direct' recursion, the opposite of 'indirect'.",
                "Incorrect — a missing base case is a separate bug, not what makes recursion 'indirect'.",
                "Incorrect — using a loop instead of a function call wouldn't be recursion at all."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 160,
            questionText = "Which classic problem is often solved with recursion and demonstrates exponential time complexity if not optimized?",
            options = listOf("Naive Fibonacci calculation", "Linear search", "Array traversal", "Printing a list"),
            correctAnswerIndex = 0,
            explanation = "Naive recursive Fibonacci recomputes the same subproblems repeatedly, leading to exponential time unless memoized.",
            optionExplanations = listOf(
                "Correct — without memoization, naive recursive Fibonacci repeats the same calculations exponentially.",
                "Incorrect — linear search runs in O(n), not exponential time.",
                "Incorrect — array traversal runs in O(n), not exponential time.",
                "Incorrect — printing a list runs in O(n), not exponential time."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Medium"
        ),

        Question(
            id = 161,
            questionText = "What technique avoids recomputation in recursive algorithms like Fibonacci by storing previous results?",
            options = listOf("Memoization", "Sorting", "Hashing without storage", "Looping only"),
            correctAnswerIndex = 0,
            explanation = "Memoization caches results of expensive calls so repeated subproblems are looked up instead of recomputed.",
            optionExplanations = listOf(
                "Correct — memoization stores previously computed results so they can be reused instead of recalculated.",
                "Incorrect — sorting reorders data; it doesn't address repeated recursive computation.",
                "Incorrect — 'hashing without storage' contradicts itself — storing results is exactly the fix here.",
                "Incorrect — switching to a loop can help, but it doesn't describe this storing-results technique."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Hard"
        ),

        Question(
            id = 162,
            questionText = "What can happen if a recursive function's base case is reachable but the recursive step doesn't move toward it?",
            options = listOf("Infinite recursion and eventual stack overflow", "Faster execution", "Automatic optimization", "No effect"),
            correctAnswerIndex = 0,
            explanation = "If each call doesn't progress toward the base case, the function keeps calling itself indefinitely.",
            optionExplanations = listOf(
                "Correct — without genuine progress toward the base case, calls pile up until the stack overflows.",
                "Incorrect — endless extra calls make execution slower and eventually crash it, not faster.",
                "Incorrect — the runtime doesn't automatically fix a logic error like this.",
                "Incorrect — this is a serious bug that will cause a crash, not something with no effect."
            ),
            topic = "Recursion",
            category = "Algorithms",
            difficulty = "Hard"
        )
    )
}
