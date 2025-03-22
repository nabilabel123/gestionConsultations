package ma.enset.gestionconsultation.web;
import ma.enset.gestionconsultation.entity.Consultation;
import ma.enset.gestionconsultation.entity.Patient;
import ma.enset.gestionconsultation.service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class MainController {

    @GetMapping("/")
    public String accueil() {
        return "accueil"; // Correspond à home.html dans templates
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Correspond à contact.html dans templates
    }
}

