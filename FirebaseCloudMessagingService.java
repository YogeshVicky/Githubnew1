package com.fingress.firebase.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import com.fingress.firebase.model.NotificationRequest;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;

@Service
public class FirebaseCloudMessagingService {
	Log log = LogFactory.getLog(FirebaseCloudMessagingService.class);

	public void sendNotification(NotificationRequest notificationRequest) {
		Notification notification = Notification.builder().setTitle(notificationRequest.getTitle())
				.setBody(notificationRequest.getBody()).build();

		Message message = Message.builder().setNotification(notification).setToken(notificationRequest.getsingleToken())
				.build();

		try {
			FirebaseMessaging.getInstance().send(message);
		} catch (Exception e) {
			log.error(e);

		}

	}
}
