package br.senac.ead.zero_two_solutions.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<TEntity, TKey> extends JpaRepository<TEntity, TKey> {
}