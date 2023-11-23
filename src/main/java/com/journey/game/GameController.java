package com.journey.game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {
	
	@GetMapping("/game-menu-view")
	public String gameMenuView() {
		return "game/gameMenu";
	}
	
}
