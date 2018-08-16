package douglas.matheus.exercicioaula10.model;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String login;
    private String password;

    public Pessoa() {
    }

    public Pessoa(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
