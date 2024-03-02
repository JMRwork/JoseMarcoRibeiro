package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Usuario;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UsuarioService {
    private static Map<Integer, Usuario> usuarios = new HashMap<Integer, Usuario>();

    public void incluir(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }
    public void excluir(Integer id) {
        usuarios.remove(id);
    }
    public Collection<Usuario> obterLista(){
        return usuarios.values();
    }
    public Usuario obter(Integer id){
        return usuarios.get(id);
    }
}
