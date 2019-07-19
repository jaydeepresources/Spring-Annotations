package com.boot;

import org.springframework.beans.factory.annotation.Autowired;

public class Message {

	private String msg;
	
	@Autowired
	private Receiver receiver;

	public Message() {

	}

	public Message(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public String toString() {
		return "Message [msg=" + msg + ", receiver=" + receiver + "]";
	}

	
}
