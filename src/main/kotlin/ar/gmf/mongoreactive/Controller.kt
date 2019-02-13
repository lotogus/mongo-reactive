package ar.gmf.mongoreactive

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class Controller(val personRepo:PersonRepo) {

    @GetMapping("/persons")
    fun getAll() = personRepo.findAll().take(10)

    @PostMapping("/persons")
    fun save(@RequestBody person:Person) = personRepo.insert(person)

    @PutMapping("/persons")
    fun update(@RequestBody person:Person) = personRepo.save(person)
}