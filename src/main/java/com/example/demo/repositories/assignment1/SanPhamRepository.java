package com.example.demo.repositories.assignment1;

import com.example.demo.entities.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository {
    private List<SanPham> ds;

    public SanPhamRepository()
    {
        this.ds = new ArrayList<>();
        this.ds.add(new SanPham(1, "SP01", "Ao phong", 1));
        this.ds.add(new SanPham(2, "SP02", "Ao da", 2));
    }

    public List<SanPham> findAll()
    {
        return this.ds;
    }

    public void create(SanPham sp)
    {
        this.ds.add(sp);
    }

    public void update(SanPham sp)
    {
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham p = this.ds.get(i);
            if (p.getId() == sp.getId()) {
                this.ds.set(i, sp);
            }
        }
    }

    public void deleteById(int id)
    {
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham p = this.ds.get(i);
            if (p.getId() == id) {
                this.ds.remove(i);
            }
        }
    }

    public SanPham findById(int id)
    {
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham p = this.ds.get(i);
            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }
}
