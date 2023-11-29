package com.WpCorp.InventTrack.Service;

import com.WpCorp.InventTrack.DTO.SaleDTO;
import com.WpCorp.InventTrack.DTO.SaleSucessBySellerDTO;
import com.WpCorp.InventTrack.DTO.SaleSumDTO;
import com.WpCorp.InventTrack.DTO.SellerDTO;
import com.WpCorp.InventTrack.Entity.SaleEntity;
import com.WpCorp.InventTrack.Repository.SaleRepository;
import com.WpCorp.InventTrack.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {
    @Autowired
    private SaleRepository SaleRepo;

    @Autowired
    private SellerRepository sellerRepo;

    @Transactional(readOnly = true)
    public Page<SaleDTO> listFindAll(Pageable pageable) {
        //Salva na memoria fazendo o Jpa usar esse Cache para não ficar fazendo várias pesquisas no banco
        sellerRepo.findAll();
        Page<SaleEntity> result = SaleRepo.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountBySeller(){
        return SaleRepo.amountGroupedBySeller();
    }
    @Transactional(readOnly = true)
    public List<SaleSucessBySellerDTO> saleSucessBySellerDTOS(){
        return SaleRepo.visitedBySeller();
    }
}
