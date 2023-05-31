public class Programa {
    public static void main(String[] args) {

        Pessoa pessoas[] = new Pessoa[6];

        Miseravel miseravel = new Miseravel();
        miseravel.setNome("Fernanda");
        miseravel.setIdade(32);

        Pobre pobre = new Pobre();
        pobre.setNome("Ricardo");
        pobre.setIdade(35);

        Rica rica = new Rica();
        rica.setNome("Rafaela");
        rica.setIdade(35);

        pessoas[0] = rica;
        pessoas[1] = pobre;
        pessoas[2] = miseravel;

        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] != null) {
                System.out.println(pessoas[i].nome);
                System.out.println(pessoas[i].idade);
                System.out.println();
            }
        }

    }
}