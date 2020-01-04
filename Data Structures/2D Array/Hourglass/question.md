Given a 6x6 2D array, arr:
```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
```

We define an hourglass in  to be a subset of values with indices falling in this pattern in ```arr```'s graphical representation:
```
a b c
  d
e f g
```
There are  hourglasses in ```arr```, and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in ```arr```, then print the maximum hourglass sum.

For example, given the 2D array:
```
-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
```
We calculate the following 16 hourglass values:
```
-63, -34, -9, 12, 
-10, 0, 28, 23, 
-27, -11, -2, 10, 
9, 17, 25, 18
```
Our highest hourglass value is 28 from the hourglass:
```
0 4 3
  1
8 6 6
```
### Function Description
Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.

hourglassSum has the following parameter(s):
* arr: an array of integers

### Input Format

Each of the 6 lines of inputs ```arr[i]``` contains 6 space-separated integers ```arr[i][j]```.

### Constraints
* ```-9 <= arr[i][j] <= 9```
* ```0 <= i, j <= 5```

### Output Format
Print the largest (maximum) hourglass sum found in ```arr```.

### Sample Input
```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
```
### Sample Output
19


<hr>

# Explanation
Given a 2D matrix, the task is to find the maximum sum of an hour glass.

An hour glass is made of 7 cells in the following form:
```
a b c
  d
e f g
```

### Examples:
```
Input : 1 1 1 0 0 
        0 1 0 0 0 
        1 1 1 0 0 
        0 0 0 0 0 
        0 0 0 0 0 
Output : 7
Below is the hour glass with
maximum sum:
1 1 1 
  1
1 1 1
                                                      
Input : 0 3 0 0 0
        0 1 0 0 0
        1 1 1 0 0
        0 0 2 4 4
        0 0 0 2 4
Output : 11
Below is the hour glass wuth
maximum sum
1 0 0
  4
0 2 4
```

It is evident from definition of an hour glass that number of rows and number of columns must be equal to 3. If we count the total number of hour glasses in a matrix, we can say that the count is equal to count of possible top left cells in the hour glass. Number of top-left cells in a hour glass is equal to ```(R-2)*(C-2)```. Therefore, in a matrix total number of hour glass is ```(R-2)*(C-2)```.

```
mat[][] = 2 3 0 0 0 
          0 1 0 0 0
          1 1 1 0 0 
          0 0 2 4 4
          0 0 0 2 0
Possible hour glass are :
2 3 0  3 0 0   0 0 0  
  1      0       0 
1 1 1  1 1 0   1 0 0 

0 1 0  1 0 0  0 0 0 
  1      1      0  
0 0 2  0 2 4  2 4 4 

1 1 1  1 1 0  1 0 0
  0      2      4
0 0 0  0 0 2  0 2 0
```

We consider all top left cells of hour glasses one by one. For every cell, we compute sum of hour glass formed by it. Finally we return maximum sum.

