package PD1;

public class ej6 {
}
/**
 *
 * Escenario:
 * Se desea llevar un registro de asistencia de un cierto curso universitario, el cual contará con
 * una cantidad no determinada inicialmente de alumnos. Para ello, se ha decidido utilizar una
 * lista para representar los alumnos en este curso.
 * Cada elemento de la lista entonces tendrá un identificador del alumno y un campo que se ha
 * de incrementar cada vez que el alumno concurra a una clase. También se desea registrar el
 * total de clases impartidas en el curso, y con este dato luego para cada alumno obtener el
 * porcentaje de asistencia a las clases.
 * Las listas pueden implementarse físicamente de dos formas básicas: utilizando un array, o
 * armando una lista encadenada. Se desea la opinión experta de tu Equipo para determinar qué
 * utilizar para resolver eficientemente el problema planteado.
 * a) ¿Cuál es el costo de memoria en cada caso?
 * b) ¿Cuáles son las consideraciones que tu Equipo haría referentes a la cantidad de
 * alumnos del curso que soporta cada tipo de estructura? (puedes considerar que, como
 * en la UCU, las inscripciones al curso suelen estar habilitadas desde varias semanas
 * antes de empezar el curso hasta dos semanas después de haber comenzado)
 *
 * ----------------------------------------------------------------------------------------------------
 *
 * a) El costo de memoria de cada caso depende de la cantidad de alumnos no se puede saber sin el numero de alumnos.
 *
 * b) Si la cantidad de alumnos en el curso es variable, puede ser más eficiente utilizar una lista encadenada
 * a menos que sepamos realmente cuantos alumnos van a ser en total, ya que la lista enlazada ocupa mas memoria si se saben cuantos alumnos son
 * resumiendo: si se saben cuantos alumnos son ArrayList sino se sabe, linkedList.
 *
 */
