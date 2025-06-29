import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(0);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(0);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlex = new Dev();
        devAlex.setNome("Alex");
        devAlex.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos Alex" + devAlex.getConteudoInscritos());

        devAlex.progredir();
        System.out.println("-");
        System.out.println("Conteúdo inscritos Alex " + devAlex.getConteudoInscritos());
        System.out.println("Conteúdo concluídos Alex " + devAlex.getConteudoConcluidos());
        System.out.println("XP: " + devAlex.calcularTotalXp());

        System.out.println("===================================================");

        Dev devMila = new Dev();
        devMila.setNome("Mila");
        devMila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos Mila" + devMila.getConteudoInscritos());

        devMila.progredir();

        System.out.println("Conteúdo inscritos Mila" + devMila.getConteudoInscritos());
        System.out.println("Conteúdo concluídos Mila" + devMila.getConteudoConcluidos());
        System.out.println("XP: " + devMila.calcularTotalXp());
    }
}
