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

    Implementation -> Write codes to implement the logics.

    Complexity analysis is defined as a technique to characterise the time taken by an 
    algorithm with respect to input size (independent from the machine, language and compiler). 
    It is used for evaluating the variations of execution time on different algorithms.

<br>

    What is the need for Complexity Analysis?
    1. Complexity Analysis determines the amount of time and space resources required to execute it.
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
</body>
</html>
