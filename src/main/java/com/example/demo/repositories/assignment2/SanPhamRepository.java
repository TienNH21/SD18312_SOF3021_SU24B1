package com.example.demo.repositories.assignment2;

import com.example.demo.entities.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepository
    extends JpaRepository<SanPham, Integer> {
//    @Query("SELECT sp FROM SanPham sp WHERE sp.ten LIKE :keyword")
//    public Page<SanPham> findByTenLike(@Param("keyword") String keyword, PageRequest p);

    public Page<SanPham> findByTenLike(String keyword, PageRequest p);
}
