package br.com.teste.docket.certidao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.teste.docket.cartorios.domain.Cartorio;

@Entity
public class Certidao implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (nullable = false)
    private String nome;

    @ManyToOne
    private Cartorio cartorio;

    public Certidao(){}

    public Certidao(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCartorio(Cartorio cartorio){
        this.cartorio = cartorio;
    }

    public Cartorio getCartorio(){
        return this.cartorio;
    }
}
