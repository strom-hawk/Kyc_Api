package com.comviva.party.service;

import com.comviva.party.model.KycDetails;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class KycService {
    HashMap<Integer , KycDetails> map = new HashMap<Integer, KycDetails>();
    int i=1;
    public KycService(){}
    public void addKycDetails(KycDetails details){
        map.put(i,details);
        i++;

    }
    public HashMap<Integer,KycDetails> getKycDetils(){
        return map;
    }

}
