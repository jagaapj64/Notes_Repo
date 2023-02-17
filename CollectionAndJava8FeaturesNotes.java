1) What is mapToObj in Java?
mapToObj. Returns an object-valued Stream consisting of the results of applying the given function to the elements of this stream. 
This is an intermediate operation.

https://stackoverflow.com/questions/56127505/how-to-remove-digits-and-whitespaces-from-a-stream

List<Character> chars = str.chars()
    .mapToObj(e->(char)e).collect(Collectors.toList());
	
Set<Character> charsSet = str.chars()
    .mapToObj(e->(char)e).collect(Collectors.toSet());
	
System.out.println(
    "abcd 123 efgh".chars()
        .map(Character::toUpperCase)
        .filter(c -> !Character.isDigit(c))
        .filter(c -> !Character.isSpaceChar(c))
        .mapToObj(c -> String.valueOf((char) c))
        .collect(Collectors.joining())
);	