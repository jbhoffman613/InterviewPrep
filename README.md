# InterviewPrep
Here is a collection of various coding challenge problems that I have completed. This repo stands not only as an example of the prep work I have done, but I also hope to have it be a repository of solutions and coding challenge for NU CCIS majors applyng for co-op in the future. 

If you look in the Java directory, you will find a directory with both examples of Java coding challenges but also tests accompanying that act as verification for the work I have done. 

In the future, I hope to add more directories with examples of coding challenges in them.

In the Java Directory here are questions thus far in the repo:
1. RevInt.java
Description:
Reverse digits of an integer
@param a Integer
@return  Integer or 0 if the result overflows and does not fit in a 32 bit signed integer


2. DiffK.java
Description
Given an array ‘A’ of sorted integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.
@param a An ArrayList of Integers
@param b an integer
@return 1 if the above is true and 0 if the above is false.

3. NthEnd.java
Description
Remove the Nth element from the end of the list
@param ListNode A
@param int N
@return ListNode that has the nth element from th end returned.

Here is the implementation of the list node class:
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

4. Pascal1.java
Description
Given numRows, generate the first numRows of Pascal’s triangle.
@param a an integer representing the number of rows
@return  a 2 dimensional arraylist


