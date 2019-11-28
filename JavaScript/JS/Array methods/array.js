const hobbies =['Sleeping','Cricket','Coding','Eating','Roaming'];
//console.log(typeof hobbies);
Array.isArray(hobbies); 
const isArrayornot = Array.isArray(hobbies);//
console.log('Hobbies array or not: ',isArrayornot);
const hasCricket = hobbies.includes('Cricket'); 
console.log('Using include method: ',hasCricket);
const cricket = hobbies.includes('Cricket',100);
console.log('Using include method : ',cricket);
hobbies.push('Guitar','Volley ball');
console.log('After push method: ',hobbies);
hobbies.pop()//It will remove last index element
console.log('After pop method: ',hobbies);
hobbies.unshift('Numismatics','singing');
console.log('After unshift method: ',hobbies);
hobbies.shift();
console.log("After shift method: ",hobbies);
const hobbies1 = ['Sleeping','Cricket','Eating','Coding','Roaming'];
hobbies1.splice(1,0,'Bird watching','Pub-g');
console.log('After splice method : ',hobbies1);
const afterSlice = hobbies1.slice(2,4);
console.log('After slice method: ',hobbies1);
console.log('After slice method: ',afterSlice);
const indexOfCoding = hobbies1.indexOf('Coding',1);
console.log('Index of coding: ',indexOfCoding);
 const afterJoin = hobbies1.join('-');
console.log(afterJoin);  
const numbers = [100,200,300,400]
const nums1 = numbers.map(function(value,index)
{
    let newValue = value+50;
    return newValue;
})
console.log('After map method: ',nums1);
const nums2 = numbers.map(value=>value+50)
console.log('After map arrow function: ',nums2);
const filterNum = numbers.filter(function(value,index)
{
    if(value>200)
    {
        return true;
    }
    else{
        return false;
    }
})
console.log('After filter method: ',filterNum);
const filterNumArrow = numbers.filter(value=>value>200);
console.log('After fat arrow function: ',filterNumArrow);


console.log('==================');
console.log('==================');
const items = [{
        name : 'Ear ring',
        id:1,
        cost:5000
},
{
        name : 'Kajal',
        id : 2,
        cost : 1000
},
{
        name : 'Trimmer',
        id : 3,
        cost : 3000
},
{
        name : 'Beardo',
        id : 4,
        cost : 170
}]
const numb = items.map(function (cost,index) {
    let newValue = cost+300;
    return newValue;
})
console.log(items);

console.log('++++++++++++++++++++++++');
hobbies.splice(1,0,'travelling');
console.log(hobbies);