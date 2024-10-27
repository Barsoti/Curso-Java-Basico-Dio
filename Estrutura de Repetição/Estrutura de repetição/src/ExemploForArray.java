public class ExemploForArray {

    public static void main(String[] args) {
        String alunos[] = { "Iris", "Felipe", "Thiago", "Jonas", "Julia", "Lucas"};

        for (int x=0; x < alunos.length; x++){ //Indices no array sempre começa em zero
            System.out.println("O aluno no indice x= "+ x + " é " + alunos[x]);
        }

        //for each (para cada), usado quando temos arryas
        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }


    }
    
}
