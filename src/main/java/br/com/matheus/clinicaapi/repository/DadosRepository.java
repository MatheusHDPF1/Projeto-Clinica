package br.com.matheus.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.matheus.clinicaapi.model.Cliente;

public interface DadosRepository extends JpaRepository<Cliente, Long>{
	
}
