Create a method that takes 2 strings, one - the string we are searching from, the other one - the substring we are looking for within the other string.


count("HiHelloHiHelloHelloHi", "Hi") -> 3
count("HiHelloHiHelloHelloHi", "Hello") -> 3
count("HiHelloHiHelloHelloHi", "hola") -> 0

count("hhhhhh", "hh") -> 5

count("hi how is it going so far? is it ok?", "is") -> 2
count("hi how is it going so far? is it ok?", "how") -> 1
count("hi how is it going so far? is it ok?", "it") -> 2
count("hi how is it going so far? is it ok?", "going") -> 1