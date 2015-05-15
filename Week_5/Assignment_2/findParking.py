#!/usr/bin/python
#Author: Nischaal Cooray
#Date: 4/28/15
#Description: Determines the closest parking lots to the user based on the users current coordinates. The user is able to control how many results are displayed by adding an argument in the format -n* where * is any number greater than 0 and 100.

import sys
import urllib
import philly_loc
import math

URL = 'https://raw.githubusercontent.com/CityOfPhiladelphia/ParksDept-geodata/264f2d579ad2662a135893b03c29d13435a74254/Parking%20Areas%20point/Parking_Areas_point.csv' #The source URL for the parking lot data.


if len( sys.argv ) < 2 :  # no argument provided 
    numOut = 20
else :
    numOut = sys.argv[1][2:] 

try :
    float(numOut).is_integer() #Check if the extracted part of the argument is an integer
except ValueError :
    print "ERROR:"
    sys.exit()

if not (float(numOut)%1 == 0): #Ensure that the number provided is a whole number
    print "ERROR:"
    sys.exit()
if (int(numOut) < 0) : #Ensure the number provided is positive
    print "ERROR:"
    sys.exit()
if (int(numOut) == 0) : #If the number provided is 0, don't display anything.
    sys.exit()
if (int(numOut) > 100) : #If the number is too large, exit the program.
    print "ERROR:"
    sys.exit()

sock = urllib.urlopen( URL )

doc = sock.readlines()[1:] #Read the source file. It is in CSV format.
sock.close()

l = []
for i in enumerate(doc) :
	temp = i[1].strip(" \t\n") #Remove leading and trailing whitespaces, newlines and tabs
	temp =  temp.split(",") #Create a sublist of the values separated by commas
	l.append(temp)

userPos = philly_loc.getLoc() #Get the users position

d = {}
count = 0
for i in enumerate(l) : #Iterate through the list of parking lots and calculate the distance from the user to the parking lot.
	j = list(i)[1]
        dLat = float(j[6]) - float(userPos[0])
        dLon = float(j[7]) - float(userPos[1])
        dist = math.sqrt(math.pow(dLat, 2) + math.pow(dLon, 2))
        d[dist] = count 
	count += 1

fList = []

for i in sorted(d) :
    fList.append(list(l[d[i]])) #Sort the list
 
if int(numOut) == 1 : #Display formatted output 
    fLat = fList[0][6]
    fLon = fList[0][7]
    fType = fList[0][2]
    fSpaces = fList[0][5]

    if fLat == " " :
        fLat = "?"
    if fLon == " " :
        fLon = "?"
    if fType == " " :
        fType = "?"
    if fSpaces == " " :
        fSpaces = "?"

    print "%s %s %s %s" % (fLat, fLon, fType, fSpaces) 
else :
    for i in range((int(numOut) - 1), -1, -1) : 
        fLat = fList[i][6]
        fLon = fList[i][7]
        fType = fList[i][2]
        fSpaces = fList[i][5]

        if fLat == " " :
            fLat = "?"
        if fLon == " " :
            fLon = "?"
        if fType == " " :
            fType = "?"
        if fSpaces == " " :
            fSpaces = "?"
        
        print "%s %s %s %s" % (fLat, fLon, fType, fSpaces) 
