package com.ishikawayoshi.web.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SimpleSchedulerService {

	public String getSimpleHello(String name) {
		return String.format("Hello " + name);
	}

}
