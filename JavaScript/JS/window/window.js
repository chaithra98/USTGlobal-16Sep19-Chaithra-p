console.log('window object',window);
console.log('This keyword : ',this);
console.log(this === window);
// window.alert('Welcome to JavaScript class');
// alert('Welcome UST Global and TestYanthra');
// let confirmDelete = confirm('Are you sure, you want to delete');
// console.log('Confirm Delete ',confirmDelete);
//  let uesrname = prompt('What is your name: ','Chaithra');// In the place of Chaithra we can give null or nothing
// console.log('User Name : ',username);

const person = {
    firstName : 'Alia',
    LastName : 'Kapoor',
    age : 26,
    getName : function(){
        console.log('This keyword ',this);
        return this.firstName+' '+this.LastName;
    }
}
let fullName = person.getName();
console.log('Full Name ',fullName);