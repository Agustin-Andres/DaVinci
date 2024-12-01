---------------------------------------------------------------------------------------------------
                                ESTRUCTURA DE PROYECTO
---------------------------------------------------------------------------------------------------
GestorGaraje/
├── .vscode/                # Configuración de Visual Studio Code
├── bin/                    # Archivos compilados
├── src/                    # Código fuente del proyecto
│   ├── Interfaz/                  # Interfaz para menus e interactuar con los objetos, especificamente vehiculos
│   │   ├── Concerns/              # Concerns son metodos para cada objeto hijo de vehiculo
│   │   │   ├── CocheConcerns.java          # Contiene metodos CREATE y UPDATE de coche, en futuro puede escalarse
│   │   │   ├── MotoConcerns.java           # Contiene metodos CREATE y UPDATE de moto, en futuro puede escalarse
│   │   │   ├── VehiculosConcerns.java      # Contiene metodos generales para todo VEHICULO, maravilla
│   │   ├── InterfazGaraje.java           # Aca populamos totalmente | parcialmente  o instanciamos el objeto GARAJE
│   │   ├── InterfazVehiculo.java         # Menu para manipular los vehiculos del garaje [Manipulacion CRUD de la lista]
│   ├── sistemaGaraje/             #Para cumplir con la consigna
│   │   ├── Garaje.java                     #Clase Garaje              
│   │   ├── GarajeTest.java                 # una vez instanciado Garaje, aca tenemos el menu Garaje.
│   ├── utilities/                 #Clase de utilidades                          
│   │   ├── popularVehiculos.java           # Clase para popular con datos aleatorios en caso qeu el user lo desee
│   │   ├── ValidadorNumeros.java           # Clase para validar numeros enteros y Double
│   │   ├── ValidadorVehiculo.java          # Clase para validar datos de cualquier objeto vehiculo [Generalizado, lo especifico esta en concerns]
│   ├── Vehiculos/
│   │   ├── Coche.java               #Clase coche
│   │   ├── Moto.java                #Clase moto
│   │   ├── Vehiculo.java            #Clase vehiculo
│   ├── App.java                     # Punto de entrada principal de la aplicación
├── README.md                        # Información del proyecto
---------------------------------------------------------------------------------------------------

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