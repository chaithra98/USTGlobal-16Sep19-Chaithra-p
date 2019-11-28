
var sum=0;
//var a =new Array['10','20','30','40']
function arradd(a)
{
    for(var i=0;i<a.length;i++)
    {
        sum += a[i];
    }
    console.log(sum);
}
//var a =new Array['10','20','30'];
arradd([10,20,30,40]);
console.log("===========================");

var arr = function(b){
    for(var j=0;j<b.length;j++){
        sum+=b[j];
    }
    return sum;
}
var c = arr([10,20,30,40,50]);
console.log("Total sum is : "+c);
console.log("===========================");

(function(e){
    for(var k=0;k<e.length;k++){
        sum += e[k];
    }
    console.log('Sum is : ',sum);
})([30,40,50]);
console.log("===========================");

var array = f => 
{
    for(var h=0;h<f.length;h++){
        sum += f[h];
    }
    console.log('Sum : '+sum);
}
array([50,60,70]);