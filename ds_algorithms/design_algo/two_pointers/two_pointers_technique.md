<h2>Basics</h2>

Two pointers is an extremely common technique used to solve array and string problems. It involves having two integer variables that both move along an iterable. In this article, we are focusing on arrays and strings. This means we will have two integers, usually named something like i and j, or left and right which each represent an index of the array or string.

There are several ways to implement two pointers. To start, let's look at the following method:

Start the pointers at the edges of the input. Move them towards each other until they meet.

Converting this idea into instructions:

Start one pointer at the first index 0 and the other pointer at the last index input.length - 1.
Use a while loop until the pointers are equal to each other.
At each iteration of the loop, move the pointers towards each other. This means either increment the pointer that started at the first index, decrement the pointer that started at the last index, or both. Deciding which pointers to move will depend on the problem we are trying to solve.
Here's some pseudocode illustrating the concept:

function fn(arr):
left = 0
right = arr.length - 1

    while left < right:
        Do some logic here depending on the problem
        Do some more logic here to decide on one of the following:
            1. left++
            2. right--
            3. Both left++ and right--
The strength of this technique is that we will never have more than
�
(
�
)
O(n) iterations for the while loop because the pointers start
�
n away from each other and move at least one step closer in every iteration. Therefore, if we can keep the work inside each iteration at
�
(
1
)
O(1), this technique will result in a linear runtime, which is usually the best possible runtime. Let's look at some examples.

    Example 1: Given a string s, return true if it is a palindrome, false otherwise.

A string is a palindrome if it reads the same forward as backward. That means, after reversing it, it is still the same string. For example: "abcdcba", or "racecar".

After reversing a string, the first character becomes the last character. If a string is the same after being reversed, that means the first character is the same as
the last character, the second character is the same as the second last character, and so on. We can use the two pointers technique here to check that all corresponding
characters are equal. To start, we check the first and last characters using two separate pointers. To check the next pair of characters, we just need to move our
pointers toward each other one position. We continue until the pointers meet each other or we find a mismatch.

<h2>Implementation</h2>

<code>

    public boolean checkIfPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        left++;
        right--;
    }

    return true;
    }
</code>

<h2> Another way to use two pointers </h2>

This method where we start the pointers at the first and last indices and move them towards each other is only one way to implement two pointers. Algorithms are beautiful because of how abstract they are - "two pointers" is just an idea, and it can be implemented in many different ways. Let's look at another method and some new examples. The following method is applicable when the problem has two iterables in the input, for example, two arrays.

<code> 

        Move along both inputs simultaneously until all elements have been checked.
</code>


Converting this idea into instructions:

Create two pointers, one for each iterable. Each pointer should start at the first index.
Use a while loop until one of the pointers reaches the end of its iterable.
At each iteration of the loop, move the pointers forward. This means incrementing either one of the pointers or both of the pointers. Deciding which pointers to move will depend on the problem we are trying to solve.
Because our while loop will stop when one of the pointers reaches the end, the other pointer will not be at the end of its respective iterable when the loop finishes. Sometimes, we need to iterate through all elements - if this is the case, you will need to write extra code here to make sure both iterables are exhausted.

<code>

    Here's some pseudocode illustrating the concept:
</code>

<i> PsudeoCode </i>

<code>

    function fn(arr1, arr2):
    i = j = 0
    while i < arr1.length AND j < arr2.length:
        Do some logic here depending on the problem
        Do some more logic here to decide on one of the following:
            1. i++
            2. j++
            3. Both i++ and j++

    // Step 4: make sure both iterables are exhausted
    // Note that only one of these loops would run
    while i < arr1.length:
        Do some logic here depending on the problem
        i++

    while j < arr2.length:
        Do some logic here depending on the problem
        j++
</code>

<p>Similar to the first method we looked at, this method will have a linear time complexity of
O(n+m) if the work inside the while loop is O(1), where n = arr1.length and m = arr2.length. This is because at every iteration, we move at least one pointer forward, and the pointers cannot be moved forward more than n + m times without the arrays being exhausted. Let's look at some examples.
</p>