#!/usr/bin/python
#Author: Nischaal Cooray
#Date: 4/24/15
#Description: 

import sys
import math

if len( sys.argv ) < 2 :  # no file name
	print 'ERROR:'
	sys.exit()
else :
	fName = "students" 

f = open( fName, "r" )  # open file for reading (default)

l = f.readline()
while l :
	l = l.strip( ' \t\n' ) #Remove leading/trailing whitespaces
	s = l.split() #Split string into individual words
	length = len(s[1:])
	i = 1  
	total = 0 #The total value of the students scores
	while i<=length :
		total += float(s[i]) #Increment the total
		i += 1
	
	total = int(round(total/length)) #Calculate average
	print '{0} {1}'.format(s[0], total) #Print formatted output

	l = f.readline()#Read the next line of the file 
