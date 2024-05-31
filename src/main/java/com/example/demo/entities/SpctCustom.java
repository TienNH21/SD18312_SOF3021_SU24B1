package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpctCustom {
    @Id
    private Integer id;

    private Integer idMS;
    private Integer idKT;
    private String tenSP;
    private String maSPCT;
    private Integer soLuong;
    private double donGia;
    private Integer trangThai;
}
