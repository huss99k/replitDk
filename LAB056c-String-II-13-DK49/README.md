Given two strings, append them together and return the result. 
However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. 
So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hi", "Hello") → "Hilo"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
minCat("java", "uber") → "javauber"
