package com.tiendaN.dao;

import com.tiendaN.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface ProductoDao extends JpaRepository <Producto,Long> {
}

