package br.com.matheus.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.matheus.clinicaapi.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
