package com.formacion.HibernateSpring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/demo") // This means URL's start with /demo (after
								// Application path)
public class MainController {
	@Autowired 
	private UserRepository userRepository;
	@Autowired
	private NacionalidadRepository nacionalidadRepository;

	@GetMapping(path = "/add") // Map ONLY GET Requests
	public String addNewUser(@RequestParam String name, @RequestParam String email, @RequestParam String pais,
			Map<String, Object> model) {	
		// @RequestParam means it is a parameter from the GET or POST request

		User n = new User();
		n.setName(name);
		n.setEmail(email);
		n.setPais(pais);
		userRepository.save(n);
		model.put("message", "Link");
		if (name != null) {
			model.put("message2", "Saved the user with name " + name);
		}
		return "index";
	}
	@GetMapping(path = "/addCity") // Map ONLY GET Requests
	public String addNewCity(@RequestParam String pais, @RequestParam String ciudad, @RequestParam String idiomaHabla,
			Map<String, Object> model) {

		Nacionalidad n = new Nacionalidad();
		n.setPais(pais);
		n.setCiudad(ciudad);
		n.setIdiomaHabla(idiomaHabla);
		
		nacionalidadRepository.save(n);
		model.put("message", "Link");

		return "index";
	}

	@GetMapping(path = "/all")
	public String getAllUsers(Map<String, Object> model) {	
		model.put("Usuarios", userRepository.findAll());
		return "usuarios";
	}

	@GetMapping(path = "/find")
	public @ResponseBody Iterable<User> getUsers(@RequestParam String name) {
		// @ResponseBody means the returned String is the response, not a view name
		return userRepository.find(name);
	}
	
	@GetMapping(path = "/findCities")
	public String getCities(@RequestParam String name, Map<String, Object> model) {
		model.put("Ciudades", nacionalidadRepository.findCities(name));
		return "cities";
	}

	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", "Link");
		return "index";
	}
}
