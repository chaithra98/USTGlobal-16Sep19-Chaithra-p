//Named functions
console.log('****************************');

function fib(n)
{
    var var1=0;
    var var2=1;
    var var3;
    for(var i=3;i<=n;i++)
    {
        var3 = var1+var2;
        var1=var2;
        var2=var3;
    }
    console.log('Fibonacci of number is ',var3);
}
fib(6);

console.log("==================================");

var func = function(n1)
{
    var var1=0;
    var var2=1;
    var var3;
    for(var i=3;i<=n1;i++)
    {
        var3 = var1+var2;
        var1=var2;
        var2=var3;
    }
    return var2;
}
var i = func(5);
console.log("Fibonacci : ",i);

console.log("=================");
(function(n2)
{
    var var1=0;
    var var2=1;
    var var3;
    for(var i=3;i<=n2;i++)
    {
        var3 = var1+var2;
        var1=var2;
        var2=var3;
    }
    console.log("Fibonacci : ",var2);
})(5);

console.log("============================");

var fibo=(n4)=>
{
    var var1=0;
    var var2=1;
    var var3;
    for(var i=3;i<=n4;i++)
    {
        var3 = var1+var2;
        var1=var2;
        var2=var3;
    }
    console.log("Fibonacci : ",var2);
   
}
fibo(7);
