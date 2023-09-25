package com.chess.system.boardgame;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Posicao {

    private int linha;

    private int coluna;
    @Override
    public String toString(){
    return linha + ", " + coluna;

    }
}
