package br.com.Uana.farmacia.repository;

import br.com.Uana.farmacia.model.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
