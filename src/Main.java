import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHorária(0);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHorária(0);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);
    }
}
