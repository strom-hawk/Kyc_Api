package com.comviva.party.service;


import com.comviva.party.model.KycDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KycService {
    List<KycDetails> list = new ArrayList<>();
    public KycService(){}
    public void addKycDetails(KycDetails details){
        list.add(details);
    }
    public List< KycDetails> getKycDetils(){
        return list;
    }

}
