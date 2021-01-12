/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.filosofos;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//Solucion del problema
//Nos dicen que cinco filosofos se pasan pensando y comiendo
//estos comen solo si los dos palillos estan desocupados 
//por lo cual le vamos a asignar un par de palillos a cada uno
//Por ejemplo para el filosofo numero 1 podra ocupar el palillo numero 1
//y el palillo numero 5
/**
 *
 * @author santi
 */
//Se ha implementado el Runnable el cual nos va a ayudar a hacer uso del Thread 
//con el cual vamos a poder iniciar el hilo realizar la sincronizacion de los hilos.

public class Filosofos implements Runnable {

    //variables
    int id;
    int ress;
    Thread tread;
    JButton derecho;
    JButton izquiuerdo;
    JTextField resultado;
    String proceso;
    JTextArea txtArea;
    JButton filosofo;
    public static boolean pausar;
    public static boolean iterar;
    

    public Filosofos() {
    }

    //constructor 
    //Aqui tambien tenemos Thread y le decimos que 
    public Filosofos(int id, JButton izquiuerdo, JButton derecho, JButton filosofo, JTextField resultado, JTextArea txtArea) {

        this.id = id;
        this.filosofo = filosofo;
        this.derecho = derecho;
        this.izquiuerdo = izquiuerdo;
        this.resultado = resultado;
        this.txtArea = txtArea;
        this.pausar = false;
        this.iterar = true;
        
        
        //Aqui instanciamos al tread
        tread = new Thread(this);
        //El metodo star se va a ejecutar siempre y cuando exista el metodo run que ya 
        //sabemos que es obligatorio crear ese metodo cuando trabajamos con hilos
        //debido a que es donde se van a ejecutar los procesos.

        tread.start();

    }

    @Override
    public void run() {
        while (iterar) {
            //podria ser un ciclo infinito pero lo que es darle un limite de 2 para que 
            //tenga una mejor presetnacion.
            for (int i = 0; i < 10000; i++) {
                //Si no utilizamos el synchronized no se tendriamos un control
                //cada uno se ejecutaria en diferentes momentos.
                //Compiten todos los procesos, viene cualquiera de los metodos, y si el tenedor izquierdo esta 
                //ocupado no participaria, pero si no esta ocupado este entraria al proceso y ejecutaria el metodo comer.
                synchronized (this.izquiuerdo) {
                    synchronized (this.derecho) {
                        comer();
                    }
                }
                pensar();
            }
            if (pausar) {
                break;
            }
        }
    }
    
   

    public void comer() {

        //Cambiamos los estados de los tenedores de libre a ocupado tanto del tenedor derecho como del izquierdo.    
        //y le asignamos un color rojo cuando este este Ocupado.
        derecho.setText("Ocupado");
        derecho.setForeground(Color.red);

        izquiuerdo.setText("Ocupado");
        izquiuerdo.setForeground(Color.red);

        //Cambiamos los estados de los filofos caundo este comiendo.
        //Y le damos un color amarillo cuando este este comiendo
        filosofo.setText("Comiendo");
        filosofo.setBackground(Color.YELLOW);

        //Contador
        //Capturamos la etiqueta resultado y le guardamos en la variable ress
        //y este ress va a ir aumentado 1 a 1 cada vez que el filofo coma
        ress = Integer.parseInt(resultado.getText());
        ress++;

        //Y se le dice que debe ser guardada en la eqiqueta de resultado que en este caso es nuestro 
        //txtField.
        resultado.setText(String.valueOf(ress));

        //Proceso
        //Vamos a determinar si el filosofo esta comiendo esto para posteriormente mostrarlo
        //en el txtArea.
        proceso = "El filosofo " + (id + 1) + " esta comiendo\n";
        txtArea.append(proceso);

        //Lo que hacemos aqui es interrumpir el proceso por una cantidad de segundos
        //que le asignemos //para posteriormente liberar los palillos
        try {

            //duerme por 4 segundos
            Thread.sleep(1000);

        } catch (InterruptedException e) {

        }

        //Una vez que el filosofo ya a comido este soltara los palillos y se podra de color verde
        derecho.setText("Libre");
        derecho.setForeground(Color.green);

        izquiuerdo.setText("Libre");
        izquiuerdo.setForeground(Color.green);

        //Al igual cuando el filosofo deje de comer este pasara a un estado de pensamiento
        //el cual se pondra de un color celeste
        //Y mostraremos un mensaje en txtArea que el filosofo con el id tal libero el tenedor
        //y con el metodo append mostramos en el txtArea.
        filosofo.setText("Pensando");
        filosofo.setBackground(Color.CYAN);
        proceso = "El filosofo " + (id + 1) + " libero sus tenedores\n";
        txtArea.append(proceso);

    }

    public void pensar() {

        //Para el metodo pensar lo que hemos hecho es que si el palillo derecho esta libre y el derecho estan libres
        //este pasara a pensar
        derecho.setText("Libre");
        derecho.setForeground(Color.GREEN);

        izquiuerdo.setText("Libre");
        izquiuerdo.setForeground(Color.GREEN);

        filosofo.setText("Pensando");
        filosofo.setBackground(Color.CYAN);

        //Y le mandaremos un mensaje de que el filosofo esta pensando
        proceso = "El filosofo " + (id + 1) + " esta pensando\n";
        txtArea.append(proceso);

        //Y interrumpiremos el proceso por el tiempo que deseemos poner.
        //le estamos diciendo que se quede por un tiempo en el estado de pensar.
        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {
        }
    }



}
