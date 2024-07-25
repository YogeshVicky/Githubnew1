package com.fingress.firebase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fingress.firebase.model.NotificationRequest;
import com.fingress.firebase.service.FirebaseCloudMessagingService;
import com.fingress.firebase.service.FirebaseCloudMessagingTopic;
import com.fingress.firebase.service.FirebaseSubscribeService;
import com.fingress.firebase.service.FirebaseUnsubscribeService;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {

	@Autowired
	FirebaseCloudMessagingService cloudMessagingService;

	@Autowired
	FirebaseCloudMessagingTopic cloudMessagingTopic;

	@Autowired
	FirebaseSubscribeService firebaseSubscribeService;

	@Autowired
	FirebaseUnsubscribeService firebaseUnsubscribeService;

	@PostMapping("/send")
	public String sendNotification(@RequestBody NotificationRequest notificationRequest) {

		cloudMessagingService.sendNotification(notificationRequest);
		return "Notification Sent Successfully";

	}

	@PostMapping("/topic")
	public String sendNotificationTopic(@RequestBody NotificationRequest notificationRequest) {

		cloudMessagingTopic.sendTopicNotification(notificationRequest);
		return "Notification Sent Successfully";

	}

	@PostMapping("/subscribe")
	public String subscribeTopic(@RequestBody NotificationRequest notificationRequest) {
		String topicName = "fingress_update";

		if (topicName.contains(notificationRequest.getTopic())) {
			firebaseSubscribeService.subscribeToTopic(notificationRequest.getTopic(), notificationRequest.getTokens());
			return "subscribed successfully";
		} else {
			return "invaid topic name";
		}
	}

	@PostMapping("/unsubscribe")
	public String unsubscribeTopic(@RequestBody NotificationRequest notificationRequest) {
		String topicName = "fingress_update";

		if (topicName.contains(notificationRequest.getTopic())) {
			firebaseUnsubscribeService.unSubscribeFromTopic(notificationRequest.getTopic(),notificationRequest.getTokens());
			return "unsubscribed successfully";
		} else {
			return "invaid topic name";
		}
	}
}
