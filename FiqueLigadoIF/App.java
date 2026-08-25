package AnaliseSistemas2026.FiqueLigadoIF;

import AnaliseSistemas2026.FiqueLigadoIF.domain.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        Area area = new Area(1, "Computaçao");
        Local local = new Local(
            1,
            "Auditorio IFTM Udi Centro",
            "Rua Blanche Galassi",
            1150,
            "Morada da Colina",
            "Uberlândia",
            "38400000",
            120,
            "Dentro do campus"
        );
        Pessoa pessoa = new Pessoa(
            1,
            "Carlos Eduardo",
            "/home/cadu.jpg",
            "Professor",
            "carloseduardodantas@iftm.edu.br"
        );

        System.out.println(area);
        System.out.println(local);
        System.out.println(pessoa);

        Usuario usuario = new Usuario(
            1,
            "senha",
            TipoUsuarioEnum.SERVIDOR,
            pessoa
        );
        Evento evento = new Evento(
            1,
            "Palestra de IA",
            LocalDate.parse("2026-07-28"),
            LocalDate.parse("2026-07-28"),
            "/home/banner.jpg",
            StatusEnum.PENDENTE,
            0.0d,
            usuario,
            usuario
        );
        Atividade atividade = new Atividade(
            1,
            "Engenharia de Prompt",
            LocalDateTime.of(2026, 7, 28, 19, 0),
            LocalDateTime.of(2026, 7, 28, 22, 0),
            3.0d,
            120,
            evento,
            local
        );

        System.out.println(usuario);
        System.out.println(evento);
        System.out.println(atividade);

        AreaDaAtividade areaDaAtividade = new AreaDaAtividade(1, area, atividade);
        AtividadeMinistrante ministrante = new AtividadeMinistrante(1, atividade, pessoa);
        Inscricao inscricao = new Inscricao(
            1,
            LocalDateTime.of(2026, 7, 24, 11, 25, 22),
            atividade,
            usuario
        );

        System.out.println(areaDaAtividade);
        System.out.println(ministrante);
        System.out.println(inscricao);
    }
}