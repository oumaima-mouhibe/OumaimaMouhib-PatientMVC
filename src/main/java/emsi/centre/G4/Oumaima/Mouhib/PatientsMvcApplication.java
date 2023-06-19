package emsi.centre.G4.Oumaima.Mouhib;

import emsi.centre.G4.Oumaima.Mouhib.entities.Patient;
import emsi.centre.G4.Oumaima.Mouhib.repos.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Yassine",new Date(),false,12));
            patientRepository.save(new Patient(null,"Yassmine",new Date(),true,342));
            patientRepository.save(new Patient(null,"Hanae",new Date(),true,564));
            patientRepository.save(new Patient(null,"Yassir",new Date(),false,32));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }
}
