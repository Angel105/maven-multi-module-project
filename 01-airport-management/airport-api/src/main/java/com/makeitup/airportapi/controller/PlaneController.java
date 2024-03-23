package com.makeitup.airportapi.controller;

import com.makeitup.airportapi.service.PlaneService;
import com.makeitup.airportcore.model.PlaneDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlaneController {

    private final PlaneService planeService;

    @Autowired
    public PlaneController(PlaneService planeService) {
        this.planeService = planeService;
    }

    @GetMapping(value = "/planes")
    public ResponseEntity<PlaneDTO> getPlane() {
        PlaneDTO planeDTO = planeService.getPlane();
        return new ResponseEntity<>(planeDTO, HttpStatus.OK);
    }
}
