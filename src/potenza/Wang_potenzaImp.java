/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potenza;

// importazione della libreria per l'utilizzo dello scan 
import java.util.Scanner; 

public class Wang_potenzaImp {

    public static void main(String[] args) {
         /*
            28-10-2024 Wang_potenzaImp Wang Jimmy.
            Esercizio della potenza in modo sequenziale versione 1.
        */
        // inizio dichiarazione della variabile.
        int base;
        int esponente;
        int potenza = 1;
        // Fine dichiarazione della variabile.
        
        // Inzio Creazione dell'oggetto per richiamare la funzione dello scan poi inserimento dell'input dell'utente.
        Scanner myScan = new Scanner(System.in);
        System.out.println("inserisci la base");

        base = myScan.nextInt();
                
        System.out.println("inserisci l'esponente");
        
        esponente = myScan.nextInt();
        
        // Fine Creazione dell'oggetto per richiamare la funzione dello scan poi inserimento dell'input dell'utente.
        
        // Ciclo for per la potenza 
        
        for(int i = 0 ; i < esponente; i++){
            potenza = potenza * base;
        }
        // Inizio stampa della base , esponente e la potenza data dall'esponente e la base.
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
        
    }
        // Fine stampa della base , esponente e la potenza data dall'esponente e la base.
    
    }    
  
