package com.xiachao.demo.repository;

import com.xiachao.demo.domain.Boy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoyRepository extends JpaRepository<Boy,Integer> {
    List<Boy> findByName(String name);
}
