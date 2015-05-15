The questions for the answers given in *l4* are the questions from the first chapter from the book "The Practice of Programming".

**Python Scripts**

Q1 Look at the students input file in the directory. Write a Python program that, for each student, computes the average of all of the scores for that student, prints 2 columns: the name, followed by the average. See str.strip and str.split to help you. The name of the file will be read as the first command-line argument. Submit a file called s1.py

Q2 Same thing, but the input file will be a CSV (see students.csv for an example). Submit a file called s2.py

Q3 Look at the ids file. You will read a file like this, break each record up into 2 fields; the id, and the name. Look more closely at str.split to help you here. You will store the entries in a dictionary, where ID is the key, and the name is the satellite data. You will then output, in 2 columns, one entry per line, all the entries in your dictionary, sorted (numerically) by ID. dict.keys and list.sort should help you here. The input filename will be the first command-line argument. Submit a file called id.py

Q4 Modify id.py so that if it isn't given any arguments (filename on the cmd-line), it will read stdin, much like cat,grep, head, etc. Submit a file called id2.py
