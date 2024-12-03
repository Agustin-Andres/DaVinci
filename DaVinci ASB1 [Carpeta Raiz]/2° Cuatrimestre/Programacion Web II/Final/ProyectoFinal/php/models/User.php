<?php
class UserModel {
    private $connection;

    public function __construct($connection) {
        $this->connection = $connection;
    }

    // Método para validar login
    public function login($email, $password) {
        // Consulta preparada para evitar inyección SQL
        $query = "SELECT * FROM usuarios WHERE email = ? AND password = ?";
        $stmt = $this->connection->prepare($query);
        $stmt->bind_param('ss', $email, $password);
        $stmt->execute();
        $result = $stmt->get_result();

        // Si encontramos el usuario, retornamos los datos
        if ($result->num_rows === 1) {
            return $result->fetch_assoc();
        }

        return false; // Credenciales incorrectas
    }
}
?>
