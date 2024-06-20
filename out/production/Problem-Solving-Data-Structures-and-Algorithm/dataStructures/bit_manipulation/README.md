> <h1> Bit Manipulations </h1>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"><title>Strings</title>
</head>
<body>
    <h3>Bitwise Operators</h3>
    
    Bitwise operators are used to performing the manipulation of individual bits of a number. They can be used with any integral
    type (char, short, int, etc.). They are used when performing update and query operations of the Binary indexed trees. 
    
    
<b>1. Bitwise OR (|) </b>

This operator is a binary operator, denoted by ‘|’. It returns bit by bit OR of input values, i.e., if either of the bits is 1, it gives 1, else it shows 0.

    Example:
    a = 5 = 0101 (In Binary)
    b = 7 = 0111 (In Binary)

    Bitwise OR Operation of 5 and 7
    0101
    | 0111
    ________
    0111  = 7 (In decimal)

<b>2. Bitwise AND (&)</b>

This operator is a binary operator, denoted by ‘&.’ It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0.

<b>3. Bitwise XOR (^)</b>

This operator is a binary operator, denoted by ‘^.’ It returns bit by bit XOR of input values, i.e., if corresponding bits are different, it gives 1, else it shows 0
    
    a = 5 = 0101 (In Binary)
    b = 7 = 0111 (In Binary)

    Bitwise XOR Operation of 5 and 7
      0101
    ^ 0111
     ________
       0010  = 2 (In decimal)
<b>4. Bitwise Complement (~)</b>

This operator is a unary operator, denoted by ‘~.’ It returns the one’s complement representation of the input value, i.e., with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.
    
    a = 5 = 0101 (In Binary)

    Bitwise Complement Operation of 5

    ~ 0101
    ________
    1010  = 10 (In decimal)

    
</body>
</html>
