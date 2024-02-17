package br.edu.infnet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        //Instancia de objeto
        try {
            u1.setId(1);
            u1.setNome("Admin");
            u1.setEmail("admin@admin.com");
            u1.setSenha("12345678");
            u1.setAdmin(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Imprimir Objeto
        System.out.println(u1.getNome());
        System.out.println(u1.isAdmin());
        System.out.println(u1.tipoAcesso());
        u1.setAdmin(false);
        System.out.println(u1.tipoAcesso());
    }
}