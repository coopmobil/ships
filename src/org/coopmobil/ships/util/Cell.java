package org.coopmobil.ships.util;

/**
 * Created by Michael on 18.02.14.
 */
public enum Cell {
    A(1),B(2),C(3),D(4),E(5),F(6),G(7),H(8),I(9),J(10),K(11),L(12),M(13),N(14),O(15),
    Eins(1),Zwei(2),Drei(3),Vier(4),Fuenf(5),Sechs(6),Sieben(7),Acht(8),Neun(9),Zehn(10),Elf(11),Zwölf(12),Dreizehn(13),Vierzehn(14),Fuenfzehn(15);

    private int id;
    Cell(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
