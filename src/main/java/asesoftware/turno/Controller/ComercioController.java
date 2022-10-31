package asesoftware.turno.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import asesoftware.turno.Entity.Comercios;
import asesoftware.turno.Service.ComercioService;

@RestController
@RequestMapping("/api/comercio/")
public class ComercioController {
	
	@Autowired
	private ComercioService comercioService;
	
	@GetMapping()
	private ResponseEntity<List<Comercios>> getAllCargos(){
		return ResponseEntity.ok(comercioService.findAll());
	}

}
