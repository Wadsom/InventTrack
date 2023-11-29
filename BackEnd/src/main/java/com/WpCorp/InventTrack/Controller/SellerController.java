package com.WpCorp.InventTrack.Controller;

import com.WpCorp.InventTrack.DTO.SellerDTO;
import com.WpCorp.InventTrack.Service.SellerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class SellerController {
    @Autowired
    private final SellerService sellerService;

    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }


    @GetMapping("/")
    public ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> dto = sellerService.listFindAll();
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }


}
