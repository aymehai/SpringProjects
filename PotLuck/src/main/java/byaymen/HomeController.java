package byaymen;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

	@Autowired
	ChefRepository chefRepository;
	
	@RequestMapping("/")
	public String homepage(Model model) {
		model.addAttribute("message", "Welcome to the application");
		return "index";
	}
	
	@GetMapping("/add")
	public String getDish(Model model){
		model.addAttribute(new Chef());
		return "potlucklist";
	}
	
	@PostMapping("/add")
	public String processDish(@Valid Chef chef, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "potlucklist";
		}
		
		chefRepository.save(chef);
		
		return "index";
	}
	
	@RequestMapping("/all")
    public @ResponseBody Iterable<Chef> getAllChefs()
    {
        return chefRepository.findAll();
    }
}
