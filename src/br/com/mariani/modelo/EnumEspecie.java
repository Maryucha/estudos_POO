package br.com.mariani.modelo;

/**
 *
 * @author maryucha
 */
public enum EnumEspecie {

    CACHORRO("cachorro"),
    FELINO("gato"),
    EQUINO("cavalo"),
    AQUATICOS("peixe");

    private String descricao;
    
    EnumEspecie(String descricao){
        this.descricao=descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
}
