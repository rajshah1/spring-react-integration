# Spring Application

This spring application is connected to database via Firebase .
The service layer has the bussiness log for CRUD operations.


## Firebase connection
I have created the firebase connection by running the firebaseInitilization.java file .
which containts the code that runs at every restart of application.
Code Source:
firebase application /project setting / serviceAccount 
where I Got serviceAcount.json which contains private key to firebase account which should not be persisted .
![image]()
##  (added this file to project directory and while commiting code add this file to .gitignore file).
This connects us to firebase database.

