/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dados.Professor;
import Dados.Dados;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author André Fernandes
 */
public class ProfessorTest {
    public static void main (String []argv)
    {
        ProfessorTest teste=new ProfessorTest();
        teste.testGetNome();
        teste.testSetNome();
        teste.testGetIdade();
        teste.testSetIdade();
        teste.testGetGrau_Académico();
        teste.testSetGrau_Académico();
        
    }
    public ProfessorTest() {
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
     * Test of getNome method, of class Professor.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String nome = "Lara";
        Dados dados = new Dados();
        Professor instance = new Professor(dados,nome, 23, Grau_Académico.Douturamento);
        System.out.println(instance.getNome());    
    }

    /**
     * Test of setNome method, of class Professor.
     */
    @Test
    public void testSetNome() {
         System.out.println("setNome");
        String nome = "Joaquim";
        Dados dados = new Dados();
        Professor instance = new Professor(dados,"Lara", 23, Grau_Académico.Douturamento);
        instance.setNome(nome);
        System.out.println(instance.getNome());  
    }

    /**
     * Test of getIdade method, of class Professor.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        int numero = 13;
        Dados dados = new Dados();
        Professor instance = new Professor(dados,"Lara", numero, Grau_Académico.Douturamento);
        System.out.println(instance.getIdade());  
    }

    /**
     * Test of setIdade method, of class Professor.
     */
    @Test
    public void testSetIdade() {
        System.out.println("setIdade");
        int idade = 13;
        Dados dados = new Dados();
        Professor instance = new Professor(dados,"Lara", 24, Grau_Académico.Douturamento);
        instance.setIdade(idade);
        System.out.println(instance.getIdade()); 
    }

    /**
     * Test of getGrau_Académico method, of class Professor.
     */
    @Test
    public void testGetGrau_Académico() {
        System.out.println("getGrau_Academico");
        Grau_Académico douturamento=Grau_Académico.Licenciamento;
        Dados dados = new Dados();
        Professor instance = new Professor(dados,"Lara", 24, douturamento);
        System.out.println(instance.getGrau_Académico()); 
    }

    /**
     * Test of setGrau_Académico method, of class Professor.
     */
    @Test
    public void testSetGrau_Académico() {
        System.out.println("setGrau_Academico");
        Grau_Académico grau_Académico = Grau_Académico.Licenciamento;
        Dados dados = new Dados();
        Professor instance = new Professor(dados,"Lara", 24, Grau_Académico.Douturamento);
        instance.setGrau_Académico(grau_Académico);  
        System.out.println(instance.getGrau_Académico()); 
    }
    
}
