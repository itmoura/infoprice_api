package br.com.infoprice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.infoprice.service.GenericService;

public abstract class GenericController<T> {
	
	protected GenericService<T> service;

	public GenericController(GenericService<T> srv) {
        this.service = srv;
    }

    // LIST
	@GetMapping
    public List<T> Get() {
        return this.service.list();
    }

	// FIND BY ID
    @GetMapping("/{id}")
    public T Get(@PathVariable(value = "id") Long id) {
        return this.service.findById(id);
	}

    // CREATE
    @PostMapping
    public T Post(@Valid @RequestBody T obj) {
        return this.service.register(obj);
    }

    // VALIDACAO CREATE
    @PostMapping("/{id}")
    public ResponseEntity<String> Post(){
        return ResponseEntity.badRequest().build();
    }

    // UPDATE
    @PutMapping("/{id}")
    public T Put(@Valid @RequestBody T newObj){
        return this.service.edit(newObj);
    }

    // VALIDACAO UPDATE
    @PutMapping
    public ResponseEntity<String> Put(){
        return ResponseEntity.badRequest().build();
    }

    // DELETE
    @DeleteMapping("/{id}")
    public boolean Delete(@PathVariable(value = "id") long id){
        return this.service.delete(id);
    }

    // VALIDACAO DELETE
    @DeleteMapping
    public ResponseEntity<String> Delete(){
        return ResponseEntity.badRequest().build();
    }
}
