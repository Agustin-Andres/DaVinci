Consigna:
----------------------------------------------------------------------------
Realizar un análisis del requerimiento detallado a continuación y determinar
los objetos y las clases del sistema con sus atributos, operaciones y sus
correspondientes vínculos.


Una aplicación necesita almacenar información básica sobre empresas, sus
empleados y sus clientes.
Ambos se caracterizan por su nombre, edad y datos personales.
Los empleados tienen un sueldo bruto y los empleados que son directivos
tienen una categoría.
De los clientes además se necesita conocer su teléfono de contacto.
La empresa tiene una dirección y un número de cuil.
La aplicación necesita mostrar los datos de empleados y clientes.
----------------------------------------------------------------------------

Estructura de directorios:
GestorEmpresas/
├── bin/
│   └── Main.class
├── lib/
├── src/
│   ├── interfaz/     ---------------------- Aca esta toda la manipulacion de los objetos correspondientes al modulo, a mano con el servicio
│   │   ├── InterfazCliente.java
│   │   ├── InterfazDirectivos.java
│   │   ├── InterfazEmpleado.java
│   │   ├── InterfazEmpresa.java
│   │   ├── InterfazPrincipal.java
│   │   └── PopularDatos.java----------- popular datos para llenar objetos hijos de Persona y empresa de forma masiva [gracias excel]
│   ├── models/ -------------------- Los modelos, clases padres [abstract] e hijos
│   │   ├── Cliente.java
│   │   ├── Directivo.java
│   │   ├── Empleado.java
│   │   ├── Empresa.java
│   │   └── Persona.java
│   ├── service/
│   │   └── GestionPersona.java ------- Una idea que se me ocurrio para agrupar el listado de cada objeto persona, re util para la refactorizacion.
│   ├── utilities/
│   │   └── ValidadorNumeros.java -- validaciones de doubles y enteros
│   └── Main.java
└── README.md ----- You're here

Observaciones:

-Decidi utilizar el servicio de GestionPersona como nucleo, la logica 'fuerte' esta ahi, el resto es codigo replicado
por clase, lo que mas costo es el Update de cada objeto hijo de Persona

-Update y Delete son parecidos en el flujo de busqueda de objeto, se debia buscar una persona, seleccionarla y ahi manipularla
evaluando si era Update o Delete.

- Aunque seguramente vaya a recuperatorio por tardanza en entrega, este parcial fue muy divertido, me re disfrute.

Parcial II [ACN2BV]
Profe: Lautaro Chiappero
Agustin Andres Avellaneda
