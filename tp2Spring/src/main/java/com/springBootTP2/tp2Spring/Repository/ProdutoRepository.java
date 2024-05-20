package com.springBootTP2.tp2Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springBootTP2.tp2Spring.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}