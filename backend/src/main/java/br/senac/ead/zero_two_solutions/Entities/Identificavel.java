package br.senac.ead.zero_two_solutions.Entities;

public interface Identificavel<TKey> {
    TKey getId();
    void setId(TKey id);
}
