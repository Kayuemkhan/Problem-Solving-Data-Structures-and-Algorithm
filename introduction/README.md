> Introduction of DS And algo.
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
  <h1>Analysis of algorithm:</h1>
  <p>
    <strong>CP</strong> Combines two topics. 
    <br>
    1. The design of Algorithms<br>
    2. The implementation of Algorithms.

    Design -> Problem solving & mathematical thinking
<br>

    Implementation -> Write codes to implement the logics.
<br>

    Complexity analysis is defined as a technique to characterise the time taken by an 
    algorithm with respect to input size (independent from the machine, language and compiler). 
    It is used for evaluating the variations of execution time on different algorithms.

<br>

    What is the need for Complexity Analysis?
    1. Complexity Analysis determines the amount of time and space resources required 
    to execute it.
    2. It is used for comparing different algorithms on different input sizes.
    3. Complexity helps to determine the difficulty of a problem.
    often measured by how much time and space (memory) it takes to solve a particular problem

<h2>Orders of growth:</h2>
<p>
  The order of growth of an algorithm is an approximation of the <strong>time required to run a computer program as the input size increases.</strong> The order of growth ignores the constant factor needed for fixed operations and focuses instead on the operations that increase proportional to input size. For example, a program with a linear order of growth generally requires double the time if the input doubles.
  <br>

The order of growth is often described using either Big-Theta or Big-O notation, but that notation is out of scope for
this course.

</p>

<p>This table summarizes the most common orders of growth:</p>




<div class="table-responsive">
<table class="table table-bordered">

  <tr>
    <th>Order</th>
    <th>Big-Theta</th>
    <th>Example</th>
  </tr>
  <tr>
    <td>Constant</td>
    <td>Θ(1)</td>
    <td>Indexing an item in a list</td>
  </tr>
  <tr>
    <td>Logarithmic</td>
    <td>Θ(lg N)</td>
    <td>Repeatedly halving a number</td>
  </tr>
  <tr>
    <td>Linear</td>
    <td>Θ(n)</td>
    <td>Summing a list</td>
  </tr>
  <tr>
    <td>Quadratic</td>
    <td>Θ(n^2)</td>
    <td>Summing each pair of numbers in a list</td>
  </tr>
  <tr>
    <td>Exponential</td>
    <td>Θ(2^n)</td>
    <td>Visiting each node in  a binary tree</td>
  </tr>


</table>
</div>

<strong>The growths of some algorithms, such as those with orders O(2^n) and O(n!) in particular, are known to be
explosive</strong>
<br><br>

<h2>Constant time</h2>
When an algorithm has a constant order of growth, it means that it always takes a fixed number of steps, <strong>no matter how large the input size increases.</strong>
  
    first_post = posts[0]


<div class="table-responsive">
<table class="table table-bordered">

  <tr>
    <th>List size</th>
    <th>Steps</th>
  </tr>
  <tr>
    <td>1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>10</td>
    <td>1</td>
  </tr>
  <tr>
    <td>100</td>
    <td>1</td>
  </tr>
  <tr>
    <td>1000</td>
    <td>1</td>
  </tr>

</table>
</div>
<strong> <i>Even if the list grows to be a million items long, that operation will always require a single step.</i> </strong>

<strong>Graphical View</strong>

<img src="https://i.imgur.com/pZezyrD.png" >


<h2> Logarithmic time </h2>
When an algorithm has a logarithmic order of growth, it increases proportionally to the logarithm of the input size.

<strong>What is a logarithm?</strong>
<div class="paragraph">Logarithms are another way of thinking about exponents.</div>
The algorithm uses a loop to look at multiple items in the list, but crucially, it does not look at every item in the list. Specifically, it looks at lg2(n) items, where n is the number of items in the list.

   <div class="table-responsive">
          <table class="table table-bordered">
  <tr>
    <th>List size</th>
    <th>Steps</th>
  </tr>
  <tr>
    <td>1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>10</td>
    <td>4</td>
  </tr>
  <tr>
    <td>100</td>
    <td>7</td>
  </tr>
  <tr>
    <td>1000</td>
    <td>10</td>
  </tr>

</table>
</div>


<img src="https://i.imgur.com/vIUXNHS.png" >


<h2> Linear Time </h2>

