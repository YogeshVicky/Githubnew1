package com.fingress.firebase.model;

import java.util.List;

public class NotificationRequest {

	private String title;
	private String body;
	private String topic;
	private String singleToken;
	private List<String> tokens;

	public NotificationRequest() {
		super();

	}

	public NotificationRequest(String title, String body, String topic, String singleToken, List<String> tokens) {
		super();
		this.title = title;
		this.body = body;
		this.topic = topic;
		this.singleToken = singleToken;
		this.tokens = tokens;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getsingleToken() {
		return singleToken;
	}

	public void setsingleToken(String token) {
		this.singleToken = token;
	}

	public List<String> getTokens() {
		return tokens;
	}

	public void setTokens(List<String> tokens) {
		this.tokens = tokens;
	}

	
}
