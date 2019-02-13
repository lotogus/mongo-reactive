package ar.gmf.mongoreactive

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepo : ReactiveMongoRepository<Person,String>