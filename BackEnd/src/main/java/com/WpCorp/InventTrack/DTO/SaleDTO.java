package com.WpCorp.InventTrack.DTO;

import com.WpCorp.InventTrack.Entity.SaleEntity;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record SaleDTO(@NotNull Long id, @NotNull Integer visited, @NotNull Integer deals, @NotNull Double amount, @NotNull LocalDate date, @NotNull SellerDTO Seller ) {
 public SaleDTO(SaleEntity saleEntity){
     this(saleEntity.getId(), saleEntity.getDeals(), saleEntity.getVisited(), saleEntity.getAmount(), saleEntity.getDate(),  new SellerDTO(saleEntity.getSeller()));
 }
}
