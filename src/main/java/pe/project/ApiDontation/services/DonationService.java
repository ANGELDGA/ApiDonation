package pe.project.ApiDontation.services;

import java.util.List;
import pe.project.ApiDontation.entity.Donation;

public interface DonationService {
    
    public List<Donation> findAll();
    public Donation add(Donation donation);
}
