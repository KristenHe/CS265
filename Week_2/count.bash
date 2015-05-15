#!/bin/bash
#Author: Nischaal Cooray
#Date: 4/11/15
#Description: Iterates through each file in the current directory and outputs the number of lines and words found in the file

words=0
lines=0

for f in `ls`; do
  words=`wc -w $f | cut -f1 -d' '`
	lines=`wc -l $f | cut -f1 -d' '`
  echo "$f $lines $words"
done
