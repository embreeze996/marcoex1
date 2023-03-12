package testes;

import org.example.SingletonAutoEscola;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testeSingleton {
    @Test
    public void deveRetornarNomeEscola() {
        SingletonAutoEscola.getInstance().setNomeAluno("Douglas1");
        assertEquals("Douglas", SingletonAutoEscola.getInstance().getNomeAluno());
    }
    @Test
    public void deveRetornarNumCpf() {
        SingletonAutoEscola.getInstance().setNumCpf("1112223334");
        assertEquals("1112223334", SingletonAutoEscola.getInstance().getNumCpf());
    }
}
