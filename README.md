# Java2-StringsLoopsIfJUnitTest

## Learning objectives
- Gain familiarity with String methods, if-statements, assignment, functions, and begin learning about Java loops.
- Get used to Eclipse and JUnit testing.

### Project Description
See [Project Description](https://github.com/vchen02/Java2-StringsLoopsIfJUnitTest/blob/master/a2.pdf) for more details.


#### Methods
Return true iff s reads the same backwards and forwards.
      Examples: For s = "", return true
                For s = "b", return true
                For s = "ab", return false
                For s = "aba", return true.
                For s = "abba", return true.
                For s = "Madam, I'm Adam", return false.
                For s = "MadamImAdam", return false.
                For s = "madamimadam", return true.  /
```     
public static boolean sameBackAndForth(String s)
```

Return the number of times query occurs as a substring of src
      (different occurrences may overlap).
      Precondition: query is not the empty string "".
      Examples: For src = "ab", query = "b", return 1.
                For src = "Luke Skywalker", query = "ke", return 2.
                For src = "abababab", query = "aba", return 3.
                For src = "aaaa", query = "aa", return 3./
```      
public static int numOccurrences(String src, String query)
``` 

String s is written in a form that looks something like this:
      "b3c1x2a013b2". For this s, return the decompressed string "bbbcxx111bb".
     
      More formally, we have:
      Precondition: s is in "compressed form": it consists of a sequence of
      pairs of characters, with the second character being a digit in 0..9.
      Return the decompressed form of s, which is found by replacing each
      pair "ci" by i occurrences of character c.
``` 
public static String decompress(String s) 
``` 

Precondition: String s consists of a last-name, a comma ',', a first-name,
           and an optional middle-name. There are one or more blank characters
           (spaces) before the first-name and before the optional middle-name.
           There are 0 or more blanks at the beginning and end of s. Any of the
           characters in the names may be in lower or upper case.
      Return the correctly formatted name as
      first-name middle-name (if present) last-name
      The first character of each name must be in uppercase and the rest of the
      characters in lowercase.
      Exactly one blank must separate adjacent names. There should be no blank
      before the first-name and after the last-name.
     
      Examples: For s = "   gRies,  DAVID     "   return "David Gries"
                For s = "foster,    nate"         return "Nate Foster"
                For s = "GOSLING, JAMES   ARTHUR" return "James Arthur Gosling"
``` 
public static String fixName(String s) 
``` 

Return a string that is s but with all upper-case consonants (letters of
      the English alphabet other than the vowels a, e, i, o, u) replaced with
      _, and all lower-case consonants replaced with their upper-case version.
     
      Examples: For s = "Minecraft" return "_iNeCRaFT".
                For s = "Alan Turing" return "ALaN _uRiNG".
``` 
public static String replaceConsonants(String s)
``` 

Return true iff s and t are anagrams of each other. An anagram of a string
      is another string that has the same characters, but possibly in a
      different order. Note that 'a' and 'A' are considered different characters and that the space is a character.
     
      Examples: For s = "noon", t = "noon", return true.
                For s = "mary", t = "army", return true.
                For s = "tom marvolo riddle", t = "i am lordvoldemort", return true.
                For s = "tommarvoloriddle", t = "i am lordvoldemort", return false.
                For s = "hello", t = "world", return false.  
``` 
public static boolean areAnagrams(String s, String t) 
``` 