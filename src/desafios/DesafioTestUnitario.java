package desafios;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class DesafioTestUnitario {

	DesafioUm desafio1 = new DesafioUm();
    DesafioDois desafio2 = new DesafioDois();
    DesafioTres desafio3 = new DesafioTres();

    String string = "ifailuhkqq";
    String password = "Dark.das@23";



    @Test
    public void testSuccessCreateLadder() {
        String resultExpected = DesafioUm.createTestUnitario(6);
        String result = DesafioUm.createLadder(6);
        assertEquals(resultExpected, result);
    }

    @Test
    public void testSuccessGetAnagram() {
        Integer resultExpected = 3;
        Integer result = DesafioTres.anagrams(string);
        assertEquals(resultExpected, result);
    }

    @Test
    public void testSuccessPassword() {
        String resultExpected = "successfully registered";
        DesafioDois.ValidatePassword(password);
        assertEquals(resultExpected, DesafioDois.msgSucess);
    }


}
