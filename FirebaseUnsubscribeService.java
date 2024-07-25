package com.fingress.firebase.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.TopicManagementResponse;

@Service
public class FirebaseUnsubscribeService {
	Log log = LogFactory.getLog(FirebaseUnsubscribeService.class);

	public void unSubscribeFromTopic(String topic, List<String> tokens) {

		try {
			TopicManagementResponse response = FirebaseMessaging.getInstance().unsubscribeFromTopic(tokens, topic);
			log.error(response.getSuccessCount());
			log.error("unsubscribed successfully");
		} catch (Exception e) {
			log.error(e);
		}

	}
}
