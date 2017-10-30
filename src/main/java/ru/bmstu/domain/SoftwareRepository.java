package ru.bmstu.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Maxon on 30.10.2017.
 */
@RepositoryRestResource
public interface SoftwareRepository extends CrudRepository<KernelSoftware, Long> {

    KernelSoftware findByName(@Param("ddd") String name);
}
