<?php
// Importamos las dependencias necesarias
require_once '../db/dbConnection.php';
require_once '../models/User.php';

// Verificamos que los datos hayan sido enviados por POST
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Recibimos los datos del formulario
    $email = $_POST['email'];
    $password = $_POST['password'];

    // Validamos que los campos no estén vacíos
    if (empty($email) || empty($password)) {
        die('Por favor, completa todos los campos.');
    }

    // Conectamos con la base de datos
    $db = new dbConnection();
    $connection = $db->connect();

    // Consultamos el modelo para validar las credenciales
    $userModel = new UserModel($connection);
    $user = $userModel->login($email, $password);

    if ($user) {
        // Credenciales correctas, iniciamos sesión
        session_start();
        $_SESSION['user'] = $user;
        header('Location: ../../html/inventario/home.html'); // Redirigir a la página principal
    } else {
        // Credenciales incorrectas
        die('Usuario o contraseña incorrectos.');
    }
}
?>
