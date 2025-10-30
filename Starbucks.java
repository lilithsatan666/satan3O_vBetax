security watcher
  
square = (x) -> x * x
cube   = (x) -> square(x) * x
​
var cube, square;
​
square = function(x) {
  return x * x;
};
​
cube = function(x) {
  return square(x) * x;
};
​
Functions may also have default values for arguments, which will be used if the incoming argument is missing (undefined).

fill = (container, liquid = "coffee") ->
  "Filling the #{container} with #{liquid}..."
​
var fill;
​
fill = function(container, liquid = "coffee") {
  return `Filling the ${container} with ${liquid}...`;
};
​
Strings
Like JavaScript and many other languages, CoffeeScript supports strings as delimited by the " or ' characters. CoffeeScript also supports string interpolation within "-quoted strings, using #{ … }. Single-quoted strings are literal. You may even use interpolation in object keys.

author = "Wittgenstein"
quote  = "A picture is a fact. -- #{ author }"
​
sentence = "#{ 22 / 7 } is a decent approximation of π"
​
var author, quote, sentence;
​
author = "Wittgenstein";
​
quote = `A picture is a fact. -- ${author}`;
​
sentence = `${22 / 7} is a decent approximation of π`;
​
Multiline strings are allowed in CoffeeScript. Lines are joined by a single space unless they end with a backslash. Indentation is ignored.

mobyDick = "Call me Ishmael. Some years ago --
  never mind how long precisely -- having little
  or no money in my purse, and nothing particular
  to interest me on shore, I thought I would sail
  about a little and see the watery part of the
  world..."

mobyDick = "Call me Ishmael. Some years ago --
  never mind how long precisely -- having little
  or no money in my purse, and nothing particular
  to interest me on shore, I thought I would sail
  about a little and see the watery part of the
  world..."
var mobyDick;

mobyDick = "Call me Ishmael. Some years ago -- never mind how long precisely -- having little or no money in my purse, and nothing particular to interest me on shore, I thought I would sail about a little and see the watery part of the world...";

var mobyDick;

