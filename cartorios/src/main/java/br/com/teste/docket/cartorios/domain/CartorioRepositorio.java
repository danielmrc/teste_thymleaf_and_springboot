package br.com.teste.docket.cartorios.domain;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CartorioRepositorio extends JpaRepository<Cartorio, Long>{
    
}
