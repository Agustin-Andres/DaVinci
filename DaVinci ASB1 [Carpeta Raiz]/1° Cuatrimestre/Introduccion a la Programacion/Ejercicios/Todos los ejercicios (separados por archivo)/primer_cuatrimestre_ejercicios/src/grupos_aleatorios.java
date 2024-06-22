
/**
 * grupos_org
 */
public class grupos_aleatorios {

    public static void main(String[] args) {

        // declaracion de alumnos
        String alumnos[] = { "agustin avellaneda", "agustin tejero", "alejandro herms", "alejandro lopez",
                "anthony salazar", "ariel montes", "carelis fagundez", "cristhian bielaszczu", "diego ruiz",
                "eudes desouza", "facundo marconi", "facundo mvillar", "gonzalo casado", "guilermo ajalla",
                "javier latorre", "jonathan waziuta", "lautaro caballero", "lucas magarcia", "lucas otero",
                "luciano dileo", "lukas galarza", "marcelof juarez", "mariano williams", "martina trebino",
                "matias lema", "matias saavedra", "mauro fidoni", "melina crespo", "nazareno napoli", "nicolas auger",
                "pablo gimenez", "santiago aquin", "santiago cabrera", "santiago iriarte", "tomas hidalgo",
                "victor barreto", "zoraini arcilatenias" };

        String correos[] = { "agustin.avellaneda@davinci.edu.ar", "agustin.tejero@davinci.edu.ar",
                "alejandro.herms@davinci.edu.ar", "alejandro.lopez@davinci.edu.ar", "anthony.salazar@davinci.edu.ar",
                "ariel.montes@davinci.edu.ar", "carelis.fagundez@davinci.edu.ar", "cristhian.bielaszczu@davinci.edu.ar",
                "diego.ruiz@davinci.edu.ar", "eudes.desouza@davinci.edu.ar", "facundo.marconi@davinci.edu.ar",
                "facundo.mvillar@davinci.edu.ar", "gonzalo.casado@davinci.edu.ar", "guilermo.ajalla@davinci.edu.ar",
                "javier.latorre@davinci.edu.ar", "jonathan.waziuta@davinci.edu.ar", "lautaro.caballero@davinci.edu.ar",
                "lucas.magarcia@davinci.edu.ar", "lucas.otero@davinci.edu.ar", "luciano.dileo@davinci.edu.ar",
                "lukas.galarza@davinci.edu.ar", "marcelof.juarez@davinci.edu.ar", "mariano.williams@davinci.edu.ar",
                "martina.trebino@davinci.edu.ar", "matias.lema@davinci.edu.ar", "matias.saavedra@davinci.edu.ar",
                "mauro.fidoni@davinci.edu.ar", "melina.crespo@davinci.edu.ar", "nazareno.napoli@davinci.edu.ar",
                "nicolas.auger@davinci.edu.ar", "pablo.gimenez@davinci.edu.ar", "santiago.aquin@davinci.edu.ar",
                "santiago.cabrera@davinci.edu.ar", "santiago.iriarte@davinci.edu.ar", "tomas.hidalgo@davinci.edu.ar",
                "victor.barreto@davinci.edu.ar", "zoraini.arcilatenias@davinci.edu.ar" };

        // array para el numero de grupo
        int gruposAleatorios[] = new int[alumnos.length];
        int cantGrupos = gruposAleatorios.length / 4; // aca retorna el int para abajo, pueden sobrar hasta 3
        System.out.println(" CANTIDAD  GRUPOS " + cantGrupos);

        int temp = 1; // temp para almacenar temporalmente el #grupo

        // asignamos el grupo dependiendo de la cantidad de grupos
        for (int i = 0; i < gruposAleatorios.length; i++) {
            gruposAleatorios[i] = temp;
            temp = (temp < cantGrupos) ? temp + 1 : 1; // primero agarramos el valor de temp y luego lo incrementamos si
                                                       // es 9
        }

        // Shuffle the array
        for (int i = 0; i < gruposAleatorios.length; i++) {

            int randomNumber = (int) (Math.random() * gruposAleatorios.length);
            temp = gruposAleatorios[randomNumber];
            gruposAleatorios[randomNumber] = gruposAleatorios[i];
            gruposAleatorios[i] = temp;
        }


        // mostramos cantidad de alumnos que hay, luego la cantidad de grupos
        System.out.println("## Hay " + alumnos.length + " alumnos.");

        // indicamos al usuario la cantidad de grupos y cuantos no tienen grupos parejos de 4
        if (alumnos.length % 4 == 0) {
            System.out.println("##### La cantidad de alumnos son suficiente para armar grupos de 4 parejos");

        } else if (alumnos.length % 4 == 1) {
            System.out.println("### La cantidad de alumnos causan que 1 equipo tenga 1 alumno mas");
            System.out.println("### son " + cantGrupos +
                    " grupos y el ultimo equipo tendra 5 alumnos ");

        } else if (alumnos.length % 4 == 2) {
            System.out.println("### La cantidad de alumnos causan que 2 equipos tenga 1 alumno mas");
            System.out
                    .println("### son " + cantGrupos +
                            " grupos y los ultimos 2 equipos tendran 5 alumnos ");
        } else if (alumnos.length % 4 == 3) {
            System.out.println("## La cantidad de alumnos causan que 3 equipo tenga 1 alumno mas");
            System.out
                    .println("### son " + cantGrupos +
                            " grupos y los ultimos 3 equipos tendran 5 alumnos ");

        }

        // mostramos los grupos aleatorios
        for (int j = 1; j < cantGrupos + 1; j++) {

            for (int i = 0; i < alumnos.length; i++) {
                if (gruposAleatorios[i] == j) {
                    System.out.println(
                            alumnos[i] + " esta en el grupo #" + gruposAleatorios[i] + " [" + correos[i] + "]");
                }
            }

        }

    }
}
