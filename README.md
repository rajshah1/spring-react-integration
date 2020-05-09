# Spring Application

This spring application is connected to database via Firebase .<br/>
The service layer has the bussiness log for CRUD operations.<br/>


## Firebase connection
I have created the firebase connection by running the firebaseInitilization.java file .<br/>
which containts the code that runs at every restart of application.<br/>

### create firestore database: 

![](https://i.stack.imgur.com/7VJ7R.png)
<br/>
### get Private key for connection

![](https://codelabs.developers.google.com/codelabs/firebase-admin/img/dbf895b6eed12501.png)

Code Source:<br/>
Firebase application /project setting / serviceAccount <br/>
where find serviceAcount.json file which contains private key to firebase account which should not be persisted .<br/>


##  (added this file to project directory and while commiting code add this file to .gitignore file).
This connects us to firebase database.<br/>

We have exposed 2 services to /createUser and /getUser/{id} where is {id} is for name of user as it is unique .<br/>

Bussiness logic in Service package.<br/>


## CI - continous integration with spring 
1. check if the project does not have any error:<br/>
    Use Git action's maven for building the code every time we push code.<br/>
2. Notify my slack channel regarding push on master.<br/>
  For connection to slack used : Post-slack-messages actions where secrets are set using github setting .<br/>
  
  
 Feel free to post issues if any<br/>
  
# Author.
 Raj shah<br/>
 shahraj121997@gmail.com

