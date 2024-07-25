package com.fingress.firebase.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.TopicManagementResponse;

@Service
public class FirebaseSubscribeService {
	Log log = LogFactory.getLog(FirebaseSubscribeService.class);

	public void subscribeToTopic(String topic, List<String> tokens) {

		try {
			TopicManagementResponse response = FirebaseMessaging.getInstance().subscribeToTopic(tokens, topic);
			log.error(response.getSuccessCount());
			log.error("subscribed successfully");
		} catch (Exception e) {
			log.error(e);
		}

	}
}
