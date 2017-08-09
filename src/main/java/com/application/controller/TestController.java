package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.application.domain.Article;


@Controller
public class TestController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody Article hello() {
		return new Article();
	}

}
