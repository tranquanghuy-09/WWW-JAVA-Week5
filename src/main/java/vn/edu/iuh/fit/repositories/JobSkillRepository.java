package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.edu.iuh.fit.entities.JobSkill;
import vn.edu.iuh.fit.ids.JobSkill_ID;

@RepositoryRestResource
public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkill_ID> {
}