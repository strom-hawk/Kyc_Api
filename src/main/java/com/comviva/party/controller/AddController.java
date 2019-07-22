package com.comviva.party.controller;


import com.comviva.party.model.KycDetails;
import com.comviva.party.service.KycService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.comviva.party.model.ResponseStatus;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/kyc")
public class AddController {

    @Autowired
    KycService service;
    ResponseStatus responseStatus;

    @PostMapping(value="/add" , consumes = { MediaType.APPLICATION_JSON_VALUE},
            produces = { MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseStatus> addKYC(@RequestBody KycDetails details)
    {
        service.addKycDetails(details);
        responseStatus = new ResponseStatus("success");
        return new ResponseEntity<ResponseStatus>(responseStatus, HttpStatus.OK);
    }

    @GetMapping(value="/view", produces = { MediaType.APPLICATION_JSON_VALUE})
    public List< KycDetails> viewKYC()
    {
        return service.getKycDetils();
    }

}
