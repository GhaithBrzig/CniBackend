package com.cni.eagleye.controller;

import com.cni.eagleye.dao.entities.CsvFile;
import com.cni.eagleye.dao.helper.Helper;
import com.cni.eagleye.service.classes.CsvfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.Map;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CsvController {
    @Autowired
    private CsvfileService Csvfileservice;
    public CsvController() {
    }
    @PostMapping({"/product/upload"})
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
        if (Helper.checkExcelFormat(file)) {
            this.Csvfileservice.save(file);
            return ResponseEntity.ok(Map.of("message", "File is uploaded and data is saved to db"));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file ");
        }
    }

    @GetMapping({"/product"})
    public List<CsvFile> getAllProduct() {
        return this.Csvfileservice.getAllProducts();
    }
    
}
