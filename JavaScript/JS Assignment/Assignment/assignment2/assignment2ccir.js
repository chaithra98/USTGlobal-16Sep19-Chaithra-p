console.log('****************************');

function cir(n1)
{
    console.log("Circumference of a circle is: ",2*3.14*n1);
}cir(3);

console.log("============================");

var circum = function(n2)
{
      var c = 2*3.14*n2;
        return c;
}
 var i = circum(6);
console.log("Circumference of a circle is: ",i);

console.log("============================");

(function(n3)
{
    console.log("Circumference of a circle is: ",2*3.14*n3);
})(11);

console.log("================================");

var cr = n4 =>
{
    console.log("Circumference of a circle is:",2*3.14*n4);
}
cr(13);