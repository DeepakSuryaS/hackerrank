* Create a list, ```seqList```, of  empty sequences, where each sequence is indexed from  to . The elements within each of the  sequences also use -indexing.
* Create an integer, ```lastAnswer```, and initialize it to `0`.
* The 2 types of queries that can be performed on your list of sequences (seqList) are described below:
  1. Query: ```1 x y```
    * Find the sequence, ```seq```, at index ((x ^ lastAnswer) % N) in ```seqList```.
    * Append integer ```y``` to sequence seq.
  2. Query: ```2 x y```
    * Find the sequence, ```seq```, at index ((x ^ lastAnswer) % N) in ```seqList```.
    * Find the value of element ```y % size``` in ```seq``` (where ```size``` is the size of ```seq```) and assign it to ```lastAnswer```.
    * Print the new value of ```lastAnswer``` on a new line

### Task
Given N, Q, and Q queries, execute each query.
Note: ^ is the bitwise OR operator

### Input Format
The first line contains two space-separated integers, N (the number of sequences) and Q (the number of queries), respectively.
Each of the Q subsequent lines contains a query in the format defined above.

### Constraints
* 1 <= N, Q <= 10^5
* 0 <= x <= 10^9
* 0 <= y <= 10^9
* it is guaranteed that query type 2 will never query an empty sequence or index.

### Output Format
For each type ```2``` query, print the updated value of ```lastAnswer``` on a new line.

### Sample Input
```
2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
```
### Sample Output
```
7
3
```
