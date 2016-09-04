public class Matriz{

    private int[][] dosDimensiones;

    public Matriz(){
        dosDimensiones = new int[4][4];
    }

    public void llenar(){
        int k = 0;

        for(int i=0; i<4; i++)
            for(int j=0; j<i+1; j++) 
                dosDimensiones[i][j] = k++;
    }

    public void imprimir(){

        for(int i=0; i<4; i++) {
            for(int j=0; j<i+1; j++)
                System.out.print(dosDimensiones[i][j] + " ");
            System.out.println();
        }
    }

}