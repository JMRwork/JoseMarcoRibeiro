package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Item;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ItemService {
    private Map<Integer, Item> items = new HashMap<Integer, Item>();

    public void incluir(Item item) {
        items.put(item.getItemId(), item);
    }
    public void excluir(Integer itemId) {
        items.remove(itemId);
    }
    public Collection<Item> obterLista(){
        return items.values();
    }
    public Item obter(Integer itemId){
        return items.get(itemId);
    }
}

