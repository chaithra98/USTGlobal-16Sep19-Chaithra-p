//Named Functions
function add(num1,num2)
{
    console.log("Sum = ",num1+num2)
}
add(10,25)

//Function Expression(Anonymous)
var sub = function(n1,n2)
{
    //console.log('sub = ',n1-n2)
    var p = n1-n2;
    return p;
}
var n = sub(35,20)
console.log('Subtraction is : '+n)

console.log('Hello'); // Here ; is mandatory i.e., before self invoked functions

//Self Invoked functions
(function(n1,n2)
{
    console.log('value = ',n1*n2);
})(10,20)

//Fat Arrow Functions
var div = (n1,n2)=>
{
    console.log('Value = '+n1/n2)
}
div(50,10)

var div1 = n1=>
{
    console.log('value : ',n1);
}
div1(10);

console.log('------------------------------')
var div2 = n1 => console.log(n1);
var l = div2(5)


var add = (n1,n2)=>n1+n2;
var val = add(10,20)
console.log(val)

greeting('chandan');
function greeting(msg)
{
    console.log('Hello',msg)
}

//greet('Dinga');
var greet = function(msg)
{
    console.log('Hi',msg)
}
('Dinga');

greets('Dingi')
var greets = (msg) =>
{
    console.log('Hi',msg)
}