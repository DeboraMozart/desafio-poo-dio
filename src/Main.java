import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setCargaHoraria(3);
        curso1.setDescricao("Nenhuma");

        System.out.println(curso1);
    }
}
