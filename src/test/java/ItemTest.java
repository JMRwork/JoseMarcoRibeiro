import br.edu.infnet.model.domain.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTest {
    private Item item;

    @BeforeEach
    void setItem(){
        item = new Item(1, "biscoito", "sabor chocolate",10,7.99);
    }
    @Test
    void itemGetters() {
        Assertions.assertEquals(1, item.getItemId());
        Assertions.assertEquals("biscoito", item.getNome());
        Assertions.assertEquals("sabor chocolate", item.getDescricao());
        Assertions.assertEquals(10, item.getQuantidade());
        Assertions.assertEquals(7.99, item.getPreco());
    }
    @Test
    void itemSetters() throws Exception {
        item.setItemId(2);
        item.setNome("bolacha");
        item.setDescricao("sabor morango");
        item.setQuantidade(12);
        item.setPreco(10.99);
        Assertions.assertEquals(2, item.getItemId());
        Assertions.assertEquals("bolacha", item.getNome());
        Assertions.assertEquals("sabor morango", item.getDescricao());
        Assertions.assertEquals(12, item.getQuantidade());
        Assertions.assertEquals(10.99, item.getPreco());
    }
    @Test
    void itemIdexceptions(){
        Assertions.assertThrows(Exception.class,() -> item.setItemId(0));
        Assertions.assertThrows(Exception.class,() -> item.setItemId(-10));
    }
}
