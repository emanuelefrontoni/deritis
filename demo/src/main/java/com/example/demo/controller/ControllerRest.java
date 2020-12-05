package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerRest {
	@GetMapping("/hello")
	public HelloWord Metodo(@RequestParam(name="param1", defaultValue="Ciao") String param1) {
		return new HelloWord("Riccardo", "De Ritis");
	}
	@PostMapping("/hello")
	public HelloWord Metodo2(@RequestBody HelloWord body) {
		return body;
	}
	
}


/*
 * package com.example.demo.controller;
 * 
 * import java.util.concurrent.atomic.AtomicLong;
 * 
 * import org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 *//**
	 * @author emanuelefrontoni
	 *
	 *//*
		 * @RestController public class ControllerRest {
		 * 
		 * private static final String template = "Hello, %s!"; private final AtomicLong
		 * counter = new AtomicLong();
		 * 
		 * @GetMapping("/rotta1") public scriviQuelloCheVuoi greeting() {
		 * 
		 * scriviQuelloCheVuoi a = new scriviQuelloCheVuoi (3,"PPPP");
		 * 
		 * return a; }
		 * 
		 * 
		 * 
		 * @GetMapping("/rotta2") public scriviQuelloCheVuoi greeting2() {
		 * 
		 * scriviQuelloCheVuoi a = new scriviQuelloCheVuoi (5,"DDD");
		 * 
		 * return a; }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

//@RequestParam(value = "name", defaultValue = "World") String name