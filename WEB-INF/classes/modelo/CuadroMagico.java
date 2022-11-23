package modelo;
public class CuadroMagico {
    private int tamano;
    private int numIni;
    private int matriz_magica[][];

    public CuadroMagico(){

    }

    public CuadroMagico(int tamano, int numIni) {
        this.tamano = tamano;
        this.numIni = numIni;
        matriz_magica = new int [tamano][tamano];
    }

    public void generar() {
        int mitad = tamano/2;
        int ubicacionC =  mitad;
        int ubicacionF = 0;

        matriz_magica[ubicacionF][ubicacionC] = numIni;

        //ubicación actual cursor
        int ubicacionFActual = ubicacionF;
        int ubicacionCActual = ubicacionC;

        for (int i = 2; i <= (Math.pow(matriz_magica.length,2)); i++ ) {
            ubicacionF--;
            ubicacionC--;
            numIni++;
            //validar si nos salimos del cuadro
            if(ubicacionF < 0) {
                ubicacionF = matriz_magica.length-1;
            }
            if(ubicacionC < 0) {
                ubicacionC = matriz_magica.length-1;
            }
            //validar si la columna esta ocupada
            if(matriz_magica[ubicacionF][ubicacionC] == 0) {
                matriz_magica[ubicacionF][ubicacionC] = numIni;
            } else {
                ubicacionF = ubicacionFActual +1 ;
                ubicacionC = ubicacionCActual;
                matriz_magica[ubicacionF][ubicacionC] = numIni;
            }
            ubicacionFActual = ubicacionF;
            ubicacionCActual = ubicacionC;
        }
    }
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void setNumIni(int numIni) {
        this.numIni = numIni;
    }

    public void setMatriz_magica(int[][] matriz_magica) {
        this.matriz_magica = matriz_magica;
    }

    public int getTamano() {
        return tamano;
    }

    public int getNumIni() {
        return numIni;
    }

    public int[][] getMatriz_magica() {
        return matriz_magica;
    }
    public void mostrarMatriz_magica(){
		for(int i=0; i<matriz_magica.length; i++){
			for(int j=0; j<matriz_magica.length; j++){
				System.out.println(matriz_magica[i][j]+"\t");
			}
			System.out.println();
		}
	}
}