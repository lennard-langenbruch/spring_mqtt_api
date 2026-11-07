package de.example.api.controller;

import de.example.api.service.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MeasurementController {

    @Autowired
    MeasurementService measurementService;


}
