package com.fingress.firebase.model;

public class NotificationRequest {

	private String title;
	private String body;
	private String token;

	public NotificationRequest() {
		super();

	}

	public NotificationRequest(String title, String body, String token) {
		super();
		this.title = title;
		this.body = body;
		this.token = token;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "NotificationRequest [title=" + title + ", body=" + body + ", token=" + token + "]";
	}

}
