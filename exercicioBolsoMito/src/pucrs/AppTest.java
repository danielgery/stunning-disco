package pucrs;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void soma() {
        //Test tamanho
        assertEquals("Cor não registrada", App.Soma(10));
        //Test <1 ou >4
        assertEquals("Cor não registrada", App.Soma(5));
        assertEquals("Cor não registrada", App.Soma(0));
        //1-Red 2-Yellow 3-Blue 4-Violet
        assertEquals("RED", App.Soma(1));
        assertEquals("YELLOW", App.Soma(2));
        assertEquals("BLUE", App.Soma(3));
        assertEquals("VIOLET", App.Soma(4));
    }

    @Test
    public void tvAssinatura() {
        //Regular, estudante, aposentado e  VIP valor entre 0.01 e 99999
        assertEquals(0, App.tvAssinatura(0.01, "Regular"));
        assertEquals(0, App.tvAssinatura(0.01, "Estudante"));
        assertEquals(0, App.tvAssinatura(0.01, "Aposentado"));
        assertEquals(0, App.tvAssinatura(0.01, "VIP"));
        assertEquals(0, App.tvAssinatura(99999.0, "Regular"));
        assertEquals(0, App.tvAssinatura(99999.0, "Estudante"));
        assertEquals(0, App.tvAssinatura(99999.0, "Aposentado"));
        assertEquals(0, App.tvAssinatura(99999.0, "VIP"));
        //Fora do intervalo <0.01 ou >99999
        assertEquals(1, App.tvAssinatura(0.0, "Regular"));
        assertEquals(1, App.tvAssinatura(0.0, "Estudante"));
        assertEquals(1, App.tvAssinatura(0.0, "Aposentado"));
        assertEquals(1, App.tvAssinatura(0.0, "VIP"));
        assertEquals(1, App.tvAssinatura(100000.0, "Regular"));
        assertEquals(1, App.tvAssinatura(100000.0, "Estudante"));
        assertEquals(1, App.tvAssinatura(100000.0, "Aposentado"));
        assertEquals(1, App.tvAssinatura(10000.0, "VIP"));
        //Status inválidos
        assertEquals(2, App.tvAssinatura(0.01, "aaaa"));
    }

    @Test
    public void situacao() {
        //Classes válidas
        assertEquals("Aprovado", App.situacao(7, true));
        assertEquals("Aprovado", App.situacao(7, false));
        assertEquals("Reprovado", App.situacao(3, true));
        assertEquals("Reprovado", App.situacao(3, false));
        assertEquals("G2", App.situacao(5, true));
        //Nota fora do intervalo
        assertEquals("Média inválida", App.situacao(11, true));
        assertEquals("Média inválida", App.situacao(-5, false));
        System.out.println(App.situacao(-55, false));
    }

    @Test
    public void arquivo() {

    }
}