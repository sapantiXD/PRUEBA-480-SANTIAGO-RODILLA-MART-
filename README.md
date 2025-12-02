# PRUEBA-480-SANTIAGO-RODILLA-MART-
Prueba tecnica 
• Qué hace tu programa: Mi programa es una calculadora de notas para estudiantes. Primero te pregunta cuántas asignaturas tienes (entre 1 y 10), y si pones un número fuera de ese rango te vuelve a preguntar hasta que lo hagas bien. Después te va pidiendo la nota de cada asignatura una por una, también validando que estén entre 0 y 10. Cuando ya tienes todas las notas introducidas, el programa calcula tu nota media, cuenta cuántas asignaturas has suspendido, te muestra todas tus notas juntas en una lista, y finalmente te dice si apruebas o suspendes el curso. Para aprobar necesitas tener una media de al menos 5 y no suspender más de una asignatura.

• Qué parte te ha parecido más fácil:
Los bucles para pedir las notas y validar que estuvieran en el rango correcto. Ya había practicado eso antes y me salió bastante natural.

• Qué parte te ha costado más:
Lo más complicado fue acumular las notas, ya que en nuestro caso no habíamos dado el tema de usar arrays y, como recomendabais que utilizáramos lo que habíamos visto, pues no se me ocurría ninguna manera hasta los últimos días, que gracias a un compañero nos dio la idea de utilizar un String para acumular las notas.

if (k == 1) {
                acumulador = acumulador + nota;
            } else {
                acumulador = acumulador + ", " + nota;
