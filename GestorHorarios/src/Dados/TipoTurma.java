/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author Utilizador
 */
public enum TipoTurma{
    Prática,
    Teórica,
    Teórica_ou_Prática{
                @Override
        public String toString(){
            return "Teórica ou Prática";
        }
    };
}
