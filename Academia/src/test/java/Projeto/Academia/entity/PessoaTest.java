/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Projeto.Academia.entity;

import java.time.LocalDate;
import java.util.Calendar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER
 */
public class PessoaTest {
    
    public PessoaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTipo method, of class Pessoa.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Pessoa instance = new Pessoa();
        char expResult = ' ';
        char result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Pessoa.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        char tipo = ' ';
        Pessoa instance = new Pessoa();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Pessoa.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Pessoa.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Pessoa instance = new Pessoa();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData_nascimento method, of class Pessoa.
     */
    @Test
    public void testGetData_nascimento() {
        System.out.println("getData_nascimento");
        Pessoa instance = new Pessoa();
        Calendar expResult = null;
        LocalDate result = instance.getDataNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData_nascimento method, of class Pessoa.
     */
    @Test
    public void testSetData_nascimento() {
        System.out.println("setData_nascimento");
        LocalDate data_nascimento = null;
        Pessoa instance = new Pessoa();
        instance.setDataNascimento(data_nascimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class Pessoa.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class Pessoa.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "";
        Pessoa instance = new Pessoa();
        instance.setCpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRg method, of class Pessoa.
     */
    @Test
    public void testGetRg() {
        System.out.println("getRg");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getRg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRg method, of class Pessoa.
     */
    @Test
    public void testSetRg() {
        System.out.println("setRg");
        String rg = "";
        Pessoa instance = new Pessoa();
        instance.setRg(rg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Pessoa.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Pessoa.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Pessoa instance = new Pessoa();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class Pessoa.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class Pessoa.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        Pessoa instance = new Pessoa();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCep method, of class Pessoa.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getCep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCep method, of class Pessoa.
     */
    @Test
    public void testSetCep() {
        System.out.println("setCep");
        String cep = "";
        Pessoa instance = new Pessoa();
        instance.setCep(cep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Pessoa.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Pessoa.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "";
        Pessoa instance = new Pessoa();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Pessoa.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Pessoa.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "";
        Pessoa instance = new Pessoa();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class Pessoa.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBairro method, of class Pessoa.
     */
    @Test
    public void testSetBairro() {
        System.out.println("setBairro");
        String bairro = "";
        Pessoa instance = new Pessoa();
        instance.setBairro(bairro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCidade method, of class Pessoa.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCidade method, of class Pessoa.
     */
    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        String cidade = "";
        Pessoa instance = new Pessoa();
        instance.setCidade(cidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Pessoa.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Pessoa.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Pessoa instance = new Pessoa();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservacao method, of class Pessoa.
     */
    @Test
    public void testGetObservacao() {
        System.out.println("getObservacao");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.getObservacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservacao method, of class Pessoa.
     */
    @Test
    public void testSetObservacao() {
        System.out.println("setObservacao");
        String observacao = "";
        Pessoa instance = new Pessoa();
        instance.setObservacao(observacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData_admissao method, of class Pessoa.
     */
    @Test
    public void testGetData_admissao() {
        System.out.println("getData_admissao");
        Pessoa instance = new Pessoa();
        Calendar expResult = null;
        LocalDate result = instance.getDataAdmissao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData_admissao method, of class Pessoa.
     */
    @Test
    public void testSetData_admissao() {
        System.out.println("setData_admissao");
        LocalDate data_admissao = null;
        Pessoa instance = new Pessoa();
        instance.setDataAdmissao(data_admissao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Pessoa.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pessoa instance = new Pessoa();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Pessoa.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id=0 ;
        Pessoa instance = new Pessoa();
        instance.setId((long) id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Pessoa.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Pessoa instance = new Pessoa();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Pessoa.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Pessoa instance = new Pessoa();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pessoa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pessoa instance = new Pessoa();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
