package cl.twk.proyectos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value = "hollowKnight")
	public String hollowKnight() {
		return "hollowknight";
	}
	




	@GetMapping(value = "enderLilies")
	public String enderLilies() {
		return "enderLilies";
	}
	




	
	@GetMapping(value = "portal2")
	public String portal2() {
		return "portal2";
	}
}
	