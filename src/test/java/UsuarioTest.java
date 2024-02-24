import br.edu.infnet.model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    private Usuario usuario;
    @BeforeEach
    void setUser() throws Exception {
        usuario = new Usuario();
        usuario.setId(1);
        usuario.setNome("Abc");
        usuario.setEmail("Abc@email.com");
        usuario.setSenha("12345678");
        usuario.setAdmin(true);
    }
    @Test
    void idDefault() {
        Assertions.assertEquals(1, usuario.getId());
    }
    @Test
    void nomeDefault() {
        Assertions.assertEquals("Abc",usuario.getNome());
    }
    @Test
    void emailDefault() {
        Assertions.assertEquals("Abc@email.com", usuario.getEmail());
    }
    @Test
    void senhaDefault() {
        Assertions.assertEquals("12345678", usuario.getSenha());
    }
    @Test
    void adminDefault() {
        Assertions.assertTrue(usuario.isAdmin());
    }
    @Test
    void idIgualAZero() {
        Assertions.assertThrows(Exception.class,() -> usuario.setId(0));
    }
    @Test
    void idMenorQueZero() {
        Assertions.assertThrows(Exception.class,() -> usuario.setId(-10));
    }
    @Test
    void nomeMenorQueTres() {
        Assertions.assertThrows(Exception.class,() -> usuario.setNome("AB"));
    }
    @Test
    void nomeMaiorQueVinteOito() {
        Assertions.assertThrows(Exception.class,() -> usuario.setNome("Abcdefghijklmnopqrstuvxwyz123456789"));
    }
    @Test
    void emailSemArroba() {
        Assertions.assertThrows(Exception.class,() -> usuario.setEmail("Abcemail.com"));
    }
    @Test
    void emailSemPrefixo() {
        Assertions.assertThrows(Exception.class,() -> usuario.setEmail("@email.com"));
    }
    @Test
    void emailSemSufixo() {
        Assertions.assertThrows(Exception.class,() -> usuario.setEmail("Abc@"));
    }
    @Test
    void senhaMenorQueOito() {
        Assertions.assertThrows(Exception.class,() -> usuario.setSenha("12345"));
    }
    @Test
    void senhaMaiorQueVinte() {
        Assertions.assertThrows(Exception.class,() -> usuario.setSenha("abcd123456789dcba54321"));
    }
    @Test
    void tipoAcessoAdmin() {
        Assertions.assertEquals("Esse usuário possui acesso total", usuario.tipoAcesso());
    }
    @Test
    void tipoAcessoNaoAdmin() {
        usuario.setAdmin(false);
        Assertions.assertEquals("Esse usuário possui acesso restrito", usuario.tipoAcesso());
    }
}
