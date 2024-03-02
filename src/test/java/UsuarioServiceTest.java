import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.UsuarioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioServiceTest {
    private UsuarioService usuarioService;
    private Usuario usuario;
    @BeforeEach
    void setUp() {
        usuarioService = new UsuarioService();;
        usuario = new Usuario();
    }

    @Test
    void inclusao() {
        usuarioService.incluir(usuario);
        Assertions.assertEquals(usuario, usuarioService.obter(usuario.getId()));
    }

    @Test
    void exclusao() {
        inclusao();
        usuarioService.excluir(usuario.getId());
        Assertions.assertEquals(null, usuarioService.obter(usuario.getId()));
    }

    @Test
    void recuperarTodos() {
        inclusao();
        Assertions.assertTrue(usuarioService.obterLista().contains(usuario));
    }
}
