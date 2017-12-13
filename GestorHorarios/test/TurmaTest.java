/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dados.Turma;
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


public class TurmaTest {
    
    public static void main (String []argv)
{
    TurmaTest teste=new TurmaTest();
    teste.testSetNumero();
    System.out.println(teste.testGetNumero());
    teste.testGetDisciplina();
    teste.testSetDisciplina();
    teste.testGetTipoTurma();
    teste.testSetTipoTurma();
    teste.testCompareTo();
}
    
    public TurmaTest() {
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
     * Test of getTipoTurma method, of class Turma.
     */
    @Test
    public void testGetTipoTurma() {
        System.out.println("getTipoTurma");
        Tipo_Turma tipoTurma = Tipo_Turma.Teórica;
        Turma instance = new Turma(4,"badjoras", tipoTurma);
        System.out.println(instance.getTipoTurma());
    }

    /**
     * Test of setTipoTurma method, of class Turma.
     */
    @Test
    public void testSetTipoTurma() {
        System.out.println("setTipoTurma");
        Tipo_Turma tipoTurma = Tipo_Turma.Teórica;
        Turma instance = new Turma(4,"badjoras", Tipo_Turma.Prática);   
        instance.setTipoTurma(Tipo_Turma.Teórica);
        System.out.println(instance.getTipoTurma());
    }

    /**
     * Test of getNumero method, of class Turma.
     */
    @Test
    public int testGetNumero() {
        System.out.println("getNumero");
        int numero = 2;
        Turma instance = new Turma(numero,"badjoras", Tipo_Turma.Prática);       
        return instance.getNumero();
    }

    /**
     * Test of setNumero method, of class Turma.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 3;
        Turma instance = new Turma(4,"badjoras", Tipo_Turma.Prática);
        instance.setNumero(numero);
        System.out.println(instance.getNumero());
    }

    /**
     * Test of getDisciplina method, of class Turma.
     */
    @Test
    public void testGetDisciplina() {
        System.out.println("getDisciplina");
        String disciplina = "portugues";
        Turma instance = new Turma(3,disciplina, Tipo_Turma.Prática);
        System.out.println(instance.getDisciplina());
    }

    /**
     * Test of setDisciplina method, of class Turma.
     */
    @Test
    public void testSetDisciplina() {
        System.out.println("setDisciplina");
        String disciplina = "matematica";
        Turma instance = new Turma(3,"ola", Tipo_Turma.Prática);
        instance.setDisciplina(disciplina);
        System.out.println(instance.getDisciplina());
    }

    /**
     * Test of compareTo method, of class Turma.
     */
    @Test
    public void testCompareTo() {
        int result=-1;
        System.out.println("compareTo");
        Turma o = new Turma(3,"Portugues", Tipo_Turma.Prática);
        Turma instance = new Turma(3,"Portugues", Tipo_Turma.Prática);
        System.out.println(result = instance.compareTo(o));
        
    }
    
}
