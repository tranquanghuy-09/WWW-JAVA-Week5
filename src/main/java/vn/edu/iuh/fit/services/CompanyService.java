package vn.edu.iuh.fit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Company;
import vn.edu.iuh.fit.repositories.CompanyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository repository;

    public boolean add(Company company) {return repository.save(company).equals(company);}
    public boolean addAll(List<Company> list) {return repository.saveAll(list).equals(list);}
    public List<Company> getAll() {return (List<Company>) repository.findAll();}
    public Optional<Company> getByID(long id) {return repository.findById(id);}
    public void delete(long id) {repository.deleteById(id);}
}
