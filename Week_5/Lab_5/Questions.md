An abstract data type (ADT) is really just a description about the behavior of a particular type, without any mention of implementation details. E.g., a stack can be implemented many ways, but its behavior doesn't change.
Q 1) Describe each of the following ADTs:

List
Stack
Queue
Dictionary (Map)

Q 2) Given a sorted array with n items, how many times (at most) will the binary search compare elements? Explain your answer.

Q 3) Given an array with n items, how many times (at most) will the linear search compare elements? Explain your answer.

Q 4) Give an example when using linear search would be preferable over the binary search.

Q 5) Show the effect of the quicksort, from the lecture notes, on the following array (always choose the left-most element in a sub-array as the pivot). Show the array at the beginning of each level of calls. Mark the pivot of each sub-array.

*84* 37 93 82 98 27 63 73 93 27 75 55 45 8

Q 6) See the file d1.c from the lab directory. Display the list that's built.

Q 7) See the file ll.py from the lab directory. Display the list that's built.

Q 8) Compile and run the file ptrs.c from the lab directory. Why are the 2 sets of output different? What's going on there?

Q 9) See the file hash.c from the lab directory. Display the resulting table.

Q 10) From the table above, write a function called find, that takes a key and a reference to an integer, fills in the reference w/the appropriate value (if found), and returns 1 (true). If the key is not found, return 0 (false). You may assume that p_ans already points to a valid location. So:

int find( char *key, int *p_ans );
Can be called like this:

 char *name = "Bob";
int data;
if( find( name, &data ))
   printf( "Found %s.  (S)he's %i\n\n", name, data );
else
   printf( "\nCouldn't find %s\n\n", name );
