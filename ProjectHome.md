# Xeger #

Think of it as the opposite of regular expression matchers. This library allows you to generate text that is guaranteed to match a regular expression passed in.

Let's take the regular expression:
`[ab]{4,6}c`
Using Xeger, you can now generate Strings matching this pattern like this:

```
String regex = "[ab]{4,6}c";
Xeger generator = new Xeger(regex);
String result = generator.generate();
assert result.matches(regex);
```

Note that - in order to use Xeger - you will also need the dk.brics.automaton package, that you can download as a library here: http://www.brics.dk/~amoeller/automaton/

Be sure to read XegerLimitations to learn about the limitations in regular expressions supported.