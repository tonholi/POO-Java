import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Curso java POO");
        cursoJava.setCargaHoraria(8);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Curso JS");
        cursoJs.setDescricao("Curso Javascript");
        cursoJs.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("mentoria java descricao");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("JAVA");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1  = new Dev();
        dev1.setNome("Luis");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("-");
        dev1.progredir();
        dev1.progredir();
        System.out.println("conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("conteudos concluidos: " + dev1.getConteudosConluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-----------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev2.getConteudosConluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
    }
}