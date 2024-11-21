package br.senac.ead.zero_two_solutions.Services;

import br.senac.ead.zero_two_solutions.Repositories.BaseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.List;

public abstract class BaseService<TEntity, TKey> {

    protected BaseRepository<TEntity, TKey> repository;

    @Autowired
    public BaseService(BaseRepository<TEntity, TKey> repository){
        this.repository = repository;
    }

    public List<TEntity> findAll(){
        return repository.findAll();
    }

    public TEntity find(TKey id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entidade com id " + id + " não encontrada."));
    }

    public TEntity save(TEntity entity) {
        try {
            return repository.save(entity);
        } catch (DataIntegrityViolationException e) {
            throw new IllegalArgumentException("Erro ao salvar entidade. Verifique as restrições de dados.", e);
        }
    }

    public void delete(TKey id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Entidade com id " + id + " não encontrada.");
        }
        repository.deleteById(id);
    }

    public TEntity update(TKey id, TEntity entity) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Entidade com id " + id + " não encontrada.");
        }
        return repository.save(entity);
    }
}