mobyDick = "Call me Ishmael. Some years ago -- never mind how long precisely -- having little or no money in my purse, and nothing particular to interest me on shore, I thought I would sail about a little and see the watery part of the world...";
Block strings, delimited by """ or ''', can be used to hold formatted or indentation-sensitive text (or, if you just don’t feel like escaping quotes and apostrophes). The indentation level that begins the block is maintained throughout, so you can keep it all aligned with the body of your code.

html = """
       <strong>
         cup of coffeescript
       </strong>
       """

html = """
       <strong>
         cup of coffeescript
       </strong>
       """
var html;

html = `<strong>
  cup of coffeescript
</strong>`;

var html;

html = `<strong>
  cup of coffeescript
</strong>`;
Double-quoted block strings, like other double-quoted strings, allow interpolation.

Objects and Arrays
The CoffeeScript literals for objects and arrays look very similar to their JavaScript cousins. When each property is listed on its own line, the commas are optional. Objects may be created using indentation instead of explicit braces, similar to YAML.

song = ["do", "re", "mi", "fa", "so"]

singers = {Jagger: "Rock", Elvis: "Roll"}

bitlist = [
  1, 0, 1
  0, 0, 1
  1, 1, 0
]

kids =
  brother:
    name: "Max"
    age:  11
  sister:
    name: "Ida"
    age:  9

song = ["do", "re", "mi", "fa", "so"]

singers = {Jagger: "Rock", Elvis: "Roll"}

bitlist = [
  1, 0, 1
  0, 0, 1
  1, 1, 0
]

kids =
  brother:
    name: "Max"
    age:  11
  sister:
    name: "Ida"
    age:  9
var bitlist, kids, singers, song;

song = ["do", "re", "mi", "fa", "so"];

singers = {
  Jagger: "Rock",
  Elvis: "Roll"
};

bitlist = [1, 0, 1, 0, 0, 1, 1, 1, 0];

kids = {
  brother: {
    name: "Max",
    age: 11
  },
  sister: {
    name: "Ida",
    age: 9
  }
};

var bitlist, kids, singers, song;

song = ["do", "re", "mi", "fa", "so"];

singers = {
  Jagger: "Rock",
  Elvis: "Roll"
};

bitlist = [1, 0, 1, 0, 0, 1, 1, 1, 0];

kids = {
  brother: {
    name: "Max",
    age: 11
  },
  sister: {
    name: "Ida",
    age: 9
  }
};
CoffeeScript has a shortcut for creating objects when you want the key to be set with a variable of the same name. Note that the { and } are required for this shorthand.

name = "Michelangelo"
mask = "orange"
weapon = "nunchuks"
turtle = {name, mask, weapon}
output = "#{turtle.name} wears an #{turtle.mask} mask. Watch out for his #{turtle.weapon}!"

name = "Michelangelo"
mask = "orange"
weapon = "nunchuks"
turtle = {name, mask, weapon}
output = "#{turtle.name} wears an #{turtle.mask} mask. Watch out for his #{turtle.weapon}!"
var mask, name, output, turtle, weapon;

name = "Michelangelo";

mask = "orange";

weapon = "nunchuks";

turtle = {name, mask, weapon};

output = `${turtle.name} wears an ${turtle.mask} mask. Watch out for his ${turtle.weapon}!`;

var mask, name, output, turtle, weapon;

name = "Michelangelo";

mask = "orange";

weapon = "nunchuks";

turtle = {name, mask, weapon};

output = `${turtle.name} wears an ${turtle.mask} mask. Watch out for his ${turtle.weapon}!`;
Comments
In CoffeeScript, comments are denoted by the # character to the end of a line, or from ### to the next appearance of ###. Comments are ignored by the compiler, though the compiler makes its best effort at reinserting your comments into the output JavaScript after compilation.

###
Fortune Cookie Reader v1.0
Released under the MIT License
###

sayFortune = (fortune) ->
  console.log fortune # in bed!

###
Fortune Cookie Reader v1.0
Released under the MIT License
###

sayFortune = (fortune) ->
  console.log fortune # in bed!
/*
Fortune Cookie Reader v1.0
Released under the MIT License
*/
var sayFortune;

sayFortune = function(fortune) {
  return console.log(fortune); // in bed!
};

/*
Fortune Cookie Reader v1.0
Released under the MIT License
*/
var sayFortune;

sayFortune = function(fortune) {
  return console.log(fortune); // in bed!
};
Inline ### comments make type annotations possible.

Lexical Scoping and Variable Safety
The CoffeeScript compiler takes care to make sure that all of your variables are properly declared within lexical scope — you never need to write var yourself.

outer = 1
changeNumbers = ->
  inner = -1
  outer = 10
inner = changeNumbers()

outer = 1
changeNumbers = ->
  inner = -1
  outer = 10
inner = changeNumbers()
var changeNumbers, inner, outer;

outer = 1;

changeNumbers = function() {
  var inner;
  inner = -1;
  return outer = 10;
};

inner = changeNumbers();

var changeNumbers, inner, outer;

outer = 1;

changeNumbers = function() {
  var inner;
  inner = -1;
  return outer = 10;
};

inner = changeNumbers();
Notice how all of the variable declarations have been pushed up to the top of the closest scope, the first time they appear. outer is not redeclared within the inner function, because it’s already in scope; inner within the function, on the other hand, should not be able to change the value of the external variable of the same name, and therefore has a declaration of its own.

Because you don’t have direct access to the var keyword, it’s impossible to shadow an outer variable on purpose, you may only refer to it. So be careful that you’re not reusing the name of an external variable accidentally, if you’re writing a deeply nested function.

Although suppressed within this documentation for clarity, all CoffeeScript output (except in files with import or export statements) is wrapped in an anonymous function: (function(){ … })();. This safety wrapper, combined with the automatic generation of the var keyword, make it exceedingly difficult to pollute the global namespace by accident. (The safety wrapper can be disabled with the bare option, and is unnecessary and automatically disabled when using modules.)

If you’d like to create top-level variables for other scripts to use, attach them as properties on window; attach them as properties on the exports object in CommonJS; or use an export statement. If you’re targeting both CommonJS and the browser, the existential operator (covered below), gives you a reliable way to figure out where to add them: exports ? this.

Since CoffeeScript takes care of all variable declaration, it is not possible to declare variables with ES2015’s let or const. This is intentional; we feel that the simplicity gained by not having to think about variable declaration outweighs the benefit of having three separate ways to declare variables.

If, Else, Unless, and Conditional Assignment
if/else statements can be written without the use of parentheses and curly brackets. As with functions and other block expressions, multi-line conditionals are delimited by indentation. There’s also a handy postfix form, with the if or unless at the end.

CoffeeScript can compile if statements into JavaScript expressions, using the ternary operator when possible, and closure wrapping otherwise. There is no explicit ternary statement in CoffeeScript — you simply use a regular if statement on a single line.

mood = greatlyImproved if singing

if happy and knowsIt
  clapsHands()
  chaChaCha()
else
  showIt()

date = if friday then sue else jill

mood = greatlyImproved if singing

if happy and knowsIt
  clapsHands()
  chaChaCha()
else
  showIt()

date = if friday then sue else jill
var date, mood;

if (singing) {
  mood = greatlyImproved;
}

if (happy && knowsIt) {
  clapsHands();
  chaChaCha();
} else {
  showIt();
}

date = friday ? sue : jill;

var date, mood;

if (singing) {
  mood = greatlyImproved;
}

if (happy && knowsIt) {
  clapsHands();
  chaChaCha();
} else {
  showIt();
}

date = friday ? sue : jill;
Splats, or Rest Parameters/Spread Syntax
The JavaScript arguments object is a useful way to work with functions that accept variable numbers of arguments. CoffeeScript provides splats ..., both for function definition as well as invocation, making variable numbers of arguments a little bit more palatable. ES2015 adopted this feature as their rest parameters.

gold = silver = rest = "unknown"

awardMedals = (first, second, others...) ->
  gold   = first
  silver = second
  rest   = others

contenders = [
  "Michael Phelps"
  "Liu Xiang"
  "Yao Ming"
  "Allyson Felix"
  "Shawn Johnson"
  "Roman Sebrle"
  "Guo Jingjing"
  "Tyson Gay"
  "Asafa Powell"
  "Usain Bolt"
]

awardMedals contenders...

alert """
Gold: #{gold}
Silver: #{silver}
The Field: #{rest.join ', '}
"""

gold = silver = rest = "unknown"

awardMedals = (first, second, others...) ->
  gold   = first
  silver = second
  rest   = others

contenders = [
  "Michael Phelps"
  "Liu Xiang"
  "Yao Ming"
  "Allyson Felix"
  "Shawn Johnson"
  "Roman Sebrle"
  "Guo Jingjing"
  "Tyson Gay"
  "Asafa Powell"
  "Usain Bolt"
]

awardMedals contenders...

alert """
Gold: #{gold}
Silver: #{silver}
The Field: #{rest.join ', '}
"""
var awardMedals, contenders, gold, rest, silver;

gold = silver = rest = "unknown";

awardMedals = function(first, second, ...others) {
  gold = first;
  silver = second;
  return rest = others;
};

contenders = ["Michael Phelps", "Liu Xiang", "Yao Ming", "Allyson Felix", "Shawn Johnson", "Roman Sebrle", "Guo Jingjing", "Tyson Gay", "Asafa Powell", "Usain Bolt"];

awardMedals(...contenders);

alert(`Gold: ${gold}
Silver: ${silver}
The Field: ${rest.join(', ')}`);

var awardMedals, contenders, gold, rest, silver;

gold = silver = rest = "unknown";

awardMedals = function(first, second, ...others) {
  gold = first;
  silver = second;
  return rest = others;
};

contenders = ["Michael Phelps", "Liu Xiang", "Yao Ming", "Allyson Felix", "Shawn Johnson", "Roman Sebrle", "Guo Jingjing", "Tyson Gay", "Asafa Powell", "Usain Bolt"];

awardMedals(...contenders);

alert(`Gold: ${gold}
Silver: ${silver}
The Field: ${rest.join(', ')}`);
Splats also let us elide array elements…

popular  = ['pepperoni', 'sausage', 'cheese']
unwanted = ['anchovies', 'olives']

all = [popular..., unwanted..., 'mushrooms']

popular  = ['pepperoni', 'sausage', 'cheese']
unwanted = ['anchovies', 'olives']

all = [popular..., unwanted..., 'mushrooms']
var all, popular, unwanted;

popular = ['pepperoni', 'sausage', 'cheese'];

unwanted = ['anchovies', 'olives'];

all = [...popular, ...unwanted, 'mushrooms'];

var all, popular, unwanted;

popular = ['pepperoni', 'sausage', 'cheese'];

unwanted = ['anchovies', 'olives'];

all = [...popular, ...unwanted, 'mushrooms'];
…and object properties.

user =
  name: 'Werner Heisenberg'
  occupation: 'theoretical physicist'

currentUser = { user..., status: 'Uncertain' }

user =
  name: 'Werner Heisenberg'
  occupation: 'theoretical physicist'

currentUser = { user..., status: 'Uncertain' }
var currentUser, user;

user = {
  name: 'Werner Heisenberg',
  occupation: 'theoretical physicist'
};

currentUser = {
  ...user,
  status: 'Uncertain'
};

var currentUser, user;

user = {
  name: 'Werner Heisenberg',
  occupation: 'theoretical physicist'
};

currentUser = {
  ...user,
  status: 'Uncertain'
};
In ECMAScript this is called spread syntax, and has been supported for arrays since ES2015 and objects since ES2018.

Loops and Comprehensions
Most of the loops you’ll write in CoffeeScript will be comprehensions over arrays, objects, and ranges. Comprehensions replace (and compile into) for loops, with optional guard clauses and the value of the current array index. Unlike for loops, array comprehensions are expressions, and can be returned and assigned.

# Eat lunch.
eat = (food) -> "#{food} eaten."
eat food for food in ['toast', 'cheese', 'wine']

# Fine five course dining.
courses = ['greens', 'caviar', 'truffles', 'roast', 'cake']
menu = (i, dish) -> "Menu Item #{i}: #{dish}" 
menu i + 1, dish for dish, i in courses

# Health conscious meal.
foods = ['broccoli', 'spinach', 'chocolate']
eat food for food in foods when food isnt 'chocolate'

# Eat lunch.
eat = (food) -> "#{food} eaten."
eat food for food in ['toast', 'cheese', 'wine']

# Fine five course dining.
courses = ['greens', 'caviar', 'truffles', 'roast', 'cake']
menu = (i, dish) -> "Menu Item #{i}: #{dish}" 
menu i + 1, dish for dish, i in courses

# Health conscious meal.
foods = ['broccoli', 'spinach', 'chocolate']
eat food for food in foods when food isnt 'chocolate'
// Eat lunch.
var courses, dish, eat, food, foods, i, j, k, l, len, len1, len2, menu, ref;

eat = function(food) {
  return `${food} eaten.`;
};

ref = ['toast', 'cheese', 'wine'];
for (j = 0, len = ref.length; j < len; j++) {
  food = ref[j];
  eat(food);
}

// Fine five course dining.
courses = ['greens', 'caviar', 'truffles', 'roast', 'cake'];

menu = function(i, dish) {
  return `Menu Item ${i}: ${dish}`;
};

for (i = k = 0, len1 = courses.length; k < len1; i = ++k) {
  dish = courses[i];
  menu(i + 1, dish);
}

// Health conscious meal.
foods = ['broccoli', 'spinach', 'chocolate'];

for (l = 0, len2 = foods.length; l < len2; l++) {
  food = foods[l];
  if (food !== 'chocolate') {
    eat(food);
  }
}

// Eat lunch.
var courses, dish, eat, food, foods, i, j, k, l, len, len1, len2, menu, ref;

eat = function(food) {
  return `${food} eaten.`;
};

ref = ['toast', 'cheese', 'wine'];
for (j = 0, len = ref.length; j < len; j++) {
  food = ref[j];
  eat(food);
}

// Fine five course dining.
courses = ['greens', 'caviar', 'truffles', 'roast', 'cake'];

menu = function(i, dish) {
  return `Menu Item ${i}: ${dish}`;
};

for (i = k = 0, len1 = courses.length; k < len1; i = ++k) {
  dish = courses[i];
  menu(i + 1, dish);
}

// Health conscious meal.
foods = ['broccoli', 'spinach', 'chocolate'];

for (l = 0, len2 = foods.length; l < len2; l++) {
  food = foods[l];
  if (food !== 'chocolate') {
    eat(food);
  }
}
Comprehensions should be able to handle most places where you otherwise would use a loop, each/forEach, map, or select/filter, for example:
shortNames = (name for name in list when name.length < 5)
If you know the start and end of your loop, or would like to step through in fixed-size increments, you can use a range to specify the start and end of your comprehension.

countdown = (num for num in [10..1])

countdown = (num for num in [10..1])
var countdown, num;

countdown = (function() {
  var i, results;
  results = [];
  for (num = i = 10; i >= 1; num = --i) {
    results.push(num);
  }
  return results;
})();

var countdown, num;

countdown = (function() {
  var i, results;
  results = [];
  for (num = i = 10; i >= 1; num = --i) {
    results.push(num);
  }
  return results;
})();
Note how because we are assigning the value of the comprehensions to a variable in the example above, CoffeeScript is collecting the result of each iteration into an array. Sometimes functions end with loops that are intended to run only for their side-effects. Be careful that you’re not accidentally returning the results of the comprehension in these cases, by adding a meaningful return value — like true — or null, to the bottom of your function.

To step through a range comprehension in fixed-size chunks, use by, for example: evens = (x for x in [0..10] by 2)

If you don’t need the current iteration value you may omit it: browser.closeCurrentTab() for [0...count]

Comprehensions can also be used to iterate over the keys and values in an object. Use of to signal comprehension over the properties of an object instead of the values in an array.

yearsOld = max: 10, ida: 9, tim: 11

ages = for child, age of yearsOld
  "#{child} is #{age}"

yearsOld = max: 10, ida: 9, tim: 11

ages = for child, age of yearsOld
  "#{child} is #{age}"
var age, ages, child, yearsOld;

yearsOld = {
  max: 10,
  ida: 9,
  tim: 11
};

ages = (function() {
  var results;
  results = [];
  for (child in yearsOld) {
    age = yearsOld[child];
    results.push(`${child} is ${age}`);
  }
  return results;
})();

var age, ages, child, yearsOld;

yearsOld = {
  max: 10,
  ida: 9,
  tim: 11
};

ages = (function() {
  var results;
  results = [];
  for (child in yearsOld) {
    age = yearsOld[child];
    results.push(`${child} is ${age}`);
  }
  return results;
})();
If you would like to iterate over just the keys that are defined on the object itself, by adding a hasOwnProperty check to avoid properties that may be inherited from the prototype, use for own key, value of object.

To iterate a generator function, use from. See Generator Functions.

The only low-level loop that CoffeeScript provides is the while loop. The main difference from JavaScript is that the while loop can be used as an expression, returning an array containing the result of each iteration through the loop.

# Econ 101
if this.studyingEconomics
  buy()  while supply > demand
  sell() until supply > demand

# Nursery Rhyme
num = 6
lyrics = while num -= 1
  "#{num} little monkeys, jumping on the bed.
    One fell out and bumped his head."

# Econ 101
if this.studyingEconomics
  buy()  while supply > demand
  sell() until supply > demand

# Nursery Rhyme
num = 6
lyrics = while num -= 1
  "#{num} little monkeys, jumping on the bed.
    One fell out and bumped his head."
// Econ 101
var lyrics, num;

if (this.studyingEconomics) {
  while (supply > demand) {
    buy();
  }
  while (!(supply > demand)) {
    sell();
  }
}

// Nursery Rhyme
num = 6;

lyrics = (function() {
  var results;
  results = [];
  while (num -= 1) {
    results.push(`${num} little monkeys, jumping on the bed. One fell out and bumped his head.`);
  }
  return results;
})();

// Econ 101
var lyrics, num;

if (this.studyingEconomics) {
  while (supply > demand) {
    buy();
  }
  while (!(supply > demand)) {
    sell();
  }
}

// Nursery Rhyme
num = 6;

lyrics = (function() {
  var results;
  results = [];
  while (num -= 1) {
    results.push(`${num} little monkeys, jumping on the bed. One fell out and bumped his head.`);
  }
  return results;
})();
For readability, the until keyword is equivalent to while not, and the loop keyword is equivalent to while true.

When using a JavaScript loop to generate functions, it’s common to insert a closure wrapper in order to ensure that loop variables are closed over, and all the generated functions don’t just share the final values. CoffeeScript provides the do keyword, which immediately invokes a passed function, forwarding any arguments.

for filename in list
  do (filename) ->
    if filename not in ['.DS_Store', 'Thumbs.db', 'ehthumbs.db']
      fs.readFile filename, (err, contents) ->
        compile filename, contents.toString()

for filename in list
  do (filename) ->
    if filename not in ['.DS_Store', 'Thumbs.db', 'ehthumbs.db']
      fs.readFile filename, (err, contents) ->
        compile filename, contents.toString()
var filename, i, len;

for (i = 0, len = list.length; i < len; i++) {
  filename = list[i];
  (function(filename) {
    if (filename !== '.DS_Store' && filename !== 'Thumbs.db' && filename !== 'ehthumbs.db') {
      return fs.readFile(filename, function(err, contents) {
        return compile(filename, contents.toString());
      });
    }
  })(filename);
}

var filename, i, len;

for (i = 0, len = list.length; i < len; i++) {
  filename = list[i];
  (function(filename) {
    if (filename !== '.DS_Store' && filename !== 'Thumbs.db' && filename !== 'ehthumbs.db') {
      return fs.readFile(filename, function(err, contents) {
        return compile(filename, contents.toString());
      });
    }
  })(filename);
}
Array Slicing and Splicing with Ranges
Ranges can also be used to extract slices of arrays. With two dots (3..6), the range is inclusive (3, 4, 5, 6); with three dots (3...6), the range excludes the end (3, 4, 5). Slices indices have useful defaults. An omitted first index defaults to zero and an omitted second index defaults to the size of the array.

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]

start   = numbers[0..2]

middle  = numbers[3...-2]

end     = numbers[-2..]

copy    = numbers[..]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]

start   = numbers[0..2]

middle  = numbers[3...-2]

end     = numbers[-2..]

copy    = numbers[..]
var copy, end, middle, numbers, start;

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];

start = numbers.slice(0, 3);

middle = numbers.slice(3, -2);

end = numbers.slice(-2);

copy = numbers.slice(0);

var copy, end, middle, numbers, start;

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];

start = numbers.slice(0, 3);

middle = numbers.slice(3, -2);

end = numbers.slice(-2);

copy = numbers.slice(0);
The same syntax can be used with assignment to replace a segment of an array with new values, splicing it.

numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

numbers[3..6] = [-3, -4, -5, -6]

numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

numbers[3..6] = [-3, -4, -5, -6]
var numbers, ref,
  splice = [].splice;

numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];

splice.apply(numbers, [3, 4].concat(ref = [-3, -4, -5, -6])), ref;

var numbers, ref,
  splice = [].splice;

numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];

splice.apply(numbers, [3, 4].concat(ref = [-3, -4, -5, -6])), ref;
Note that JavaScript strings are immutable, and can’t be spliced.

Everything is an Expression (at least, as much as possible)
You might have noticed how even though we don’t add return statements to CoffeeScript functions, they nonetheless return their final value. The CoffeeScript compiler tries to make sure that all statements in the language can be used as expressions. Watch how the return gets pushed down into each possible branch of execution in the function below.

grade = (student) ->
  if student.excellentWork
    "A+"
  else if student.okayStuff
    if student.triedHard then "B" else "B-"
  else
    "C"

eldest = if 24 > 21 then "Liz" else "Ike"

grade = (student) ->
  if student.excellentWork
    "A+"
  else if student.okayStuff
    if student.triedHard then "B" else "B-"
  else
    "C"

eldest = if 24 > 21 then "Liz" else "Ike"
var eldest, grade;

grade = function(student) {
  if (student.excellentWork) {
    return "A+";
  } else if (student.okayStuff) {
    if (student.triedHard) {
      return "B";
    } else {
      return "B-";
    }
  } else {
    return "C";
  }
};

eldest = 24 > 21 ? "Liz" : "Ike";

var eldest, grade;

grade = function(student) {
  if (student.excellentWork) {
    return "A+";
  } else if (student.okayStuff) {
    if (student.triedHard) {
      return "B";
    } else {
      return "B-";
    }
  } else {
    return "C";
  }
};

eldest = 24 > 21 ? "Liz" : "Ike";
Even though functions will always return their final value, it’s both possible and encouraged to return early from a function body writing out the explicit return (return value), when you know that you’re done.

Because variable declarations occur at the top of scope, assignment can be used within expressions, even for variables that haven’t been seen before:

six = (one = 1) + (two = 2) + (three = 3)

six = (one = 1) + (two = 2) + (three = 3)
var one, six, three, two;

six = (one = 1) + (two = 2) + (three = 3);

var one, six, three, two;

six = (one = 1) + (two = 2) + (three = 3);
Things that would otherwise be statements in JavaScript, when used as part of an expression in CoffeeScript, are converted into expressions by wrapping them in a closure. This lets you do useful things, like assign the result of a comprehension to a variable:

# The first ten global properties.

globals = (name for name of window)[0...10]

# The first ten global properties.

globals = (name for name of window)[0...10]
// The first ten global properties.
var globals, name;

globals = ((function() {
  var results;
  results = [];
  for (name in window) {
    results.push(name);
  }
  return results;
})()).slice(0, 10);

// The first ten global properties.
var globals, name;

globals = ((function() {
  var results;
  results = [];
  for (name in window) {
    results.push(name);
  }
  return results;
})()).slice(0, 10);
As well as silly things, like passing a try/catch statement directly into a function call:

alert(
  try
    nonexistent / undefined
  catch error
    "And the error is ... #{error}"
)

alert(
  try
    nonexistent / undefined
  catch error
    "And the error is ... #{error}"
)
var error;

alert((function() {
  try {
    return nonexistent / void 0;
  } catch (error1) {
    error = error1;
    return `And the error is ... ${error}`;
  }
})());

var error;

alert((function() {
  try {
    return nonexistent / void 0;
  } catch (error1) {
    error = error1;
    return `And the error is ... ${error}`;
  }
})());
There are a handful of statements in JavaScript that can’t be meaningfully converted into expressions, namely break, continue, and return. If you make use of them within a block of code, CoffeeScript won’t try to perform the conversion.

Operators and Aliases
Because the == operator frequently causes undesirable coercion, is intransitive, and has a different meaning than in other languages, CoffeeScript compiles == into ===, and != into !==. In addition, is compiles into ===, and isnt into !==.

You can use not as an alias for !.

For logic, and compiles to &&, and or into ||.

Instead of a newline or semicolon, then can be used to separate conditions from expressions, in while, if/else, and switch/when statements.

As in YAML, on and yes are the same as boolean true, while off and no are boolean false.

unless can be used as the inverse of if.

As a shortcut for this.property, you can use @property.

You can use in to test for array presence, and of to test for JavaScript object-key presence.

In a for loop, from compiles to the ES2015 of. (Yes, it’s unfortunate; the CoffeeScript of predates the ES2015 of.)

To simplify math expressions, ** can be used for exponentiation and // performs floor division. % works just like in JavaScript, while %% provides “dividend dependent modulo”:

-7 % 5 == -2 # The remainder of 7 / 5
-7 %% 5 == 3 # n %% 5 is always between 0 and 4

tabs.selectTabAtIndex((tabs.currentIndex - count) %% tabs.length)

-7 % 5 == -2 # The remainder of 7 / 5
-7 %% 5 == 3 # n %% 5 is always between 0 and 4

tabs.selectTabAtIndex((tabs.currentIndex - count) %% tabs.length)
var modulo = function(a, b) { return (+a % (b = +b) + b) % b; };

-7 % 5 === -2; // The remainder of 7 / 5

modulo(-7, 5) === 3; // n %% 5 is always between 0 and 4

tabs.selectTabAtIndex(modulo(tabs.currentIndex - count, tabs.length));

var modulo = function(a, b) { return (+a % (b = +b) + b) % b; };

-7 % 5 === -2; // The remainder of 7 / 5

modulo(-7, 5) === 3; // n %% 5 is always between 0 and 4

tabs.selectTabAtIndex(modulo(tabs.currentIndex - count, tabs.length));
All together now:

CoffeeScript	JavaScript
is	===
isnt	!==
not	!
and	&&
or	||
true, yes, on	true
false, no, off 	false
@, this	this
a in b	[].indexOf.call(b, a) >= 0
a of b	a in b
for a from b	for (a of b)
a ** b	a ** b
a // b	Math.floor(a / b)
a %% b	(a % b + b) % b
launch() if ignition is on

volume = 10 if band isnt SpinalTap

letTheWildRumpusBegin() unless answer is no

if car.speed < limit then accelerate()

winner = yes if pick in [47, 92, 13]

print inspect "My name is #{@name}"

launch() if ignition is on

volume = 10 if band isnt SpinalTap

letTheWildRumpusBegin() unless answer is no

if car.speed < limit then accelerate()

winner = yes if pick in [47, 92, 13]

print inspect "My name is #{@name}"
var volume, winner;

if (ignition === true) {
  launch();
}

if (band !== SpinalTap) {
  volume = 10;
}

if (answer !== false) {
  letTheWildRumpusBegin();
}

if (car.speed < limit) {
  accelerate();
}

if (pick === 47 || pick === 92 || pick === 13) {
  winner = true;
}

print(inspect(`My name is ${this.name}`));

var volume, winner;

if (ignition === true) {
  launch();
}

if (band !== SpinalTap) {
  volume = 10;
}

if (answer !== false) {
  letTheWildRumpusBegin();
}

if (car.speed < limit) {
  accelerate();
}

if (pick === 47 || pick === 92 || pick === 13) {
  winner = true;
}

print(inspect(`My name is ${this.name}`));
The Existential Operator
It’s a little difficult to check for the existence of a variable in JavaScript. if (variable) … comes close, but fails for zero, the empty string, and false (to name just the most common cases). CoffeeScript’s existential operator ? returns true unless a variable is null or undefined or undeclared, which makes it analogous to Ruby’s nil?.

It can also be used for safer conditional assignment than the JavaScript pattern a = a || value provides, for cases where you may be handling numbers or strings.

solipsism = true if mind? and not world?

speed = 0
speed ?= 15

footprints = yeti ? "bear"

solipsism = true if mind? and not world?

speed = 0
speed ?= 15

footprints = yeti ? "bear"
var footprints, solipsism, speed;

if ((typeof mind !== "undefined" && mind !== null) && (typeof world === "undefined" || world === null)) {
  solipsism = true;
}

speed = 0;

if (speed == null) {
  speed = 15;
}

footprints = typeof yeti !== "undefined" && yeti !== null ? yeti : "bear";

var footprints, solipsism, speed;

if ((typeof mind !== "undefined" && mind !== null) && (typeof world === "undefined" || world === null)) {
  solipsism = true;
}

speed = 0;

if (speed == null) {
  speed = 15;
}

footprints = typeof yeti !== "undefined" && yeti !== null ? yeti : "bear";
Note that if the compiler knows that a is in scope and therefore declared, a? compiles to a != null, not a !== null. The != makes a loose comparison to null, which does double duty also comparing against undefined. The reverse also holds for not a? or unless a?.

major = 'Computer Science'

unless major?
  signUpForClass 'Introduction to Wines'

major = 'Computer Science'

unless major?
  signUpForClass 'Introduction to Wines'
var major;

major = 'Computer Science';

if (major == null) {
  signUpForClass('Introduction to Wines');
}

var major;

major = 'Computer Science';

if (major == null) {
  signUpForClass('Introduction to Wines');
}
If a variable might be undeclared, the compiler does a thorough check. This is what JavaScript coders should be typing when they want to check if a mystery variable exists.

if window?
  environment = 'browser (probably)'

if window?
  environment = 'browser (probably)'
var environment;

if (typeof window !== "undefined" && window !== null) {
  environment = 'browser (probably)';
}

var environment;

if (typeof window !== "undefined" && window !== null) {
  environment = 'browser (probably)';
}
The accessor variant of the existential operator ?. can be used to soak up null references in a chain of properties. Use it instead of the dot accessor . in cases where the base value may be null or undefined. If all of the properties exist then you’ll get the expected result, if the chain is broken, undefined is returned instead of the TypeError that would be raised otherwise.

zip = lottery.drawWinner?().address?.zipcode

zip = lottery.drawWinner?().address?.zipcode
var ref, zip;

zip = typeof lottery.drawWinner === "function" ? (ref = lottery.drawWinner().address) != null ? ref.zipcode : void 0 : void 0;

var ref, zip;

zip = typeof lottery.drawWinner === "function" ? (ref = lottery.drawWinner().address) != null ? ref.zipcode : void 0 : void 0;
For completeness:

Example	Definition
a?	tests that a is in scope and a != null
a ? b	returns a if a is in scope and a != null; otherwise, b
a?.b or a?['b']	returns a.b if a is in scope and a != null; otherwise, undefined
a?(b, c) or a? b, c 	returns the result of calling a (with arguments b and c) if a is in scope and callable; otherwise, undefined
a ?= b	assigns the value of b to a if a is not in scope or if a == null; produces the new value of a
Chaining Function Calls
Leading . closes all open calls, allowing for simpler chaining syntax.

$ 'body'
.click (e) ->
  $ '.box'
  .fadeIn 'fast'
  .addClass 'show'
.css 'background', 'white'

$ 'body'
.click (e) ->
  $ '.box'
  .fadeIn 'fast'
  .addClass 'show'
.css 'background', 'white'
$('body').click(function(e) {
  return $('.box').fadeIn('fast').addClass('show');
}).css('background', 'white');

$('body').click(function(e) {
  return $('.box').fadeIn('fast').addClass('show');
}).css('background', 'white');
Destructuring Assignment
Just like JavaScript (since ES2015), CoffeeScript has destructuring assignment syntax. When you assign an array or object literal to a value, CoffeeScript breaks up and matches both sides against each other, assigning the values on the right to the variables on the left. In the simplest case, it can be used for parallel assignment:

theBait   = 1000
theSwitch = 0

[theBait, theSwitch] = [theSwitch, theBait]

theBait   = 1000
theSwitch = 0

[theBait, theSwitch] = [theSwitch, theBait]
var theBait, theSwitch;

theBait = 1000;

theSwitch = 0;

[theBait, theSwitch] = [theSwitch, theBait];

var theBait, theSwitch;

theBait = 1000;

theSwitch = 0;

[theBait, theSwitch] = [theSwitch, theBait];
But it’s also helpful for dealing with functions that return multiple values.

weatherReport = (location) ->
  # Make an Ajax request to fetch the weather...
  [location, 72, "Mostly Sunny"]

[city, temp, forecast] = weatherReport "Berkeley, CA"

weatherReport = (location) ->
  # Make an Ajax request to fetch the weather...
  [location, 72, "Mostly Sunny"]

[city, temp, forecast] = weatherReport "Berkeley, CA"
var city, forecast, temp, weatherReport;

weatherReport = function(location) {
  // Make an Ajax request to fetch the weather...
  return [location, 72, "Mostly Sunny"];
};

[city, temp, forecast] = weatherReport("Berkeley, CA");

var city, forecast, temp, weatherReport;

weatherReport = function(location) {
  // Make an Ajax request to fetch the weather...
  return [location, 72, "Mostly Sunny"];
};

[city, temp, forecast] = weatherReport("Berkeley, CA");
Destructuring assignment can be used with any depth of array and object nesting, to help pull out deeply nested properties.

futurists =
  sculptor: "Umberto Boccioni"
  painter:  "Vladimir Burliuk"
  poet:
    name:   "F.T. Marinetti"
    address: [
      "Via Roma 42R"
      "Bellagio, Italy 22021"
    ]

{sculptor} = futurists

{poet: {name, address: [street, city]}} = futurists

futurists =
  sculptor: "Umberto Boccioni"
  painter:  "Vladimir Burliuk"
  poet:
    name:   "F.T. Marinetti"
    address: [
      "Via Roma 42R"
      "Bellagio, Italy 22021"
    ]

{sculptor} = futurists

{poet: {name, address: [street, city]}} = futurists
var city, futurists, name, sculptor, street;

futurists = {
  sculptor: "Umberto Boccioni",
  painter: "Vladimir Burliuk",
  poet: {
    name: "F.T. Marinetti",
    address: ["Via Roma 42R", "Bellagio, Italy 22021"]
  }
};

({sculptor} = futurists);

({
  poet: {
    name,
    address: [street, city]
  }
} = futurists);

var city, futurists, name, sculptor, street;

futurists = {
  sculptor: "Umberto Boccioni",
  painter: "Vladimir Burliuk",
  poet: {
    name: "F.T. Marinetti",
    address: ["Via Roma 42R", "Bellagio, Italy 22021"]
  }
};

({sculptor} = futurists);

({
  poet: {
    name,
    address: [street, city]
  }
} = futurists);
Destructuring assignment can even be combined with splats.

tag = "<impossible>"

[open, contents..., close] = tag.split("")

tag = "<impossible>"

[open, contents..., close] = tag.split("")
var close, contents, open, ref, tag,
  splice = [].splice;

tag = "<impossible>";

ref = tag.split(""), [open, ...contents] = ref, [close] = splice.call(contents, -1);

var close, contents, open, ref, tag,
  splice = [].splice;

tag = "<impossible>";

ref = tag.split(""), [open, ...contents] = ref, [close] = splice.call(contents, -1);
Expansion can be used to retrieve elements from the end of an array without having to assign the rest of its values. It works in function parameter lists as well.

text = "Every literary critic believes he will
        outwit history and have the last word"

[first, ..., last] = text.split " "

text = "Every literary critic believes he will
        outwit history and have the last word"

[first, ..., last] = text.split " "
var first, last, ref, text,
  slice = [].slice;

text = "Every literary critic believes he will outwit history and have the last word";

ref = text.split(" "), [first] = ref, [last] = slice.call(ref, -1);

var first, last, ref, text,
  slice = [].slice;

text = "Every literary critic believes he will outwit history and have the last word";

ref = text.split(" "), [first] = ref, [last] = slice.call(ref, -1);
Destructuring assignment is also useful when combined with class constructors to assign properties to your instance from an options object passed to the constructor.

class Person
  constructor: (options) ->
    {@name, @age, @height = 'average'} = options

tim = new Person name: 'Tim', age: 4

class Person
  constructor: (options) ->
    {@name, @age, @height = 'average'} = options

tim = new Person name: 'Tim', age: 4
var Person, tim;

Person = class Person {
  constructor(options) {
    ({name: this.name, age: this.age, height: this.height = 'average'} = options);
  }

};

tim = new Person({
  name: 'Tim',
  age: 4
});

var Person, tim;

Person = class Person {
  constructor(options) {
    ({name: this.name, age: this.age, height: this.height = 'average'} = options);
  }

};

tim = new Person({
  name: 'Tim',
  age: 4
});
The above example also demonstrates that if properties are missing in the destructured object or array, you can, just like in JavaScript, provide defaults. Note though that unlike with the existential operator, the default is only applied with the value is missing or undefined—passing null will set a value of null, not the default.

Bound (Fat Arrow) Functions
In JavaScript, the this keyword is dynamically scoped to mean the object that the current function is attached to. If you pass a function as a callback or attach it to a different object, the original value of this will be lost. If you’re not familiar with this behavior, this Digital Web article gives a good overview of the quirks.

The fat arrow => can be used to both define a function, and to bind it to the current value of this, right on the spot. This is helpful when using callback-based libraries like Prototype or jQuery, for creating iterator functions to pass to each, or event-handler functions to use with on. Functions created with the fat arrow are able to access properties of the this where they’re defined.

Account = (customer, cart) ->
  @customer = customer
  @cart = cart

  $('.shopping_cart').on 'click', (event) =>
    @customer.purchase @cart

Account = (customer, cart) ->
  @customer = customer
  @cart = cart

  $('.shopping_cart').on 'click', (event) =>
    @customer.purchase @cart
var Account;

Account = function(customer, cart) {
  this.customer = customer;
  this.cart = cart;
  return $('.shopping_cart').on('click', (event) => {
    return this.customer.purchase(this.cart);
  });
};

var Account;

Account = function(customer, cart) {
  this.customer = customer;
  this.cart = cart;
  return $('.shopping_cart').on('click', (event) => {
    return this.customer.purchase(this.cart);
  });
};
If we had used -> in the callback above, @customer would have referred to the undefined “customer” property of the DOM element, and trying to call purchase() on it would have raised an exception.

The fat arrow was one of the most popular features of CoffeeScript, and ES2015 adopted it; so CoffeeScript 2 compiles => to ES =>.

Generator Functions
CoffeeScript supports ES2015 generator functions through the yield keyword. There’s no function*(){} nonsense — a generator in CoffeeScript is simply a function that yields.

perfectSquares = ->
  num = 0
  loop
    num += 1
    yield num * num
  return

window.ps or= perfectSquares()

perfectSquares = ->
  num = 0
  loop
    num += 1
    yield num * num
  return

window.ps or= perfectSquares()
var perfectSquares;

perfectSquares = function*() {
  var num;
  num = 0;
  while (true) {
    num += 1;
    yield num * num;
  }
};

window.ps || (window.ps = perfectSquares());

var perfectSquares;

perfectSquares = function*() {
  var num;
  num = 0;
  while (true) {
    num += 1;
    yield num * num;
  }
};

window.ps || (window.ps = perfectSquares());
yield* is called yield from, and yield return may be used if you need to force a generator that doesn’t yield.

You can iterate over a generator function using for…from.

fibonacci = ->
  [previous, current] = [1, 1]
  loop
    [previous, current] = [current, previous + current]
    yield current
  return

getFibonacciNumbers = (length) ->
  results = [1]
  for n from fibonacci()
    results.push n
    break if results.length is length
  results

fibonacci = ->
  [previous, current] = [1, 1]
  loop
    [previous, current] = [current, previous + current]
    yield current
  return

getFibonacciNumbers = (length) ->
  results = [1]
  for n from fibonacci()
    results.push n
    break if results.length is length
  results
var fibonacci, getFibonacciNumbers;

fibonacci = function*() {
  var current, previous;
  [previous, current] = [1, 1];
  while (true) {
    [previous, current] = [current, previous + current];
    yield current;
  }
};

getFibonacciNumbers = function(length) {
  var n, results;
  results = [1];
  for (n of fibonacci()) {
    results.push(n);
    if (results.length === length) {
      break;
    }
  }
  return results;
};

var fibonacci, getFibonacciNumbers;

fibonacci = function*() {
  var current, previous;
  [previous, current] = [1, 1];
  while (true) {
    [previous, current] = [current, previous + current];
    yield current;
  }
};

getFibonacciNumbers = function(length) {
  var n, results;
  results = [1];
  for (n of fibonacci()) {
    results.push(n);
    if (results.length === length) {
      break;
    }
  }
  return results;
};
Async Functions
ES2017’s async functions are supported through the await keyword. Like with generators, there’s no need for an async keyword; an async function in CoffeeScript is simply a function that awaits.

Similar to how yield return forces a generator, await return may be used to force a function to be async.

# Your browser must support async/await and speech synthesis
# to run this example.

sleep = (ms) ->
  new Promise (resolve) ->
    window.setTimeout resolve, ms

say = (text) ->
  window.speechSynthesis.cancel()
  window.speechSynthesis.speak new SpeechSynthesisUtterance text

countdown = (seconds) ->
  for i in [seconds..1]
    say i
    await sleep 1000 # wait one second
  say "Blastoff!"

countdown 3

# Your browser must support async/await and speech synthesis
# to run this example.

sleep = (ms) ->
  new Promise (resolve) ->
    window.setTimeout resolve, ms

say = (text) ->
  window.speechSynthesis.cancel()
  window.speechSynthesis.speak new SpeechSynthesisUtterance text

countdown = (seconds) ->
  for i in [seconds..1]
    say i
    await sleep 1000 # wait one second
  say "Blastoff!"

countdown 3
// Your browser must support async/await and speech synthesis
// to run this example.
var countdown, say, sleep;

sleep = function(ms) {
  return new Promise(function(resolve) {
    return window.setTimeout(resolve, ms);
  });
};

say = function(text) {
  window.speechSynthesis.cancel();
  return window.speechSynthesis.speak(new SpeechSynthesisUtterance(text));
};

countdown = async function(seconds) {
  var i, j, ref;
  for (i = j = ref = seconds; (ref <= 1 ? j <= 1 : j >= 1); i = ref <= 1 ? ++j : --j) {
    say(i);
    await sleep(1000); // wait one second
  }
  return say("Blastoff!");
};

countdown(3);

// Your browser must support async/await and speech synthesis
// to run this example.
var countdown, say, sleep;

sleep = function(ms) {
  return new Promise(function(resolve) {
    return window.setTimeout(resolve, ms);
  });
};

say = function(text) {
  window.speechSynthesis.cancel();
  return window.speechSynthesis.speak(new SpeechSynthesisUtterance(text));
};

countdown = async function(seconds) {
  var i, j, ref;
  for (i = j = ref = seconds; (ref <= 1 ? j <= 1 : j >= 1); i = ref <= 1 ? ++j : --j) {
    say(i);
    await sleep(1000); // wait one second
  }
  return say("Blastoff!");
};

countdown(3);
Classes
CoffeeScript 1 provided the class and extends keywords as syntactic sugar for working with prototypal functions. With ES2015, JavaScript has adopted those keywords; so CoffeeScript 2 compiles its class and extends keywords to ES2015 classes.

class Animal
  constructor: (@name) ->

  move: (meters) ->
    alert @name + " moved #{meters}m."

class Snake extends Animal
  move: ->
    alert "Slithering..."
    super 5

class Horse extends Animal
  move: ->
    alert "Galloping..."
    super 45

sam = new Snake "Sammy the Python"
tom = new Horse "Tommy the Palomino"

sam.move()
tom.move()

class Animal
  constructor: (@name) ->

  move: (meters) ->
    alert @name + " moved #{meters}m."

class Snake extends Animal
  move: ->
    alert "Slithering..."
    super 5

class Horse extends Animal
  move: ->
    alert "Galloping..."
    super 45

sam = new Snake "Sammy the Python"
tom = new Horse "Tommy the Palomino"

sam.move()
tom.move()
var Animal, Horse, Snake, sam, tom;

Animal = class Animal {
  constructor(name) {
    this.name = name;
  }

  move(meters) {
    return alert(this.name + ` moved ${meters}m.`);
  }

};

Snake = class Snake extends Animal {
  move() {
    alert("Slithering...");
    return super.move(5);
  }

};

Horse = class Horse extends Animal {
  move() {
    alert("Galloping...");
    return super.move(45);
  }

};

sam = new Snake("Sammy the Python");

tom = new Horse("Tommy the Palomino");

sam.move();

tom.move();

var Animal, Horse, Snake, sam, tom;

Animal = class Animal {
  constructor(name) {
    this.name = name;
  }

  move(meters) {
    return alert(this.name + ` moved ${meters}m.`);
  }

};

Snake = class Snake extends Animal {
  move() {
    alert("Slithering...");
    return super.move(5);
  }

};

Horse = class Horse extends Animal {
  move() {
    alert("Galloping...");
    return super.move(45);
  }

};

sam = new Snake("Sammy the Python");

tom = new Horse("Tommy the Palomino");

sam.move();

tom.move();
Static methods can be defined using @ before the method name:

class Teenager
  @say: (speech) ->
    words = speech.split ' '
    fillers = ['uh', 'um', 'like', 'actually', 'so', 'maybe']
    output = []
    for word, index in words
      output.push word
      output.push fillers[Math.floor(Math.random() * fillers.length)] unless index is words.length - 1
    output.join ', '

class Teenager
  @say: (speech) ->
    words = speech.split ' '
    fillers = ['uh', 'um', 'like', 'actually', 'so', 'maybe']
    output = []
    for word, index in words
      output.push word
      output.push fillers[Math.floor(Math.random() * fillers.length)] unless index is words.length - 1
    output.join ', '
var Teenager;

Teenager = class Teenager {
  static say(speech) {
    var fillers, i, index, len, output, word, words;
    words = speech.split(' ');
    fillers = ['uh', 'um', 'like', 'actually', 'so', 'maybe'];
    output = [];
    for (index = i = 0, len = words.length; i < len; index = ++i) {
      word = words[index];
      output.push(word);
      if (index !== words.length - 1) {
        output.push(fillers[Math.floor(Math.random() * fillers.length)]);
      }
    }
    return output.join(', ');
  }

};

var Teenager;

Teenager = class Teenager {
  static say(speech) {
    var fillers, i, index, len, output, word, words;
    words = speech.split(' ');
    fillers = ['uh', 'um', 'like', 'actually', 'so', 'maybe'];
    output = [];
    for (index = i = 0, len = words.length; i < len; index = ++i) {
      word = words[index];
      output.push(word);
      if (index !== words.length - 1) {
        output.push(fillers[Math.floor(Math.random() * fillers.length)]);
      }
    }
    return output.join(', ');
  }

};
Finally, class definitions are blocks of executable code, which make for interesting metaprogramming possibilities. In the context of a class definition, this is the class object itself; therefore, you can assign static properties by using @property: value.

Prototypal Inheritance
In addition to supporting ES2015 classes, CoffeeScript provides a shortcut for working with prototypes. The :: operator gives you quick access to an object’s prototype:

String::dasherize = ->
  this.replace /_/g, "-"

String::dasherize = ->
  this.replace /_/g, "-"
String.prototype.dasherize = function() {
  return this.replace(/_/g, "-");
};

String.prototype.dasherize = function() {
  return this.replace(/_/g, "-");
};
Switch/When/Else
switch statements in JavaScript are a bit awkward. You need to remember to break at the end of every case statement to avoid accidentally falling through to the default case. CoffeeScript prevents accidental fall-through, and can convert the switch into a returnable, assignable expression. The format is: switch condition, when clauses, else the default case.

As in Ruby, switch statements in CoffeeScript can take multiple values for each when clause. If any of the values match, the clause runs.

switch day
  when "Mon" then go work
  when "Tue" then go relax
  when "Thu" then go iceFishing
  when "Fri", "Sat"
    if day is bingoDay
      go bingo
      go dancing
  when "Sun" then go church
  else go work

switch day
  when "Mon" then go work
  when "Tue" then go relax
  when "Thu" then go iceFishing
  when "Fri", "Sat"
    if day is bingoDay
      go bingo
      go dancing
  when "Sun" then go church
  else go work
switch (day) {
  case "Mon":
    go(work);
    break;
  case "Tue":
    go(relax);
    break;
  case "Thu":
    go(iceFishing);
    break;
  case "Fri":
  case "Sat":
    if (day === bingoDay) {
      go(bingo);
      go(dancing);
    }
    break;
  case "Sun":
    go(church);
    break;
  default:
    go(work);
}

switch (day) {
  case "Mon":
    go(work);
    break;
  case "Tue":
    go(relax);
    break;
  case "Thu":
    go(iceFishing);
    break;
  case "Fri":
  case "Sat":
    if (day === bingoDay) {
      go(bingo);
      go(dancing);
    }
    break;
  case "Sun":
    go(church);
    break;
  default:
    go(work);
}
switch statements can also be used without a control expression, turning them in to a cleaner alternative to if/else chains.

score = 76
grade = switch
  when score < 60 then 'F'
  when score < 70 then 'D'
  when score < 80 then 'C'
  when score < 90 then 'B'
  else 'A'
# grade == 'C'

score = 76
grade = switch
  when score < 60 then 'F'
  when score < 70 then 'D'
  when score < 80 then 'C'
  when score < 90 then 'B'
  else 'A'
# grade == 'C'
var grade, score;

score = 76;

grade = (function() {
  switch (false) {
    case !(score < 60):
      return 'F';
    case !(score < 70):
      return 'D';
    case !(score < 80):
      return 'C';
    case !(score < 90):
      return 'B';
    default:
      return 'A';
  }
})();

// grade == 'C'

var grade, score;

score = 76;

grade = (function() {
  switch (false) {
    case !(score < 60):
      return 'F';
    case !(score < 70):
      return 'D';
    case !(score < 80):
      return 'C';
    case !(score < 90):
      return 'B';
    default:
      return 'A';
  }
})();

// grade == 'C'
Try/Catch/Finally
try expressions have the same semantics as try statements in JavaScript, though in CoffeeScript, you may omit both the catch and finally parts. The catch part may also omit the error parameter if it is not needed.

try
  allHellBreaksLoose()
  catsAndDogsLivingTogether()
catch error
  print error
finally
  cleanUp()

try
  allHellBreaksLoose()
  catsAndDogsLivingTogether()
catch error
  print error
finally
  cleanUp()
var error;

try {
  allHellBreaksLoose();
  catsAndDogsLivingTogether();
} catch (error1) {
  error = error1;
  print(error);
} finally {
  cleanUp();
}

var error;

try {
  allHellBreaksLoose();
  catsAndDogsLivingTogether();
} catch (error1) {
  error = error1;
  print(error);
} finally {
  cleanUp();
}
Chained Comparisons
CoffeeScript borrows chained comparisons from Python — making it easy to test if a value falls within a certain range.

cholesterol = 127

healthy = 200 > cholesterol > 60

cholesterol = 127

healthy = 200 > cholesterol > 60
var cholesterol, healthy;

cholesterol = 127;

healthy = (200 > cholesterol && cholesterol > 60);

var cholesterol, healthy;

cholesterol = 127;

healthy = (200 > cholesterol && cholesterol > 60);
Block Regular Expressions
Similar to block strings and comments, CoffeeScript supports block regexes — extended regular expressions that ignore internal whitespace and can contain comments and interpolation. Modeled after Perl’s /x modifier, CoffeeScript’s block regexes are delimited by /// and go a long way towards making complex regular expressions readable. To quote from the CoffeeScript source:

NUMBER     = ///
  ^ 0b[01]+    |              # binary
  ^ 0o[0-7]+   |              # octal
  ^ 0x[\da-f]+ |              # hex
  ^ \d*\.?\d+ (?:e[+-]?\d+)?  # decimal
///i

NUMBER     = ///
  ^ 0b[01]+    |              # binary
  ^ 0o[0-7]+   |              # octal
  ^ 0x[\da-f]+ |              # hex
  ^ \d*\.?\d+ (?:e[+-]?\d+)?  # decimal
///i
var NUMBER;

NUMBER = /^0b[01]+|^0o[0-7]+|^0x[\da-f]+|^\d*\.?\d+(?:e[+-]?\d+)?/i; // binary
// octal
// hex
// decimal

var NUMBER;

NUMBER = /^0b[01]+|^0o[0-7]+|^0x[\da-f]+|^\d*\.?\d+(?:e[+-]?\d+)?/i; // binary
// octal
// hex
// decimal
Tagged Template Literals
CoffeeScript supports ES2015 tagged template literals, which enable customized string interpolation. If you immediately prefix a string with a function name (no space between the two), CoffeeScript will output this “function plus string” combination as an ES2015 tagged template literal, which will behave accordingly: the function is called, with the parameters being the input text and expression parts that make up the interpolated string. The function can then assemble these parts into an output string, providing custom string interpolation.

upperCaseExpr = (textParts, expressions...) ->
  textParts.reduce (text, textPart, i) ->
    text + expressions[i - 1].toUpperCase() + textPart

greet = (name, adjective) ->
  upperCaseExpr"""
               Hi #{name}. You look #{adjective}!
               """

upperCaseExpr = (textParts, expressions...) ->
  textParts.reduce (text, textPart, i) ->
    text + expressions[i - 1].toUpperCase() + textPart

greet = (name, adjective) ->
  upperCaseExpr"""
               Hi #{name}. You look #{adjective}!
               """
var greet, upperCaseExpr;

upperCaseExpr = function(textParts, ...expressions) {
  return textParts.reduce(function(text, textPart, i) {
    return text + expressions[i - 1].toUpperCase() + textPart;
  });
};

greet = function(name, adjective) {
  return upperCaseExpr`Hi ${name}. You look ${adjective}!`;
};

var greet, upperCaseExpr;

upperCaseExpr = function(textParts, ...expressions) {
  return textParts.reduce(function(text, textPart, i) {
    return text + expressions[i - 1].toUpperCase() + textPart;
  });
};

greet = function(name, adjective) {
  return upperCaseExpr`Hi ${name}. You look ${adjective}!`;
};
Modules
ES2015 modules are supported in CoffeeScript, with very similar import and export syntax:

import './local-file.js' # Must be the filename of the generated file
import 'package'

import _ from 'underscore'
import * as underscore from 'underscore'

import { now } from 'underscore'
import { now as currentTimestamp } from 'underscore'
import { first, last } from 'underscore'
import utilityBelt, { each } from 'underscore'

import dates from './calendar.json' assert { type: 'json' }

export default Math
export square = (x) -> x * x
export class Mathematics
  least: (x, y) -> if x < y then x else y

export { sqrt }
export { sqrt as squareRoot }
export { Mathematics as default, sqrt as squareRoot }

export * from 'underscore'
export { max, min } from 'underscore'
export { version } from './package.json' assert { type: 'json' }

import './local-file.js' # Must be the filename of the generated file
import 'package'

import _ from 'underscore'
import * as underscore from 'underscore'

import { now } from 'underscore'
import { now as currentTimestamp } from 'underscore'
import { first, last } from 'underscore'
import utilityBelt, { each } from 'underscore'

import dates from './calendar.json' assert { type: 'json' }

export default Math
export square = (x) -> x * x
export class Mathematics
  least: (x, y) -> if x < y then x else y

export { sqrt }
export { sqrt as squareRoot }
export { Mathematics as default, sqrt as squareRoot }

export * from 'underscore'
export { max, min } from 'underscore'
export { version } from './package.json' assert { type: 'json' }
import './local-file.js';

import 'package';

import _ from 'underscore';

import * as underscore from 'underscore';

import {
  now
} from 'underscore';

import {
  now as currentTimestamp
} from 'underscore';

import {
  first,
  last
} from 'underscore';

import utilityBelt, {
  each
} from 'underscore';

import dates from './calendar.json' assert {
  type: 'json'
};

export default Math;

export var square = function(x) {
  return x * x;
};

export var Mathematics = class Mathematics {
  least(x, y) {
    if (x < y) {
      return x;
    } else {
      return y;
    }
  }

};

export {
  sqrt
};

export {
  sqrt as squareRoot
};

export {
  Mathematics as default,
  sqrt as squareRoot
};

export * from 'underscore';

export {
  max,
  min
} from 'underscore';

export {
  version
} from './package.json' assert {
    type: 'json'
  };

import './local-file.js';

import 'package';

import _ from 'underscore';

import * as underscore from 'underscore';

import {
  now
} from 'underscore';

import {
  now as currentTimestamp
} from 'underscore';

import {
  first,
  last
} from 'underscore';

import utilityBelt, {
  each
} from 'underscore';

import dates from './calendar.json' assert {
  type: 'json'
};

export default Math;

export var square = function(x) {
  return x * x;
};

export var Mathematics = class Mathematics {
  least(x, y) {
    if (x < y) {
      return x;
    } else {
      return y;
    }
  }

};

export {
  sqrt
};

export {
  sqrt as squareRoot
};

export {
  Mathematics as default,
  sqrt as squareRoot
};

export * from 'underscore';

export {
  max,
  min
} from 'underscore';

export {
  version
} from './package.json' assert {
    type: 'json'
  };
Dynamic import is also supported, with mandatory parentheses:

# Your browser must support dynamic import to run this example.

do ->
  { run } = await import('./browser-compiler-modern/coffeescript.js')
  run '''
    if 5 < new Date().getHours() < 9
      alert 'Time to make the coffee!'
    else
      alert 'Time to get some work done.'
  '''

# Your browser must support dynamic import to run this example.

do ->
  { run } = await import('./browser-compiler-modern/coffeescript.js')
  run '''
    if 5 < new Date().getHours() < 9
      alert 'Time to make the coffee!'
    else
      alert 'Time to get some work done.'
  '''
// Your browser must support dynamic import to run this example.
(async function() {
  var run;
  ({run} = (await import('./browser-compiler-modern/coffeescript.js')));
  return run(`if 5 < new Date().getHours() < 9
  alert 'Time to make the coffee!'
else
  alert 'Time to get some work done.'`);
})();

// Your browser must support dynamic import to run this example.
(async function() {
  var run;
  ({run} = (await import('./browser-compiler-modern/coffeescript.js')));
  return run(`if 5 < new Date().getHours() < 9
  alert 'Time to make the coffee!'
else
  alert 'Time to get some work done.'`);
})();
Note that the CoffeeScript compiler does not resolve modules; writing an import or export statement in CoffeeScript will produce an import or export statement in the resulting output. Such statements can be run by all modern browsers (when the script is referenced via <script type="module">) and by Node.js when the output .js files are in a folder where the nearest parent package.json file contains "type": "module". Because the runtime is evaluating the generated output, the import statements must reference the output files; so if file.coffee is output as file.js, it needs to be referenced as file.js in the import statement, with the .js extension included.

Also, any file with an import or export statement will be output without a top-level function safety wrapper; in other words, importing or exporting modules will automatically trigger bare mode for that file. This is because per the ES2015 spec, import or export statements must occur at the topmost scope.

Embedded JavaScript
Hopefully, you’ll never need to use it, but if you ever need to intersperse snippets of JavaScript within your CoffeeScript, you can use backticks to pass it straight through.

hi = `function() {
  return [document.title, "Hello JavaScript"].join(": ");
}`

hi = `function() {
  return [document.title, "Hello JavaScript"].join(": ");
}`
var hi;

hi = function() {
  return [document.title, "Hello JavaScript"].join(": ");
};

var hi;

hi = function() {
  return [document.title, "Hello JavaScript"].join(": ");
};
Escape backticks with backslashes: \`​ becomes `​.

Escape backslashes before backticks with more backslashes: \\\`​ becomes \`​.

markdown = `function () {
  return \`In Markdown, write code like \\\`this\\\`\`;
}`

markdown = `function () {
  return \`In Markdown, write code like \\\`this\\\`\`;
}`
var markdown;

markdown = function () {
  return `In Markdown, write code like \`this\``;
};

var markdown;

markdown = function () {
  return `In Markdown, write code like \`this\``;
};
You can also embed blocks of JavaScript using triple backticks. That’s easier than escaping backticks, if you need them inside your JavaScript block.

```
function time() {
  return `The time is ${new Date().toLocaleTimeString()}`;
}
```

```
function time() {
  return `The time is ${new Date().toLocaleTimeString()}`;
}
```
function time() {
  return `The time is ${new Date().toLocaleTimeString()}`;
}
;


function time() {
  return `The time is ${new Date().toLocaleTimeString()}`;
}
;

JSX
JSX is JavaScript containing interspersed XML elements. While conceived for React, it is not specific to any particular library or framework.

CoffeeScript supports interspersed XML elements, without the need for separate plugins or special settings. The XML elements will be compiled as such, outputting JSX that could be parsed like any normal JSX file, for example by Babel with the React JSX transform. CoffeeScript does not output React.createElement calls or any code specific to React or any other framework. It is up to you to attach another step in your build chain to convert this JSX to whatever function calls you wish the XML elements to compile to.

Just like in JSX and HTML, denote XML tags using < and >. You can interpolate CoffeeScript code inside a tag using { and }. To avoid compiler errors, when using < and > to mean “less than” or “greater than,” you should wrap the operators in spaces to distinguish them from XML tags. So i < len, not i<len. The compiler tries to be forgiving when it can be sure what you intend, but always putting spaces around the “less than” and “greater than” operators will remove ambiguity.

renderStarRating = ({ rating, maxStars }) ->
  <aside title={"Rating: #{rating} of #{maxStars} stars"}>
    {for wholeStar in [0...Math.floor(rating)]
      <Star className="wholeStar" key={wholeStar} />}
    {if rating % 1 isnt 0
      <Star className="halfStar" />}
    {for emptyStar in [Math.ceil(rating)...maxStars]
      <Star className="emptyStar" key={emptyStar} />}
  </aside>

renderStarRating = ({ rating, maxStars }) ->
  <aside title={"Rating: #{rating} of #{maxStars} stars"}>
    {for wholeStar in [0...Math.floor(rating)]
      <Star className="wholeStar" key={wholeStar} />}
    {if rating % 1 isnt 0
      <Star className="halfStar" />}
    {for emptyStar in [Math.ceil(rating)...maxStars]
      <Star className="emptyStar" key={emptyStar} />}
  </aside>
var renderStarRating;

renderStarRating = function({rating, maxStars}) {
  var emptyStar, wholeStar;
  return <aside title={`Rating: ${rating} of ${maxStars} stars`}>
    {(function() {
    var i, ref, results;
    results = [];
    for (wholeStar = i = 0, ref = Math.floor(rating); (0 <= ref ? i < ref : i > ref); wholeStar = 0 <= ref ? ++i : --i) {
      results.push(<Star className="wholeStar" key={wholeStar} />);
    }
    return results;
  })()}
    {rating % 1 !== 0 ? <Star className="halfStar" /> : void 0}
    {(function() {
    var i, ref, ref1, results;
    results = [];
    for (emptyStar = i = ref = Math.ceil(rating), ref1 = maxStars; (ref <= ref1 ? i < ref1 : i > ref1); emptyStar = ref <= ref1 ? ++i : --i) {
      results.push(<Star className="emptyStar" key={emptyStar} />);
    }
    return results;
  })()}
  </aside>;
};

var renderStarRating;

renderStarRating = function({rating, maxStars}) {
  var emptyStar, wholeStar;
  return <aside title={`Rating: ${rating} of ${maxStars} stars`}>
    {(function() {
    var i, ref, results;
    results = [];
    for (wholeStar = i = 0, ref = Math.floor(rating); (0 <= ref ? i < ref : i > ref); wholeStar = 0 <= ref ? ++i : --i) {
      results.push(<Star className="wholeStar" key={wholeStar} />);
    }
    return results;
  })()}
    {rating % 1 !== 0 ? <Star className="halfStar" /> : void 0}
    {(function() {
    var i, ref, ref1, results;
    results = [];
    for (emptyStar = i = ref = Math.ceil(rating), ref1 = maxStars; (ref <= ref1 ? i < ref1 : i > ref1); emptyStar = ref <= ref1 ? ++i : --i) {
      results.push(<Star className="emptyStar" key={emptyStar} />);
    }
    return results;
  })()}
  </aside>;
};
Older plugins or forks of CoffeeScript supported JSX syntax and referred to it as CSX or CJSX. They also often used a .cjsx file extension, but this is no longer necessary; regular .coffee will do.

Type Annotations
Static type checking can be achieved in CoffeeScript by using Flow’s Comment Types syntax:

# @flow

###::
type Obj = {
  num: number,
};
###

fn = (str ###: string ###, obj ###: Obj ###) ###: string ### ->
  str + obj.num

# @flow

###::
type Obj = {
  num: number,
};
###

fn = (str ###: string ###, obj ###: Obj ###) ###: string ### ->
  str + obj.num
// @flow
/*::
type Obj = {
  num: number,
};
*/
var fn;

fn = function(str/*: string */, obj/*: Obj */)/*: string */ {
  return str + obj.num;
};

// @flow
/*::
type Obj = {
  num: number,
};
*/
var fn;

fn = function(str/*: string */, obj/*: Obj */)/*: string */ {
  return str + obj.num;
};
CoffeeScript does not do any type checking itself; the JavaScript output you see above needs to get passed to Flow for it to validate your code. We expect most people will use a build tool for this, but here’s how to do it the simplest way possible using the CoffeeScript and Flow command-line tools, assuming you’ve already installed Flow and the latest CoffeeScript in your project folder:

coffee --bare --no-header --compile app.coffee && npm run flow
--bare and --no-header are important because Flow requires the first line of the file to be the comment // @flow. If you configure your build chain to compile CoffeeScript and pass the result to Flow in-memory, you can get better performance than this example; and a proper build tool should be able to watch your CoffeeScript files and recompile and type-check them for you on save.

If you know of another way to achieve static type checking with CoffeeScript, please create an issue and let us know.

Literate CoffeeScript
Besides being used as an ordinary programming language, CoffeeScript may also be written in “literate” mode. If you name your file with a .litcoffee extension, you can write it as a Markdown document — a document that also happens to be executable CoffeeScript code. The compiler will treat any indented blocks (Markdown’s way of indicating source code) as executable code, and ignore the rest as comments. Code blocks must also be separated from comments by at least one blank line.

Just for kicks, a little bit of the compiler is currently implemented in this fashion: See it as a document, raw, and properly highlighted in a text editor.

A few caveats:

Code blocks need to maintain consistent indentation relative to each other. When the compiler parses your Literate CoffeeScript file, it first discards all the non-code block lines and then parses the remainder as a regular CoffeeScript file. Therefore the code blocks need to be written as if the comment lines don’t exist, with consistent indentation (including whether they are indented with tabs or spaces).
Along those lines, code blocks within list items or blockquotes are not treated as executable code. Since list items and blockquotes imply their own indentation, it would be ambiguous how to treat indentation between successive code blocks when some are within these other blocks and some are not.
List items can be at most only one paragraph long. The second paragraph of a list item would be indented after a blank line, and therefore indistinguishable from a code block.
Source Maps
CoffeeScript includes support for generating source maps, a way to tell your JavaScript engine what part of your CoffeeScript program matches up with the code being evaluated. Browsers that support it can automatically use source maps to show your original source code in the debugger. To generate source maps alongside your JavaScript files, pass the --map or -m flag to the compiler.

For a full introduction to source maps, how they work, and how to hook them up in your browser, read the HTML5 Tutorial.

Cake, and Cakefiles
CoffeeScript includes a (very) simple build system similar to Make and Rake. Naturally, it’s called Cake, and is used for the tasks that build and test the CoffeeScript language itself. Tasks are defined in a file named Cakefile, and can be invoked by running cake [task] from within the directory. To print a list of all the tasks and options, just type cake.

Task definitions are written in CoffeeScript, so you can put arbitrary code in your Cakefile. Define a task with a name, a long description, and the function to invoke when the task is run. If your task takes a command-line option, you can define the option with short and long flags, and it will be made available in the options object. Here’s a task that uses the Node.js API to rebuild CoffeeScript’s parser:

fs = require 'fs'

option '-o', '--output [DIR]', 'directory for compiled code'

task 'build:parser', 'rebuild the Jison parser', (options) ->
  require 'jison'
  code = require('./lib/grammar').parser.generate()
  dir  = options.output or 'lib'
  fs.writeFile "#{dir}/parser.js", code

fs = require 'fs'

option '-o', '--output [DIR]', 'directory for compiled code'

task 'build:parser', 'rebuild the Jison parser', (options) ->
  require 'jison'
  code = require('./lib/grammar').parser.generate()
  dir  = options.output or 'lib'
  fs.writeFile "#{dir}/parser.js", code
var fs;

fs = require('fs');

option('-o', '--output [DIR]', 'directory for compiled code');

task('build:parser', 'rebuild the Jison parser', function(options) {
  var code, dir;
  require('jison');
  code = require('./lib/grammar').parser.generate();
  dir = options.output || 'lib';
  return fs.writeFile(`${dir}/parser.js`, code);
});

var fs;

fs = require('fs');

option('-o', '--output [DIR]', 'directory for compiled code');

task('build:parser', 'rebuild the Jison parser', function(options) {
  var code, dir;
  require('jison');
  code = require('./lib/grammar').parser.generate();
  dir = options.output || 'lib';
  return fs.writeFile(`${dir}/parser.js`, code);
});
If you need to invoke one task before another — for example, running build before test, you can use the invoke function: invoke 'build'. Cake tasks are a minimal way to expose your CoffeeScript functions to the command line, so don’t expect any fanciness built-in. If you need dependencies, or async callbacks, it’s best to put them in your code itself — not the cake task.

"text/coffeescript" Script Tags
While it’s not recommended for serious use, CoffeeScripts may be included directly within the browser using <script type="text/coffeescript"> tags. The source includes a compressed and minified version of the compiler (Download current version here, 77k when gzipped) as docs/v2/browser-compiler-legacy/coffeescript.js. Include this file on a page with inline CoffeeScript tags, and it will compile and evaluate them in order.

The usual caveats about CoffeeScript apply — your inline scripts will run within a closure wrapper, so if you want to expose global variables or functions, attach them to the window object.

Integrations
CoffeeScript is part of the vast JavaScript ecosystem, and many libraries help integrate CoffeeScript with JavaScript. Major projects, especially projects updated to work with CoffeeScript 2, are listed here; more can be found in the wiki pages. If there’s a project that you feel should be added to this section, please open an issue or pull request. Projects are listed in alphabetical order by category.

Build Tools
Browserify with coffeeify

Grunt with grunt-contrib-coffee

Gulp with gulp-coffee

Parcel with transformer-coffeescript

Rollup with rollup-plugin-coffee-script

Webpack with coffee-loader

Code Editors
Atom packages

Sublime Text packages

Visual Studio Code extensions

Frameworks
Ember with ember-cli-coffeescript

Meteor with coffeescript-compiler

Linters and Formatting
CoffeeLint

ESLint with eslint-plugin-coffee

Prettier with prettier-plugin-coffeescript

Testing
Jest with jest-preset-coffeescript
Resources
CoffeeScript on GitHub
CoffeeScript Issues
Bug reports, feature proposals, and ideas for changes to the language belong here.
CoffeeScript Google Group
If you’d like to ask a question, the mailing list is a good place to get help.
The CoffeeScript Wiki
If you’ve ever learned a neat CoffeeScript tip or trick, or ran into a gotcha — share it on the wiki.
The FAQ
Perhaps your CoffeeScript-related question has been asked before. Check the FAQ first.
JS2Coffee
Is a very well done reverse JavaScript-to-CoffeeScript compiler. It’s not going to be perfect (infer what your JavaScript classes are, when you need bound functions, and so on…) — but it’s a great starting point for converting simple scripts.
High-Rez Logo
The CoffeeScript logo is available in SVG for use in presentations.
Books
There are a number of excellent resources to help you get started with CoffeeScript, some of which are freely available online.

The Little Book on CoffeeScript is a brief 5-chapter introduction to CoffeeScript, written with great clarity and precision by Alex MacCaw.
Smooth CoffeeScript is a reimagination of the excellent book Eloquent JavaScript, as if it had been written in CoffeeScript instead. Covers language features as well as the functional and object oriented programming styles. By E. Hoigaard.
CoffeeScript: Accelerated JavaScript Development is Trevor Burnham’s thorough introduction to the language. By the end of the book, you’ll have built a fast-paced multiplayer word game, writing both the client-side and Node.js portions in CoffeeScript.
CoffeeScript Programming with jQuery, Rails, and Node.js is a new book by Michael Erasmus that covers CoffeeScript with an eye towards real-world usage both in the browser (jQuery) and on the server-side (Rails, Node).
CoffeeScript Ristretto is a deep dive into CoffeeScript’s semantics from simple functions up through closures, higher-order functions, objects, classes, combinators, and decorators. By Reg Braithwaite.
Testing with CoffeeScript is a succinct and freely downloadable guide to building testable applications with CoffeeScript and Jasmine.
CoffeeScript Application Development from Packt, introduces CoffeeScript while walking through the process of building a demonstration web application. A CoffeeScript Application Development Coookbook with over 90 “recipes” is also available.
CoffeeScript in Action from Manning Publications, covers CoffeeScript syntax, composition techniques and application development.
CoffeeScript: Die Alternative zu JavaScript from dpunkt.verlag, is the first CoffeeScript book in Deutsch.
Screencasts
A Sip of CoffeeScript is a Code School Course which combines 6 screencasts with in-browser coding to make learning fun. The first level is free to try out.
Meet CoffeeScript is a 75-minute long screencast by PeepCode, now PluralSight. Highly memorable for its animations which demonstrate transforming CoffeeScript into the equivalent JS.
If you’re looking for less of a time commitment, RailsCasts’ CoffeeScript Basics should have you covered, hitting all of the important notes about CoffeeScript in 11 minutes.
Examples
The best list of open-source CoffeeScript examples can be found on GitHub. But just to throw out a few more:

GitHub’s Hubot, a friendly IRC robot that can perform any number of useful and useless tasks.
sstephenson’s Pow, a zero-configuration Rack server, with comprehensive annotated source.
technoweenie’s Coffee-Resque, a port of Resque for Node.js.
stephank’s Orona, a remake of the Bolo tank game for modern browsers.
GitHub’s Atom, a hackable text editor built on web technologies.
Basecamp’s Trix, a rich text editor for web apps.
Web Chat (IRC)
Quick help and advice can often be found in the CoffeeScript IRC room #coffeescript on irc.freenode.net, which you can join via your web browser.

Annotated Source
You can browse the CoffeeScript 2.7.0 source in readable, annotated form here. You can also jump directly to a particular source file:

Grammar Rules — src/grammar
Lexing Tokens — src/lexer
The Rewriter — src/rewriter
The Syntax Tree — src/nodes
Lexical Scope — src/scope
Helpers & Utility Functions — src/helpers
The CoffeeScript Module — src/coffeescript
Cake & Cakefiles — src/cake
“coffee” Command-Line Utility — src/command
Option Parsing — src/optparse
Interactive REPL — src/repl
Source Maps — src/sourcemap
Contributing
Contributions are welcome! Feel free to fork the repo and submit a pull request.

Some features of ECMAScript are intentionally unsupported. Please review both the open and closed issues on GitHub to see if the feature you’re looking for has already been discussed. As a general rule, we don’t support ECMAScript syntax for features that aren’t yet finalized (at Stage 4 in the proposal approval process) or implemented in major browsers and/or Node (which can sometimes happen for features in Stage 3). Any Stage 3 features that CoffeeScript chooses to support should be considered experimental, subject to breaking changes or removal until the feature reaches Stage 4.

For more resources on adding to CoffeeScript, please see the Wiki, especially How The Parser Works.

There are several things you can do to increase your odds of having your pull request accepted:

Create tests! Any pull request should probably include basic tests to verify you didn’t break anything, or future changes won’t break your code.
Follow the style of the rest of the CoffeeScript codebase.
Ensure any ECMAScript syntax is mature (at Stage 4, or at Stage 3 with support in major browsers or runtimes).
Add only features that have broad utility, rather than a feature aimed at a specific use case or framework.
Of course, it’s entirely possible that you have a great addition, but it doesn’t fit within these constraints. Feel free to roll your own solution; you will have plenty of company.

Unsupported ECMAScript Features
There are a few ECMAScript features that CoffeeScript intentionally doesn’t support.

let and const: block-scoped and reassignment-protected variables
When CoffeeScript was designed, var was intentionally omitted. This was to spare developers the mental housekeeping of needing to worry about variable declaration (var foo) as opposed to variable assignment (foo = 1). The CoffeeScript compiler automatically takes care of declaration for you, by generating var statements at the top of every function scope. This makes it impossible to accidentally declare a global variable.

let and const add a useful ability to JavaScript in that you can use them to declare variables within a block scope, for example within an if statement body or a for loop body, whereas var always declares variables in the scope of an entire function. When CoffeeScript 2 was designed, there was much discussion of whether this functionality was useful enough to outweigh the simplicity offered by never needing to consider variable declaration in CoffeeScript. In the end, it was decided that the simplicity was more valued. In CoffeeScript there remains only one type of variable.

Keep in mind that const only protects you from reassigning a variable; it doesn’t prevent the variable’s value from changing, the way constants usually do in other languages:

const obj = {foo: 'bar'};
obj.foo = 'baz'; // Allowed!
obj = {}; // Throws error
Named functions and function declarations
Newcomers to CoffeeScript often wonder how to generate the JavaScript function foo() {}, as opposed to the foo = function() {} that CoffeeScript produces. The first form is a function declaration, and the second is a function expression. As stated above, in CoffeeScript everything is an expression, so naturally we favor the expression form. Supporting only one variant helps avoid confusing bugs that can arise from the subtle differences between the two forms.

Technically, foo = function() {} is creating an anonymous function that gets assigned to a variable named foo. Some very early versions of CoffeeScript named this function, e.g. foo = function foo() {}, but this was dropped because of compatibility issues with Internet Explorer. For a while this annoyed people, as these functions would be unnamed in stack traces; but modern JavaScript runtimes infer the names of such anonymous functions from the names of the variables to which they’re assigned. Given that this is the case, it’s simplest to just preserve the current behavior.

get and set keyword shorthand syntax
get and set, as keywords preceding functions or class methods, are intentionally unimplemented in CoffeeScript.

This is to avoid grammatical ambiguity, since in CoffeeScript such a construct looks identical to a function call (e.g. get(function foo() {})); and because there is an alternate syntax that is slightly more verbose but just as effective:

screen =
  width: 1200
  ratio: 16/9

Object.defineProperty screen, 'height',
  get: ->
    this.width / this.ratio
  set: (val) ->
    this.width = val * this.ratio

screen =
  width: 1200
  ratio: 16/9

Object.defineProperty screen, 'height',
  get: ->
    this.width / this.ratio
  set: (val) ->
    this.width = val * this.ratio
var screen;

screen = {
  width: 1200,
  ratio: 16 / 9
};

Object.defineProperty(screen, 'height', {
  get: function() {
    return this.width / this.ratio;
  },
  set: function(val) {
    return this.width = val * this.ratio;
  }
});

var screen;

screen = {
  width: 1200,
  ratio: 16 / 9
};

Object.defineProperty(screen, 'height', {
  get: function() {
    return this.width / this.ratio;
  },
  set: function(val) {
    return this.width = val * this.ratio;
  }
});
Breaking Changes From CoffeeScript 1.x to 2
CoffeeScript 2 aims to output as much idiomatic ES2015+ syntax as possible with as few breaking changes from CoffeeScript 1.x as possible. Some breaking changes, unfortunately, were unavoidable.

Bound (fat arrow) functions
In CoffeeScript 1.x, => compiled to a regular function but with references to this/@ rewritten to use the outer scope’s this, or with the inner function bound to the outer scope via .bind (hence the name “bound function”). In CoffeeScript 2, => compiles to ES2015’s =>, which behaves slightly differently. The largest difference is that in ES2015, => functions lack an arguments object:

outer = ->
  inner = => Array.from arguments
  inner()

outer(1, 2)  # Returns '' in CoffeeScript 1.x, '1, 2' in CoffeeScript 2

outer = ->
  inner = => Array.from arguments
  inner()

outer(1, 2)  # Returns '' in CoffeeScript 1.x, '1, 2' in CoffeeScript 2
var outer;

outer = function() {
  var inner;
  inner = () => {
    return Array.from(arguments);
  };
  return inner();
};

outer(1, 2); // Returns '' in CoffeeScript 1.x, '1, 2' in CoffeeScript 2

var outer;

outer = function() {
  var inner;
  inner = () => {
    return Array.from(arguments);
  };
  return inner();
};

outer(1, 2); // Returns '' in CoffeeScript 1.x, '1, 2' in CoffeeScript 2
Default values for function parameters and destructured elements
Per the ES2015 spec regarding function default parameters and destructuring default values, default values are only applied when a value is missing or undefined. In CoffeeScript 1.x, the default value would be applied in those cases but also if the value was null.

f = (a = 1) -> a

f(null)  # Returns 1 in CoffeeScript 1.x, null in CoffeeScript 2

f = (a = 1) -> a

f(null)  # Returns 1 in CoffeeScript 1.x, null in CoffeeScript 2
var f;

f = function(a = 1) {
  return a;
};

f(null); // Returns 1 in CoffeeScript 1.x, null in CoffeeScript 2

var f;

f = function(a = 1) {
  return a;
};

f(null); // Returns 1 in CoffeeScript 1.x, null in CoffeeScript 2
{a = 1} = {a: null}

a  # Equals 1 in CoffeeScript 1.x, null in CoffeeScript 2

{a = 1} = {a: null}

a  # Equals 1 in CoffeeScript 1.x, null in CoffeeScript 2
var a;

({a = 1} = {
  a: null
});

a; // Equals 1 in CoffeeScript 1.x, null in CoffeeScript 2

var a;

({a = 1} = {
  a: null
});

a; // Equals 1 in CoffeeScript 1.x, null in CoffeeScript 2
Bound generator functions
Bound generator functions, a.k.a. generator arrow functions, aren’t allowed in ECMAScript. You can write function* or =>, but not both. Therefore, CoffeeScript code like this:

f = => yield this
# Throws a compiler error
Needs to be rewritten the old-fashioned way:

self = this
f = -> yield self

self = this
f = -> yield self
var f, self;

self = this;

f = function*() {
  return (yield self);
};

var f, self;

self = this;

f = function*() {
  return (yield self);
};
Classes are compiled to ES2015 classes
ES2015 classes and their methods have some restrictions beyond those on regular functions.

Class constructors can’t be invoked without new:

(class)()
# Throws a TypeError at runtime
ES2015 classes don’t allow bound (fat arrow) methods. The CoffeeScript compiler goes through some contortions to preserve support for them, but one thing that can’t be accommodated is calling a bound method before it is bound:

class Base
  constructor: ->
    @onClick()      # This works
    clickHandler = @onClick
    clickHandler()  # This throws a runtime error

class Component extends Base
  onClick: =>
    console.log 'Clicked!', @
Class methods can’t be used with new (uncommon):

class Namespace
  @Klass = ->
new Namespace.Klass  # Throws a TypeError at runtime
Due to the hoisting required to compile to ES2015 classes, dynamic keys in class methods can’t use values from the executable class body unless the methods are assigned in prototype style.

class A
  name = 'method'
  "#{name}": ->   # This method will be named 'undefined'
  @::[name] = ->  # This will work; assigns to `A.prototype.method`
super and this
In the constructor of a derived class (a class that extends another class), this cannot be used before calling super:

class B extends A
  constructor: -> this  # Throws a compiler error
This also means you cannot pass a reference to this as an argument to super in the constructor of a derived class:

class B extends A
  constructor: (@arg) ->
    super @arg  # Throws a compiler error
This is a limitation of ES2015 classes. As a workaround, assign to this after the super call:

class B extends A
  constructor: (arg) ->
    super arg
    @arg = arg

class B extends A
  constructor: (arg) ->
    super arg
    @arg = arg
var B;

B = class B extends A {
  constructor(arg) {
    super(arg);
    this.arg = arg;
  }

};

var B;

B = class B extends A {
  constructor(arg) {
    super(arg);
    this.arg = arg;
  }

};
super and extends
Due to a syntax clash with super with accessors, “bare” super (the keyword super without parentheses) no longer compiles to a super call forwarding all arguments.

class B extends A
  foo: -> super
  # Throws a compiler error
Arguments can be forwarded explicitly using splats:

class B extends A
  foo: -> super arguments...

class B extends A
  foo: -> super arguments...
var B;

B = class B extends A {
  foo() {
    return super.foo(...arguments);
  }

};

var B;

B = class B extends A {
  foo() {
    return super.foo(...arguments);
  }

};
Or if you know that the parent function doesn’t require arguments, just call super():

class B extends A
  foo: -> super()

class B extends A
  foo: -> super()
var B;

B = class B extends A {
  foo() {
    return super.foo();
  }

};

var B;

B = class B extends A {
  foo() {
    return super.foo();
  }

};
CoffeeScript 1.x allowed the extends keyword to set up prototypal inheritance between functions, and super could be used manually prototype-assigned functions:

A = ->
B = ->
B extends A
B.prototype.foo = -> super arguments...
# Last two lines each throw compiler errors in CoffeeScript 2
Due to the switch to ES2015 extends and super, using these keywords for prototypal functions are no longer supported. The above case could be refactored to:

# Helper functions
hasProp = {}.hasOwnProperty
extend = (child, parent) ->
  ctor = ->
    @constructor = child
    return
  for key of parent
    if hasProp.call(parent, key)
      child[key] = parent[key]
  ctor.prototype = parent.prototype
  child.prototype = new ctor
  child


A = ->
B = ->
extend B, A
B.prototype.foo = -> A::foo.apply this, arguments

# Helper functions
hasProp = {}.hasOwnProperty
extend = (child, parent) ->
  ctor = ->
    @constructor = child
    return
  for key of parent
    if hasProp.call(parent, key)
      child[key] = parent[key]
  ctor.prototype = parent.prototype
  child.prototype = new ctor
  child


A = ->
B = ->
extend B, A
B.prototype.foo = -> A::foo.apply this, arguments
// Helper functions
var A, B, extend, hasProp;

hasProp = {}.hasOwnProperty;

extend = function(child, parent) {
  var ctor, key;
  ctor = function() {
    this.constructor = child;
  };
  for (key in parent) {
    if (hasProp.call(parent, key)) {
      child[key] = parent[key];
    }
  }
  ctor.prototype = parent.prototype;
  child.prototype = new ctor();
  return child;
};

A = function() {};

B = function() {};

extend(B, A);

B.prototype.foo = function() {
  return A.prototype.foo.apply(this, arguments);
};

// Helper functions
var A, B, extend, hasProp;

hasProp = {}.hasOwnProperty;

extend = function(child, parent) {
  var ctor, key;
  ctor = function() {
    this.constructor = child;
  };
  for (key in parent) {
    if (hasProp.call(parent, key)) {
      child[key] = parent[key];
    }
  }
  ctor.prototype = parent.prototype;
  child.prototype = new ctor();
  return child;
};

A = function() {};

B = function() {};

extend(B, A);

B.prototype.foo = function() {
  return A.prototype.foo.apply(this, arguments);
};
or

class A
class B extends A
  foo: -> super arguments...

class A
class B extends A
  foo: -> super arguments...
var A, B;

A = class A {};

B = class B extends A {
  foo() {
    return super.foo(...arguments);
  }

};

var A, B;

A = class A {};

B = class B extends A {
  foo() {
    return super.foo(...arguments);
  }

};
JSX and the < and > operators
With the addition of JSX, the < and > characters serve as both the “less than” and “greater than” operators and as the delimiters for XML tags, like <div>. For best results, in general you should always wrap the operators in spaces to distinguish them from XML tags: i < len, not i<len. The compiler tries to be forgiving when it can be sure what you intend, but always putting spaces around the “less than” and “greater than” operators will remove ambiguity.

Literate CoffeeScript parsing
CoffeeScript 2’s parsing of Literate CoffeeScript has been refactored to now be more careful about not treating indented lists as code blocks; but this means that all code blocks (unless they are to be interpreted as comments) must be separated by at least one blank line from lists.

Code blocks should also now maintain a consistent indentation level—so an indentation of one tab (or whatever you consider to be a tab stop, like 2 spaces or 4 spaces) should be treated as your code’s “left margin,” with all code in the file relative to that column.

Code blocks that you want to be part of the commentary, and not executed, must have at least one line (ideally the first line of the block) completely unindented.

Argument parsing and shebang (#!) lines
In CoffeeScript 1.x, -- was required after the path and filename of the script to be run, but before any arguments passed to that script. This convention is now deprecated. So instead of:

coffee [options] path/to/script.coffee -- [args]
Now you would just type:

coffee [options] path/to/script.coffee [args]
The deprecated version will still work, but it will print a warning before running the script.

On non-Windows platforms, a .coffee file can be made executable by adding a shebang (#!) line at the top of the file and marking the file as executable. For example:

#!/usr/bin/env coffee

x = 2 + 2
console.log x
If this were saved as executable.coffee, it could be made executable and run:

▶ chmod +x ./executable.coffee
▶ ./executable.coffee
4
In CoffeeScript 1.x, this used to fail when trying to pass arguments to the script. Some users on OS X worked around the problem by using #!/usr/bin/env coffee -- as the first line of the file. That didn’t work on Linux, however, which cannot parse shebang lines with more than a single argument. While such scripts will still run on OS X, CoffeeScript will now display a warning before compiling or evaluating files that begin with a too-long shebang line. Now that CoffeeScript 2 supports passing arguments without needing --, we recommend simply changing the shebang lines in such scripts to just #!/usr/bin/env coffee.

Changelog
2.7.0 — April 22, 2022
The import assertions syntax is now supported. This allows statements like export { version } from './package.json' assert { type: 'json' } or expressions like import('./calendar.json', { assert { type: 'json' } }).
CoffeeScript no longer always patches Node’s error stack traces. This patching, where the line and column numbers are adjusted to match the source CoffeeScript rather than the generated JavaScript, caused conflicts with other libraries and is unnecessary when Node’s new --enable-source-maps flag is passed. The patching will now occur only when --enable-source-maps is not set, no other library has already patched the stack traces, and require('coffeescript/register') is used. The patching can be enabled explicitly via require('coffeescript').patchStackTrace() or import { patchStackTrace } from 'coffeescript'; patchStackTrace().
Bugfix for an issue where block (triple-quoted) strings weren’t getting transpiled correctly into a JSX expression container wrapping the template literal (such as <div a={`...`} />).
Bugfixes for line continuations not behaving as expected for a nonempty first line of an explicit [ array or { object literal.
2.6.1 — October 2, 2021
The coffeescript package itself now supports named exports when used by ES modules in Node.js; or in other words, import { compile } from 'coffeescript' now works, rather than only import CoffeeScript from 'coffeescript'.
Bugfix for a stack overflow error when compiling large files in non-bare mode.
2.6.0 — September 18, 2021
The syntax import.meta, including import.meta.url, is now supported.
The await keyword is now supported outside of functions (in other words, at the top level). Note that JavaScript runtimes only support this for ES modules.
Bugfix for a for comprehension at the end of an unless or until line.
2.5.1 — January 30, 2020
Object splats can now include prototype shorthands, such as a = {b::c...}; and soaks, such as a = {b?.c..., d?()...}.
Bugfix for regression in 2.5.0 where compilation became much slower for files with Windows-style line endings.
Bugfix for an implicit object after a line continuation keyword like or inside a larger implicit object.
2.5.0 — December 30, 2019
The compiler now supports a new ast option, available via --ast on the command line or ast via the Node API. This option outputs an “abstract syntax tree,” or a JSON-like representation of the input CoffeeScript source code. This AST follows Babel’s spec as closely as possible, for compatibility with tools that work with JavaScript source code. Two tools that use this new AST output are eslint-plugin-coffee, a plugin to lint CoffeeScript via ESLint; and prettier-plugin-coffeescript, a plugin to reformat CoffeeScript source code via Prettier. The structure and properties of CoffeeScript’s AST are not final and may undergo breaking changes between CoffeeScript versions; please open an issue if you are interested in creating new integrations.
Numeric separators are now supported in CoffeeScript, following the same syntax as JavaScript: 1_234_567.
BigInt numbers are now supported in CoffeeScript, following the same syntax as JavaScript: 42n.
''' and """ strings are now output as more readable JavaScript template literals, or backtick (`) strings, with actual newlines rather than \n escape sequences.
Classes can now contain computed properties, e.g. [someVar]: -> or @[anotherVar]: ->.
JSX tags can now contain XML-style namespaces, e.g. <image xlink:href="data:image/png" /> or <Something:Tag></Something:Tag>.
Bugfixes for comments after colons not appearing the output; reserved words mistakenly being disallowed as JSX attributes; indented leading elisions in multiline arrays; and invalid location data in source maps.
2.4.1 — April 7, 2019
Both the traditional ES5 and modern ES module versions of the CoffeeScript browser compiler are now published to NPM, enabling the browser compilers’ use via services that provide NPM modules’ code available via public CDN. The traditional version is referenced via the package.json "browser" field, and the ES module version via the "module" field.
2.4.0 — March 28, 2019
Dynamic import() expressions are now supported. The parentheses are always required, to distinguish from import statements. See Modules. Note that as of this writing, the JavaScript feature itself is still Stage 3; if it changes before being fully standardized, it may change in CoffeeScript too. Using import() before its upstream ECMAScript proposal is finalized should be considered provisional, subject to breaking changes if the proposal changes or is rejected. We have also revised our policy on Stage 3 ECMAScript features, to support them when the features are shipped in significant runtimes such as major browsers or Node.js.
There are now two browser versions of the CoffeeScript compiler: the traditional one that’s been published for years, and a new ES module version that can be used via import. If your browser supports it, it is in effect on this page. A reference to the ES module browser compiler is in the package.json "module" field.
The Node API now exposes the previously private registerCompiled method, to allow plugins that use the coffeescript package to take advantage of CoffeeScript’s internal caching.
Bugfixes for commas in strings in block arrays, a reference to @ not being maintained in a do block in a class, and function default parameters should no longer be wrapped by extraneous parentheses.
2.3.2 — September 18, 2018
Babel 7 is now supported. With version 7, the Babel team moved from babel-core on NPM to @babel/core. Now the CoffeeScript --transpile option will first search for @babel/core (Babel versions 7 and above) and then search for babel-core (versions 6 and below) to try to find an installed version of Babel to use for transpilation.
The syntax new.target is now supported.
You can now follow the keyword yield with an indented object, like has already been allowed for return and other keywords.
Previously, any comments inside a JSX tag or attribute would cause interpolation braces ({ and }) to be output. This is only necessary for line (#, or // in JavaScript) comments, not here (###, or /* */) comments; so now the compiler checks if all the comments that would trigger the braces are here comments, and if so it doesn’t generate the unnecessary interpolation braces.
2.3.1 — May 20, 2018
Returning a JSX tag that is adjacent to another JSX tag, as opposed to returning a root JSX tag or fragment, is invalid JSX syntax. Babel throws an error on this, and now the CoffeeScript compiler does too.
Invalid indentation inside a JSX interpolation (the middle of <tag>{ ... }</tag>) now throws an error.
The browser compiler, used in Try CoffeeScript and similar web-based CoffeeScript editors, now evaluates code in a global scope rather than the scope of the browser compiler. This improves performance of code executed via the browser compiler.
Syntax cleanup: it is now possible for an implicit function call to take a body-less class as an argument, and ?:: now behaves identically to :: with regard to implying a line continuation.
2.3.0 — April 28, 2018
This release adds support for all the new features and syntaxes in ES2018 that weren’t already possible in CoffeeScript. For all of the below features, make sure that you transpile unless you know that your target runtime(s) support each feature.
Asynchronous iterators are now supported. You can now yield an await call, e.g. do -> until file.EOF then yield await file.readLine().
Object splats/destructuring, a.k.a. object rest/spread syntax, has been standardized as part of ES2018 and therefore this release removes the polyfill that had previously been supporting this syntax. Code like {a, b, rest...} = obj now outputs more or less just like it appears, rather than being converted into an Object.assign call. Note that there are some subtle differences between the Object.assign polyfill and the native implementation.
The exponentiation operator, **, and exponentiation assignment operator **= are new to JavaScript in ES2018. Now code like a ** 3 is output as it appears, rather than being converted into Math.pow(a, 3) as it was before.
The s (dotAll) flag is now supported in regular expressions.
2.2.4 — March 28, 2018
When the by value in a for loop is a literal number, e.g. for x in [2..1] by -1, fewer checks are necessary to determine if the loop is in range.
Bugfix for regression in 2.2.0 where a statement inside parentheses, e.g. (fn(); break) while condition, was compiling. Pure statements like break or return cannot turn a parenthesized block into an expression, and should throw an error.
2.2.3 — March 10, 2018
Bugfix for object destructuring with an empty array as a key’s value: { key: [] } = obj.
Bugfix for array destructuring onto targets attached to this: [ @most... , @penultimate, @last ] = arr.
2.2.2 — February 20, 2018
Bugfix for regression in 2.2.0 where a range with a by (step) value that increments or decrements in the opposite direction as the range was returning an array containing the first value of the range, whereas it should be returning an empty array. In other words, x for x in [2..1] by 1 should equal [], not [2] (because the step value is positive 1, counting up, whereas the range goes from 2 to 1, counting down).
Bugfixes for allowing backslashes in import and export statements and lines that trigger the start of an indented block, like an if statement.
2.2.1 — February 5, 2018
Bugfix for regression in 2.2.0 involving an error thrown by the compiler in certain cases when using destructuring with a splat or expansion in an array.
Bugfix for regression in 2.2.0 where in certain cases a range iterator variable was declared in the global scope.
2.2.0 — January 31, 2018
This release fixes all currently open bugs, dating as far back as 2014, 2012 and 2011.
Potential breaking change: An inline if or switch statement with an ambiguous else, such as if no then if yes then alert 1 else alert 2, now compiles where the else always corresponds to the closest open then. Previously the behavior of an ambiguous else was unpredictable. If your code has any if … then or switch … then statements with multiple thens (and one or more elses) the compiled output might be different now, unless you had resolved ambiguity via parentheses. We made this change because the previous behavior was inconsistent and basically a bug: depending on what grammar was where, for example if there was an inline function or something that implied a block, the else might bind to an earlier then rather than a later then. Now an else essentially closes a block opened by a then, similar to closing an open parenthesis.
When a required then is missing, the error more accurately points out the location of the mistake.
An error is thrown when the coffee command is run in an environment that doesn’t support some ES2015 JavaScript features that the CoffeeScript compiler itself requires. This can happen if CoffeeScript is installed in Node older than version 6.
Destructuring with a non-final splat/spread, e.g. [open, contents..., close] = tag.split('') is now output using ES2015 rest syntax.
Functions named get or set can be used without parentheses in more cases, including when attached to this or @ or ?.; or when the first argument is an implicit object, e.g. @set key: 'val'.
Statements such as break can now be used inside parentheses, e.g. (doSomething(); break) while condition or (pick(key); break) for key of obj.
Bugfix for assigning to a property attached to this/@ in destructuring, e.g. ({@prop = yes, @otherProp = no}) ->.
Bugfix for incorrect errors being thrown about calling super with a parameter attached to this when said parameter is in a lower scope, e.g. class Child extends Parent then constructor: -> super(-> @prop).
Bugfix to prevent a possible infinite loop when a for loop is given a variable to step by, e.g. for x in [1..3] by step (as opposed to by 0.5 or some other primitive numeric value).
Bugfix to no longer declare iterator variables twice when evaluating a range, e.g. end = 3; fn [0..end].
Bugfix for incorrect scope of variables in chained calls, e.g. start(x = 3).then(-> x = 4).
Bugfix for incorrect scope of variables in a function passed to do, e.g. for [1..3] then masked = 10; do -> alert masked.
Bugfix to no longer throw a syntax error for a trailing comma in a function call, e.g. fn arg1, arg2,.
Bugfix for an expression in a property access, e.g. a[!b in c..].
Bugfix to allow a line continuation backslash (\) at any point in a for line.
2.1.1 — December 28, 2017
Bugfix to set the correct context for executable class bodies. So in class @B extends @A then @property = 1, the @ in @property now refers to the class, not the global object.
Bugfix where anonymous classes were getting created using the same automatic variable name. They now each receive unique names, so as not to override each other.
2.1.0 — December 9, 2017
Computed property keys in object literals are now supported: obj = { ['key' + i]: 42 }, or obj = [Symbol.iterator]: -> yield i++.
Skipping of array elements, a.k.a. elision, is now supported: arr = [a, , b], or [, protocol] = url.match /^(.*):\/\//.
JSX fragments syntax is now supported.
Bugfix where /// within a # line comment inside a /// block regex was erroneously closing the regex, rather than being treated as part of the comment.
Bugfix for incorrect output for object rest destructuring inside array destructuring.
2.0.3 — November 25, 2017
Bugfix for export default followed by an implicit object that contains an explicit object, for example exportedMember: { obj... }.
Bugfix for key, val of obj after an implicit object member, e.g. foo: bar for key, val of obj.
Bugfix for combining array and object destructuring, e.g. [ ..., {a, b} ] = arr.
Bugfix for an edge case where it was possible to create a bound (=>) generator function, which should throw an error as such functions aren’t allowed in ES2015.
Bugfix for source maps: .map files should always have the same base filename as the requested output filename. So coffee --map --output foo.js test.coffee should generate foo.js and foo.js.map.
Bugfix for incorrect source maps generated when using --transpile with --map for multiple input files.
Bugfix for comments at the beginning or end of input into the REPL (coffee --interactive).
2.0.2 — October 25, 2017
--transpile now also applies to required or imported CoffeeScript files.
--transpile can be used with the REPL: coffee --interactive --transpile.
Improvements to comments output that should now cover all of the Flow comment-based syntax. Inline ### comments near variable initial assignments are now output in the variable declaration statement, and ### comments near a class and method names are now output where Flow expects them.
Importing CoffeeScript keywords is now allowed, so long as they’re aliased: import { and as andFn } from 'lib'. (You could also do import lib from 'lib' and then reference lib.and.)
Calls to functions named get and set no longer throw an error when given a bracketless object literal as an argument: obj.set propertyName: propertyValue.
In the constructor of a derived class (a class that extends another class), you cannot call super with an argument that references this: class Child extends Parent then constructor: (@arg) -> super(@arg). This isn’t allowed in JavaScript, and now the CoffeeScript compiler will throw an error. Instead, assign to this after calling super: (arg) -> super(arg); @arg = arg.
Bugfix for incorrect output when backticked statements and hoisted expressions were both in the same class body. This allows a backticked line like `field = 3`, for people using the experimental class fields syntax, in the same class along with traditional class body expressions like prop: 3 that CoffeeScript outputs as part of the class prototype.
Bugfix for comments not output before a complex ? operation, e.g. @a ? b.
All tests now pass in Windows.
2.0.1 — September 25, 2017
babel-core is no longer listed in package.json, even as an optionalDependency, to avoid it being automatically installed for most users. If you wish to use --transpile, simply install babel-core manually. See Transpilation.
--transpile now relies on Babel to find its options, i.e. the .babelrc file in the path of the file(s) being compiled. (Previously the CoffeeScript compiler was duplicating this logic, so nothing has changed from a user’s perspective.) This provides automatic support for additional ways to pass options to Babel in future versions, such as the .babelrc.js file coming in Babel 7.
Backticked expressions in a class body, outside any class methods, are now output in the JavaScript class body itself. This allows for passing through experimental JavaScript syntax like the class fields proposal, assuming your transpiler supports it.
2.0.0 — September 17, 2017
Added --transpile flag or transpile Node API option to tell the CoffeeScript compiler to pipe its output through Babel before saving or returning it; see Transpilation. Also changed the -t short flag to refer to --transpile instead of --tokens.
Always populate source maps’ sourcesContent property.
Bugfixes for destructuring and for comments in JSX.
Note that these are only the changes between 2.0.0-beta5 and 2.0.0. See below for all changes since 1.x.
2.0.0-beta5 — September 1, 2017
Node 6 is now supported, and we will try to maintain that as the minimum required version for CoffeeScript 2 via the coffee command or Node API. Older versions of Node, or non-evergreen browsers, can compile via the legacy browser compiler.
The command line --output flag now allows you to specify an output filename, not just an output folder.
The command line --require flag now properly handles filenames or module names that are invalid identifiers (like an NPM module with a hyphen in the name).
Object.assign, output when object destructuring is used, is polyfilled using the same polyfill that Babel outputs. This means that polyfills shouldn’t be required unless support for Internet Explorer 8 or below is desired (or your own code uses a feature that requires a polyfill). See ES2015+ Output.
A string or JSX interpolation that contains only a comment ("a#{### comment ###}b" or <div>{### comment ###}</div>) is now output (`a${/* comment */}b`)
Interpolated strings (ES2015 template literals) that contain quotation marks no longer have the quotation marks escaped: `say "${message}"`
It is now possible to chain after a function literal (for example, to define a function and then call .call on it).
The results of the async tests are included in the output when you run cake test.
Bugfixes for object destructuring; expansions in function parameters; generated reference variables in function parameters; chained functions after do; splats after existential operator soaks in arrays ([a?.b...]); trailing if with splat in arrays or function parameters ([a if b...]); attempting to throw an if, for, switch, while or other invalid construct.
Bugfixes for syntactical edge cases: semicolons after = and other “mid-expression” tokens; spaces after ::; and scripts that begin with : or *.
Bugfixes for source maps generated via the Node API; and stack trace line numbers when compiling CoffeeScript via the Node API from within a .coffee file.
2.0.0-beta4 — August 2, 2017
This release includes all the changes from 1.12.6 to 1.12.7.
Line comments (starting with #) are now output in the generated JavaScript.
Block comments (delimited by ###) are now allowed anywhere, including inline where they previously weren’t possible. This provides support for static type annotations using Flow’s comments-based syntax.
Spread syntax (... for objects) is now supported in JSX tags: <div {props...} />.
Argument parsing for scripts run via coffee is improved. See breaking changes.
CLI: Propagate SIGINT and SIGTERM signals when node is forked.
await in the REPL is now allowed without requiring a wrapper function.
do super is now allowed, and other accesses of super like super.x.y or super['x'].y now work.
Splat/spread syntax triple dots are now allowed on either the left or the right (so props... or ...props are both valid).
Tagged template literals are recognized as callable functions.
Bugfixes for object spread syntax in nested properties.
Bugfixes for destructured function parameter default values.
2.0.0-beta3 — June 29, 2017
JSX is now supported.
Object rest/spread properties are now supported.
Bound (fat arrow) methods are once again supported in classes; though an error will be thrown if you attempt to call the method before it is bound. See breaking changes for classes.
The REPL no longer warns about assigning to _.
Bugfixes for destructured nested default values and issues related to chaining or continuing expressions across multiple lines.
2.0.0-beta2 — May 15, 2017
This release includes all the changes from 1.12.5 to 1.12.6.
Bound (fat arrow) methods in classes must be declared in the class constructor, after super() if the class is extending a parent class. See breaking changes for classes.
All unnecessary utility helper functions have been removed, including the polyfills for indexOf and bind.
The extends keyword now only works in the context of classes; it cannot be used to extend a function prototype. See breaking changes for extends.
Literate CoffeeScript is now parsed entirely based on indentation, similar to the 1.x implementation; there is no longer a dependency for parsing Markdown. See breaking changes for Literate CoffeeScript parsing.
JavaScript reserved words used as properties are no longer wrapped in quotes.
require('coffeescript') should now work in non-Node environments such as the builds created by Webpack or Browserify. This provides a more convenient way to include the browser compiler in builds intending to run in a browser environment.
Unreachable break statements are no longer added after switch cases that throw exceptions.
The browser compiler is now compiled using Babili and transpiled down to Babel’s env preset (should be safe for use in all browsers in current use, not just evergreen versions).
Calling functions @get or @set no longer throws an error about required parentheses. (Bare get or set, not attached to an object or @, still intentionally throws a compiler error.)
If $XDG_CACHE_HOME is set, the REPL .coffee_history file is saved there.
2.0.0-beta1 — April 13, 2017
Initial beta release of CoffeeScript 2. No further breaking changes are anticipated.
Destructured objects and arrays now output using ES2015+ syntax whenever possible.
Literate CoffeeScript now has much better support for parsing Markdown, thanks to using Markdown-It to detect Markdown sections rather than just looking at indentation.
Calling a function named get or set now requires parentheses, to disambiguate from the get or set keywords (which are disallowed).
The compiler now requires Node 7.6+, the first version of Node to support asynchronous functions without requiring a flag.
2.0.0-alpha1 — February 20, 2017
Initial alpha release of CoffeeScript 2. The CoffeeScript compiler now outputs ES2015+ syntax whenever possible. See breaking changes.
Classes are output using ES2015 class and extends keywords.
Added support for async/await.
Bound (arrow) functions now output as => functions.
Function parameters with default values now use ES2015 default values syntax.
Splat function parameters now use ES2015 spread syntax.
Computed properties now use ES2015 syntax.
Interpolated strings (template literals) now use ES2015 backtick syntax.
Improved support for recognizing Markdown in Literate CoffeeScript files.
Mixing tabs and spaces in indentation is now disallowed.
Browser compiler is now minified using the Google Closure Compiler (JavaScript version).
Node 7+ required for CoffeeScript 2.
1.12.7 — July 15, 2017
Fix regressions in 1.12.6 related to chained function calls and indented return and throw arguments.
The REPL no longer warns about assigning to _.
1.12.6 — May 14, 2017
The return and export keywords can now accept implicit objects (defined by indentation, without needing braces).
Support Unicode code point escapes (e.g. \u{1F4A9}).
The coffee command now first looks to see if CoffeeScript is installed under node_modules in the current folder, and executes the coffee binary there if so; or otherwise it runs the globally installed one. This allows you to have one version of CoffeeScript installed globally and a different one installed locally for a particular project. (Likewise for the cake command.)
Bugfixes for chained function calls not closing implicit objects or ternaries.
Bugfixes for incorrect code generated by the ? operator within a termary if statement.
Fixed some tests, and failing tests now result in a nonzero exit code.
1.12.5 — April 9, 2017
Better handling of default, from, as and * within import and export statements. You can now import or export a member named default and the compiler won’t interpret it as the default keyword.
Fixed a bug where invalid octal escape sequences weren’t throwing errors in the compiler.
1.12.4 — February 17, 2017
The cake commands have been updated, with new watch options for most tasks. Clone the CoffeeScript repo and run cake at the root of the repo to see the options.
Fixed a bug where exporting a referenced variable was preventing the variable from being declared.
Fixed a bug where the coffee command wasn’t working for a .litcoffee file.
Bugfixes related to tokens and location data, for better source maps and improved compatibility with downstream tools.
1.12.3 — January 23, 2017
@ values can now be used as indices in for expressions. This loosens the compilation of for expressions to allow the index variable to be an @ value, e.g. do @visit for @node, @index in nodes. Within @visit, the index of the current node (@node) would be available as @index.
CoffeeScript’s patched Error.prepareStackTrace has been restored, with some revisions that should prevent the erroneous exceptions that were making life difficult for some downstream projects. This fixes the incorrect line numbers in stack traces since 1.12.2.
The //= operator’s output now wraps parentheses around the right operand, like the other assignment operators.
1.12.2 — December 15, 2016
The browser compiler can once again be built unminified via MINIFY=false cake build:browser.
The error-prone patched version of Error.prepareStackTrace has been removed.
Command completion in the REPL (pressing tab to get suggestions) has been fixed for Node 6.9.1+.
The browser-based tests now include all the tests as the Node-based version.
1.12.1 — December 6, 2016
You can now import a module member named default, e.g. import { default } from 'lib'. Though like in ES2015, you cannot import an entire module and name it default (so import default from 'lib' is not allowed).
Fix regression where from as a variable name was breaking for loop declarations. For the record, from is not a reserved word in CoffeeScript; you may use it for variable names. from behaves like a keyword within the context of import and export statements, and in the declaration of a for loop; though you should also be able to use variables named from in those contexts, and the compiler should be able to tell the difference.
1.12.0 — December 3, 2016
CoffeeScript now supports ES2015 tagged template literals. Note that using tagged template literals in your code makes you responsible for ensuring that either your runtime supports tagged template literals or that you transpile the output JavaScript further to a version your target runtime(s) support.
CoffeeScript now provides a for…from syntax for outputting ES2015 for…of. (Sorry they couldn’t match, but we came up with for…of first for something else.) This allows iterating over generators or any other iterable object. Note that using for…from in your code makes you responsible for ensuring that either your runtime supports for…of or that you transpile the output JavaScript further to a version your target runtime(s) support.
Triple backticks ( ```​) allow the creation of embedded JavaScript blocks where escaping single backticks is not required, which should improve interoperability with ES2015 template literals and with Markdown.
Within single-backtick embedded JavaScript, backticks can now be escaped via \`​.
The browser tests now run in the browser again, and are accessible here if you would like to test your browser.
CoffeeScript-only keywords in ES2015 imports and exports are now ignored.
The compiler now throws an error on trying to export an anonymous class.
Bugfixes related to tokens and location data, for better source maps and improved compatibility with downstream tools.
1.11.1 — October 1, 2016
Bugfix for shorthand object syntax after interpolated keys.
Bugfix for indentation-stripping in """ strings.
Bugfix for not being able to use the name “arguments” for a prototype property of class.
Correctly compile large hexadecimal numbers literals to 2e308 (just like all other large number literals do).
1.11.0 — September 23, 2016
CoffeeScript now supports ES2015 import and export syntax.
Added the -M, --inline-map flag to the compiler, allowing you embed the source map directly into the output JavaScript, rather than as a separate file.
A bunch of fixes for yield:
yield return can no longer mistakenly be used as an expression.
yield now mirrors return in that it can be used stand-alone as well as with expressions. Where you previously wrote yield undefined, you may now write simply yield. However, this means also inheriting the same syntax limitations that return has, so these examples no longer compile:
doubles = ->
  yield for i in [1..3]
    i * 2
six = ->
  yield
    2 * 3
The JavaScript output is a bit nicer, with unnecessary parentheses and spaces, double indentation and double semicolons around yield no longer present.
&&=, ||=, and= and or= no longer accidentally allow a space before the equals sign.
Improved several error messages.
Just like undefined compiles to void 0, NaN now compiles into 0/0 and Infinity into 2e308.
Bugfix for renamed destructured parameters with defaults. ({a: b = 1}) -> no longer crashes the compiler.
Improved the internal representation of a CoffeeScript program. This is only noticeable to tools that use CoffeeScript.tokens or CoffeeScript.nodes. Such tools need to update to take account for changed or added tokens and nodes.
Several minor bug fixes, including:
The caught error in catch blocks is no longer declared unnecessarily, and no longer mistakenly named undefined for catch-less try blocks.
Unassignable parameter destructuring no longer crashes the compiler.
Source maps are now used correctly for errors thrown from .coffee.md files.
coffee -e 'throw null' no longer crashes.
The REPL no longer crashes when using .exit to exit it.
Invalid JavaScript is no longer output when lots of for loops are used in the same scope.
A unicode issue when using stdin with the CLI.
1.10.0 — September 2, 2015
CoffeeScript now supports ES2015-style destructuring defaults.
(offsetHeight: height) -> no longer compiles. That syntax was accidental and partly broken. Use ({offsetHeight: height}) -> instead. Object destructuring always requires braces.
Several minor bug fixes, including:
A bug where the REPL would sometimes report valid code as invalid, based on what you had typed earlier.
A problem with multiple JS contexts in the jest test framework.
An error in io.js where strict mode is set on internal modules.
A variable name clash for the caught error in catch blocks.
1.9.3 — May 26, 2015
Bugfix for interpolation in the first key of an object literal in an implicit call.
Fixed broken error messages in the REPL, as well as a few minor bugs with the REPL.
Fixed source mappings for tokens at the beginning of lines when compiling with the --bare option. This has the nice side effect of generating smaller source maps.
Slight formatting improvement of compiled block comments.
Better error messages for on, off, yes and no.
1.9.2 — April 14, 2015
Fixed a watch mode error introduced in 1.9.1 when compiling multiple files with the same filename.
Bugfix for yield around expressions containing this.
Added a Ruby-style -r option to the REPL, which allows requiring a module before execution with --eval or --interactive.
In <script type="text/coffeescript"> tags, to avoid possible duplicate browser requests for .coffee files, you can now use the data-src attribute instead of src.
Minor bug fixes for IE8, strict ES5 regular expressions and Browserify.
1.9.1 — February 17, 2015
Interpolation now works in object literal keys (again). You can use this to dynamically name properties.
Internal compiler variable names no longer start with underscores. This makes the generated JavaScript a bit prettier, and also fixes an issue with the completely broken and ungodly way that AngularJS “parses” function arguments.
Fixed a few yield-related edge cases with yield return and yield throw.
Minor bug fixes and various improvements to compiler error messages.
1.9.0 — January 28, 2015
CoffeeScript now supports ES2015 generators. A generator is simply a function that yields.
More robust parsing and improved error messages for strings and regexes — especially with respect to interpolation.
Changed strategy for the generation of internal compiler variable names. Note that this means that @example function parameters are no longer available as naked example variables within the function body.
Fixed REPL compatibility with latest versions of Node and Io.js.
Various minor bug fixes.
1.8.0 — August 25, 2014
The --join option of the CLI is now deprecated.
Source maps now use .js.map as file extension, instead of just .map.
The CLI now exits with the exit code 1 when it fails to write a file to disk.
The compiler no longer crashes on unterminated, single-quoted strings.
Fixed location data for string interpolations, which made source maps out of sync.
The error marker in error messages is now correctly positioned if the code is indented with tabs.
Fixed a slight formatting error in CoffeeScript’s source map-patched stack traces.
The %% operator now coerces its right operand only once.
It is now possible to require CoffeeScript files from Cakefiles without having to register the compiler first.
The CoffeeScript REPL is now exported and can be required using require 'coffeescript/repl'.
Fixes for the REPL in Node 0.11.
1.7.1 — January 28, 2014
Fixed a typo that broke node module lookup when running a script directly with the coffee binary.
1.7.0 — January 27, 2014
When requiring CoffeeScript files in Node you must now explicitly register the compiler. This can be done with require 'coffeescript/register' or CoffeeScript.register(). Also for configuration such as Mocha’s, use coffeescript/register.
