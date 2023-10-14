package vn.edu.iuh.fit.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.services.CandidateService;

@RestController
@RequestMapping("/candidate")
public class CandidateResource {
    @Autowired
    private CandidateService service;

    @GetMapping
    public String getAll(Model model){
        model.addAttribute("candidates",service.getAll());

        return "candidate/candidates";
    }
    @GetMapping("/str")
    public String getString(){
        return "hihi";
    }
}
