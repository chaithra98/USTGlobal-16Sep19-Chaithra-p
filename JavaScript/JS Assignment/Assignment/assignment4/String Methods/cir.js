//Named functions


// var circleRadius = parseInt(prompt('Please enter the radius of a circle:'));
// var circumcircle = 2*Math.PI*circleRadius;
// console.log(circumcircle)
function circum(n)
{
    console.log('Circumference is ',2*3.14*n);
}
circum(6);
console.log("=============");

var cir = function(n1)
{
    var s = 2*3.14*n1;
    return s;
}
var v= cir(6);
console.log(v);
console.log("=================");

(function circumf(e){
    console.log('Circumference : ',2*3.14*e);
})(15);

console.log('======================');
var circum = r =>{
    console.log('Circumference is :',2*3.14*r);

}
circum(10);

    

