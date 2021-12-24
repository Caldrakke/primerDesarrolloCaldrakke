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
	
	@GetMapping(value = "nierAutomata")
	public String nierAutomata() {
		return "nierAutomata";
	}

    @GetMapping(value = "portal2")
	public String portal2() {
		return "portal2";
	}




@GetMapping(value = "darkSouls3")
public String darkSouls3() {
	return "darkSouls3";
   }



@GetMapping(value = "oriAndTheBlindForest")
public String oriAndTheBlindForest() {
	return "oriAndTheBlindForest";
}

@GetMapping(value = "listaJuegos")
public String listaJuegos() {
	return "listaJuegos";
}


}

