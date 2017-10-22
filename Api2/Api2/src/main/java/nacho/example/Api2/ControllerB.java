package nacho.example.Api2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {
	
	@GetMapping("/api2")
	public String api2() {
		return "Aplicación 2B.-Puedes Acceder a este recurso desde tu api GateWay! \n"
				+ "Revisa las rutas en el app.properties de zuul";
	}
}
