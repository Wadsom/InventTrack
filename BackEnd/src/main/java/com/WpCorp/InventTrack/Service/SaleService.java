package com.WpCorp.InventTrack.Service;

import com.WpCorp.InventTrack.DTO.SaleDTO;
import com.WpCorp.InventTrack.DTO.SellerDTO;
import com.WpCorp.InventTrack.Entity.SaleEntity;
import com.WpCorp.InventTrack.Entity.SellerEntity;
import com.WpCorp.InventTrack.Repository.SaleRepository;
import com.WpCorp.InventTrack.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {
    @Autowired
    private SaleRepository SaleRepo;



    public Page<SaleDTO> listFindAll(Pageable pageable){
        Page<SaleEntity> result = SaleRepo.findAll(pageable);
        return result.map(x-> new SaleDTO(x));
    }
}
