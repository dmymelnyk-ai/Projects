# Questions.md

### 1. Why are arrays more convenient than 100 separate variables?

An array stores many values under one name. We can access each value using its index. This is easier than creating many separate variables.

### 2. What is an index, and why does an index out of bounds error occur?

An index is the position of an element in an array. In Java, indexing starts at 0. An index out of bounds error occurs when we try to access an element outside the array.

### 3. Why is the size of an array fixed?

In Java, an ordinary array has a fixed size that is set when it is created. If we need a different size, we can create a new array or use an ArrayList.

### 4. Why can traversing a two-dimensional array by rows be faster than by columns?

In Java, a two-dimensional array consists of separate arrays for each row. Accessing elements in sequence along a row can use the processor cache more efficiently.

### 5. Why does array indexing start at zero?

An index represents the offset from the beginning of an array. The first element has an offset of 0, the second has an offset of 1, and so on.

### 6. Why is adding an element to the end usually easier than adding it to the beginning?

An ordinary Java array has a fixed size, so we cannot directly add an element to it. With an ArrayList, adding to the end is usually faster, while adding to the beginning requires shifting other elements.
