package br.edu.infnet.model;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private boolean admin;
    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if(id > 0) {
            this.id = id;
        } else {
            throw new Exception("O id deve ser único e maior que zero.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.matches("^[A-Za-z]\\w{2,27}$")) {
            this.nome = nome;
        } else {
            throw new Exception("Nome do usuário deve possuir uma letra inicialmente e entre 3 a 28 caracteres alfanuméricos.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9.]+$")) {
            this.email = email;
        } else {
            throw new Exception("Email inválido.");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if(senha.matches("^.{8,20}$")) {
            this.senha = senha;
        } else {
            throw new Exception("A senha deve possuir entre 8 e 20 caracteres");
        }
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String tipoAcesso () {
        if(this.isAdmin()) {
           return "Esse usuário possui acesso total";
        } else {
            return "Esse usuário possui acesso restrito";
        }
    }
}
