package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/management")
public class Management {

	@RequestMapping(value = "/{department}", method = RequestMethod.GET)
	@ResponseBody
	public String view(@PathVariable("department") String dep)  {
		System.out.println("department"+dep);
		String aaa = "[ 7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2,26.5, 23.3, 18.3, 13.9, 19.6, 17.0, 6.9, 19.5,14.5, 18.2, 11.5, 15.2, 16.5, 23.3, 18.3,13.9, 9.6 ]";
		
		return aaa;
	}

}
