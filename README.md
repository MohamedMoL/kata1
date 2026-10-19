# Kata 1

**Asignatura:** Ingeniería del Software II · ULPGC  
**Autor:** Mohamed Moussati Lamhamdi  

---

## Objetivo

Familiarizarse con IntelliJ IDEA y el flujo básico de Git/GitHub implementando un microproyecto con una clase de dominio sencilla. La entrega consiste en repetir el mismo ejercicio varias veces para reducir fricción técnica con el IDE y el flujo Git: crear rama `develop`, hacer commits pequeños, integrar en `master` y hacer push a GitHub.

---

## Compilar y ejecutar

**Requisitos:** JDK 26 · Maven

**Desde IntelliJ IDEA:** abrir la carpeta, asignar JDK 26 en `File → Project Structure` y ejecutar la clase `Main`.

La salida esperada es la edad calculada de la persona creada en `Main`:

```
26
```

---

## Estructura

```
kata1/
├── src/main/java/software/ulpgc/katas/
│   ├── Main.java
│   └── Person.java
└── pom.xml
```

**`Person`** — record Java con atributos `name` y `birthday`. Expone el método `age()` que devuelve la edad en años calculada sobre la diferencia de días respecto a la fecha actual.

**`Main`** — crea una instancia `Person("Marcos", 2000-01-01)` e imprime el resultado de `person.age()` por consola.

---

## Flujo Git

Todo el flujo Git se gestionó desde IntelliJ IDEA sin usar la terminal. El trabajo habitual se realizó en la rama `develop` (y variantes `develop2`, `develop3`, `develop_Final`) con commits pequeños; al terminar cada iteración se integró en `master` mediante merge y se hizo push a GitHub, todo desde los botones y menús del IDE.

### Shortcuts de IntelliJ usados

| Shortcut | Acción |
|---|---|
| `Alt + 1` | Abrir / cerrar el panel Project |
| `Shift + F6` | Renombrar (refactoring) |
| `Alt + Insert` | Generar código (constructor, métodos…) |
| `Alt + Enter` | Aplicar sugerencias y quick-fixes |
| `Ctrl + K` | Hacer commit (ventana de Git) |
| `Alt + 9` | Abrir el panel Git / Version Control |

---

## Clonar y verificar en carpeta limpia

```bash
git clone https://github.com/MohamedMoL/kata1.git ~/kata1_test
cd ~/kata1_test
./mvnw compile
```

---

## Vídeo explicativo

> https://www.youtube.com/watch?v=oEnD5K8mBdU

---

## Repetición de la kata y variaciones

La kata se repitió **4 veces** en ramas separadas (`develop`, `develop2`, `develop3`, `develop_Final`), reconstruyendo el microproyecto desde cero en cada iteración. El alcance fue idéntico en todas: clase `Person`, clase `Main`, ejecución y flujo Git.

Como variación pequeña, en cada iteración se cambió el punto de partida de `Person`: unas veces se comenzó directamente como record Java y otras como clase ordinaria que se refactorizó a record a lo largo de los commits.

---

## Verificación

| Caso | Entrada | Resultado |
|---|---|---|
| Edad persona nacida el 01/01/2000 | `new Person("Marcos", LocalDate.of(2000,1,1))` | `26` ✅ |