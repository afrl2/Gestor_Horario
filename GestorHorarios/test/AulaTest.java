/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author afrl1
 */
public class AulaTest {
    
    public static void main(){
        AulaTest teste=new AulaTest();
        teste.testGetHora_inicial();
        teste.testSetHora_inicial();
        teste.testGetHora_final();
        teste.testSetHora_final();
        teste.testGetProfessor();
        teste.testGetSala();
        teste.testGetTurma();
        teste.testGetDia();
        teste.testSetDia();
        teste.testCompareTo();
        teste.testVerificar_hora();
        teste.testRemove_aula();
    }
    
    public AulaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHora_inicial method, of class Aula.
     */
    
    @Test
    public void testGetHora_inicial() {
        System.out.println("getHora_inicial");
        Dados dados = new Dados();
        Hora hi = new Hora(1, 0);
        Hora hf = new Hora(2, 30);
        Professor professor = new Professor(dados, "André", 69, Grau_Académico.Douturamento);
        Salas sala = new Salas(dados, Departamentos.DEIS, 10);
        Turma turma = new Turma(dados, 2, "GPS", Tipo_Turma.Prática);
        
        Aula instance = new Aula(dados, 1, 0, 2, 30, professor, sala, turma, dia_semana.segunda);
                
        int result = instance.getHora_inicial().getHora();
        assertEquals(hi.getHora(), result);
        
    }

    /**
     * Test of setHora_inicial method, of class Aula.
     */
    @Test
    public void testSetHora_inicial() {
        System.out.println("setHora_inicial");
        Dados dados = new Dados();
        Hora hora_inicial = new Hora(1,1);
        Aula instance = new Aula(dados,1,2,2,1,new Professor(dados,"Joao",30,Grau_Académico.Licenciamento),new Salas(dados, Departamentos.DEIS, 10),new Turma(dados, 2, "GPS", Tipo_Turma.Prática),dia_semana.sexta);
        instance.setHora_inicial(hora_inicial);
        assertEquals(instance.getHora_inicial().getHora(),new Hora(1,1).getHora());
    }

//    /**
//     * Test of getHora_final method, of class Aula.
//     */
    @Test
    public void testGetHora_final() {
        System.out.println("getHora_final");
        Dados dados = new Dados();
        Hora hi = new Hora(1, 0);
        Hora hf = new Hora(2, 30);
        Professor professor = new Professor(dados, "André", 69, Grau_Académico.Douturamento);
        Salas sala = new Salas(dados, Departamentos.DEIS, 10);
        Turma turma = new Turma(dados, 2, "GPS", Tipo_Turma.Prática);
        
        Aula instance = new Aula(dados, 1, 0, 2, 30, professor, sala, turma, dia_semana.segunda);
                
        int result = instance.getHora_final().getHora();
        assertEquals(hf.getHora(), result);
    }

//    /**
//     * Test of setHora_final method, of class Aula.
//     */
    @Test
    public void testSetHora_final() {
        System.out.println("setHora_final");
         Dados dados = new Dados();
        Hora hora_final = new Hora(1,1);
        Aula instance = new Aula(dados,1,2,2,1,new Professor(dados,"Joao",30,Grau_Académico.Licenciamento),new Salas(dados, Departamentos.DEIS, 10),new Turma(dados, 2, "GPS", Tipo_Turma.Prática),dia_semana.sexta);
        instance.setHora_final(hora_final);
        assertEquals(instance.getHora_inicial().getHora(),new Hora(1,1).getHora());
    }

//    /**
//     * Test of getProfessor method, of class Aula.
//     */
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        Dados dados = new Dados();
        Professor professor = new Professor(dados, "André", 69, Grau_Académico.Douturamento);
        Salas sala = new Salas(dados, Departamentos.DEIS, 10);
        Turma turma = new Turma(dados, 2, "GPS", Tipo_Turma.Prática);
        
        Aula instance = new Aula(dados, 1, 0, 2, 30, professor, sala, turma, dia_semana.segunda);
                
        Professor result = instance.getProfessor();
        assertEquals(new Professor(dados, "André", 69, Grau_Académico.Douturamento), result);
    }

