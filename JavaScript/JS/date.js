 var todaysDate = new Date();
 console.log('date is',todaysDate)
 console.log('Date :  ',todaysDate.getDate())
 console.log('Year is : ',todaysDate.getFullYear());
 console.log('Day is : ',todaysDate.getDay());
 console.log('Time is : ',todaysDate.getHours())

 var constMilli = new Date(0)
 console.log('Date : ',constMilli)
 var constString = new Date('Nov 10')
 console.log('Date string constructor ',constString)
 var  constYear = new Date(2092,5)
 console.log('Date year constructor : ',constYear)
