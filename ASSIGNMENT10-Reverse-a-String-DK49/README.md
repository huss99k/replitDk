Create a method called reverse that takes a String and returns the reversed version of that String.
If an empty string or null is passed, your method should return an empty string.
To check for null, use == ->  str==null (make sure to add this check, before any other code, otherwise your code might throw Nullpointer exception)
To check for an empty string, use equals ->  str.equals("")


NOTE: This assignment has unit tests, once you are done, run them to test your method correctness. All tests must pass.


Examples:

reverse("Hello") -> "olleH"
reverse("hi") -> "ih"
reverse("h") -> "h"
reverse("Programming isn't about what you know; it's about what you can figure out.") -> 
".tuo erugif nac uoy tahw tuoba s'ti ;wonk uoy tahw tuoba t'nsi gnimmargorP"
reverse("") -> ""
reverse(null) -> ""


