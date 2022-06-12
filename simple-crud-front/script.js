function send() {
    console.log("Hello world");

    var name = document.getElementById("name_id").value;
    var cellphone = document.getElementById("cellphone_id").value;
    var email = document.getElementById("email_id").value;
    var cpf = document.getElementById("cpf_id").value;
    var birth_date = document.getElementById("birthdate_id").value;
    var opinion = document.getElementById("your_opinion_id").value;

    console.log('Name %s Age %s CPF %s Birth Date %s', name, cellphone, cpf, birth_date);

    var xhr = new XMLHttpRequest();
    xhr.open('POST', 'http://localhost:8080/person');
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send(JSON.stringify({
        name: name,
        cellphone: cellphone,
        cpf: cpf,
        email: email,
        birth_date: birth_date,
        opinion: opinion
    }));


    alert("Done")
}