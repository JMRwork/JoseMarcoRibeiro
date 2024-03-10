package br.edu.infnet;

import br.edu.infnet.model.domain.Item;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.LocalService;
import br.edu.infnet.model.service.ItemService;
import br.edu.infnet.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Loader implements ApplicationRunner {
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    ItemService itemService;
    @Autowired
    LocalService localService;
    @Override
    public void run(ApplicationArguments args) {
        //instancia de serviços

        //Instancia de objeto
        Usuario u1 = new Usuario(1, "Admin", "admin@admin.com", "12345678",true);
        Usuario u2 = new Usuario(2, "User", "user@user.com", "12345678",false);

        Item i1 = new Item(1, "Relógio", "Modelo RKX",2,299.90);
        Item i2 = new Item(2, "Colar", "ouro 18 quilates",1,1200);
        Item i3 = new Item(3, "Sapatos", "Couro legítimo",4,175.50);

        //Usando os serviços
        itemService.incluir(i1);
        itemService.incluir(i2);
        itemService.incluir(i3);
        u1.setInventario(itemService.obterLista());
        usuarioService.incluir(u1);
        usuarioService.incluir(u2);
        System.out.println(usuarioService.obterLista());

        //Consumo de Api
        System.out.println(localService.obterEnderecoPorCep(77950970));
    }
}