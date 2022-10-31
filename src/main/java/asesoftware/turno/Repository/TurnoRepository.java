package asesoftware.turno.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import asesoftware.turno.Entity.Turnos;

public interface TurnoRepository extends JpaRepository<Turnos, Long>{

}
