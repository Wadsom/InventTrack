package com.WpCorp.InventTrack.Repository;

import com.WpCorp.InventTrack.Entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<SaleEntity, Long> {
}
