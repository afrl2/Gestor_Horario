/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dados.Salas;
import Dados.Departamentos;
import Dados.Dados;
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
public class SalasTest {
    
    public static void main(){
        SalasTest teste=new SalasTest();
        teste.testGetDepartamento();
        teste.testSetDepartamento();
        teste.testGetNumero();
        teste.testSetNumero();
        teste.testCompareTo();
        teste.testRemove_salas();
    }
    
    public SalasTest() {
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
     * Test of getDepartamento method, of class Salas.
     */
    @Test
    public void testGetDepartamento() {
        System.out.println("getDepartamento");
        Departamentos departamento=Departamentos.DEIS;
        Dados dados=new Dados();
        Salas instance = new Salas(dados,departamento,1);
        Departamentos expResult = Departamentos.DEIS;
        Departamentos result = instance.getDepartamento();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDepartamento method, of class Salas.
     */
    @Test
    public void testSetDepartamento() {
        System.out.println("setDepartamento");
        Departamentos departamento = Departamentos.DEIS;
        Dados dados=new Dados();
        Salas instance = new Salas(dados,departamento,1);
        instance.setDepartamento(departamento);
        
    }

    /**
     * Test of getNumero method, of class Salas.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Dados dados=new Dados();
        Salas instance = new Salas(dados,Departamentos.DEIS,3);
        int expResult = 3;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumero method, of class Salas.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 1;
        Dados dados=new Dados();
        Salas instance = new Salas(dados,Departamentos.DEIS,3);
        instance.setNumero(numero);
        
    }

    /**
     * Test of compareTo method, of class Salas.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Dados dados=new Dados();
        Salas o = new Salas(dados,Departamentos.DEIS,1);
        Salas instance = new Salas(dados,Departamentos.DEIS,1);
        int expResult = 1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove_salas method, of class Salas.
     */
    @Test
    public void testRemove_salas() {
        System.out.println("remove_salas");
        Dados dados=new Dados();
        Salas instance = new Salas(dados,Departamentos.DEIS,1);
        instance.remove_salas();
        
    }
    
}
