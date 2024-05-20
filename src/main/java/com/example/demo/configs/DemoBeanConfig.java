package com.example.demo.configs;

import com.example.demo.entities.SanPham;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DemoBeanConfig {
    @Bean(name = "bean1")
    public SanPham getSP1()
    {
        SanPham sp = new SanPham(1, "SP01", "Ao Nam", 1);
        return sp;
    }

    @Bean(name = "bean2")
    // @Primary
    public SanPham getSP2()
    {
        SanPham sp = new SanPham(2, "SP02", "Ao Nu", 1);
        return sp;
    }
}
