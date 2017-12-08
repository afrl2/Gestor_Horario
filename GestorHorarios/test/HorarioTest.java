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
public class HorarioTest {
    
    public static void main(){
        HorarioTest teste=new HorarioTest();
        teste.testGetCurso();
        teste.testSetCurso();
        teste.testSetSemestre();
        teste.testGetAno();
        teste.testGetSemestre();
        teste.testApagar_horario();
        
        teste.testAdicionar_aula();
        teste.testRemove_aula();
    }
    
    public HorarioTest() {
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
     * Test of getCurso method, of class Horario.
     */
    @Test
    public void testGetCurso() {
        System.out.println("getCurso");
        Dados dados = new Dados();
        Horario instance = new Horario(dados, Curso.Lic_EngGI, Semestre.sem1, Ano.ano1);
        System.out.println(instance.getCurso());

    }

    /**
     * Test of setCurso method, of class Horario.
     */
    @Test
    public void testSetCurso() {
        System.out.println("setCurso");
        Curso curso = Curso.Lic_BioEng;
        Dados dados = new Dados();
        Horario instance = new Horario(dados, Curso.Lic_EngGI, Semestre.sem2, Ano.ano3);
        instance.setCurso(curso);
        System.out.println(instance.getCurso());
    }

//    /**
//     * Test of getSemestre method, of class Horario.
//     */
    @Test
    public void testGetSemestre() {
       System.out.println("getSemestre");
       Dados dados = new Dados();
       Horario instance = new Horario(dados, Curso.Lic_EngGI, Semestre.sem2, Ano.ano1);
       System.out.println(instance.getSemestre());
    }
//
//    /**
//     * Test of setSemestre method, of class Horario.
//     */
@Test
    public void testSetSemestre() {
        System.out.println("setSemestre");
        Semestre semestre = Semestre.sem1;
        Dados dados = new Dados();
        Horario instance = new Horario(dados, Curso.Lic_EngGI, Semestre.sem2, Ano.ano1);
        instance.setSemestre(semestre);
        System.out.println(instance.getSemestre());
    }
//    /**
//     * Test of getAno method, of class Horario.
//     */
 @Test
    public void testGetAno() {
        System.out.println("getAno");
        Dados dados = new Dados();
        Horario instance = new Horario(dados, Curso.Lic_EngGI, Semestre.sem2, Ano.ano1);
        System.out.println(instance.getAno());
    }
//
//    /**
//     * Test of setAno method, of class Horario.
//     */
//    @Test
//    public void testSetAno() {
//        System.out.println("setAno");
//        Ano ano = null;
//        Horario instance = null;
//        instance.setAno(ano);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of adicionar_aula method, of class Horario.
//     */
//    @Test
//    public void testAdicionar_aula() {
//        System.out.println("adicionar_aula");
//        Aula aula = null;
//        Horario instance = null;
//        boolean expResult = false;
//        boolean result = instance.adicionar_aula(aula);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove_aula method, of class Horario.
//     */
//    @Test
//    public void testRemove_aula() {
//        System.out.println("remove_aula");
//        Aula aula = null;
//        Horario instance = null;
//        Boolean expResult = null;
//        Boolean result = instance.remove_aula(aula);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of Apagar_horario method, of class Horario.
//     */
    @Test
    public void testApagar_horario() {
        System.out.println("Apagar_horario");
        Dados dados = new Dados();
        Horario instance = new Horario(dados, Curso.Lic_EngGI, Semestre.sem2, Ano.ano1);
        instance.Apagar_horario();
        System.out.println(dados.getHorarios().isEmpty()); 
    }
     
    @Test
    public void testAdicionar_aula() {
        System.out.println("adicionar_aula");
        Dados dados = new Dados();
        Professor prof=new Professor(dados, "Manuel", 23, Grau_Académico.Douturamento);
        Salas sala = new Salas(dados, Departamentos.DEM, 3);
        Turma turma =new Turma(dados, 3, "matematica", Tipo_Turma.Prática);
        Aula aula = new Aula(dados, 9, 30, 10, 30, prof, sala, turma, dia_semana.segunda);
        Horario instance = new Horario(dados, Curso.Lic_EngGI, Semestre.sem2, Ano.ano1);
        
        boolean result = instance.adicionar_aula(aula);
        System.out.println(instance.getAulas().get(0).getSala().getDepartamento());
        System.out.println(instance.getAulas().get(0).getProfessor().getNome());
        System.out.println(instance.getAulas().get(0).getTurma().getDisciplina());
    }
    
    @Test
    public void testRemove_aula() {
        System.out.println("remove_aula");
        
        Dados dados = new Dados();
        Professor prof=new Professor(dados, "Manuel", 23, Grau_Académico.Douturamento);
        Salas sala = new Salas(dados, Departamentos.DEM, 3);
        Turma turma =new Turma(dados, 3, "matematica", Tipo_Turma.Prática);
        Aula aula = new Aula(dados, 9, 30, 10, 30, prof, sala, turma, dia_semana.segunda);
        Horario instance = new Horario(dados, Curso.Lic_EngGI, Semestre.sem2, Ano.ano1);
        
        boolean result = instance.adicionar_aula(aula);
        System.out.println(instance.getAulas().get(0).getSala().getDepartamento());
        System.out.println(instance.getAulas().get(0).getProfessor().getNome());
        System.out.println(instance.getAulas().get(0).getTurma().getDisciplina());
        
        System.out.println(result = instance.remove_aula(aula));
       
      
    }
    
}
