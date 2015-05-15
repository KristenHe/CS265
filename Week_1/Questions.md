Q1: Describe when the shell invokes .bashrc, and when it invokes .bash_profile.

Q2:Complete all edits in this file, as directed by the file, save as vi_lab, and submit along w/your lab.

Copy funny and hello.bash from the course lab directory
Q3: Do an ls -l . What do you see?

Q4: If you enter chmod 644 some_file , what permissions did you give to whom?

Q5: If you enter chmod 755 some_file , what permissions did you give to whom?

Type chmod 644 funny
Q6: Can you read your funny file?

Type chmod 644 hello.bash
Q7: Can you read your hello.bash file?

Attempt to execute hello.bash: $ ./hello.bash
Q8: Were you successful?

Q9: What are 2 ways of giving yourself execute permission on this file?

Type: $ chmod 400 funny
Open the file in an editor, make a change
Save the file
Q10: What happened?

The shell reserves certain characters. These include *, which matches any number of characters, and ?, which matches exactly 1 character. A space is used to separate tokens.
Copy the following files from my directory: annoy annoy.cc itemList itemList-2cols TelecomTruths UnitTestingPhase
Execute each of the following lines:
ls * 
ls a* 
ls *m* 
ls anno? 
ls annoy?
Q11: What is the output of each of these?

Create a file w/a space in the name: vi a space
Q12: What happened?

If the shell sees back quotes it will execute the quoted command, and replaced the quoted expression w/the output (stdout) of the command.
try each of the following commands.
Q13: Record the output:

echo Is a < b?
echo "Is a < b?"
echo "\$USER is $USER"
echo '\$USER is $USER'
echo "Today is `date`"
echo "Today is $(date)"
echo 'Today is `date`'
echo -e "Files that start w/e:\n`ls e*`"

Q14: What is the difference between sort itemList-2cols and sort -n itemList-2cols?

Q15: How would you list the 8 items in itemList-2cols w/the highest numbers, in descending order?

Tar all the files in your directory: tar cvf lab1.tar *
Make sure you got it all: tar tf lab1.tar
Now zip that file up: gzip lab1.tar
Q16: The tar file is gone. What is in its place?

Delete that file, we'll do it all at once:
tar cvf - * | gzip > lab1.tgz
Okay, delete the tgz file.
If you have a newer tar, you're on a linux box, we can be even slicker:
tar cvzf lab1.tgz *
Make a copy of that file: cp lab1.tgz lab1.2.tgz
Okay, now let's extract gzip and tar files:
gunzip lab1.tgz
Q17: What happened to the *.tgz file?

To untar a tar file:
mkdir play 
mv lab1.tar lab1.2.tgz play 
cd play 
tar xvf lab1.tar
To do that all at once:
gunzip -c lab1.2.tgz | tar xvf -
Or, if you're on a Linux box:

tar xvzf lab1.2.tgz
Clean up:
cd .. 
\rm -rf Play
Looking around

Q18: Show the grep used to find if any files in this lab directory mention "Vacation".

Now where did I put that? You've just logged in, and cd'd to your lab directory, but lab1 isn't there. Without changing directories, issue a find to search your entire home directory for that file you were working on, lab1.
Q19: Put the find command you used above here in your labsheet.
