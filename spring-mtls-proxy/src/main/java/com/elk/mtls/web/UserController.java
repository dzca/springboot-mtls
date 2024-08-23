package com.elk.mtls.web;

import com.elk.mtls.domain.User;
import com.elk.mtls.service.ProxyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("/v1")
@RestController
public class UserController {

	ProxyService proxyService;

	@GetMapping("/user/{id}")
	@ResponseStatus(HttpStatus.OK)
	User getUserByProxy(@PathVariable("id") String id) {
		return proxyService.queryUser();
	}
}
