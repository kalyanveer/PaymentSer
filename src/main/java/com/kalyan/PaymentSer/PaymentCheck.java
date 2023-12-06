package com.kalyan.PaymentSer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/many")
public class PaymentCheck {
	
	@GetMapping(path="/pull")
	public String checking()
	{
	return "all checking are a done";
	}
}
