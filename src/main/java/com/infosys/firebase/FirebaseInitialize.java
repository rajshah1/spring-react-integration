package com.infosys.firebase;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FirebaseInitialize {

    @PostConstruct
    public void initialize() {
        try {
// This will work on if you have the service account json file if not add this path to user defined envirment variable in computer
//FileInputStream serviceAccount =new FileInputStream("./ServiceAccount.json");

/*
 * FirebaseOptions options = new FirebaseOptions.Builder()
 * .setCredentials(GoogleCredentials.fromStream(serviceAccount))
 * .setDatabaseUrl("https://infy-rest-data.firebaseio.com") .build();
 * FirebaseApp.initializeApp(options);
 */
FirebaseOptions options = new FirebaseOptions.Builder()
.setCredentials(GoogleCredentials.getApplicationDefault())
.setDatabaseUrl("https://infy-rest-data.firebaseio.com/")
.build();
FirebaseApp.initializeApp(options);



    } catch (Exception e) {
        e.printStackTrace();
    }

}

}