When an algorithm has a linear order of growth, its number of steps increases in direct proportion to the input size.
The aptly-named linear search algorithm runs in linear time.


<div class="table-responsive">
<table class="table table-bordered">

  <tr>
    <th>List size</th>
    <th>Steps</th>
  </tr>
  <tr>
    <td>1</td>
    <td>1</td>
  </tr>
  <tr>
    <td>10</td>
    <td>10</td>
  </tr>
  <tr>
    <td>100</td>
    <td>100</td>
  </tr>
  <tr>
    <td>1000</td>
    <td>1000</td>
  </tr>

</table>
</div>

This time, the loop looks at every item in the list. This exhaustive search is necessary to search for items in an unsorted list, since there's no way to narrow down where a particular item might be. This algorithm will always require at least as many steps as items in the list.

<img src="https://i.imgur.com/nl9Cvez.png">

<h1>Quadratic time</h1>
When an algorithm has a quadratic order of growth, its steps increase in proportion to the input size squared.


<div class="table-responsive">
<table class="table table-bordered">

  <tr>
    <th>Digits</th>
    <th>Steps</th>
  </tr>
  <tr>
    <td>1</td>
    <td>10</td>
  </tr>
  <tr>
    <td>2</td>
    <td>100</td>
  </tr>
  <tr>
    <td>3</td>
    <td>1000</td>
  </tr>
  <tr>
    <td>4</td>
    <td>10000</td>
  </tr>
  <tr>
    <td>5</td>
    <td>100000</td>
  </tr>

</table>
</div>

<img src="https://i.imgur.com/S46rX16.png">

<strong>All together now </strong>

<img src="https://i.imgur.com/8psl4kk.png" alt="img">

<strong > N.B. :Data & Pictures collected from <a href="https://cs61a.org/study-guide/orders-of-growth/" >Link</a> </strong>

<h2>Asymptotic Notation and Analysis (Based on input size) in Complexity Analysis of Algorithms </h2>
Asymptotic Analysis is defined as the big idea that handles the above issues in analyzing algorithms. In Asymptotic Analysis, we evaluate the performance of an algorithm in terms of input size (we don’t measure the actual running time). We calculate, how the time (or space) taken by an algorithm increases with the input size.
<br>

Asymptotic notation is a way to describe the running time or space complexity of an algorithm based on the input size. It is commonly used in complexity analysis to describe how an algorithm performs as the size of the input grows. The three most commonly used notations are Big O, Omega, and Theta.

<br>

<strong>Big O notation (O)</strong>: This notation provides an upper bound on the growth rate of an algorithm’s running time or space usage. It represents the worst-case scenario, i.e., the maximum amount of time or space an algorithm may need to solve a problem. For example, if an algorithm’s running time is O(n), then it means that the running time of the algorithm increases linearly with the input size n or less.

<strong>Omega notation (?)</strong>: This notation provides a lower bound on the growth rate of an algorithm’s running time or space usage. It represents the best-case scenario, i.e., the minimum amount of time or space an algorithm may need to solve a problem. For example, if an algorithm’s running time is ?(n), then it means that the running time of the algorithm increases linearly with the input size n or more.

<strong>Theta notation (?) </strong>: This notation provides both an upper and lower bound on the growth rate of an algorithm’s running time or space usage. It represents the average-case scenario, i.e., the amount of time or space an algorithm typically needs to solve a problem. For example, if an algorithm’s running time is ?(n), then it means that the running time of the algorithm increases linearly with the input size n.

long start = System.currentTimeMillis( ); // record the starting time
/? (run the algorithm) ?/

long end = System.currentTimeMillis( ); // record the ending time

long elapsed = end ? start; //Total time elapsed

Measuring elapsed time  provides a reasonable reflection of an algorithm’s efficiency

<strong>let us say:</strong>

we run the Linear Search on a fast computer A and
Binary Search on a slow computer B and
pick the constant values for the two computers so that it tells us exactly how long it takes for the given machine to perform the search in seconds.

Let’s say the constant for A is 0.2 and the constant for B is 1000 which means that A is 5000 times more powerful than B.

For small values of input array size n, the fast computer may take less time.

But, after a certain value of input array size, the Binary Search will definitely start taking less time compared to the Linear Search even though the Binary Search is being run on a slow machine.

