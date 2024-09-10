package java17._1variables;

public class TiposDeDatos {
    //Primitivos
   boolean bool; // true o false
   byte b; //8 bits, entero
   char c;// unicode 16 bits
   short s;// 16 bits
   int num;// 32 bits
   long l;// 64 bits
   float f;//32 bits
   double d;// 64 bits

    //Literales: Son enteros que se pueden representar cómo:
      //Decimales: 345
      //Octal: 531
      //HExadecimal: 159
      //Binario:101011001

   //Símbolo _ para enteros.
   int num_=1_4545;//El _ Se puede usar para separar números
   float f_=12.1_2f;//Igualmente con flotantes o dobles.

   //Restricciones: No puede usarse al inicio, final o junto a un punto
   int num_2=_234;//No puede ir al inicio
   int num_3=234_;//No puede ir al final
   double num_3=234._1;//No puede ir al final

   //Los literales son int por defecto, si debe ser long se tiene que añadir l
   long lo=12L;

   //Los literales por defecto son doubles, si se desea que sean float se debe añadir d
   float fl=1.1F;

   //Todos los tipos de datos primitivos son convertibles entre si, excepto boolean.

   //Conversión implícita, sin casting, el receptor debe tener igual o mayor capacidad
   //de bites
   int numi=2;
   double dou=numi;

   //Conversión explícita, con casting, cuando el receptor es de menor capacidad.
   char ch='a';
   byte by=(byte)ch;

   //Excepciónes
   //Si el tipo de origen es numerico y el destino es char, aunque cabe,
   // se tiene que hacer la conversión explícita.

   //Si el tipo origne es decimal y se quiere convertir a entero,
   // se tiene que hacer explícitamente. (O sea, cuando se pierde precisión)


    //Objetos

}
