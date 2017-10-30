package org.unskilled.myapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/myapp")
public class MyAppController {
	@Value("${test.testProp.Name}")
	private String name;
	@RequestMapping(method=RequestMethod.GET, path="welcome")
	public Object welcome(){
		return "Welcome "+this.name;
	}
}
