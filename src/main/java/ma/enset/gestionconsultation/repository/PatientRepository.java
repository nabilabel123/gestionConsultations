package ma.enset.gestionconsultation.repository;

import ma.enset.gestionconsultation.entity.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PatientRepository extends JpaRepository<Patient, Long> {



}
;