// 
<?php
//importacion de clase
require_once('./modelos/Ventilador.php');

//Creacion de objetos
$ventilador = new Ventilador('Liliana',2,true);

//modificacion de variable cuando es public
//$ventilador->nivel =1;

//output de data
echo "El ventilador tiene el valor: {$ventilador->getNivel()}";
