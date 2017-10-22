package nacho.example.Api1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {
	
	@GetMapping("/api1")
	public String api1() {
		return "Aplicación 1A.-Puedes Acceder a este recurso desde tu api GateWay! \n"+
				"revisa las rutas en el app.properties de zuul";
	}

	
}
