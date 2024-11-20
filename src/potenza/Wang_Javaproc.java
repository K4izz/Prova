/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potenza;

// importazione della libreria per l'utilizzo dello scan 
import java.util.Scanner; 

/*
    28-10-2024 Wang_potenzaproc Wang Jimmy.
    Esercizio della potenza nello stesso file richiamando i metodi  versione 2.
*/

public class Wang_Javaproc {
    // inizio dichiarazione della variabile nella classe.
    public int base;
    public int esponente;
    public int potenza = 1;
    // Fine dichiarazione della variabile nella classe.
    
    // Creazione della classe
    public void Scan (){
        // Inzio Creazione dell'oggetto per richiamare la funzione dello scan poi inserimento dell'input dell'utente.
        Scanner myScan = new Scanner(System.in);
        System.out.println("inserisci la base");

        base = myScan.nextInt();
        
        System.out.println("inserisci l'esponente");

        esponente = myScan.nextInt();
        // Fine Creazione dell'oggetto per richiamare la funzione dello scan poi inserimento dell'input dell'utente.
}

    
    public void FunctionFor(){
        //Ciclo for per il calcolo della potenza
        for(int i = 0 ; i < esponente; i++){
            potenza = potenza * base;
        }
        
        }
        // Inizio stampa della base , esponente e la potenza data dall'esponente e la base.
        public void Stampa(){
        if (esponente==0){
            System.out.println("La base equivale a : " + base);
            System.out.println("L'esponente equivale a : " + esponente);
            System.out.println("Dato che qualsiasi numero elevato alla 0 la potenza equivale a : " + potenza);
        }
        else{
        System.out.println("La base equivale a : " + base);
        System.out.println("L'esponente equivale a : " + esponente);
        System.out.println("La potenza e' : " + potenza);
        }
        // Fine stampa della base , esponente e la potenza data dall'esponente e la base.
        }
        
    public static void main(String[] args) {
        
        Wang_Javaproc myWang_Javaproc = new Wang_Javaproc();
        
        myWang_Javaproc.Scan();
        myWang_Javaproc.FunctionFor();
        myWang_Javaproc.Stampa();
        
        
    }
   
}