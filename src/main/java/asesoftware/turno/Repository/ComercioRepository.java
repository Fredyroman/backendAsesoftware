package asesoftware.turno.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import asesoftware.turno.Entity.Comercios;

public interface ComercioRepository extends JpaRepository<Comercios, Long> {

}
