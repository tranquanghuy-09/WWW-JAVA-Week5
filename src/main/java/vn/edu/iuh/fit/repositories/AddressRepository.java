package vn.edu.iuh.fit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.edu.iuh.fit.entities.Address;

@RepositoryRestResource
public interface AddressRepository extends CrudRepository<Address, Long> {
}