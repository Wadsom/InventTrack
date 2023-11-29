package com.WpCorp.InventTrack.Repository;

import com.WpCorp.InventTrack.Entity.SellerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<SellerEntity, Long> {
}
