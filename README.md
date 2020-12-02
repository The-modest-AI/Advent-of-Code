#What is this project?

Well, this project is a solution, part 2 of Day 1 of the Advent of Code 2020(AoC), December 02,2020.

###What is Advent of Code?

Advent of Code is an Advent calendar of small programming puzzles for a variety of skill sets and skill levels that can be solved in any programming language you like. People use them as a speed contest, interview prep, company training, university coursework, practice problems, or to challenge each other.

For information about the Advent of Code 2020(AoC) visit this [link to the website!](https://adventofcode.com/).

## What is the purpose of the project?

The purpose is to:

• Calculate that which three numbers when added form their sum as `2020`

• Then multiply and show product along with the respective numbers.

## How is this done in this program?

• Read the file `TextFile.txt` 

• Add the data from the file  in an ArrayList as `int`

• Make three `for` loops and check if they form `2020` as the sum 

• If they do print the numbers and the product of those numbers

##How to use?

Change the data of `TextFile.txt` and use it to find the numbers. Also, change the `sum` variable, if you need  the  target `sum` being something else.

You can also change the number of loops and get more combinations or less.

I know it won't be useful but still...

#### Metrics

Used in the project are:

•`TextFile.txt` has the data(Which is of `int` type) which will be used by the program

•`Main`-Containing the `main` and `operation` methods.

•`ReadFile`-Containing the ArrayList with the values which has been read from the file `TextFile.txt`.


Total class count-2.

Total method count-5(including `main`)

####Algorithm

#####Inside the `ReadFile.java`:

• Declare a class named ``ReadFile`` 

• Create an instance variable ``first`` which is an ArrayList and is `private`, `static` and `final`.

• Create a method called `setFirst`

• `setFirst` would read the `TextFile.txt` and would add the integer values from that to the `first` ArrayList 

•  Create another method `getFirst` with parameter `int i` which returns the value of the index(the parameter)

•  By, method overloading, create another method `getFirst` with no parameters and which return `List<Integer>`

#####Inside the`Main.java`:


• Create a class `Main` which extends `ReadFile`

• Create a method called `operations`

• Initialize and declare the `var sum` with `2020`

• Make three nested `for` `loops` with different variables and with condition `Foo< getFirst().size()`

• Make three variables and store `getFirst(Foo)` respectively

• Add an `if` statement and chek if those three can add and make the value to`sum`

• Create a variable `product` which multiplies those three numbers

• Display the three numbers respectively, also display `product` 

• Add a return statement so that the control goes to `main` method and terminates the program.

#####Inside `main` method in `Main.java`

• Call `setFirst`(Using the dot operator, more info in Footnotes section). Like this:
```java
ReadFile.setFirst();
```
• Call `operations`. Like this:
```java
operations();
```

##Footnotes


1. This is the [link!](https://www.reddit.com/r/adventofcode/) to the subreddit of the website event! Where you might question your doubts.

2. The (.) operator is also known as member operator it is used to access the member of a package or a class. For more details visit [this site!](https://stackoverflow.com/questions/37646364/what-is-the-purpose-of-java-dot-operator#:~:text=The%20dot%20operator%2C%20also%20known,followed%20by%20the%20dot%20(.))