# Number Guessing Game 
This is an example implementation of the Student Assignment for Module 1

# Assignment Details:
Students will implement the following pseudo code:

1) Select a random whole number between 1 and 15 and save as a variable
2) Prompt the user for number input and save as a variable
3) If input is not a number, try again. If input is not a whole number,
round down. Use java.util.Scanner and try{}catch{} keywords
4) Compare input to randomly selected number
5) Print "To high/Too Low Try again" or "You guessed right!" based on
the comparison results [phrasing can be adjusted]
6) Repeat steps 2 through 4 until the user guesses correctly.
7) Print how many guesses it took the user to get the right one.

## This exercise should contain the following
* use an Integer Data Type - long, int, short, Integer, Long, Short, or
BigInteger would be valid options... most Students will use int
* Use a while{}, do{}while{}, or a for{} loop block in their code.
* use try{}catch{} to handle any exceptions thrown from bad input.
    1) can catch Exception, or NumberFormatException
    2) students could wrap the scanner.nextInt() to a method that would
    contain the input try/catch loop. maybe bonus points?
* prints the number of guesses at the end of the game.
* all three scenarios of output should be reachable in code. [phrasing is not specific]
    1) "too high"
    2) "too low"
    3) "you guessed right!"

## Example Code Output:
```bat
Guess what number I picked! Between 0 and 15
60
Too High, try again.
15
Too High, try again.
4
Too Low, try again.
6
Too Low, try again.
8
Too Low, try again.
9
Too Low, try again.
11
Too High, try again.
10
You got it in 8 guesses!
```