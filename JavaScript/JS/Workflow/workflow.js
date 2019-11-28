function first()
    {
        setTimeout(function() {
        console.log("First function executed");
    },0) //Time in milliseconds becoz it will give the output after 5 seconds
    console.log("Execution");
}

    function second(){
        console.log("Second function is executed");
    }

    first();
    second();
    console.log("====================");

//callback function
    function third(callback) // instead callback we can give any name except keywords
    {
        setTimeout(function() {
        console.log("First function executed");
        callback();
    },0) 
}

    function fourth(){
        console.log("Second function is executed");
    }

    third(fourth);