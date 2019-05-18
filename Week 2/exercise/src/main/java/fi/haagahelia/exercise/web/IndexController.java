package fi.haagahelia.exercise.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fi.haagahelia.exercise.domain.Friend;


@Controller
public class IndexController {
	public ArrayList<Friend> friends = new ArrayList<Friend>();
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String home(@RequestParam(value="friend", required=false) String name, Model model){

		this.friends.add(new Friend(name));
		
		model.addAttribute("friends", friends);
		return "index";
	}
}
