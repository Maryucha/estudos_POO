package br.com.mariani.modelo;

/**
 *
 * @author maryucha
 */
public enum Especie {

    CACHORRO("cachorro"),
    FELINO("gato"),
    EQUINO("cavalo"),
    AQUATICOS("peixe");

    private String descricao;
    
    Especie(String descricao){
        this.descricao=descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
}
