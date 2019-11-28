h1Element = document.getElementById('demo');
console.log('Element: ',h1Element);
console.log('Element text = ',h1Element.textContent); //It is used to get the data
h1Element.textContent = 'Good Evening';//change the data in the element
console.log('============================');
//createelement() --> To create elements dynamically
let buttonElement = document.createElement('button');
buttonElement.textContent = 'Click me!!!!!'; //To give the data to the button element.
console.log('Button element: ',buttonElement);
document.body.appendChild(buttonElement);
let ulElement = document.createElement('ul');
let li1Element = document.createElement('li');
let li2Element = document.createElement('li');
let li3Element = document.createElement('li');

li1Element.textContent = 'JAVA';
li2Element.textContent = 'SQL';
li3Element.textContent = 'JS';

// Assignment snippet
// const updatedItem = items.map(function(item,index){ //map
//     item.price = item.price+300;
//     return item;
// })
// const itemsArrow = items.map((value)=>{ //arrow
//     value.price = value.price+300;
//     return value;
// })
// const filteredItems = items.filter((item)=>item.price>1000)


ulElement.appendChild(li1Element);
ulElement.appendChild(li2Element);
ulElement.appendChild(li3Element);
document.body.appendChild(ulElement);

h1Element.style.color = 'blue';// It will change the color of the data present in h1 tag
h1Element.style.fontSize = '20px';

function showMessage(){
    alert('Hi Everyone, Welcome!!!!!');
}

function changeColor(){
    let pElement = document.getElementById('mover');
    pElement.style.color = 'red';
}

function removeColor(){
    let pElement = document.getElementById('mover');
    pElement.style.color = 'black';
}
function printHello(){
    // console.log('Hello');
    let userName = document.getElementById('username').value;
    document.getElementById('showusername').textContent = userName;
} 
let name = 'chaithra'
let age = 21
let phoneno = 8951555338
console.log('Name is '+name+' Age is '+age+' Phone no is '+phoneno);
console.log(`Name is ${name} Age is ${age} phone no is ${phoneno}`);
console.log(`2 + 2 = ${2+2}`);