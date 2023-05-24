public class MediaTurma {
    double media=0;
    double[] nota = new double[3];

    public void notaFinal(){
        int i;
        for (i=0 ; i < nota.length ; i++){
            media = media + nota[i];
        }
        media = media / nota.length;
    }
}