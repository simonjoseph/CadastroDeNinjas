package dev.uevo.CadastroDeNinjas.Ninjas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.uevo.CadastroDeNinjas.Ninjas.model.NinjaModel;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
    
}
