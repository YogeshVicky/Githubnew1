package com.fingress.firebase;

import java.io.FileInputStream;
import java.io.IOException;
import org.springframework.context.annotation.Configuration;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Configuration
public class FirebaseConfiguration {

	public FirebaseApp initializeFirebaseApp() throws IOException {
		FileInputStream serviceAccount = new FileInputStream("src/main/resources/fireBaseConfig.json");

		@SuppressWarnings("deprecation")
		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();

		return FirebaseApp.initializeApp(options);

	}
}
