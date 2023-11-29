package com.WpCorp.InventTrack.Controller;

import com.WpCorp.InventTrack.DTO.SaleDTO;
import com.WpCorp.InventTrack.Service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
