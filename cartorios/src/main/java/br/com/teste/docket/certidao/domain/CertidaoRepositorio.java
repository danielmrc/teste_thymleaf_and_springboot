package br.com.teste.docket.certidao.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertidaoRepositorio extends JpaRepository<Certidao, Long>{

}
