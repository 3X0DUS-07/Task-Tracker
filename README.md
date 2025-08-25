# TaskTracker CLI (Kotlin)

![Kotlin](https://img.shields.io/badge/Kotlin-1.9-blue?logo=kotlin&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)

TaskTracker es una aplicación de consola escrita en **Kotlin** que permite **gestionar tareas** aplicando **Programación Orientada a Objetos (POO)**.  
El proyecto implementa **data classes, enums, objetos singleton y clases internas**, siguiendo una **arquitectura modular en capas**.

---

## **Características**

- **Agregar tareas** con título, descripción, fecha de creación, categoría y prioridad.
- **Estados de tarea** (`Pendiente`, `En progreso`, `Completada`) mediante `enum`.
- **Categorías** (`Estudio`, `Trabajo`, etc.) asociadas a las tareas.
- **Prioridades** (`Baja`, `Media`, `Alta`) mediante `enum`.
- **Modificar estado, categoría y prioridad** de tareas por ID.
- **Visualización formateada** en consola.
- **Reporte automático** del estado de todas las tareas.
- Arquitectura **modular y escalable**.

---

## **Estructura del proyecto**

```
TaskTracker/
├── src/
│   └── main/
│       └── kotlin/
│           └── com/
│               └── caffellayohusseff/
│                   └── tasktracker/
│                       ├── Main.kt
│                       ├── model/
│                       │   ├── Tarea.kt
│                       │   ├── Categoria.kt
│                       │   └── enums/
│                       │       ├── EstadoTarea.kt
│                       │       └── Prioridad.kt
│                       ├── service/
│                       │   └── GestorTareas.kt
│                       ├── ui/
│                       │   └── Menu.kt
│                       └── utils/
│                           └── FechaHelper.kt
```

---

## **Descripción de las capas**

### **1. `model/`**
- **`Tarea.kt`**: `data class` que representa una tarea con ID, título, descripción, estado, fecha, categoría y prioridad.  
- **`Categoria.kt`**: `data class` para definir categorías.
- **`EstadoTarea.kt`**: `enum class` con estados (`PENDIENTE`, `EN_PROGRESO`, `COMPLETADA`).
- **`Prioridad.kt`**: `enum class` con prioridades (`BAJA`, `MEDIA`, `ALTA`).

### **2. `service/`**
- **`GestorTareas.kt`**: Lógica de negocio. Administra tareas (agregar, cambiar estado, categoría, prioridad, reporte).

### **3. `ui/`**
- **`Menu.kt`**: Interfaz de usuario. Muestra las tareas en consola de forma formateada.

### **4. `utils/`**
- **`FechaHelper.kt`**: `object` (singleton) para obtener fecha/hora (mockeadas en esta versión).

### **5. `Main.kt`**
- Punto de entrada. Crea categorías, tareas, cambia estados, asigna prioridades y muestra reporte.

---

## **Ejemplo de ejecución**

```bash
Lista de tareas:

    ID: 1
    Título: Test
    Descripción: Descripción
    Estado: ⏳ Por hacer
    Fecha de creación: 19/12/2024
    Categoría: Sin categoría
    Prioridad: 🟡 Media
----------------------------------------------------
    ID: 2
    Título: Aprender Fundamentos en Kotlin
    Descripción: Descripción
    Estado: ✅ Completada
    Fecha de creación: 19/08/2025
    Categoría: 1 - Estudio (Tareas relacionadas con aprendizaje)
    Prioridad: 🔴 Alta
----------------------------------------------------
    ID: 3
    Título: Practicar Enums
    Descripción: Descripción
    Estado: 🔄 En progreso
    Fecha de creación: 19/08/2025
    Categoría: 1 - Estudio (Tareas relacionadas con aprendizaje)
    Prioridad: 🔴 Alta
----------------------------------------------------
    ID: 4
    Título: Construir Data Classes
    Descripción: Descripción
    Estado: ✅ Completada
    Fecha de creación: 19/08/2025
    Categoría: 2 - Trabajo (Tareas laborales)
    Prioridad: 🟢 Baja
----------------------------------------------------
Total: 4 | ⏳ 1 | 🔄 1 | ✅ 2
```

---

## **Tecnologías utilizadas**
- **Kotlin (JVM)**
- **IntelliJ IDEA**
- **POO (Clases, Data Classes, Enums, Objetos, Inner Classes)**

---

## **Cómo ejecutar**
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/3X0DUS-07/TaskTracker.git
   cd TaskTracker
   ```
2. Abrir el proyecto en **IntelliJ IDEA**.
3. Asegurarse de tener **Kotlin/JVM SDK** configurado.
4. Ejecutar `Main.kt`.

---

## **Mejoras futuras**
- Persistencia de datos (guardar tareas en archivos o base de datos).
- Menú interactivo (leer entradas del usuario).
- Uso de `java.time` para fechas reales.
- Tests unitarios.
