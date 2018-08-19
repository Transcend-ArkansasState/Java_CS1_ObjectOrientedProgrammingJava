# Asterisk Diamonds Program 
## Psedudo Code [Highly Detailed] :
### ```public static void main(String args[]){...}```
1) In the main() method create an ```int``` variable called "height";
2) Prompt the user for a "Height" for their desired Diamond. Save their Input as an Integer to the "height" variable.
    * If the input cannot be parsed to an ```int``` catch the exception and prompt for input again
3) Call the "Print Diamond" method that takes a single ```int``` as argument. Pass "height" in this method call.

### ```private static void printDiamond(int height){...}```
*  Print Top Half of the Diamond
1) Create a variable named "asterisk" set it to integer value 1
2) Create a variable named "spaces" and set the value to "height"/2
3) For all integer values ```i``` from 0 to (1/2 * height),
    1) for all integer values ```j``` from 0 to ```spaces```,
        * print a single " "
    2) for all integer values ```j``` from 0 to ```astersisk```,
        * print a single "*"
    3) decrement ```spaces``` by 1
    4) increment ```astersisk``` by 2
    5) print a new line character.
4) decrement ```asterisk``` by 1

* Print the Bottom half of the Diamond
5) For all integer values ```i``` from 0 to (1/2 * height),
    1) for all integer values ```j``` from 0 to ```spaces```,
        * print a single " "
    2) for all integer values ```j``` from 0 to ```asterisk```,
        * print a single "*"
    3) increment ```spaces``` by 1
    4) decrement ```asterisk``` by 2
    5) print a new line character

## Breakdown of thought
This diamond is really just several triangles, which we can print in a variety of ways, as seen in the Triangle Demo Code

To print the diamond of given "height" we will print two triangles of 1/2 "height".
One triangle is right side up, and twice as wide as it is tall, the other is upside down, and twice as wide as it is tall.
## Flow Chart
