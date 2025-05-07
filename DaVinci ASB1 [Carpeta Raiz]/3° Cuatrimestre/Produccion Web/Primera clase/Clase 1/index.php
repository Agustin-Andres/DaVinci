//index es el inicio del programa 
<?php
//importacion de clase
require_once('./modelos/Ventilador.php');
require_once('./modelos/Mascota.php');

//Creacion de objetos
$ventilador = new Ventilador('Liliana',2,true);

//modificacion de variable cuando es public
//$ventilador->nivel =1;

//output de data
echo "El ventilador tiene el valor: {$ventilador->getNivel()}";


 
//$mascotaPerro = new Perro("Rufus");
$mascotaGato = new Gato("Nyamko");

$mascotaGato->jugar();

