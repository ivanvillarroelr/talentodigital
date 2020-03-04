public class Tablero{

    /*
    *  VARIABLES DE INSTANCIA 
    */

    private String[][] board = new String[15][15];

    private ArrayList<Carro> carros = new ArrayList<Carro>();

    private ArrayList<Huevo> huevos = new ArrayList<Huevo>();

    /*
    * CONSTRUCTORES 
    */
    public Tablero(){
        super();
    }

    public Tablero(String[][] board, ArrayList<Carro> carros, ArrayList<Huevo> huevos){
        super();
        this.board = board;
        this.carros = carros;
        this.huevos = huevos;
    }

    /*
    * METODOS ESPECIFICOS 
    */
    
    public void crearCarro(){

    }

    public void lanzarHuevo(){

    }

    public static void mostrarMatriz(){
        for(int ext = 0; ext < board.){
        }
    }

    public static void calcularPuntaje(){

    }


    /*
    * GETTERS Y SETTERS 
    */

    public String[][] getBoard(){
        return this.board;
    }

    public ArrayList getCarros(){
        return this.carros;
    }

    public ArrayList getHuevos(){
        return this.huevos;
    }

    public void setBoard(String [][] board){
        this.board = board;
    }

    public void setCarros(ArrayList<Carro> carros){
        this.carros = carros;
    }

    public void setHuevos(ArrayList<Huevo> huevos){
        this.huevos = huevos;
    }

    public String toString(){
        return string;
    }

}
