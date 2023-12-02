package pe.project.ApiDontation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.project.ApiDontation.entity.Donation;


public interface DonationRepository extends JpaRepository<Donation, Long>{
    
}
