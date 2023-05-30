public class Main {
    public static void main(String[] args) {

        System.out.println("////\\\\" + "** TABELA DE NÚMEROS ****" + "///////\\\\\\");
        System.out.println();

        int valoresCartela = 1;
        int[][] cartela = new int[6][10];

        for (int linhas = 0; linhas < cartela.length; linhas++ ){
            for (int colunas = 0; colunas < cartela[linhas].length; colunas++){
                cartela[linhas][colunas] = valoresCartela++;
            }
        }

        for (int linhas = 0; linhas < cartela.length; linhas++ ){
            for (int colunas = 0; colunas < cartela[linhas].length; colunas++){
                System.out.printf("[%d]", cartela[linhas][colunas] );
                //System.out.print("[" + cartela[linhas][colunas] + "]");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("////\\\\" + "*** NÚMEROS SORTEADOS **" + "///////\\\\\\");
        System.out.println();

        int[] numsorteado = new int[6];
        int contador = 0;

        for(int i = 0; i < numsorteado.length; i++){
            numsorteado[i] = (int)(Math.random() * 60 + 1);
            //System.out.print("[" + numsorteado[i] + "]");
        }

        while (contador < numsorteado.length)

            for(int fixa = 0; fixa < numsorteado.length; fixa++){
                for(int i = 0; i < numsorteado.length; i++){

                    if(numsorteado[fixa] == numsorteado[i] && fixa != i){
                        numsorteado[i] = (int)(Math.random() * 60 + 1);
                        contador--;
                    }else{
                        contador++;
                    }
                }
            }
        //Imprime os valores sorteados e verificados
        for(int i = 0; i < numsorteado.length; i++) {
            System.out.print("[" + numsorteado[i] + "]");
        }


        System.out.println();
        System.out.println();
        System.out.println("////\\\\" + "** TESTE ****" + "///////\\\\\\");
        System.out.println();


        //Foi feito esse teste para comparar os resultados de um sorteio que não passa por conferecia para um que passa
        int[] teste = new int[6];

        for (int i = 0; i < teste.length ; i++) {
            numsorteado[i] = (int)(Math.random() * 60 + 1);
            System.out.print("[" + numsorteado[i] + "]");
        }


    }
}