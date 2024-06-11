package Dependencias;

import java.util.Scanner;

public class Main {

    public static int indiceAtletaGanador(Atleta atletas[]) {

        float tiempoCarrera;
        int indice = 0;

        tiempoCarrera = atletas[indice].getTiempoCarrera();
        for (int i = 0; i < atletas.length; i++) {

            if (atletas[i].getTiempoCarrera() < tiempoCarrera) {
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }

        }

        return indice;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroAtleta, nAtletas, indiceGanador;
        String nombre;
        float tiempoCarrera;

        System.out.println("Digite cantidad de atetlas compitiendo: ");
        nAtletas = entrada.nextInt();

        Atleta atletas[] = new Atleta[nAtletas];

        for (int i = 0; i < nAtletas; i++) {

            entrada.nextLine();
            System.out.println("Digite los datos para el atleta" + (i + 1) + ": ");
            System.out.println("Digite el numero del atleta: ");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Digite el nombre: ");
            nombre = entrada.nextLine();
            System.out.println("tiempo de carrera del atleta: ");
            tiempoCarrera = entrada.nextFloat();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);

        }

        indiceGanador = indiceAtletaGanador(atletas);
        System.out.println("EL ATLETA GANADOR DE LA CARRERA ES: ");
        System.out.println(atletas[indiceGanador].mostrarDatos());
        
    }
}