<table>
<thead>
<tr>
<th>Input Size</th>
<th>Running time on A</th>
<th>Running time on B</th>
</tr>
</thead>
<tbody>
<tr>
<th>10</th>
<td>2 sec</td>
<td>~ 1 h&nbsp;</td>
</tr>
<tr>
<th>100</th>
<td>20 sec</td>
<td>~ 1.8 h</td>
</tr>
<tr>
<th>10^6&nbsp;</th>
<td>~ 55.5 h</td>
<td>~ 5.5 h</td>
</tr>
<tr>
<th>10^9</th>
<td>~ 6.3 years&nbsp;</td>
<td>~ 8.3 h</td>
</tr>
</tbody>
</table>

<h1>How to Analyse Loops for Complexity Analysis of Algorithms</h1>

The analysis of loops for the complexity analysis of algorithms involves finding the number of operations performed by a loop as a function of the input size. This is usually done by determining the number of iterations of the loop and the number of operations performed in each iteration.

<strong> Constant Time Complexity O(1):</strong>
The time complexity of a function (or set of statements) is considered as O(1) if it doesn’t contain a loop, recursion, and call to any other non-constant time function. 
 i.e. set of non-recursive and non-loop statements

Example:

swap() function has O(1) time complexity.

A loop or recursion that runs a constant number of times is also considered O(1). For example, the following loop is O(1).

// Here c is a constant

    for (int i = 1; i <= c; i++) {
        // some O(1) expressions
    }

<strong>Linear Time Complexity O(n):</strong>

The Time Complexity of a loop is considered as O(n) if the loop variables are incremented/decremented by a constant amount. For example following functions have O(n) time complexity. Linear time complexity, denoted as O(n), is a measure of the growth of the running time of an algorithm proportional to the size of the input.
    
    // Here c is a positive integer constant
    for (int i = 1; i <= n; i += c) {
    // some O(1) expressions
    }

    for (int i = n; i > 0; i -= c) {
    // some O(1) expressions
    }

<strong><span>Quadratic Time Complexity O(n</span><sup><span>c</span></sup><span>):</span></strong>
The time complexity is defined as an algorithm whose performance is directly proportional to the squared size of the input data, as in nested loops it is equal to the number of times the innermost statement is executed. For example, the following sample loops have O(n2) time complexity


    for (int i = 1; i <= n; i += c) {
    for (int j = 1; j <= n; j += c) {
    // some O(1) expressions
    }
    }

    for (int i = n; i > 0; i -= c) {
    for (int j = i + 1; j <= n; j += c) {
    // some O(1) expressions
    }
    }


<strong>Logarithmic Time Complexity O(Log n):</strong>

The time Complexity of a loop is considered as O(Logn) if the loop variables are divided/multiplied by a constant amount. And also for recursive calls in the recursive function, the Time Complexity is considered as O(Logn).

    for (int i = 1; i <= n; i *= c) {
    // some O(1) expressions
    }
    for (int i = n; i > 0; i /= c) {
    // some O(1) expressions
    }

<strong>Logarithmic Time Complexity O(Log Log n):</strong>

    // Here c is a constant greater than 1
    for (int i = 2; i <= n; i = Math.pow(i, c)) {
    // some O(1) expressions
    }
    // Here fun is sqrt or cuberoot or any other constant root
    for (int i = n; i > 1; i = fun(i)) {
    // some O(1) expressions
    }

<h4>Algorithimic CheatSheet </h4>

