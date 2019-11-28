console.log('******************');
var n,count=0;
function prime(n1)
{
    for(var i=1;i<=n1;i++)
    {
        if(n1%i===0)
        {
            count++;
        }
    }
    if(count===2)
        {
            console.log("prime");
        }
    else
    {
        console.log("Not prime");
    }
}prime(3);

console.log("============================");

// var n2,count = 0; 
// var prime = function(n2)
// {
//     for(var i=1;i<=n2;i++)
//     {
//         if(n2%i===0)
//         {
//             count++;
//         }
//         return count;
//     }
    
// }
// console.log("================================");
var num = prime(7);
if(count===2)
{
    console.log("Prime");
}
else
{
    console.log("Not prime");
}

console.log("=======================");

var n3;
(function(n3)
{
    for(i=1;i<=n3;i++)
    {
        if(n3%i===0)
        {
            count++;
        }
    }
    if(count===2)
    {
        console.log("prime");
    }
    else
    {
        console.log("Not prime");
    }
    
})(11);

console.log("================================");

var n4,count=0;
var pr = n4 =>
{
    for(var i=1;i<=n4;i++)
    {
        if(n4%i===0)
        {
            count++;
        }
    }
    if(count===2)
        {
            console.log("prime");
        }
    else
    {
        console.log("Not prime");
    }
}
pr(13);