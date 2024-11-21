package br.senac.ead.zero_two_solutions.Controllers;

import br.senac.ead.zero_two_solutions.Services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<TEntity, TKey> {

    protected BaseService<TEntity, TKey> service;

    @Autowired
    public BaseController(BaseService<TEntity, TKey> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TEntity>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TEntity> findById(@PathVariable TKey id) {
        TEntity entity = service.find(id);
        return ResponseEntity.ok(entity);
    }

    @PostMapping
    public ResponseEntity<TEntity> create(@RequestBody TEntity entity) {
        TEntity savedEntity = service.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEntity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TEntity> update(@PathVariable TKey id, @RequestBody TEntity entity) {
        TEntity updatedEntity = service.update(id, entity);
        return ResponseEntity.ok(updatedEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable TKey id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}