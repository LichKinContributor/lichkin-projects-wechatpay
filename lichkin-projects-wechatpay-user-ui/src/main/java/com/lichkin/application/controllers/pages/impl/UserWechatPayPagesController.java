package com.lichkin.application.controllers.pages.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lichkin.springframework.controllers.LKPagesController;
import com.lichkin.springframework.web.beans.LKPage;

@Controller
@RequestMapping("/user")
public class UserWechatPayPagesController extends LKPagesController {

	@GetMapping("/wechatpay/{module}/index" + MAPPING)
	public LKPage linkTo(@PathVariable String module) {
		return null;
	}


	@PostMapping("/wechatpay/{module}/index" + MAPPING)
	public LKPage jumpTo(@PathVariable String module) {
		return linkTo(module);
	}

}
