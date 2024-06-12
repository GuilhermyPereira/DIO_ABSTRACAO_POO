import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev guilhermy = new Dev();
        guilhermy.setNome("Guilhermy");
        guilhermy.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Guilhermy:" + guilhermy.getConteudosInscritos());
        guilhermy.progredir();
        guilhermy.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Guilhermy:" + guilhermy.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Guilhermy:" + guilhermy.getConteudosConcluidos());
        System.out.println("XP:" + guilhermy.calcularTotalXp());

        System.out.println("-------");


    }

}
