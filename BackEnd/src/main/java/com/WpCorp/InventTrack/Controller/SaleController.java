package com.WpCorp.InventTrack.Controller;

import com.WpCorp.InventTrack.DTO.SaleDTO;
import com.WpCorp.InventTrack.DTO.SaleSucessBySellerDTO;
import com.WpCorp.InventTrack.DTO.SaleSumDTO;
import com.WpCorp.InventTrack.Service.SaleService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Sales")
public class SaleController {
    @Autowired
    private SaleService saleServ;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> result = saleServ.listFindAll(pageable);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        List<SaleSumDTO> result = saleServ.amountBySeller();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/Sucess-Seller")
    public ResponseEntity<List<SaleSucessBySellerDTO>> sucessBySeller() {
        List<SaleSucessBySellerDTO> sucessSeller = saleServ.saleSucessBySellerDTOS();
        return ResponseEntity.status(HttpStatus.OK).body(sucessSeller);
    }
}
