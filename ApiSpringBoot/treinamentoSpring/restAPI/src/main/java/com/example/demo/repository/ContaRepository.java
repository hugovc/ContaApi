package com.example.demo.repository;

import com.example.demo.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ashish on 13/5/17.
 */
@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer>{
}
