package com.fingress.firebase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fingress.firebase.model.NotificationRequest;
import com.fingress.firebase.service.FirebaseCloudMessagingService;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {

	@Autowired
	FirebaseCloudMessagingService cloudMessagingService;

	@PostMapping("/send")
	public String sendNotification(@RequestBody NotificationRequest notificationRequest) {

		return cloudMessagingService.sendNotification(notificationRequest);

	}
}
