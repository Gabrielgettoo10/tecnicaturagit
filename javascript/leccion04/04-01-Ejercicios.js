//Ejercicio 1: Calcular estación del año
let mes = 10;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estación de: "+estacion);
//Ejercicio 2: Hora del día
/*
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good Afternoom
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good night
Trabajamos con 24 horas
*/
let horaDia = 20;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good afternoom";
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "Good evening";
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Good night";
}
else{
    mensaje = "Valor incorrecto";
}
console.log(mensaje);

//Estructura switch(la sintaxis es igual a Java)
switch(mes){ //No solo se pueden utilizar número,también cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";                                
}
console.log("Bienvenido a la estación de: "+estacion);

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); //solo se ejecuta el console anterior

//Evitar repetir tu código
//Dry don't repeat yourself

let days = 1;
switch (days) {
    case 1:
        console.log('hoy es Lunes');
        break;
    case 2:
        console.log('hoy es Martes');
        break;
    case 3:
        console.log('hoy es Miércoles');
        break;
    case 4:
        console.log('hoy es Jueves');
        break;
    case 5:
        console.log('hoy es Viernes');
        break;
    case 6:
        console.log('hoy es Sabado');
        break;
    case 7:
        console.log('hoy es Domingo');
        break;
    default:
        console.log("Error en el ingreso del día de la semana");
        break;
}

//Esta es la opción mejorada

let days2 = ['Lunes','Martes','Miercoles','Jueves','Viernes','Sabado','Domingo'];
function getDay(n){
    if(n < 1 || n > 7){
        throw new Error('out of range');
    }
    return days2[n-1];
}
console.log(getDay(5));

//Evitar repetir tu código
//Dry don't repeat yourself

let month = 11;
switch (month) {
    case 1:
        console.log('Es Enero');
        break;
    case 2:
        console.log('Es Febrero');
        break;
    case 3:
        console.log('Es Marzo');
        break;
    case 4:
        console.log('Es Abril');
        break;
    case 5:
        console.log('Es Mayo');
        break;
    case 6:
        console.log('Es Junio');
        break;
    case 7:
        console.log('Es Julio');
        break;
    case 8:
        console.log('Es Agosto');
        break;
    case 9:
        console.log('Es Septiembre');
        break;
    case 10:
        console.log('Es Octubre');
        break;
    case 11:
        console.log('Es Noviembre');
        break;
    case 12:
        console.log('Es Diciembre');
        break;
    default:
        console.log("Error en el ingreso del mes del año");
        break;
}

//Esta es la opción mejorada

let month2 = ['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'];
function getMonth(n){
    if(n < 1 || n > 12){
        throw new Error('out of range');
    }
    return month2[n-1];
}
console.log(getMonth(1));


