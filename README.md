# Prólogo
Retomo en mi vida la parte de enseñar, sé lo complicado que es encontrar cursos en el idioma español y sobre todo que estén al alcance de uno (ya sea distancia, precio y tiempo).

Al lenguaje **Java** le tengo mucho cariño ya que me abrio muchas puertas laboralmente, fue la primera certificación que obtuve en mi vida y ha sido la que me dió pie a querer saber más de diferentes cosas.

Espero que con esto pueda ayudar a más personas a aprender y sobre todo poder transmitirles mi sed de conocimiento.

---

# Introducción a la Programación
Hoy en día utilizamos diferentes programas en la vida diaria, ya sea en nuestra computadora personal (o laboral) o teléfono inteligente. Aplicaciones para escribir, contar, llevar un registro, interacción social, ver vídeos, juegos, etc. Entonces, si ya usamos tantos programas en el día a día, ¿por qué no crear uno propio?.

Para dar respuesta a esa pregunta, es muy simple. Hay que aprender a programar, para ello en este curso de introducción a la programación basado en *Java* iniciaremos este hito en la vida de los que desean aprender para lograr crear una aplicación propia.

---

#### Variables
Las variables son reservaciones en memoria que se hacen asignando primero el tipo de esta y después el nombre que tendrá. Y en esta variable un programa podrá almacenar algun dato para después ser utilizada dentro del mismo programa.

En *Java* las variables pueden ser datos primitivos u objetos.

##### Declaración de Variables
Para declarar una variable la estructura es la siguiente:

> *tipo_de_dato nombre_de_la_variable*

Ejemplo:
```java
int edad;
```

Y para declarar varias variables del mismo tipo la estructura es la siguiente:

> *tipo_de_dato nombre_de_la_variable_1,nombre_de_la_variable_2,nombre_de_la_variable_3*

Ejemplo:
```java
int a,b,c,edad;
```

> Restricciones:
> - No puede usarse una palabra reservada para el nombre de una variables

###### Constantes
Una constante es una variable que su valor no puede ser modificado. Para definir una constante en *Java* se requiere utilizar la palabra reservada *final* antes de la declaración de la variable y el nombre de la variable se pone en mayúsculas (esto es por convención y tener un código más limpio), la estructura es la siguiente:

> *final tipo_de_dato NOMBRE_VARIABLE;*

Ejemplo:
```java
final int IVA=16;
```
---

##### Asignación
Una vez que la variable es declarada se puede asignar un dato/valo con la siguiente estructura:

> *nombre_variable=expresion_o_valor*

Ejemplo:
```java
int edad, a, b, c, resultado; // se declaran las variables
edad=30;
a=10;
b=3;
c=a+b;
resultado=edad-10;
```
Otra manera es asignar un valor inicial a una variable en el mismo momento que es declarada, eso se hace de la siguiente manera:
```java
int edad=30; // se declara la variable edad de tipo int y se inicializa con el valor 30
int a, b=20; // se declara la variable a y b, pero b es inicializada con el valor 20;
```

La asignación se hace por medio del signo de **"="**, debe entenderse que esto no representa comparativa de igualdad, sino asignación directa. Sin embargo existen otros operadores de asignación.

| Operador | Descripción                                                                                                              | Ejemplo                                                                                   |
|----------|--------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| =        | Asigna una expresión o valor de derecha a izquierda del operador.                                                        | int a=9; // esto es una asignación directa                                                |
| +=       | Suma la expresión de la derecha, a la variable que se encuentra al izquierda del operador.                               | int a=3; a+=5; // esto le da el valor de 8 a la variable a, que sería igual a poner a=a+5 |
| -=       | Resta la expresión de la derecha, a la variable que se encuentra al izquierda del operador.                              |                          int a=10; a-=5; // esto le da el valor de 5 a la variable a, que sería igual a poner a=a-5                                                                 |
| *=       | Multiplica la expresión de la derecha, a la variable que se encuentra al izquierda del operador.                         |     int a=3; a*=5; // esto le da el valor de 15 a la variable a, que sería igual a poner a=a*5                                                                                      |
| /=       | Divide la expresión de la derecha, a la variable que se encuentra al izquierda del operador.                             |             int a=10; a/=2; // esto le da el valor de 5 a la variable a, que sería igual a poner a=a/2                                                                              |
| %=       | Calcula el resto de la división de la expresión de la derecha, a la variable que se encuentra al izquierda del operador. |int a=10; a%=2; // esto le da el valor de 0 a la variable a, que sería igual a poner a=a%5                                                                                           |

---

#### Camel case
Camel case se utiliza para dar una estructura al texto que se escribe en frases o palabras compuestas, por ejemplo:

> *usuarioNuevo*

El nombre de este estilo de escritura es debido a la asemejanza de las jorobas de un camello, en las cuales se usa minúsculas y mayúsculas al escribir.

