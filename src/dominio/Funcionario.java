/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Metodologia
 */
public class Funcionario {

    private Integer matricula_func;
    private String nome_func;
    private String email_func;
    private String telefone_func;

    public Funcionario(Integer matricula_func, String nome_func, String email_func, String telefone_func) {
        this.matricula_func = matricula_func;
        this.nome_func = nome_func;
        this.email_func = email_func;
        this.telefone_func = telefone_func;
    }

    public Funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getMatricula_func() {
        return matricula_func;
    }

    public void setMatricula_func(Integer matricula_func) {
        this.matricula_func = matricula_func;
    }

    public String getNome_func() {
        return nome_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public String getEmail_func() {
        return email_func;
    }

    public void setEmail_func(String email_func) {
        this.email_func = email_func;
    }

    public String getTelefone_func() {
        return telefone_func;
    }

    public void setTelefone_func(String telefone_func) {
        this.telefone_func = telefone_func;
    }

}