<table>
<thead></thead>
<tbody>
<tr>
<td style="width: 175px"><b><strong>Algorithm</strong></b></td>
<td style="width: 175px"><b><strong>Best Case</strong></b></td>
<td style="width: 175px"><b><strong>Average Case</strong></b></td>
<td style="width: 175px"><b><strong>Worst Case</strong></b></td>
</tr>
<tr>
<td style="width: 175px"><span>Selection Sort</span></td>
<td style="width: 175px"><span>O(n^2)</span></td>
<td style="width: 175px"><span>O(n^2)</span></td>
<td style="width: 175px"><span>O(n^2)</span></td>
</tr>
<tr>
<td style="width: 175px"><span>Bubble Sort</span></td>
<td style="width: 175px"><span>O(n)</span></td>
<td style="width: 175px"><span>O(n^2)</span></td>
<td style="width: 175px"><span>O(n^2)</span></td>
</tr>
<tr>
<td style="width: 175px"><span>Insertion Sort</span></td>
<td style="width: 175px"><span>O(n)</span></td>
<td style="width: 175px"><span>O(n^2)</span></td>
<td style="width: 175px"><span>O(n^2)</span></td>
</tr>
<tr>
<td style="width: 175px"><span>Tree Sort</span></td>
<td style="width: 175px"><span>O(nlogn)</span></td>
<td style="width: 175px"><span>O(nlogn)</span></td>
<td style="width: 175px"><span>O(n^2)</span></td>
</tr>
<tr>
<td style="width: 175px"><span>Radix Sort</span></td>
<td style="width: 175px"><span>O(dn)</span></td>
<td style="width: 175px"><span>O(dn)</span></td>
<td style="width: 175px"><span>O(dn)</span></td>
</tr>
<tr>
<td style="width: 175px"><span>Merge Sort</span></td>
<td style="width: 175px"><span>O(nlogn)</span></td>
<td style="width: 175px"><span>O(nlogn)</span></td>
<td style="width: 175px"><span>O(nlogn)</span></td>
</tr>
<tr>
<td style="width: 175px"><span>Heap Sort</span></td>
<td style="width: 175px"><span>O(nlogn)</span></td>
<td style="width: 175px"><span>O(nlogn)</span></td>
<td style="width: 175px"><span>O(nlogn)</span></td>
</tr>
<tr>
<td style="width: 175px"><span>Quick Sort</span></td>
<td style="width: 175px"><span>O(nlogn)</span></td>
<td style="width: 175px"><span>O(nlogn)</span></td>
<td style="width: 175px"><span>O(n^2)</span></td>
</tr>
<tr>
<td style="width: 175px"><span>Bucket Sort</span></td>
<td style="width: 175px"><span>O(n+k)</span></td>
<td style="width: 175px"><span>O(n+k)</span></td>
<td style="width: 175px"><span>O(n^2)</span></td>
</tr>
<tr>
<td style="width: 175px"><span>Counting Sort</span></td>
<td style="width: 175px"><span>O(n+k)</span></td>
<td style="width: 175px"><span>O(n+k)</span></td>
<td style="width: 175px"><span>O(n+k)</span></td>
</tr>
</tbody>
</table>

<h1>Space Complexity</h1>

Auxiliary Space is the extra space or temporary space used by an algorithm.

<i>The space Complexity of an algorithm is the total space taken by the algorithm with respect to the input size. Space complexity includes both Auxiliary space and space used by input.</i>

For example, if we want to compare standard sorting algorithms on the basis of space, then Auxiliary Space would be a better criterion than Space Complexity. Merge Sort uses O(n) auxiliary space, Insertion sort, and Heap Sort use O(1) auxiliary space. The space complexity of all these sorting algorithms is O(n) though.

<strong>In recursive calls stack space also counts.</strong>

int add (int n){
if (n <= 0){
return 0;
}
return n + add (n-1);
}

Here each call add a level to the stack :

    1.  add(4)
    2.    -> add(3)
    3.      -> add(2)
    4.        -> add(1)
    5.          -> add(0)
    Each of these calls is added to call stack and takes up actual memory.
    So it takes O(n) space.

<strong>However, just because you have n calls total doesn’t mean it takes O(n) space.</strong>


    int addSequence (int n){
    int sum = 0;
    for (int i = 0; i < n; i++){
    sum += pairSum(i, i+1);
    }
    return sum;
    }

    int pairSum(int x, int y){
    return x + y;
    }

    There will be roughly O(n) calls to pairSum. However, those
    calls do not exist simultaneously on the call stack,
    so you only need O(1) space.


<strong> Factors Affecting Long-term Usage of an Algorithm </strong>
The following are the factors that are crucial to an algorithm's long-term effectiveness:

<strong>Efficiency</strong> —  Efficiency plays a key role in developing a successful algorithm. Efficiency is what minimizes computation durations and delivers swift results.

<strong>Finiteness</strong> – The algorithm must conclude a predetermined number of steps. Otherwise, it will consume more RAM and is not recommended. If it continues through infinite loops or recursion, stack overflow and out-of-bounds problems may happen.

<strong>Correctness</strong> – Regardless of the magnitude of the input given, a good algorithm should generate a proper result.


</body>
</html>
