Q1 What is the difference between add() and addSuffix?

Q2 What does lookup do? Which function(s) call lookup?

Strings

Note that space is allocated for each string (single word) exactly once
Everybody maintains pointers to these things.
Consider, as input:
It's a new dawn
Draw the table, much as in the notes, after build is called w/this input
Q3 Include the table in your lab sheet. How many references (pointers) are there to each string:

"It's"
"a"
"new"
"dawn"
?
Q4 What are the advantages of this?

Q5 What are the drawbacks?

Does the program explicitly give this memory back?
Wherever we have more than one reference to heap memory we have a problem
Q6 Write a function to clean up statetab when we're all done, give the memory back (don't spend a lot of time here). In-line your function here, in the lab-sheet.

Q7 Does your function work properly? What difficulties did you have?

Q8 Take a step back from the table. How could you make sure that each string was freed exactly once?

The C++ Implementation

Look at markov.cpp
Q9 How are the prefixes stored? Why not use a vector?

Q10 What serves as our dictionary (replaces our hash table)?

Q11 How is the satellite data (list of suffices) stored?

Q12 Are there any advantages to this implementation over the C implementation? What are they?

Q13 Are there any drawbacks?

The Python Implementation

Look at markov.py
Q14 How are the prefixes stored?

Q15 What serves as our dictionary (replaces our hash table)?

Q16 How is the satellite data (list of suffices) stored?

Q17 Are there any advantages to this implementation over the C++ implementation? What are they?

Q18 Are there any drawbacks?
