package br.com.exemplo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploApi {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		
		return "<h1>Jib Plugin Docker</h1>";
	}
}