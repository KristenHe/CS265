Type pushd ~/ to go to your home directory
type find . -type f -mtime -2 -print
Q 1: What is the output?

Create a subdirectory w/some files:
$ mkdir tmp
$ touch tmp/gotMe.bash
Q 2: What would the find command be to find all files that end in .bash?

Try it, until you get it right
Q 3: What is the output?

Clean up that tmp directory
type popd to return to your lab directory
wc

Use wc to find the number of characters, words, and lines in breadIsDangerous.txt
Q 4: What were the results?

Q 5: How could you use grep, wc (with the -l option), and a pipe to find how many lines contain the string "the"?

Look at spellExample
type ispell spellExample, follow the prompts.
Do a listing of the directory
Q 6: What is different?

Look at spellExample again
type echo "An extra line" >> spellExample

type diff spellExample spellExample.bak
Q 7: Explain the output

type diff spellExample spellExample
Q 8: What did you see this time?

type grep dough breadIsDangerous.txt
type echo $?
type grep uniqueString breadIsDangerous.txt
type echo $?
type grep dough noSuchFile
type echo $?
Q 9: Explain the different return values (the man pages might help)

Take a look again at args.bash, eg.bash, and rv.bash
Run them, and understand each step of the way
Ask me if you don't
Write a script called count.bash that, for each file in the working directory, prints the filename, the # of lines, and the # of words to stdout, like this:
breadIsDangerous.txt 73 431 
spellExample 5 21
Do not use find
Q 10: Upload count.bash

Write a shell script that accepts two file extensions as command line arguments and renames all files with the first extension within the current working directory to have the second extension instead.
For example:

$ reextend .log .txt
Would cause install.log to be renamed to install.txt, and

$ reextend A B
Would cause TADAA to be renamed to TADAB . It would also cause file.A to be renamed file.B .

The script should print out error messages as is appropriate if there is any problem with the command line arguments. Test the script with a range of different parameters, including incorrect parameters or missing parameters.
hint: See Parameter Expansion in the bash man or info page.

Q 11: Call this script reextend, and upload it w/your lab.

You just used your favorite ripper to get some songs off a bunch of CDs that you legally purchased. You set the output format, got the bit-rate you wanted, but forgot to set the format for the filenames. You ended up w/listings like this:
Led Zeppelin - Over the Hills and Far Away.mp3
, all in the same directory. What you really wanted was to have the songs in directories by artist, and just the song name for the filename:

Led Zeppelin/Over the Hills and Far Away.mp3
So, write a script that looks in the current directory only for mp3 files, breaks the filename out into artist and song title, creates the appropriate directory (if it doesn't already exist), removes the artist and the first ' - ' from the filename, and moves it into the directory.

Q 12: Call this script organiseMusic, and upload it w/your lab.
