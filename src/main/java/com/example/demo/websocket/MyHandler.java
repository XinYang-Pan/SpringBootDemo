package com.example.demo.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.SneakyThrows;

public class MyHandler extends TextWebSocketHandler {
	
	@SneakyThrows
	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message) {
		System.out.println(message.getPayload());
		session.sendMessage(new TextMessage(message.getPayload()));
	}

}