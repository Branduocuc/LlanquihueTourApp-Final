# LlanquihueTourApp 

Aplicación desarrollada en Java para representar un prototipo de gestión turística para Llanquihue Tour.

El sistema aplica principios de programación orientada a objetos, lectura de datos desde archivos, uso de colecciones, herencia, interfaces, polimorfismo, manejo de excepciones e interfaz gráfica con Java Swing.

## Funcionalidades

- Carga de tours desde un archivo `.txt`.
- Conversión de datos del archivo en objetos `Tour`.
- Registro de guías, embarcaciones y atractivos turísticos.
- Búsqueda de tours por nombre.
- Filtro de tours por precio.
- Asignación de guía y operador a un tour.
- Visualización de información por consola y mediante ventanas gráficas.
- Validación de datos con `try-catch` y excepción personalizada.
- Manejo de cancelación o cierre de ventanas sin errores.

## Estructura del proyecto

```text
src
├── data
│   ├── GestorDatos.java
│   ├── GestorServicios.java
│   └── GestorEntidades.java
│
├── exception
│   └── CapacidadInvalidaException.java
│
├── model
│   ├── Tour.java
│   ├── Guia.java
│   ├── Operador.java
│   ├── Embarcacion.java
│   ├── AtractivoTuristico.java
│   ├── Registrable.java
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── resources
│   └── tours.txt
│
└── ui
    └── Main.java


Ejecución
Abrir el proyecto en IntelliJ IDEA.
Verificar que el archivo tours.txt esté dentro de src/resources.
Ejecutar la clase Main, ubicada en el paquete ui.

Al ejecutarse, el sistema realiza lo siguiente:

Carga los tours desde el archivo tours.txt.
Convierte los datos del archivo en objetos Tour.
Muestra los tours cargados en consola.
Asigna una guía y un operador a un tour para demostrar composición.
Realiza una búsqueda de tour por nombre.
Filtra los tours con precio mayor a 20000.
Solicita datos mediante ventanas gráficas con JOptionPane.
Registra una guía, una embarcación y un atractivo turístico.
Valida la capacidad de la embarcación usando try-catch y una excepción personalizada.
Muestra el resumen final en una ventana gráfica y también en consola.
