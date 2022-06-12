function send() {
    console.log("Hello world");

    var name = document.getElementById("name_id").value;
    var age = document.getElementById("age_id").value;
    var cpf = document.getElementById("cpf_id").value;
    var birth_date = document.getElementById("birthdate_id").value;

    console.log('Name %s Age %s CPF %s Birth Date %s', name, age, cpf, birth_date);

    var xhr = new XMLHttpRequest();
    xhr.open('POST', 'http://localhost:8080/person');
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send(JSON.stringify({
        name: name,
        age: age,
        cpf: cpf,
        birth_date: birth_date
    }));

}