# 🏷️ Simulación de Facturación y Cálculo de Impuestos por Polimorfismo (POO en Java)

Este proyecto es una aplicación en Java que modela el cálculo dinámico de impuestos y precios finales para diferentes tipos de ítems facturables (productos importados, servicios profesionales y alimentos básicos). Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como **clases abstractas**, **métodos templates**, **herencia** y **polimorfismo** mediante colecciones en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una superclase abstracta que define la plantilla de cálculo y múltiples implementaciones concretas:

*   **`ItemFacturable` (Clase Abstracta)**: Establece la estructura base para cualquier elemento susceptible de facturación.
    *   **Atributos:** `nombre` y `precioBase`.
    *   **Métodos principales:** 
        *   Constructor para inicializar los datos comunes.
        *   `calcularImpuesto()`: Método abstracto que obliga a cada subclase a definir su propia tasa impositiva.
        *   `precioFinal()`: Método concreto (*Template Method*) que calcula de manera unificada el valor total sumando el precio base y el impuesto calculado.
*   **`ProductoImportado`**: Modela un bien adquirido del exterior.
    *   **Comportamiento:** Implementa el cálculo de impuestos aplicando una tasa diferencial del **21%** sobre el precio base.
*   **`ServicioProfesional`**: Modela la prestación de servicios técnicos o profesionales.
    *   **Comportamiento:** Implementa el cálculo impositivo aplicando una tasa del **10%**.
*   **`AlimentoBasico`**: Modela productos de primera necesidad.
    *   **Comportamiento:** Aplica una tasa impositiva reducida del **5%**.
*   **`Main`**: Punto de entrada de la aplicación. Agrupa instancias de diferentes naturalezas en una lista polimórfica (`ArrayList<ItemFacturable>`) y recorre los elementos mostrando el desglose detallado de costos.

---

## ⚙️ Conceptos Clave de POO y Patrones Aplicados

1. **Método Plantilla (*Template Method*):** El cálculo del `precioFinal()` está definido y centralizado en la clase abstracta `ItemFacturable`. Este método invoca internamente a `calcularImpuesto()`, delegando en cada subclase la responsabilidad de retornar el valor impositivo correspondiente sin duplicar código de suma.
2. **Polimorfismo en Colecciones:** La lista `ArrayList<ItemFacturable>` permite almacenar objetos heterogéneos (`ProductoImportado`, `ServicioProfesional`, `AlimentoBasico`) y procesarlos de forma idéntica en un bucle.
3. **Despacho Dinámico de Métodos:** En tiempo de ejecución, Java identifica automáticamente cuál implementación de `calcularImpuesto()` debe ejecutar según la instancia real de cada elemento.
4. **Principio Abierto/Cerrado (OCP):** Es posible añadir nuevas categorías facturables (ej. `Electrodomestico`, `Medicamento`) creando nuevas clases que extiendan de `ItemFacturable`, sin necesidad de alterar la lógica de iteración o impresión del sistema.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente desglose por pantalla:

```text
Nombre: Notebook
Precio Base: $150000.0
Impuesto: $31500.0
Precio Final: $181500.0
-------------------------------
Nombre: Consulta
Precio Base: $20000.0
Impuesto: $2000.0
Precio Final: $22000.0
-------------------------------
Nombre: Harina
Precio Base: $2000.0
Impuesto: $100.0
Precio Final: $2100.0
-------------------------------
