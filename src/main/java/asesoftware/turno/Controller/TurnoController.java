package asesoftware.turno.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import asesoftware.turno.Entity.Turnos;
import asesoftware.turno.Service.TurnoService;

@RestController
@RequestMapping("/api/turnos/")
public class TurnoController {
	
	@Autowired
	private TurnoService turnoService;

	@GetMapping
	private ResponseEntity<List<Turnos>> getAllTurnos(){
		return ResponseEntity.ok(turnoService.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Turnos> saveTurno (@RequestBody Turnos turno){
		try {
			Turnos turnosGuardada = turnoService.save(turno);
			return ResponseEntity.created(new URI("/api/turnos/" + turnosGuardada.getIdTurno())).body(turnosGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Boolean> deleteTurno (@PathVariable ("id") Long id){
		turnoService.deleteById(id);
		return ResponseEntity.ok(!(turnoService.findById(id)!=null));
	}
	
	
	
	
	
	
	
	
	
	
}
