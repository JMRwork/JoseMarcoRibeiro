import br.edu.infnet.model.domain.Item;
import br.edu.infnet.model.service.ItemService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemServiceTest {
    private ItemService itemService;
    private Item item;
    @BeforeEach
    void setUp() {
        itemService = new ItemService();
        item = new Item(1, "biscoito", "sabor chocolate",10,7.99);
    }

    @Test
    void inclusao() {
        itemService.incluir(item);
        Assertions.assertEquals(item, itemService.obter(item.getItemId()));
    }

    @Test
    void exclusao() {
        inclusao();
        itemService.excluir(item.getItemId());
        Assertions.assertEquals(null, itemService.obter(item.getItemId()));
    }

    @Test
    void recuperarTodos() {
        inclusao();
        Assertions.assertTrue(itemService.obterLista().contains(item));
    }
}
