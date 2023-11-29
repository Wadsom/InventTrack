package com.WpCorp.InventTrack.Service;

import com.WpCorp.InventTrack.DTO.SellerDTO;
import com.WpCorp.InventTrack.Entity.SellerEntity;
import com.WpCorp.InventTrack.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepo;



    public List<SellerDTO> listFindAll(){
        List<SellerEntity> result = sellerRepo.findAll();
        return result.stream().map(x-> new SellerDTO(x)).collect(Collectors.toList());
    }
}
