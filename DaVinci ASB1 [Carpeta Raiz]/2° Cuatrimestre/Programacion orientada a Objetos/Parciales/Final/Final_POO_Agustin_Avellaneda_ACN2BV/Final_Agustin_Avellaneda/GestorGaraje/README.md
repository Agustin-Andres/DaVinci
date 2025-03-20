Consigna:
Desarrollar un sistema de gestión de un garaje siguiendo las siguientes
especificaciones.

En el garaje se cambian las ruedas tanto de coches como de motos. El precio del
cambio de una rueda se fija al abrir el garaje, al igual que la capacidad máxima de vehículos, ya
sean motos o coches. Si no hubiese lugar disponible para registrar un vehículo nuevo, habrá
que tener contemplado un sistema de aviso
para quien esté dejando su vehículo.

El sistema de gestión del garaje requiere un mecanismo para ingresar y retirar los
vehículos, conocer el número total de vehículos recibidos en ese momento, el precio que
supondría cambiar todas las ruedas de todos los vehículos, y el kilometraje medio de todos
ellos.

La información que manejaremos de los coches entre otras cosas es la marca y el
número de puertas. Mientras que de las motos será la marca y la cilindrada.

Las clases relacionadas con los vehículos se guardarán en el paquete vehículos
mientras que las clases Garaje y GarajeTest se guardarán en el paquete
sistemaGaraje.

La clase GarajeTest tiene un método main en el que se crea un Garaje, una serie de
vehículos que se irán recibiendo en el garaje y por último se imprimirá por pantalla
toda la información general del garaje así como la información de cada vehículo.
Subir el desarrollo del requerimiento a la sección Trabajo de Clase del Classroom

---

                                ESTRUCTURA DE PROYECTO

---

GestorGaraje/
├── .vscode/ # Configuración de Visual Studio Code
├── bin/ # Archivos compilados
├── src/ # Código fuente del proyecto
│ ├── Interfaz/ # Interfaz para interactuar con objetos y menús
│ │ ├── Concerns/ # Métodos específicos para objetos hijos de Vehiculo
│ │ │ ├── CocheConcerns.java # Métodos CREATE y UPDATE para Coche
│ │ │ ├── MotoConcerns.java # Métodos CREATE y UPDATE para Moto
│ │ │ ├── VehiculosConcerns.java # Métodos generales aplicables a todos los Vehiculos
│ │ ├── InterfazGaraje.java # Instanciación y manipulación del objeto Garaje
│ │ ├── InterfazVehiculo.java # Menú para manipular Vehiculos del Garaje (CRUD)
│ ├── sistemaGaraje/ # Lógica central del sistema
│ │ ├── Finanzas.java # Gestión de datos financieros del Garaje
│ │ ├── Garaje.java # Clase principal del Garaje
│ │ ├── GarajeTest.java # Pruebas y menú principal para Garaje
│ ├── utilities/ # Clases de utilidades para validación y datos
│ │ ├── popularVehiculos.java # Popular datos aleatorios para tests o inicialización
│ │ ├── ValidadorNumeros.java # Validación de números enteros y decimales
│ │ ├── ValidadorVehiculo.java # Validación general de datos de Vehiculo
│ ├── Vehiculos/ # Clases relacionadas con Vehiculos
│ │ ├── Coche.java # Clase específica para Coche
│ │ ├── Moto.java # Clase específica para Moto
│ │ ├── Vehiculo.java # Clase base abstracta para Vehiculos
│ ├── App.java # Punto de entrada principal de la aplicación
├── README.md # Información general del proyecto

---------------------------------------------------------------------------------------------------------------

Comentarios :
#1 - El proyecto consiste de 3 partes.

#1.1 - Inicio de sesion [InterfazGaraje] [3 opciones, sesion sin datos pre-cargados, parcialmente cargada, totalmente cargada] [esta opcion se selecciona 1 vez.]
#1.2 - Menu Garaje [GarajeTest] [El usuario elige opciones relacionadas a la gestion del Garaje]
#1.3 - Menu Vehiculos [InterfazVehiculo] [El usuario usa CRUD relacionado a la lista de los vehiculos dentro del garaje.]

#2 - Explicacion de distintas carpetas

#2.1 - [Interfaz] contiene la logica del menu de inicio de sesion | menu vehiculos
#2.1.1 - [Concerns] - para refactorizar los menus, dividi la logica entre distintos archivos.
[VehiculosConcerns] -> metodos utiles para la gestion general de vehiculos (usando atributos compartidos por clase padre)
[CocheConcerns] ->  metodos exclusivamente para el manejo del objeto Coche
[MotoConcerns] ->  metodos exclusivamente para el manejo del objeto Moto

#2.1.2 - [Utilities] Contiene metodos utiles
[popularVehiculos] -> objetos precargados para empezar a interactuar con el programa sin realizar el Create (opcional en iniciar sesion)
[ValidadorNumeros] -> metodos para validar el ingreso de numeros, int y Double
[ValidadorVehiculo] -> validaciones utiles para objetos Vehiculo (usando atributos compartidos por clase padre)

#3 Flujo general

#3.1 -> Se inicia sesion y el usuario elige la session que mas le guste
-> segun esa sesion podra realizar ciertas acciones (sesion de 0, no podra hacer el READ, UPDATE, DELETE de vehiculos, debe crear primero, el resto ofrece mayor libertad a las funcionalidades)
-> el menu garaje ofrece ir al menu de vehiculos, ver el estado financiero, ver informacion general de garaje ,vehiculos almacenados, vehiculos retirados, y cerrar sesion

#3.2 -> Al ingresar al menu de vehiculos se instancia una lista por los retiros en el caso que haya, se pasa la lista de vehiculos actuales del garaje, no todo el objeto en si
-> aca el usuario utiliza el CRUD para la gestion que desee.
-> en los concerns coloque mucha logica para validar segun el tipo de vehiculo que es mas el vehiculo generico en si. para llevar a cabo todas las gestiones del CRUD. (si no hay espacio, se indica, si no hay vehiculos se indica, etc)
-> se vuelve de este menu vehiculos al menu de garaje y se guarda los vehiculos actuales (se pasaron por parametro) y se agregan los vehiculos retirados en el caso que haya alguno

---------------------------------------------------------------------------------------------------------------
Agustin Andres Avellaneda
CARRERA: Analista de Sistemas
ASIGNATURA: Programación Orientada a Objetos 
PROFESOR: Lautaro Chiappero




