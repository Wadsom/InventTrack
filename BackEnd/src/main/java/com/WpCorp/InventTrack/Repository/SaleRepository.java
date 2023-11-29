package com.WpCorp.InventTrack.Repository;

import com.WpCorp.InventTrack.DTO.SaleSucessBySellerDTO;
import com.WpCorp.InventTrack.DTO.SaleSumDTO;
import com.WpCorp.InventTrack.Entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<SaleEntity, Long> {
    @Query("SELECT new com.WpCorp.InventTrack.DTO.SaleSumDTO(obj.seller, SUM(obj.amount))" + "FROM SaleEntity AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query(" SELECT new com.WpCorp.InventTrack.DTO.SaleSucessBySellerDTO(obj.seller,SUM(obj.visited),SUM(obj.deals)) "+"FROM SaleEntity AS obj GROUP BY obj.seller")
    List<SaleSucessBySellerDTO> visitedBySeller();
}
