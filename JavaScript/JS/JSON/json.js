const person = {
    name : 'chaithra',
    phno : 1234567890,
    address : {
        city : 'Mandya',
        state : 'karnataka',
        pincode : 263784
    },
    hobbies : ['coding','Bird watching','Singing'],
}

console.log('JavaScript person object ',person);
const jsonObject = JSON.stringify(person);
console.log('JSON person object: ',jsonObject);

const javaScriptPersonObject = JSON.parse(jsonObject);
console.log('JavaScript person object after parse ',javaScriptPersonObject);

localStorage.setItem('email','billgates@gmail.com');

const emailId = localStorage.getItem('email');
console.log('Email ID : ',emailId); 
localStorage.clear();  
