package pe.project.ApiDontation.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.project.ApiDontation.dao.DonationRepository;
import pe.project.ApiDontation.entity.Donation;

@Service
public class DonationServiceImpl implements DonationService{

    @Autowired
    private DonationRepository donationRepository;
    
    @Override
    public List<Donation> findAll() {
        return donationRepository.findAll();
    }

    @Override
    public Donation add(Donation donation) {
        return donationRepository.save(donation);
    }
    
}
