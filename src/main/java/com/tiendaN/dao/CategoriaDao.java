package com.tiendaN.dao;

/**
 *
 * @author camac
 */
import com.tiendaN.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface CategoriaDao extends JpaRepository <Categoria,Long> {
    
}
