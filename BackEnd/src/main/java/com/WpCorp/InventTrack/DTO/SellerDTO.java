package com.WpCorp.InventTrack.DTO;

import com.WpCorp.InventTrack.Entity.SellerEntity;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public record SellerDTO(@NotNull String name, @NotNull Long id) implements Serializable {
    private static Serializable serializable = 1L;

   public SellerDTO(SellerEntity seller){
       this(seller.getName(), seller.getId());
   }
}

