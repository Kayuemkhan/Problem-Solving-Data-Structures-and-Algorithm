> <h1> Recursion </h1>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"><title>Strings</title>
</head>
<body>

<h2> What is recursion </h2>

<b>Normal Function vs Recursive function: </b>

Normal function end after the operation but the recursion will call until the base case hasn't reached. 

The process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called a recursive function.

<i> Two Things in recursive call </i>
 <ul>
    <li>Base Call</li>
    <li>Recursive Call</li>

    int fact(int n)
    {

    if (n < = 1) // base case
    return 1;
    else    
    return n*fact(n-1);    

    }

<b>Why Stack Overflow error occurs in recursion?</b>

If the base case is not reached or not defined, then the stack overflow problem may arise. Let us take an example to understand this.


    int fact(int n)
    {
    // wrong base case (it may cause
    // stack overflow).
    if (n == 100)
    return 1;

    else
        return n*fact(n-1);
    }

</ul>
</body>
</html>
