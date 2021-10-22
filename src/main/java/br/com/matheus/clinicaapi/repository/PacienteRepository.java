package br.com.matheus.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.matheus.clinicaapi.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
