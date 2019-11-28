var brands = ['kingfisher','aqua','bisleri','kinley'];
console.log('For of loop')
for(var element of brands){
    console.log("Brand = ",element);
}
console.log("======================");
console.log("For in loop");
var brand = ['kingfisher','aqua','bisleri','kinley'];
for(var index in brand)
{
    console.log('Brand :',brand[index]);
}
console.log("======================");
console.log("for in loop for object");
var person = {
    name:'Sundari',
    age:33,
    color:'white'
}
for(var key in person){
    console.log('value = ',person[key]);
}
console.log("==============");
console.log("ForEach method of Array");
var movies = ['Sholey','Mayabazar','Jurassic park','Titanic'];
movies.forEach(function(value,index){
    console.log('movie = ',value);
    console.log('index: ',index);
})
console.log("==============");
console.log("forEach loop for multiple objects");
var items=[{
    name:'Bangles',
    id:1,
    price:'200',
},
{
    name:'eyeliner',
    id:2,
    price:100,
},
{
    name:'watch',
    id:3,
    price:3000,
},
{
    name:'Bike',
    id:4,
    price:80000,
}]
items.forEach(function(item,index){
    console.log('Item : ',item);
    console.log('Index of item : ',index);
})

console.log("===============");
console.log("Does not consider");
var numbers = [10,20,,30];
for(var i=0;i<numbers.length;i++)
{
    console.log(numbers[i]);
}
console.log('================================');
numbers['hundred'] = 100;
for(var j=0;j<numbers.length;j++){
    console.log(numbers[i]);
}
console.log("========================");
for(var i in numbers){
    console.log("For in loop : ",numbers[i]);
}
console.log('========================');
numbers.forEach(function(value){
    console.log('For Each: '+value);
})