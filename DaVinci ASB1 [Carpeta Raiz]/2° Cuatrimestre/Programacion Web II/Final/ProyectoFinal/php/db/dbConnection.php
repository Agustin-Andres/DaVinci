<?php
class dbConnection {
    private $host = 'localhost';
    private $user = 'root';
    private $password = '';
    private $database = 'proyecto_final';

    public function connect() {
        $connection = new mysqli($this->host, $this->user, $this->password, $this->database);

        if ($connection->connect_error) {
            die('Error de conexión: ' . $connection->connect_error);
        }

        return $connection;
    }
}
?>
