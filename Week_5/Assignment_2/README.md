The purpose of this assignment is for students to become familiar with writing simple Python scripts, to use built-in containers (data structures), and to see how modules can make some daunting tasks fairly simple.

You will write a Python program that will pull down some Phila. municipal data from the Web, find nearby parking lots.

The motivation is a mobile app. We won't be worrying about the GUI, of course, and we'll have to fake the phone's location.

Your program will pull a CSV down from https://raw.githubusercontent.com/CityOfPhiladelphia/ParksDept-geodata/264f2d579ad2662a135893b03c29d13435a74254/Parking%20Areas%20point/Parking_Areas_point.csv , and parse it up. Use the lat/long information to determine the 20‡ closest parking lots (belonging to Phila. Parks), in decreasing order by distance from user†, one per line .

Each line of output will have this form:

  LAT LONG TYPE SPACES 
To compute distance, just use the Euclidean measure. The area is small enough that any error is negligible.

‡ Your program will have an option, -n , that will allow the user to specify the size of the list. The default will be 20. So:

./findParking.py -n12
†To get the user's location, I provided a Python module, philly_loc.py that has a single function, getLoc(), which will return a list, [lat, long ], of a location, hopefully somewhere in/near Phila. There is a example of using this module in loc_eg.py example.
