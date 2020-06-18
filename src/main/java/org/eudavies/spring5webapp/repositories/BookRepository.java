package org.eudavies.spring5webapp.repositories;

import org.eudavies.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{

}
