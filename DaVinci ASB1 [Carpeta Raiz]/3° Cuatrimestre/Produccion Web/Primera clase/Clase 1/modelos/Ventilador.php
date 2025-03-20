//class Ventilador 
<?php

//declaracion de clase
class Ventilador{
    
    /* 
    //constructor vacio
    public function __construct()
    {
        echo "Se creo el objeto ventilador \n";
    }
        */

        
       //constructor con varibales por parametro, con setteo
       public function __construct(string $marca, int $nivel, bool $estado)
       {
           echo "Se creo el objeto ventilador \n";
           $this.$marca = $marca;
            $this.$nivel = $nivel;
            $this.$estado = $estado;
       }


// declaraciuon de variables   visibilidad = public/private/protected
private string $marca;
private int $nivel;
private bool $encendida = false;

//comportamiento(metodos)
public function encender(): void{

    $this -> encendida = true;
}

public function apagar(): void{

    $this -> encendida = false;
}

//getters y setters 

public function setNivel(int $nivel): void {
    $this->nivel = $nivel;
}

public function getNivel(): int {
    return $this->nivel;
}
}