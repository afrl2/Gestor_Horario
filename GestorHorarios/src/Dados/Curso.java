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
public enum Curso{
    //Licenciaturas
    Lic_EngBiol  {
        @Override
        public String toString(){
            return "Engenharia Biológica";
        }
    },
    
    Lic_EngBiom  {
        @Override
        public String toString(){
            return "Engenharia Biomédica - Bioeletrónica";
        }
    },
    
    Lic_EngCivil  {
        @Override
        public String toString(){
            return "Engenharia Civil";
        }
    },
    
    Lic_EngElectrmec  {
        @Override
        public String toString(){
            return "Engenharia Electromecânica";
        }
    },
    
    Lic_EngElecttec  {
        @Override
        public String toString(){
            return "Engenharia Electrotécnica";
        }
    },
    
    Lic_EngGI  {
        @Override
        public String toString(){
            return "Engenharia e Gestão Industrial";
        }
    },
    
    Lic_EngInf  {
        @Override
        public String toString(){
            return "Engenharia Informática";
        }
    },
    
    Lic_EngInfEU  {
        @Override
        public String toString(){
            return "Engenharia Informática - Curso Europeu";
        }
    },
    
    Lic_EngQui  {
        @Override
        public String toString(){
            return "Engenharia Química";
        }
    },
    
    Lic_EngMec  {
        @Override
        public String toString(){
            return "Engenharia Mecânica";
        }
    },
    
    Lic_BioEng  {
        @Override
        public String toString(){
            return "Bioengenharia ";
        }
    },
//Mestrados    
    Mest_ComE  {
        @Override
        public String toString(){
            return "Mestrado em Comércio Electrónico";
        }
    },
    
    Mest_EngCiv  {
        @Override
        public String toString(){
            return "Mestrado em Engenharia Civil - Especialização em Contrução Urbana";
        }
    },
    
    Mest_EngElectrtec  {
        @Override
        public String toString(){
            return "Mestrado em Engenharia Electrotécnica";
        }
    },
        
    Mest_EngElectrmec  {
        @Override
        public String toString(){
            return "Mestrado em Engenharia Eletromecânica";
        }
    },
    
    Mest_EngGI {
        @Override
        public String toString(){
            return "Mestrado em Engenharia e Gestão Industrial";
        }
    },
    
    Mest_EngMec {
        @Override
        public String toString(){
            return "Mestrado em Engenharia Mecânica";
        }
    },
    
    Mest_Erasmus {
        @Override
        public String toString(){
            return "Mestrado Erasmus Mundus - Mobilidade Elétrica e Sistemas"
                    + " de Energia";
        }
    },
    
    Mest_InfSis {
        @Override
        public String toString(){
            return "Mestrado em Informática e Sistemas";
        }
    },
    
    Mest_InstBio {
        @Override
        public String toString(){
            return "Mestrado em Instrumentação Biomédica";
        }
    },
    
    Mest_ProcQuiBio{
        @Override
        public String toString(){
            return "Mestrado em Processos Químicos e Biológicos";
        }
    };
    
}
