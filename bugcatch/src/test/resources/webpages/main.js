const username = document.getElementById('username')
const password = document.getElementById('password')
const submitButton = document.getElementById('btn')

async function validateLogin(){

let bodyInfo ={
    username: username.value,
    password: password.value
}
let bodyInfoJSon = JSON.stringify(bodyInfo)

let config = {
    method: "PATCH",
    headers:{'Content-type': 'application/json; charset=UTF-8'},
    body: bodyInfoJSon
}
const httpResponse = await fetch("https://bugcatcher.coe.revaturelabs.com/4/login", config); // notice we added the config object
if(httpResponse.status == 404){
    alert("invalid user name and password please contact admin")
}
if(httpResponse.status == 200){
const responseBody = await httpResponse.json(); 
console.log(responseBody)
// converts the response body json into a JavaScript object
if(responseBody.role === "Manager"){
    localStorage.setItem('emp', JSON.stringify(responseBody));
    window.location.replace('File:///Users/cameronhauser/Documents/GitHub/Automation-Project/Bugcatch/bugcatch/src/test/resources/webpages/Manager/index.html')
}else if(responseBody.role === "Tester"){
    localStorage.setItem('emp', JSON.stringify(responseBody));
    window.location.replace('File:///Users/cameronhauser/Documents/GitHub/Automation-Project/Bugcatch/bugcatch/src/test/resources/webpages/Tester/index.html')
}else{
    alert("please contact it to set your role")
}}
}
submitButton.addEventListener('click', validateLogin)
