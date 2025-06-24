<h1> Selection Sort </h1>

<i> Selection Sort is a comparison-based sorting algorithm. It sorts an array by repeatedly selecting the smallest (or largest) element from the unsorted portion and swapping it with the first unsorted element. This process continues until the entire array is sorted.
</i>

First we find the smallest element and swap it with the first element. This way we get the smallest element at its
correct position.
Then we find the smallest among remaining elements (or second smallest) and swap it with the second element.
We keep doing this until we get all elements moved to correct position.



<h2>Complexity Analysis of Selection Sort</h2> <br>
Time Complexity: <strong> O(n2) </strong> , as there are two nested loops:

One loop to select an element of Array one by one = O(n)<br>
Another loop to compare that element with every other Array element = O(n)<br>
Therefore overall complexity = O(n) * O(n) = O(n*n) = O(n2)<br>
Auxiliary Space: O(1) as the only extra memory used is for temporary variables.<br>

<h3>Advantages of Selection Sort</h3><br>
Easy to understand and implement, making it ideal for teaching basic sorting concepts.<br>
Requires only a constant O(1) extra memory space.<br>
It requires less attempt of swaps (or memory writes) compared to many other standard algorithms. Only cycle sort beats it in terms of memory writes. Therefore it can be simple algorithm choice when memory writes are costly.<br>
Disadvantages of the Selection Sort has a time complexity of O(n^2) makes it slower compared to algorithms like Quick Sort or Merge Sort.<br>
Does not maintain the relative order of equal elements which means it is not stable.<br>


<h3>Applications of Selection Sort</h3><br>
Perfect for teaching fundamental sorting mechanisms and algorithm design.<br>
Suitable for small lists where the overhead of more complex algorithms isn’t justified and memory writing is costly as it requires less memory writes compared to other standard sorting algorithms.<br>
Heap Sort algorithm is based on Selection Sort.<br>


<h2>Frequently Asked Questions (FAQs) on Selection Sort<br> </h2>
<br>
    
    Question 1: Is Selection Sort a stable sorting algorithm?<br>
    Answer: No, Selection Sort is not stable as it may change the relative order of equal elements.


    Question 2: What is the time complexity of Selection Sort?

    Answer: Selection Sort has a time complexity of O(n^2) in the best, average, and worst cases.


    Question 3: Does Selection Sort require extra memory?


    Answer: No, Selection Sort is an in-place sorting algorithm and requires only O(1) additional space.


    Question 4: When is it best to use Selection Sort?

    Answer: Selection Sort is best used for small datasets, educational purposes, or when memory usage needs to be minimal.


    Question 5: How does Selection Sort differ from Bubble Sort?

    Answer: Selection Sort selects the minimum element and places it in the correct position with fewer swaps, while Bubble Sort repeatedly swaps adjacent elements to sort the array.


