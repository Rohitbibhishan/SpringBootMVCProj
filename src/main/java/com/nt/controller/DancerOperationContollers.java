package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Dancer;
import com.nt.repository.DancerRepository;

@Controller
public class DancerOperationContollers {
	
	@Autowired
	private DancerRepository dancerRepo;
	
	//Welcome page Launching
	@GetMapping("/")
	public String showHomePage() {
		
		System.out.println("DancerOperationContollers.showHomePage()");
		
		//LVN
		return "welcome";
	}
	
	
	@GetMapping("/register")
	public String showDancerRegistraionPage() {
		System.out.println("DancerOperationContollers.showDancerRegistraionPage()");
		//LVN
		return "dancer_registration_page";
	}
	
	
	@PostMapping("/register")
	public String registerDancer(@ModelAttribute Dancer dancer,Map<String,Object> map) {
		
		
		
		
      //return LVN
		System.out.println("DancerOperationContollers.registerDancer()");
		System.out.println("model class object" + dancer);
		
		dancerRepo.save(dancer);
		
if(dancer.getFee()>10000)
	map.put("feeRange","Costly");

else if(dancer.getFee()<=0)
	map.put("feeRange","Charity Dancer");

else map.put("feeRange","Affordable");

    //saving Dancer Object data to Database
     
     
		return "show_result";
		
		
		                 
		
	}

}

