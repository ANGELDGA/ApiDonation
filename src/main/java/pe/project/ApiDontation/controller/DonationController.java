package pe.project.ApiDontation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.project.ApiDontation.entity.Donation;
import pe.project.ApiDontation.services.DonationService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8083"})
@RequestMapping("/Donation")
public class DonationController {
    
    @Autowired
    private DonationService donationService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Donation>> findAll(){
        return new ResponseEntity<>(donationService.findAll(),HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Donation> add(@RequestBody Donation donation){
        return new ResponseEntity<>(donationService.add(donation),HttpStatus.CREATED);
    }
    
}
