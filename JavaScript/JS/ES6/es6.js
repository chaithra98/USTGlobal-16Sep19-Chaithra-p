const message = new Promise(function(resolve,reject){
    if(10>30){ //if(10>30)
        resolve('Success');
    }else{
        reject('Failed');
    }
})
message.then(function(msg){
    console.log('Success Message: ',msg);
}).catch(function(error){
    console.log('Failure meassage: ',error);
})
console.log('***************************');

const employee = new Promise(function(a,b){
    if(30>10){
        a([{
            name : 'Billgates',
            age : 65
        },{
           name : 'Mark Zukerberg',
           age : 40
        },{
           name : 'Jeff Bezos',
           age : 45
        }])
    }else{
            b('Unsuccessful');
        }
})
employee.then(function(data){
    console.log(data);
}).catch(function(err){
    console.log(err);
})

console.log('===============================');
//Closures

function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter+10;
        return count;
    }
    return innerFunction;
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter value : ',counter);