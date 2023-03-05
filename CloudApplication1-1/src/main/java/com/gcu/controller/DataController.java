/*********************
 * Note: when logging into localhost:8080/hello
 * 		username: user
 * 		password: test123
 * 			password changed in application.properties page
 */

package com.gcu.controller;

//loger?
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gcu.CloudApplication11Application;
import com.gcu.model.VehicleModel;


@Controller
@Primary
@RequestMapping("/main")
public class DataController {
	//logger
	Logger logger = LoggerFactory.getLogger(DataController.class);
	
	/**
	 * Simple hello world controller that returns a string in the response body
	 * invoke using /test1 URI
	 */
	@GetMapping("/test1")
	@ResponseBody
	public String printHello() {
		//more logger
		logger.info("This is default log from Cloud App");
		
		// return string in the response body (must use @ResponseBody annotation
		return "Hello World!";
	}
	
	
	/**
	 * Simple Hello World Controller that returns a View Name along with a model attribute named message
	 * Invoke using /test2 URI
	 * @param model Model to bind to the View
	 * 
	 * @return View name hello
	 */
	@GetMapping("/test2")
	public String test2(Model model) {
		//more logger
		logger.info("This is default log from test page two");
		
		//;return string
		model.addAttribute("message", "Hello, welcome to the vehicle registration!");
		return "main";
	}
	
	
	/**
	 * Simple hello world controller that returns a View Name along with model attribute named message
	 * Invoke using /test3 UIR
	 * 
	 * @return ModelAndView with both the Model and the view to render
	 */
	@GetMapping("/test3")
	public ModelAndView printHello1() {

		//create a model and view  then set attribute
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", new String("Hello world from ModelAndView!"));
		mv.addObject("message2", new String("Another Hello World from ModelAndView!"));
		mv.setViewName("main");
		return mv;
	}
	
	
	@GetMapping("/test4")
	public String printHello(@RequestParam("message") String message, Model model) {
		/**
		 * 
		 */
		//return string

		model.addAttribute("message", message);
		return "main";
	}
	
	@GetMapping("/VehicleEntry")
	public String vehicleEntry(Model model) {

		model.addAttribute("message", "Enter Vehicle Data");
		model.addAttribute("VehicleModel", new VehicleModel());
		
		return "VehicleEntry.html";
	}
	@PostMapping("/ShowVehicle")
	public String showVehicle(Model model) {
		//TODO

		
		return "VehicleView.html";
	}
	
}
