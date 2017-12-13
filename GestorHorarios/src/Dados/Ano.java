/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author afrl1
 */
public enum Ano{
    ano1{
        @Override
        public String toString(){
            return "1º Ano";
        }
    },
    
    ano2{
        @Override
        public String toString(){
            return "2º Ano";
        }
    },
    
    ano3{
        @Override
        public String toString(){
            return "3º Ano";
        }
    };
}
