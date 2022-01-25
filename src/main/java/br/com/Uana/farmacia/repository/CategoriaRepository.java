package br.com.Uana.farmacia.repository;

import br.com.Uana.farmacia.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
    public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