> La notación Upper Camel Case: iniciamos con una mayúscula continuamos con minúsculas hasta llegar a la siguiente palabra y esta iniciara con mayúscula continuando con minúscula.

Por ejemplo:
```java
// Esto es una clase
public class AutoCompacto{}
```

> La notación Lower Camel Case: iniciamos con una minúsculas y hasta la siguiente palabra comenzará con una mayúscula continuando con minúsculas.

Por ejemplo:
```java
// para un método
public Double obtenerIva(Double monto){}

// variable
int edadUsuario;
```

> Esto es un estandar o conjunto de convenciones que permiten leer el código con mayor facilidad al ser humano, para poder saber si es una clase, una variable, una constante o método.

---

#### Palabras reservadas

| reservada | reservada | reservada  | reservada | reservada    |
|-----------|-----------|------------|-----------|--------------|
| abstract  | continue  | for        | new       | switch       |
| assert    | default   | goto       | package   | synchronized |
| boolean   | do        | if         | private   | this         |
| break     | double    | implements | protected | throw        |
| byte      | else      | import     | public    | thorws       |
| case      | enum      | instanceof | return    | transient    |
| catch     | extends   | int        | short     | try          |
| char      | final     | interface  | static    | void         |
| class     | finally   | long       | strictfp  | volatile     |
| const     | float     | native     | super     | while        |
| null      | false     | true       |           |              |

---

#### Modificadores de acceso
En *Java* existen 4 tipos:
- public
- private
- protected
- default (por defecto)

Sino escribimos ningun modificador este toma el nivel de acceso *default*
Ejemplo:
```java
// en una clase sería así
class MiClase{

    // en un atributo de clase
    int valor;

    // en un método
    void miMetodo(){}
}
```

Ahora si deseamos usar los modificadores son de la siguiente forma:
```java
// en una clase sería así
public class OtraClase{

    // en un atributo de clase
    private int valor;

    // en un método
    public int getValor(){
        return this.valor;
    }

    protected void miMetodo(){

    }
}
```

Los modificadores de acceso deben ser escritos antes de la declaración, como se muestra en los ejemplos de arriba. Pero no se pone modificador de acceso a las variables que están dentro de un método, porque su visibilidad o tiempo de vida lo determina el *scope* del método.

Ejemplo:
```java
public class NuevaClase{

    private int valor;

    public int getValor(){
        return this.valor;
    }

    protected void miMetodo(){
        // aquí no se pone el modificador de acceso
        int variableA = 0;
    }
}
```

La visibilidad de los modificadores de acceso es la siguiente:

| Modificador/Visibilidad | En la misma clase | Otra clase del mismo paquete | Subclases de otro paquete | Otra clase de otro paquete |
|-------------------------|-------------------|------------------------------|---------------------------|----------------------------|
| public                  | X                 | X                            | X                         | X                          |
| protected               | X                 | X                            | X                         |                            |
| default                 | X                 | X                            |                           |                            |
| private                 | X                 |                              |                           |                            |

---

#### Datos primitivos
En Java solo existen 8 tipos de datos primitivos, que se claifican de la siguiente manera:

- Números enteros (byte, short, int, long).
- Números reales (float, double).
- Carácter (char).
- Booleano o lógico (boolean), valores true o false.

| Tipo    | Tamaño  | Valor mínimo          | Valor máximo         |
|---------|---------|-----------------------|----------------------|
| byte    | 8 bits  | -128                  | 127                  |
| short   | 16 bits | -32768                | 32767                |
| int     | 32 bits | -2147483648           | 2147483647           |
| long    | 64 bits | -9223372036854775808  | 9223372036854775807  |
| float   | 32 bits | -3.402823e38          | 3.402823e38          |
| double  | 64 bits | -1.79769313486232e308 | 1.79769313486232e308 |
| char    | 16 bits | '\u0000'              | '\uffff'             |
| boolean | -       |                       |                      |

En los datos primitivos no existe alguno en el cual pueda representar una cadena de carcateres para ello se debe usar un objeto llamado *String*

---

#### Operadores lógicos

| OPERADOR     | DESCRIPCIÓN                                |
|--------------|--------------------------------------------|
| ==           | Es igual                                   |
| !=           | Es distinto                                |
| <, <=, >, >= | Menor, menor o igual, mayor, mayor o igual |
| &&           | Operador and (Y)                           |
| `||` | Operador or (O) |
| !            | Operador not (NO)                          |

---

### Operadores aritméticos

| OPERADOR | DESCRIPCIÓN                                                                          |
|----------|--------------------------------------------------------------------------------------|
| +        | Suma                                                                                 |
| -        | Resta                                                                                |
| *        | Multiplicación                                                                       |
| /        | División                                                                             |
| %        | Mod, es el resto de una división entre enteros                                       |
| ++       | Incrementa la variable en una unidad y la deposita el resultado en la misma variable |
| - -       | Decrementa la variable en una unidad y la deposita el resultado en la misma variable |

---

### Objetos
