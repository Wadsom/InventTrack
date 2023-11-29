package com.WpCorp.InventTrack.Entity;

import com.WpCorp.InventTrack.DTO.SellerDTO;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_sellers")
public class SellerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "seller")
    private List<SaleEntity> sales = new ArrayList<>();

    public SellerEntity() {
    }

    public SellerEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public SellerEntity(SellerDTO dto){
        this.id = dto.id();
        this.name = dto.name();
    }

    public List<SaleEntity> getSales() {
        return sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SellerEntity that = (SellerEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
