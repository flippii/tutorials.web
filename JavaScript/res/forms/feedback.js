function updateFormAction() {

    document.forms["myform"].elements["webpage"].value = encodeURIComponent(location.href);
    var value = document.forms["myform"].elements["user"].value;
    if (value == null || value == "") {
        var Textknoten = document.createTextNode("Please fill out all fields");
        document.getElementById("replace").replaceChild(Textknoten, document.getElementById("replace").firstChild);

        return false;
    }
    var value = document.forms["myform"].elements["email"].value;
    if (value == null || value == "") {
        return false;
    }
    var value = document.forms["myform"].elements["summary"].value;
    if (value == null || value == "") {
        return false;
    }

    var value = document.forms["myform"].elements["comment"].value;
    if (value == null || value == "") {
        return false;
    }
    return true;

}