Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Termostato Inteligente (Encapsulamiento y Control de Rangos en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🌡️ Simulación de Termostato Inteligente (Encapsulamiento y Validaciones en Java)

Este proyecto es una aplicación en Java que modela el control automatizado de la temperatura y el modo de operación de un dispositivo termostato. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos**, el control de estado defensivo mediante constructores y modificadores, y la validación de rangos límites permitidos en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`Termostato`**: Modela el dispositivo electrónico y protege la integridad de la temperatura ambiente y el modo operativo.
* **Atributos privados (`private`)**: `temperaturaActual` y `modoOperacion`, impidiendo alteraciones directas desde fuera de la clase.
* **Constructor**: Inicializa el termostato evaluando de forma defensiva que la temperatura inicial se encuentre dentro del rango de confort permitido (entre **15°C y 30°C**). Si se ingresa un valor fuera de este intervalo, se establece por defecto en `15°C`.
* **Métodos accesores y modificadores (*getters/setters*)**: Permiten consultar y modificar de forma controlada el estado del dispositivo.
* **Métodos operativos de negocio**:
* `setTemperatura(double nuevaTemperatura)`: Valida estrictamente que el nuevo valor se mantenga dentro del rango admisible antes de aplicarlo. Si es inválido, rechaza la operación e informa un error por consola.




* **`Main`**: Punto de entrada del programa. Instancia un termostato en modo automático, consulta sus valores iniciales, ejecuta múltiples pruebas de cambio de temperatura (incluyendo valores válidos y fuera de rango) y muestra por consola el estado final.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Restricción Estricta de Rango Térmico:** Tanto el constructor como el método modificador (`setTemperatura`) validan que la temperatura se encuentre comprendida entre los límites operativos de confort (**15°C** y **30°C** inclusive).
2. **Manejo Defensivo de Temperaturas Fuera de Rango:** Si un usuario intenta configurar una temperatura inválida (ej. `35°C` o `10°C`), el sistema intercepta la acción, emite un mensaje de error y preserva intacto el último valor válido en memoria.
3. **Encapsulamiento Estricto:** Al ocultar los campos mediante el modificador `private`, se garantiza que ninguna entidad externa altere la temperatura de forma descontrolada sin pasar por las validaciones de seguridad del dispositivo.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Temperatura inicial: 22.0°C
Modo de operación: Automático

--- Pruebas de temperatura ---
Error: Temperatura no valido
Error: Temperatura no valido

--- Estado final ---
Temperatura actual: 30.0°C
Modo de operación: Automático

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento:** Ocultamiento de la representación interna del objeto, permitiendo exponer únicamente una interfaz pública segura y controlada.
* **Invariantes de Clase:** Garantía estricta de que el dispositivo jamás adopte estados físicos imposibles o fuera de rango durante su ciclo de ejecución.
* **Diseño Modular:** Clara separación entre la lógica de control del dispositivo (`Termostato`) y el flujo de pruebas ejecutado por el usuario (`Main`).

---

### 💡 Materiales de Apoyo y Videos

Los videos recomendados arriba ilustran cómo aplicar correctamente las reglas de **encapsulamiento**, validaciones de rangos numéricos y gestión de atributos privados en Java.
