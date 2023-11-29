package com.WpCorp.InventTrack.DTO;

import com.WpCorp.InventTrack.Entity.SellerEntity;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class SaleSucessBySellerDTO implements Serializable {
    private static final long serialVersionUID =1L;
private String sellerName;
private Long Deals;
private Long Visited;

    public SaleSucessBySellerDTO(SellerEntity seller, Long deals, Long visited) {
        this.sellerName = seller.getName();
        Deals = deals;
        Visited = visited;
    }


    public SaleSucessBySellerDTO() {
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getDeals() {
        return Deals;
    }

    public void setDeals(Long deals) {
        Deals = deals;
    }

    public Long getVisited() {
        return Visited;
    }

    public void setVisited(Long visited) {
        Visited = visited;
    }
}
