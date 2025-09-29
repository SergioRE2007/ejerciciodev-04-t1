public class App {

    public static final String Blanco = "\u001B[37m";
    public static final String Rojo = "\u001B[31m";
    public static final String Verde = "\u001B[32m";
    public static final String Amarillo = "\u001B[33m";
    public static final String Azul = "\u001B[34m";
    public static final String Magenta = "\u001B[35m";

    public static void main(String[] args) throws Exception {
       
        System.out.printf(Blanco+"%-10s%-10s%-14s%-10s%-10s%n","Lunes","Martes","Miercoles","Jueves","Viernes");
        System.out.printf("%-10s%-10s%-14s%-10s%-10s%n","======","======","========","======","=======");
        System.out.printf(Verde+"%-10s"+Rojo+"%-10s"+Verde+"%-14s"+Blanco+"%-10s"+Azul+"%-10s%n","SIINF","PROGR","SIINF","IPE I","BADAT");
        System.out.printf(Verde+"%-10s"+Rojo+"%-10s"+Verde+"%-14s"+Blanco+"%-10s"+Azul+"%-10s%n","SIINF","PROGR","SIINF","IPE I","BADAT");
        System.out.printf(Magenta+"%-10s"+Rojo+"%-10s"+Blanco+"%-14s"+Rojo+"%-10s"+Verde+"%-10s%n","LMSGI","PROGR","IPE I","PROGR","SIINF");
        System.out.printf(Blanco+"%-10s%-10s%-14s%-10s%-10s%n","Recreo","Recreo","Recreo","Recreo","Recreo");
        System.out.printf(Magenta+"%-10s"+Azul+"%-10s"+Blanco+"%-14s"+Rojo+"%-10s"+Amarillo+"%-10s%n","LMSGI","BADAT","DASPGS","PROGR","ENDES");
        System.out.printf(Azul+"%-10s"+Azul+"%-10s"+Rojo+"%-14s"+Rojo+"%-10s"+Amarillo+"%-10s%n","BADAT","BADAT","PROGR","PROGR","ENDES");
        System.out.printf(Azul+"%-10s"+Blanco+"%-10s"+Rojo+"%-14s"+Magenta+"%-10s"+Amarillo+"%-10s%n"+Blanco,"BADAT","SASP","PROGR","LMSGI","ENDES");
    }
}
