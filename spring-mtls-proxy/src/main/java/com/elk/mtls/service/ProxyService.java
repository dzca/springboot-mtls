package com.elk.mtls.service;

import com.elk.mtls.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@AllArgsConstructor
@Service
public class ProxyService {

	RestClient restClient;

	public User queryUser(){
		String uriBase = "http://localhost:3001/v1";
		return restClient.get()
				.uri(uriBase + "/user/2")
				.retrieve()
				.body(User.class);
	}
}
