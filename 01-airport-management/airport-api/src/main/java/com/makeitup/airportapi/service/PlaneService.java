package com.makeitup.airportapi.service;

import com.makeitup.airportcore.model.PlaneDTO;
import org.springframework.stereotype.Service;

@Service
public class PlaneService {
    public PlaneDTO getPlane() {
        return new PlaneDTO("Jumbo Jet", 4);
    }
}

