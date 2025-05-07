<?php
//clase abstracta
abstract class Mascota
{
    //constante 
    const CONSTANTE = 'Soy una constante';

    private string $nombre;
    private array $vacunas;

    public function __construct(string $nombre, array $vacunas)
    {
        $this->nombre = $nombre;
        $this->vacunas = $vacunas;
        
    }

    public function jugar()
    {
       echo "{$this->nombre} esta jugando";
    }
}

//subclases heredadas de Mascota

class Gato extends Mascota
{
    //constructor propio de clase hija, una sobrescritura de metodos
    // aca setteamos el nombre de otra clase y automaticamente setteamos las vacunas
    public function __construct(string $nombre){
        parent::__construct($nombre,vacunas: ['Triple felina'. 'Antirrabica']);
    } 

    public function maullar()
    {
        echo "miau";
    }
}
class Perro extends Mascota {
    public function ladrar()
    {
        echo "woof";
    }
}