//    
//    /**
//     * Test of getSala method, of class Aula.
//     */
    @Test
    public void testGetSala() {
        System.out.println("getSala");
        Dados dados = new Dados();
        Professor professor = new Professor(dados, "André", 69, Grau_Académico.Douturamento);
        Salas sala = new Salas(dados, Departamentos.DEIS, 10);
        Turma turma = new Turma(dados, 2, "GPS", Tipo_Turma.Prática);
        
        Aula instance = new Aula(dados, 1, 0, 2, 30, professor, sala, turma, dia_semana.segunda);
                
        Salas result = instance.getSala();
        assertEquals(new Salas(dados, Departamentos.DEIS, 10), result);
    }

    @Test
    public void testGetTurma() {
        System.out.println("getTurma");
        Dados dados = new Dados();
        Professor professor = new Professor(dados, "André", 69, Grau_Académico.Douturamento);
        Salas sala = new Salas(dados, Departamentos.DEIS, 10);
        Turma turma = new Turma(dados, 2, "GPS", Tipo_Turma.Prática);
        
        Aula instance = new Aula(dados, 1, 0, 2, 30, professor, sala, turma, dia_semana.segunda);
                
        Turma result = instance.getTurma();
        assertEquals(new Turma(dados, 2, "GPS", Tipo_Turma.Prática), result);
    }

//    /**
//     * Test of getDia method, of class Aula.
//     */
    @Test
    public void testGetDia() {
        System.out.println("getDia");
        Dados dados = new Dados();
        Professor professor = new Professor(dados, "André", 69, Grau_Académico.Douturamento);
        Salas sala = new Salas(dados, Departamentos.DEIS, 10);
        Turma turma = new Turma(dados, 2, "GPS", Tipo_Turma.Prática);
        
        Aula instance = new Aula(dados, 1, 0, 2, 30, professor, sala, turma, dia_semana.segunda);
                
        dia_semana result = instance.getDia();
        assertEquals(dia_semana.segunda, result);
    }
//
//    /**
//     * Test of setDia method, of class Aula.
//     */
    @Test
    public void testSetDia() {
        System.out.println("setDia");
        Dados dados = new Dados();
        Hora hora_inicial = new Hora(1,1);
        Aula instance = new Aula(dados,1,2,2,1,new Professor(dados,"Joao",30,Grau_Académico.Licenciamento),new Salas(dados, Departamentos.DEIS, 10),new Turma(dados, 2, "GPS", Tipo_Turma.Prática),dia_semana.sexta);
        instance.setDia(dia_semana.domingo);
        assertEquals(dia_semana.domingo,instance.getDia());
    }
//
//    /**
//     * Test of compareTo method, of class Aula.
//     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Dados dados = new Dados();
        Professor professor = new Professor(dados, "André", 69, Grau_Académico.Douturamento);
        Salas sala = new Salas(dados, Departamentos.DEIS, 10);
        Turma turma = new Turma(dados, 2, "GPS", Tipo_Turma.Prática);
        
        Aula instance = new Aula(dados, 1, 0, 2, 30, professor, sala, turma, dia_semana.segunda);
        Aula o = new Aula(dados, 1, 0, 2, 30, professor, sala, turma, dia_semana.segunda);
        
        int expResult = 1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        
    }

//    /**
//     * Test of Verificar_hora method, of class Aula.
//     */
//    @Test
    public void testVerificar_hora() {
        System.out.println("Verificar_hora");
        Dados dados = new Dados();
        Professor professor = new Professor(dados, "André", 69, Grau_Académico.Douturamento);
        Salas sala = new Salas(dados, Departamentos.DEIS, 10);
        Turma turma = new Turma(dados, 2, "GPS", Tipo_Turma.Prática);
        
        Aula instance = new Aula(dados, 1, 0, 2, 30, professor, sala, turma, dia_semana.segunda);
        Aula o = new Aula(dados, 1, 0, 2, 30, professor, sala, turma, dia_semana.segunda);
        int expResult = 1;
        int result = instance.Verificar_hora(o);
        assertEquals(expResult, result);
        
    }
//
//    /**
//     * Test of remove_aula method, of class Aula.
//     */
    @Test
    public void testRemove_aula() {
        System.out.println("remove_aula");
        Dados dados = new Dados();
        Professor professor = new Professor(dados, "André", 69, Grau_Académico.Douturamento);
        Salas sala = new Salas(dados, Departamentos.DEIS, 10);
        Turma turma = new Turma(dados, 2, "GPS", Tipo_Turma.Prática);
        
        Aula instance = new Aula(dados, 1, 0, 2, 30, professor, sala, turma, dia_semana.segunda);
        Boolean expResult = true;
        Boolean result = instance.remove_aula();
        assertEquals(expResult, result);
        
    }
    
}
