package AnaliseSistemas2026.FiqueLigadoIF.domain;

import java.util.List;

public class Usuario {
    private Integer id;
    private String senha;
    private TipoUsuarioEnum tipoUsuario;
    private Pessoa pessoa;
    private List<Inscricao> atividadesInscritas;

    public Usuario(Integer id, String senha, TipoUsuarioEnum tipoUsuario, Pessoa pessoa) {
        this.id = id;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.pessoa = pessoa;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public TipoUsuarioEnum getTipoUsuario() { return tipoUsuario; }
    public void setTipoUsuario(TipoUsuarioEnum tipoUsuario) { this.tipoUsuario = tipoUsuario; }

    public Pessoa getPessoa() { return pessoa; }
    public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }

    public List<Inscricao> getAtividadesInscritas() { return atividadesInscritas; }
    public void setAtividadesInscritas(List<Inscricao> atividadesInscritas) { this.atividadesInscritas = atividadesInscritas; }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", senha=" + senha + ", tipoUsuario=" + tipoUsuario + ", pessoa=" + pessoa + "]";
    }
}