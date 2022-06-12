console.log("This is the saved forms script");

load();

function load() {

    var req = new XMLHttpRequest();
    req.responseType = 'json';
    req.open('GET', 'http://localhost:8080/person', true);
    
    req.onload = function () {
        var data = req.response;

        console.log(data);
    };

    req.send(null);
}