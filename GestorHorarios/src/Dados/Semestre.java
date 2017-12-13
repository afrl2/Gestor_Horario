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
public enum Semestre{

    sem1{
        @Override
        public String toString(){
            return "1ºSemestre";
        }
    },
    
    sem2{
        @Override
        public String toString(){
            return "2ºSemestre";
        }
    };
}
