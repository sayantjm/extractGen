package com.db.extractGen.controller;

import com.db.extractGen.model.ReportType;
import com.db.extractGen.model.tflmDto;
import com.db.extractGen.service.ExtractGenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by sayantjm on 19/9/20
 */
@RequestMapping("/api/v1/extract")
@RestController
@RequiredArgsConstructor
public class ExtractGenController {

    private final ExtractGenService service;

    @GetMapping("/{reportType}")
    public ResponseEntity<List<String>> getReportId(@PathVariable("reportType") String reportType){
        //return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
        ReportType reportTypeEntry = ReportType.valueOf(reportType);
        return new ResponseEntity<List<String>>(service.extractGen(reportTypeEntry), HttpStatus.OK);
    }
}
