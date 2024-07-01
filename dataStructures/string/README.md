> <h1> Strings </h1>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"><title>Strings</title>
</head>
<body>

    Strings are considered a data type in general and are typically represented as arrays of bytes (or words) that store a sequence of characters. Strings are defined as an array of characters. The difference between a character array and a string is the string is terminated with a special character ‘\0’

<h3>General Operations performed on String:</h3>

<b>1. Concatenation of Strings</b>
    
    public class StringConcatenation {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String concatenated = concatenateStrings(str1, str2);
        System.out.println(concatenated);  // Output: HelloWorld
    }

    public static String concatenateStrings(String s1, String s2) {
        // Calculate the length of the concatenated string
        int len1 = s1.length();
        int len2 = s2.length();
        int combinedLength = len1 + len2;

        // Create a character array to hold the concatenated string
        char[] result = new char[combinedLength];

        // Copy characters from the first string to the result array
        for (int i = 0; i < len1; i++) {
            result[i] = s1.charAt(i);
        }

        // Copy characters from the second string to the result array
        for (int i = 0; i < len2; i++) {
            result[len1 + i] = s2.charAt(i);
        }

        // Convert the character array back to a string
        String concatenated = new String(result);
        return concatenated;
    }
    }

</body>
</html>
