package asesoftware.turno.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import asesoftware.turno.Entity.Servicios;
import asesoftware.turno.Service.ServicioService;

@RestController
@RequestMapping("/api/servicios/")
public class ServicioController {
	
	@Autowired
	private ServicioService usuarioService;
	
	@GetMapping
	private ResponseEntity<List<Servicios>> getAllUsuarios(){
		return ResponseEntity.ok(usuarioService.findAll());
	}
	
	@GetMapping("{id}")
    private ResponseEntity<List<Servicios>> getUsuariosByIdCargo(@PathVariable("id") Long idCargo){
		return ResponseEntity.ok(usuarioService.findAllByCargo(idCargo));
	}
	

}
