package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.commons.ConfigContext;
import com.entity.FirstEntity;

@RestController
@RequestMapping("/user")
public class FirstController {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody()
	public FirstEntity view(@PathVariable("id") Long id) throws InterruptedException {
		FirstEntity user = new FirstEntity();
		user.setId(id);
		user.setName("msl");
		System.out.println(ConfigContext.getInstance().getString(
				"site.vmnameprefix"));
		System.out.println("3秒前前前前前前前前前前");
		Thread.sleep(new Long(3000));
		System.out.println("3秒后后后后后后后后后后houhouhou新新xinxinxinxin");
		System.out.println(ConfigContext.getInstance().getInteger(
				"account.default.user.minNode"));

		return user;
	}
}