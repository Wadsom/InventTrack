package com.WpCorp.InventTrack.DTO;

import com.WpCorp.InventTrack.Entity.SellerEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String SellerName;
    private Double sum;

    public SaleSumDTO() {
    }

    public SaleSumDTO(SellerEntity seller, Double sum) {
        super();
        SellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return SellerName;
    }

    public void setSellerName(String sellerName) {
        SellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
