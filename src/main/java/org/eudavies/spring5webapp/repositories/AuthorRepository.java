package org.eudavies.spring5webapp.repositories;

import org.eudavies.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
