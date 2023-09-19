package med.voll.api.domain.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

// objeto, tipo de Id
public interface MedicoRepository extends JpaRepository<Medico,Long> {

    Page<Medico> findByActivoTrue(Pageable paginacion);

}
