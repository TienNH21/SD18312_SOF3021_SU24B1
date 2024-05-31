package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SanPhamChiTiet")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SPCT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="IdMauSac")
    private Integer idMS;

    @Column(name="IdKichThuoc")
    private Integer idKT;

//    @Column(name="IdSanPham")
//    private Integer idSP;

    /**
     * (N+1) Query Problem
     * FetchType -> Eager/Lazy
     */
    @ManyToOne
    @JoinColumn(name="IdSanPham")
    private SanPham sp;

    @Column(name="MaSPCT")
    private String maSPCT;

    @Column(name="SoLuong")
    private Integer soLuong;

    @Column(name="DonGia")
    private double donGia;

    @Column(name="TrangThai")
    private Integer trangThai;
}
